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

package ru.jts.loginserver.network.game_client.serverpackets;

import ru.jts.common.network.ServerPacket;

/**
 * @author : Camelion
 * @date : 19.08.12  14:18
 */
public class PlayOK extends ServerPacket {
    private final int playOK1;
    private final int playOK2;

    public PlayOK(int playOK1, int playOK2) {
        this.playOK1 = playOK1;
        this.playOK2 = playOK2;
    }

    @Override
    protected void writeImpl() {
        writeC(0x07);
        writeD(playOK1);
        writeD(playOK2);
    }
}
