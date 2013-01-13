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

package ru.jts.loginserver.network.game_server.clientpackets;

import ru.jts.common.game.l2.SessionKey;
import ru.jts.common.network.ClientPacket;
import ru.jts.loginserver.manager.SessionManager;
import ru.jts.loginserver.network.game_server.GameserverClient;
import ru.jts.loginserver.network.game_server.serverpackets.PlayerAuthResponse;

/**
 * @author : Camelion
 * @date : 20.08.12  15:36
 */
public class PlayerAuthRequest extends ClientPacket<GameserverClient> {
    private String accountName;
    private int loginOK1;
    private int loginOK2;
    private int playOK1;
    private int playOK2;

    @Override
    protected void readImpl() {
        accountName = readS();
        loginOK1 = readD();
        loginOK2 = readD();
        playOK1 = readD();
        playOK2 = readD();
    }

    @Override
    protected void runImpl() {
        boolean closeOK = SessionManager.getInstance().closeSession(accountName, new SessionKey(loginOK1, loginOK2, playOK1, playOK2));
        getNetworkClient().sendPacket(new PlayerAuthResponse(accountName, closeOK));
    }
}
