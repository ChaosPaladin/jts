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

import ru.jts.common.log.Log;
import ru.jts.common.network.ClientPacket;
import ru.jts.common.network.IPacketHandler;
import ru.jts.loginserver.network.game_server.clientpackets.GameserverInfo;
import ru.jts.loginserver.network.game_server.clientpackets.PlayerAuthRequest;

import java.nio.ByteBuffer;

/**
 * @author : Camelion
 * @date : 20.08.12  14:56
 */
public class GameserverPacketHandler implements IPacketHandler<GameserverClient> {
    private static final String LOG_TAG = "GameserverPacketHandler.java";

    private static GameserverPacketHandler ourInstance = new GameserverPacketHandler();

    public static GameserverPacketHandler getInstance() {
        return ourInstance;
    }

    @Override
    public ClientPacket<GameserverClient> handlePacket(ByteBuffer buffer) {
        int opcode = buffer.get() & 0xFF;

        ClientPacket<GameserverClient> packet = null;
        switch (opcode) {
            case 0x00:
                packet = new GameserverInfo();
                break;
            case 0x01:
                packet = new PlayerAuthRequest();
                break;
            default:
                Log.w(LOG_TAG, "Unknown opcode {}", Integer.toHexString(opcode));
                break;
        }
        return packet;
    }
}
