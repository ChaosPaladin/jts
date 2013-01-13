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

package ru.jts.loginserver;

import ru.jts.common.configuration.Config;
import ru.jts.common.database.DatabaseFactory;
import ru.jts.common.database.DatabaseUpdater;
import ru.jts.common.log.Log;
import ru.jts.common.network.*;
import ru.jts.common.network.handlers.NetworkHandler;
import ru.jts.common.threading.ThreadPoolManager;
import ru.jts.loginserver.database.GameserversDAO;
import ru.jts.loginserver.network.game_client.LoginClientFactory;
import ru.jts.loginserver.network.game_server.GameserverClientFactory;

/**
 * @author : Camelion
 * @date : 10.08.12  1:07
 */
public class LoginServer {
    private static final String LOG_TAG = "LoginServer.java";
    // Поток для обслуживания подключений игровых клиентов
    private static NetworkThread clientsNetworkThread;
    // Поток для обслуживания подключений игровых серверов
    private static NetworkThread gameserversNetworkThread;

    static {
        Config.load("config/developers.properties");
        Config.load("config/loginserver.properties");
        Config.load("config/network.properties");
        Config.load("config/thread_pool_manager.properties");
    }

    public static void main(String[] args) {
        ThreadPoolManager.getInstance().init(Config.getInt("loginserver.thread_pool_manager.scheduled_thread_pool_size"),
                Config.getInt("loginserver.thread_pool_manager.executor_thread_pool_size"));
        Log.i(LOG_TAG, "ThreadPoolManager created.");

        DatabaseFactory.getInstance().init(Config.getInt("loginserver.database.version"), new DBUpdateListener());
        Log.i(LOG_TAG, "DatabaseFactory loaded.");

        GameserversDAO.getInstance();

        startNetworkServers();
    }

    /**
     * Запускает сетевой процесс для подключения игровых клиентов,
     * а также сетевой процесс для подключения игровых серверов
     */
    public static void startNetworkServers() {
        // Запуск сетевого процесса для подключения игровых серверов
        NetworkPipelineFactory pipelineFactory = new NetworkPipelineFactory(new PacketEncoder(), new PacketDecoder(),
                new NetworkHandler(new GameserverClientFactory()));
        NetworkConfig networkConfig = new NetworkConfig(Config.getString("loginserver.network.game_servers.address"),
                Config.getInt("loginserver.network.game_servers.port"), Config.getInt("loginserver.network.game_servers.thread_count")
                , pipelineFactory);
        gameserversNetworkThread = new NetworkThread(networkConfig);
        gameserversNetworkThread.startAsServer();
        Log.i(LOG_TAG, "Gameservers NetworkThread loaded on {}:{}", Config.getString("loginserver.network.game_servers.address"),
                Config.getInt("loginserver.network.game_servers.port"));

        // Запуск сетевого процесса для подключения игровых клиентов
        pipelineFactory = new NetworkPipelineFactory(new PacketEncoder(), new PacketDecoder(),
                new NetworkHandler(new LoginClientFactory()));

        networkConfig = new NetworkConfig(Config.getString("loginserver.network.game_clients.address"),
                Config.getInt("loginserver.network.game_clients.port"), Config.getInt("loginserver.network.game_clients.thread_count")
                , pipelineFactory);
        clientsNetworkThread = new NetworkThread(networkConfig);
        clientsNetworkThread.startAsServer();
        Log.i(LOG_TAG, "Clients NetworkThread loaded on {}:{}", Config.getString("loginserver.network.game_clients.address"),
                Config.getInt("loginserver.network.game_clients.port"));
    }

    public static void stop() {
        clientsNetworkThread.stop();
        gameserversNetworkThread.stop();
        DatabaseFactory.getInstance().close();
    }

    private static class DBUpdateListener implements DatabaseUpdater.IDBUpdateListener {
        /**
         * example:
         * if(from == 1 && to == 3) {
         * // Do update from version 1 to version 3
         * return true;
         * }
         * if(from == 3 && to == 5) {
         * // Do update from version 3 to version 5
         * return true;
         * }
         * if(from == 5 && to == 8) {
         * // Do update from version 5 to version 8
         * return true;
         * }
         *
         * @param from - версия, с которой происходит обновление
         * @param to   - версия, до которой обновляетс база данных
         * @return - true, если обновление было выполнено.
         */
        @Override
        public boolean update(int from, int to) {
            return false;
        }
    }
}
