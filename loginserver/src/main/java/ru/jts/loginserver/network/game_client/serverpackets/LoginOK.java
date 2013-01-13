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
 * @date : 18.08.12  21:26
 */
public class LoginOK extends ServerPacket {
    private int loginOK1;
    private int loginOK2;

    public LoginOK(int loginOK1, int loginOK2) {
        this.loginOK1 = loginOK1;
        this.loginOK2 = loginOK2;
    }

    @Override
    protected void writeImpl() {
        writeC(0x03);
        writeD(loginOK1);
        writeD(loginOK2);
        writeD(0x00);
        writeD(0x00);
        writeD(0x000003ea);
        writeD(0x00);
        writeD(0x00);
        writeD(0x00);
        writeB(new byte[16]);
    }
}
