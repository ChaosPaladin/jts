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

package ru.jts.gameserver.network.login_server.clientpackets;

import ru.jts.common.log.Log;
import ru.jts.common.network.ClientPacket;
import ru.jts.gameserver.GameServer;
import ru.jts.gameserver.network.login_server.LoginserverClient;

/**
 * @author : Camelion
 * @date : 20.08.12  12:53
 */
public class RegistrationInfo extends ClientPacket<LoginserverClient> {
    private static final String LOG_TAG = "RegistrationInfo.java";

    private static final int CODE_SUCCESS = 0;
    private static final int CODE_WRONG_ID = 1;

    private int code;

    @Override
    protected void readImpl() {
        code = readD();
    }

    @Override
    protected void runImpl() {
        switch (code) {
            case CODE_SUCCESS:
                Log.i(LOG_TAG, "GameServer successfully registered on Loginserver.");
                break;
            case CODE_WRONG_ID:
                Log.i(LOG_TAG, "GameServer registration unsuccessfully. Reason: wrong server ID.");
                GameServer.stop();
                break;
            default:
                Log.w(LOG_TAG, "Unknown code({}) response from loginserver", code);
                break;
        }
    }
}
