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

import ru.jts.common.network.ClientPacket;
import ru.jts.gameserver.network.game_client.GameClient;
import ru.jts.gameserver.network.game_client.GameClientFactory;
import ru.jts.gameserver.network.game_client.serverpackets.CharacterSelectionInfo;
import ru.jts.gameserver.network.game_client.serverpackets.ExLoginVitalityEffectInfo;
import ru.jts.gameserver.network.game_client.serverpackets.LoginFail;
import ru.jts.gameserver.network.login_server.LoginserverClient;

/**
 * @author : Camelion
 * @date : 20.08.12  18:24
 */
public class PlayerAuthResponse extends ClientPacket<LoginserverClient> {
    private String accountName;
    private boolean authed;

    @Override
    protected void readImpl() {
        accountName = readS();
        authed = readC() == 0x01;
    }

    @Override
    protected void runImpl() {
        GameClient client = GameClientFactory.getInstance().removeAuthWaitingClient(accountName);

        if (client == null)
            return;

        if (!authed) {
            client.close(LoginFail.ACCESS_FAILED_TRY_AGAIN_LATER);
            return;
        }

        GameClient oldAuthedClient = GameClientFactory.getInstance().addAuthedClient(client);
        if (oldAuthedClient != null) {
            oldAuthedClient.close();
        }

        // Load info about all characters
        // Send characters info
        client.sendPacket(new CharacterSelectionInfo());
        // send ExLoginVitalityEffectInfo (GOD only)
        client.sendPacket(new ExLoginVitalityEffectInfo());
    }
}
