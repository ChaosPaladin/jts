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

import ru.jts.common.configuration.Config;
import ru.jts.common.log.Log;
import ru.jts.common.network.ClientPacket;
import ru.jts.gameserver.network.game_client.GameClient;
import ru.jts.gameserver.network.game_client.serverpackets.VersionCheck;

/**
 * @author : Camelion
 * @date : 19.08.12  17:07
 */
public class ProtocolVersion extends ClientPacket<GameClient> {
    private static final String LOG_TAG = "ProtocolVersion.java";

    private int protocolVersion;

    @Override
    protected void readImpl() {
        protocolVersion = readD();
    }

    @Override
    protected void runImpl() {
        if (protocolVersion != Config.getInt("gameserver.protocol_version")) {
            Log.w(LOG_TAG, "Unknown client protocol {}. Close connection.", protocolVersion);
            getNetworkClient().close(VersionCheck.INVALID_PROTOCOL);
            return;
        }

        byte[] key = getNetworkClient().generateCryptKey();

        getNetworkClient().sendPacket(new VersionCheck(key, true));
    }
}
