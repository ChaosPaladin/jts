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

package ru.jts.gameserver.network.game_client.serverpackets;

import ru.jts.common.network.ServerPacket;

/**
 * @author : Camelion
 * @date : 19.08.12  17:10
 */
public class VersionCheck extends ServerPacket {
    public static final VersionCheck INVALID_PROTOCOL = new VersionCheck(new byte[8], false);

    private byte[] key;
    private boolean validProtocol;

    public VersionCheck(byte[] key, boolean validProtocol) {
        this.key = key;
        this.validProtocol = validProtocol;
    }

    @Override
    protected void writeImpl() {
        writeC(0x2E);

        writeC(validProtocol ? 0x01 : 0x00);
        writeB(key);
        writeD(0x01);
        writeD(0x10);
        writeC(0x01);
        writeD(0x00); // Seed (obfuscation key)
    }
}
