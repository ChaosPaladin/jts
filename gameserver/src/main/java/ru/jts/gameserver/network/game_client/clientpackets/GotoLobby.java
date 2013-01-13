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

import ru.jts.common.network.ClientPacket;
import ru.jts.gameserver.network.game_client.GameClient;
import ru.jts.gameserver.network.game_client.serverpackets.CharacterSelectionInfo;
import ru.jts.gameserver.network.game_client.serverpackets.ExLoginVitalityEffectInfo;

/**
 * @author : Camelion
 * @date : 23.08.12  13:07
 * <p/>
 * Отсылается при выходе из окна создания персонажа (Без создания персонажа)
 */
public class GotoLobby extends ClientPacket<GameClient> {
    @Override
    protected void readImpl() {
        // Trigger
    }

    @Override
    protected void runImpl() {
        // Load info about all characters
        // Send characters info
        getNetworkClient().sendPacket(new CharacterSelectionInfo());
        // send ExLoginVitalityEffectInfo (GOD only)
        getNetworkClient().sendPacket(new ExLoginVitalityEffectInfo());
    }
}
