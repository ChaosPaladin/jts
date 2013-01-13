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

package ru.jts.loginserver.network.game_server.serverpackets;

import ru.jts.common.network.ServerPacket;

/**
 * @author : Camelion
 * @date : 20.08.12  18:22
 */
public class PlayerAuthResponse extends ServerPacket {
    private final String accountName;
    private final boolean authed;

    public PlayerAuthResponse(String accountName, boolean authed) {
        this.accountName = accountName;
        this.authed = authed;
    }

    @Override
    protected void writeImpl() {
        writeC(0x02);
        writeS(accountName);
        writeC(authed ? 0x01 : 0x00);
    }
}
