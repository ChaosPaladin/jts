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

package ru.jts.loginserver.network.game_client;

import ru.jts.common.log.Log;
import ru.jts.common.network.ClientPacket;
import ru.jts.common.network.IPacketHandler;
import ru.jts.loginserver.network.game_client.clientpackets.AuthGameGuard;
import ru.jts.loginserver.network.game_client.clientpackets.RequestAuthLogin;
import ru.jts.loginserver.network.game_client.clientpackets.RequestServerList;
import ru.jts.loginserver.network.game_client.clientpackets.RequestServerLogin;

import java.nio.ByteBuffer;

/**
 * @author : Camelion
 * @date : 20.08.12  14:55
 */
public class LoginclientPacketHandler implements IPacketHandler<LoginClient> {
    private static final String LOG_TAG = "LoginGameClientPacketHandler.java";

    private static LoginclientPacketHandler ourInstance = new LoginclientPacketHandler();

    public static LoginclientPacketHandler getInstance() {
        return ourInstance;
    }

    @Override
    public ClientPacket<LoginClient> handlePacket(ByteBuffer buffer) {
        int opcode = buffer.get() & 0xFF;

        ClientPacket<LoginClient> packet = null;
        switch (opcode) {
            case 0x00:
                packet = new RequestAuthLogin();
                break;
            case 0x02:
                packet = new RequestServerLogin();
                break;
            case 0x05:
                packet = new RequestServerList();
                break;
            case 0x07:
                packet = new AuthGameGuard();
                break;
            default:
                Log.w(LOG_TAG, "Unknown opcode {}", Integer.toHexString(opcode));
                break;
        }
        return packet;
    }
}
