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
import ru.jts.loginserver.database.AccountsDAO;
import ru.jts.loginserver.database.GameserversDAO;
import ru.jts.loginserver.model.Account;
import ru.jts.loginserver.model.GameServer;
import ru.jts.loginserver.network.game_client.LoginClient;
import ru.jts.loginserver.network.game_client.serverpackets.LoginFail;
import ru.jts.loginserver.network.game_client.serverpackets.PlayOK;

/**
 * @author : Camelion
 * @date : 19.08.12  14:08
 */
public class RequestServerLogin extends ClientPacket<LoginClient> {
    private int loginOKID1;
    private int loginOKID2;
    private int serverId;

    @Override
    protected void readImpl() {
        loginOKID1 = readD();
        loginOKID2 = readD();
        serverId = readC();
    }

    @Override
    protected void runImpl() {
        LoginClient client = getNetworkClient();
        if (client.getSessionKey() == null || !client.getSessionKey().checkKeyPair(loginOKID1, loginOKID2)) {
            client.close(LoginFail.REASON_ACCESS_FAILED);
            return;
        }

        GameServer gameServer = GameserversDAO.getInstance().getGameServerByID(serverId);
        if (gameServer == null || !gameServer.isOnline() || gameServer.getOnline() > gameServer.getMaxOnline()) {
            client.close(LoginFail.REASON_ACCESS_FAILED);
            return;
        }

        Account account = client.getAccount();
        if (account == null) {
            client.close(LoginFail.REASON_ACCESS_FAILED);
            return;
        }

        account.setLastServer(serverId);
        AccountsDAO.getInstance().saveAccount(account);

        client.close(new PlayOK(client.getSessionKey().getPlayOK1(), client.getSessionKey().getPlayOK2()));
    }
}
