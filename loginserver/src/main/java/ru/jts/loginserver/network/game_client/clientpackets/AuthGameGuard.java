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

package ru.jts.loginserver.network.game_client.clientpackets;

import ru.jts.common.network.ClientPacket;
import ru.jts.loginserver.network.game_client.LoginClient;
import ru.jts.loginserver.network.game_client.serverpackets.GGAuth;
import ru.jts.loginserver.network.game_client.serverpackets.LoginFail;

/**
 * @author : Camelion
 * @date : 15.08.12  12:51
 * <p/>
 * Приходит от клиента в ответ на {@link ru.jts.loginserver.network.game_client.serverpackets.LoginInit}
 */
public class AuthGameGuard extends ClientPacket<LoginClient> {
    private int sessionId;

    @Override
    public void readImpl() {
        sessionId = readD();

        readD(); // unk1
        readD(); // unk2
        readD(); // unk3
        readD(); // unk4
    }

    @Override
    public void runImpl() {
        LoginClient client = getNetworkClient();
        if (sessionId != client.getSessionId()) {
            client.close(LoginFail.REASON_ACCESS_FAILED);
            return;
        }
        client.sendPacket(new GGAuth(client.getSessionId()));
    }
}
