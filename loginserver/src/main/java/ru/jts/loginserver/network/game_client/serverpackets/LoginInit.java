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

package ru.jts.loginserver.network.game_client.serverpackets;

import ru.jts.common.network.ServerPacket;

/**
 * @author : Camelion
 * @date : 13.08.12  21:23
 * <p/>
 * Первоначальный пакет, отсылается каждому новому клиенту при подключении к каналу
 */
public class LoginInit extends ServerPacket {

    private final int sessionId;
    private final byte[] publicKey;
    private final byte[] blowfishKey;

    public LoginInit(int sessionId, byte[] publicKey, byte[] blowfishKey) {
        this.sessionId = sessionId;
        this.publicKey = publicKey;
        this.blowfishKey = blowfishKey;
    }

    @Override
    protected void writeImpl() {
        writeC(0x00);

        writeD(sessionId);
        writeD(0x0000c621);
        writeB(publicKey);
        writeD(0x29DD954E);
        writeD(0x77C39CFC);
        writeD(0x97ADB620);
        writeD(0x07BDE0F7);
        writeB(blowfishKey);
        writeC(0x00);
    }
}
