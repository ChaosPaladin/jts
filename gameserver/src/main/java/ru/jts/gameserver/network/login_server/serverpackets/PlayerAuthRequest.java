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

package ru.jts.gameserver.network.login_server.serverpackets;

import ru.jts.common.game.l2.SessionKey;
import ru.jts.common.network.ServerPacket;

/**
 * @author : Camelion
 * @date : 20.08.12  15:31
 */
public class PlayerAuthRequest extends ServerPacket {
    private final String accountName;
    private final SessionKey sessionKey;

    public PlayerAuthRequest(String accountName, SessionKey sessionKey) {
        this.accountName = accountName;
        this.sessionKey = sessionKey;
    }

    @Override
    protected void writeImpl() {
        writeC(0x01);
        writeS(accountName);
        writeD(sessionKey.getLoginOK1());
        writeD(sessionKey.getLoginOK2());
        writeD(sessionKey.getPlayOK1());
        writeD(sessionKey.getPlayOK2());
    }
}
