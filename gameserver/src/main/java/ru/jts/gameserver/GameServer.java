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

package ru.jts.gameserver;

import ru.jts.PTSDataLoader;
import ru.jts.common.configuration.Config;
import ru.jts.common.database.DatabaseFactory;
import ru.jts.common.database.DatabaseUpdater;
import ru.jts.common.log.Log;
import ru.jts.common.network.*;
import ru.jts.common.network.handlers.ClientReconnectHandler;
import ru.jts.common.network.handlers.NetworkHandler;
import ru.jts.common.threading.ThreadPoolManager;
import ru.jts.gameserver.data.Parser;
import ru.jts.gameserver.network.game_client.GameClientFactory;
import ru.jts.gameserver.network.login_server.LoginClientFactory;
import ru.jts.nasc_loader.NASCLoader;

/**
 * @author : Camelion
 * @date : 17.08.12  18:07
 */
public class GameServer {
    private static final String LOG_TAG = "GameServer.java";
    private static final String AI_SOURCE_FILE = "data/ai-freya-symbol.nasc";
    //private static final String AI_SOURCE_FILE = "data/default_npc.nasc";

    // Поток для обслуживания подключений игровых клиентов
    private static NetworkThread gameclientNetworkThread;
    // Поток для обслуживания подключения к логин серверу
    private static NetworkThread loginserverNetwrokThread;

    static {
        Config.load("config/developers.properties");
        Config.load("config/gameserver.properties");
        Config.load("config/network.properties");
        Config.load("config/thread_pool_manager.properties");
    }

    public static void main(String[] args) {
        ThreadPoolManager.getInstance().init(Config.getInt("gameserver.thread_pool_manager.scheduled_thread_pool_size"),
                Config.getInt("gameserver.thread_pool_manager.executor_thread_pool_size"));
        Log.i(LOG_TAG, "ThreadPoolManager created.");

        DatabaseFactory.getInstance().init(Config.getInt("gameserver.database.version"), new DBUpdateListener());
        Log.i(LOG_TAG, "DatabaseFactory loaded.");

        Log.i(LOG_TAG, "Start PTS data loading...");

        try {
            NASCLoader.getInstance().load(AI_SOURCE_FILE);
        } catch (Exception e) {
            Log.e(LOG_TAG, "", e);
        }
        PTSDataLoader.load();

        // Загрузка парсеров
        Parser.parseAll();


        // Загрузка сетевых коммуникаций
        startLoginserverConnection();
        startNetworkServer();
    }

    /**
     * Запускает сетевой процесс для связи с игровыми клиентами
     */
    private static void startNetworkServer() {
        // Запуск сетевого процесса для подключения клиентов игры
        NetworkPipelineFactory pipelineFactory = new NetworkPipelineFactory(new PacketEncoder(), new PacketDecoder(),
                new NetworkHandler(GameClientFactory.getInstance()));
        NetworkConfig networkConfig = new NetworkConfig("*", // Сервер работает на все адреса
                Config.getInt("gameserver.network.game_clients.port"), Config.getInt("gameserver.network.game_clients.thread_count")
                , pipelineFactory);
        gameclientNetworkThread = new NetworkThread(networkConfig);
        gameclientNetworkThread.startAsServer();
        Log.i(LOG_TAG, "GameClients NetworkThread loaded on {}:{}", Config.getString("gameserver.network.game_clients.external_address"),
                Config.getInt("gameserver.network.game_clients.port"));
    }

    /**
     * Запускает подключение к логинсерверу
     */
    private static void startLoginserverConnection() {
        // Запуск сетевого процесса для подключения к логин серверу
        Log.i(LOG_TAG, "Trying connect to loginserver on {}:{}", Config.getString("gameserver.network.loginserver.address"),
                Config.getInt("gameserver.network.loginserver.port"));

        NetworkPipelineFactory pipelineFactory = new NetworkPipelineFactory(new PacketEncoder(), new PacketDecoder(),
                new NetworkHandler(LoginClientFactory.getInstance()), new ClientReconnectHandler(new LoginserverReconnectListenerImpl()));
        NetworkConfig networkConfig = new NetworkConfig(Config.getString("gameserver.network.loginserver.address"),
                Config.getInt("gameserver.network.loginserver.port"), Config.getInt("gameserver.network.loginserver.thread_count")
                , pipelineFactory);
        loginserverNetwrokThread = new NetworkThread(networkConfig);
        loginserverNetwrokThread.startAsClient();
    }

    public static void stop() {
        gameclientNetworkThread.stop();
        loginserverNetwrokThread.stop();
        DatabaseFactory.getInstance().close();
        System.exit(0);
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

    private static class LoginserverReconnectListenerImpl implements ClientReconnectHandler.ReconnectListener {
        @Override
        public void msgBeforeReconnect() {
            Log.i(LOG_TAG, "Connection with loginserver lost. Trying to reconnect...");
        }

        @Override
        public void reconnect() {
            loginserverNetwrokThread.stop();
            loginserverNetwrokThread.startAsClient();
        }
    }
}
