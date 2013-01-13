/*
 * Copyright 2012 jts
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.jts.loginserver.database;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.jts.common.configuration.Config;
import ru.jts.common.database.DatabaseFactory;
import ru.jts.common.log.Log;
import ru.jts.common.network.ServerPacket;
import ru.jts.loginserver.model.GameServer;

import java.util.*;

/**
 * @author : Camelion
 * @date : 18.08.12  14:57
 */
public class GameserversDAO {
    private static final String LOG_TAG = "GameserversDAO.java";
    private static GameserversDAO ourInstance = new GameserversDAO();

    private final Map<Integer, GameServer> serverMap;

    public static GameserversDAO getInstance() {
        return ourInstance;
    }

    private GameserversDAO() {
        serverMap = new HashMap<>();
        load();
    }

    private void load() {
        Session session = DatabaseFactory.getInstance().openSession();
        try {
            Criteria criteria = session.createCriteria(GameServer.class);

            List list = criteria.list();

            for (Object object : list) {
                GameServer gs = (GameServer) object;
                serverMap.put(gs.getServerId(), gs);
            }
        } catch (Exception e) {
            Log.e(LOG_TAG, "Exception in load() ", e.getCause());
        } finally {
            DatabaseFactory.close(session);
        }

        Log.i(LOG_TAG, "Loaded {} registered game server(s).", serverMap.size());
    }

    public GameServer getGameServerByID(int serverId) {
        if (serverMap.containsKey(serverId))
            return serverMap.get(serverId);

        if (!Config.getBool("loginserver.gs_managment.automatic_gs_registration"))
            return null;

        Log.i(LOG_TAG, "Registered new game server with id {}", serverId);

        GameServer gs = new GameServer(serverId);
        serverMap.put(gs.getServerId(), gs);

        Session session = DatabaseFactory.getInstance().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(gs);
            transaction.commit();
        } catch (Exception e) {
            Log.e(LOG_TAG, "Exception in load() ", e.getCause());
            if (transaction != null) {
                transaction.rollback();
            }
            return null;
        } finally {
            DatabaseFactory.close(session);
        }
        return gs;
    }

    public Collection<GameServer> getServerList() {
        return Collections.unmodifiableCollection(serverMap.values());
    }

    /**
     * Обновляет информацию о сервере в базе данных
     *
     * @param gameServer - сервер, информацию о котором обновляем
     */
    public void updateServer(GameServer gameServer) {
        Session session = DatabaseFactory.getInstance().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(gameServer);
            transaction.commit();
        } catch (Exception e) {
            Log.e(LOG_TAG, "Exception in load() ", e.getCause());
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            DatabaseFactory.close(session);
        }
    }

    public void sendPacketToAll(ServerPacket packet) {
        for (GameServer server : serverMap.values()) {
            if (server.getNetworkClient() != null)
                server.getNetworkClient().sendPacket(packet);
        }
    }
}
