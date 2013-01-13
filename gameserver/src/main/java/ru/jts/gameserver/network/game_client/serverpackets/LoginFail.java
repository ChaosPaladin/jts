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
 * @date : 20.08.12  18:28
 */
public class LoginFail extends ServerPacket {
    public static final LoginFail ACCESS_FAILED_TRY_AGAIN_LATER = new LoginFail(4);

    private final int reason;

    private LoginFail(int reason) {
        this.reason = reason;
    }

    @Override
    protected void writeImpl() {
        writeC(0x0a);
        writeD(reason);
    }
}
