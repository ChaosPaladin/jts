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

import ru.jts.common.log.Log;
import ru.jts.common.network.ClientPacket;
import ru.jts.common.network.IPacketHandler;
import ru.jts.gameserver.network.game_client.clientpackets.*;

import java.nio.ByteBuffer;

/**
 * @author : Camelion
 * @date : 20.08.12  14:50
 */
public class GameclientPacketHandler implements IPacketHandler<GameClient> {
    private static final String LOG_TAG = "GameclientPacketHandler.java";

    private static GameclientPacketHandler ourInstance = new GameclientPacketHandler();

    public static GameclientPacketHandler getInstance() {
        return ourInstance;
    }

    @Override
    public ClientPacket<GameClient> handlePacket(ByteBuffer buffer) {
        int opcode = buffer.get() & 0xFF;

        ClientPacket<GameClient> packet = null;
        switch (opcode) {
            case 0x00:
                packet = new Logout();
                break;
            case 0x0E:
                packet = new ProtocolVersion();
                break;
            case 0x13:
                packet = new NewCharacter();
                break;
            case 0x2B:
                packet = new C_LOGIN();
                break;
            case 0xD0:
                int opcode2 = buffer.getShort() & 0xFFFF;
                switch (opcode2) {
                    case 0x36:
                        packet = new GotoLobby();
                        break;
                    case 0xB0:
                        packet = new RequestCharacterNameCreatable();
                        break;
                    default:
                        Log.w(LOG_TAG, "Unknown opcode 0xd0:{}", Integer.toHexString(opcode2));
                        break;
                }
                break;
            default:
                Log.w(LOG_TAG, "Unknown opcode {}", Integer.toHexString(opcode));
                break;
        }
        return packet;
    }
}
