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

package ru.jts.gameserver.network.game_client.clientpackets;

import ru.jts.common.game.l2.SessionKey;
import ru.jts.common.network.ClientPacket;
import ru.jts.gameserver.network.game_client.GameClient;
import ru.jts.gameserver.network.game_client.GameClientFactory;
import ru.jts.gameserver.network.game_client.serverpackets.SeverClose;
import ru.jts.gameserver.network.login_server.LoginClientFactory;
import ru.jts.gameserver.network.login_server.serverpackets.PlayerAuthRequest;

/**
 * @author : Camelion
 * @date : 20.08.12  10:00
 */
public class C_LOGIN extends ClientPacket<GameClient> {
    private String accountName;
    private int loginOK1;
    private int loginOK2;
    private int playOK1;
    private int playOK2;

    @Override
    protected void readImpl() {
        accountName = readS().toLowerCase();
        playOK2 = readD();
        playOK1 = readD();
        loginOK1 = readD();
        loginOK2 = readD();
        readD(); // always (01 00 00 00)    1
        readD(); // (00 00 00 00)           0
        readD(); // (03 7A 00 00)           890
    }

    @Override
    protected void runImpl() {
        SessionKey sessionKey = new SessionKey(loginOK1, loginOK2, playOK1, playOK2);
        getNetworkClient().setSessionKey(sessionKey);
        getNetworkClient().setAccountName(accountName);

        GameClient oldClient = GameClientFactory.getInstance().addAuthWaitingClient(getNetworkClient());
        if (oldClient != null)
            oldClient.close(SeverClose.STATIC);

        LoginClientFactory.getInstance().sendPacket(new PlayerAuthRequest(accountName, sessionKey));
    }
}
