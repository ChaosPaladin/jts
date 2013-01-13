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

package ru.jts.gameserver.network.game_client;

import ru.jts.common.network.IClientFactory;
import ru.jts.common.network.NetworkClient;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author : Camelion
 * @date : 20.08.12  18:41
 */
public class GameClientFactory implements IClientFactory {
    private static GameClientFactory ourInstance = new GameClientFactory();

    public static GameClientFactory getInstance() {
        return ourInstance;
    }

    private final ReadWriteLock authWaitlock = new ReentrantReadWriteLock();
    private final Lock authWaitWriteLock = authWaitlock.writeLock();

    private final Map<String, GameClient> authWaitClients = new HashMap<>();

    private final ReadWriteLock authedLock = new ReentrantReadWriteLock();
    private final Lock authedWriteLock = authedLock.writeLock();
    private final Lock authedReadLock = authedLock.readLock();

    private final Map<String, GameClient> authedClients = new HashMap<>();

    @Override
    public NetworkClient createNewClient() {
        return new GameClient(new GameCrypt(), GameclientPacketHandler.getInstance());
    }

    public GameClient addAuthWaitingClient(GameClient gameClient) {
        authWaitWriteLock.lock();
        try {
            return authWaitClients.put(gameClient.getAccountName(), gameClient);
        } finally {
            authWaitWriteLock.unlock();
        }
    }

    public GameClient removeAuthWaitingClient(String accountName) {
        authWaitWriteLock.lock();
        try {
            return authWaitClients.remove(accountName);
        } finally {
            authWaitWriteLock.unlock();
        }
    }

    public GameClient addAuthedClient(GameClient gameClient) {
        authedWriteLock.lock();
        try {
            return authedClients.put(gameClient.getAccountName(), gameClient);
        } finally {
            authedWriteLock.unlock();
        }
    }
}
