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

import ru.jts.common.game.l2.SessionKey;
import ru.jts.common.network.ClientPacket;
import ru.jts.loginserver.database.GameserversDAO;
import ru.jts.loginserver.network.game_client.LoginClient;
import ru.jts.loginserver.network.game_client.serverpackets.LoginFail;
import ru.jts.loginserver.network.game_client.serverpackets.ServerList;

/**
 * @author : Camelion
 * @date : 18.08.12  22:48
 */
public class RequestServerList extends ClientPacket<LoginClient> {
    private int loginOKID1;
    private int loginOKID2;

    @Override
    protected void readImpl() {
        loginOKID1 = readD();
        loginOKID2 = readD();
    }

    @Override
    protected void runImpl() {
        LoginClient client = getNetworkClient();

        SessionKey sessionKey = client.getSessionKey();
        if (sessionKey == null || !sessionKey.checkKeyPair(loginOKID1, loginOKID2)) {
            client.close(LoginFail.REASON_ACCESS_FAILED);
            return;
        }

        client.sendPacket(new ServerList(client.getAccount(), GameserversDAO.getInstance().getServerList()));
    }
}
