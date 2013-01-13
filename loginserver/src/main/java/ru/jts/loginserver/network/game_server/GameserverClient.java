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

package ru.jts.loginserver.network.game_server;

import ru.jts.common.network.INetworkCrypt;
import ru.jts.common.network.IPacketHandler;
import ru.jts.common.network.NetworkClient;
import ru.jts.loginserver.model.GameServer;

/**
 * @author : Camelion
 * @date : 17.08.12  19:38
 * <p/>
 * Класс-сетевая оболочка для игрового сервера
 */
public class GameserverClient extends NetworkClient {
    private static final int HEADER_SIZE = 2;
    private GameServer gameServer;

    protected GameserverClient(INetworkCrypt networkCrypt, IPacketHandler packetHandler) {
        super(networkCrypt, packetHandler);
    }

    @Override
    public void prepareToSend(byte[] data) {
        // write short (size)
        data[0] = (byte) (data.length & 0xFF);
        data[1] = (byte) (data.length >> 8 & 0xFF);
    }

    @Override
    public int getShiftBeforeReadPacket() {
        return HEADER_SIZE;
    }

    @Override
    public int getShiftBeforeWritePacket() {
        return HEADER_SIZE;
    }

    @Override
    public int getShiftAfterWritePacket(int packetSize) {
        return 0;
    }

    public void setGameServer(GameServer gameServer) {
        this.gameServer = gameServer;
    }
}
