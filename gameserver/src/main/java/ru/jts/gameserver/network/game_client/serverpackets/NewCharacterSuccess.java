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

package ru.jts.gameserver.network.game_client.serverpackets;

import ru.jts.common.network.ServerPacket;
import ru.jts.data.holder.setting.model.NewPlayerBaseStat;

import java.util.List;

/**
 * @author : Camelion
 * @date : 20.08.12  23:57
 */
public class NewCharacterSuccess extends ServerPacket {

    private final List<NewPlayerBaseStat> baseStats;

    public NewCharacterSuccess(List<NewPlayerBaseStat> baseStats) {
        this.baseStats = baseStats;
    }

    @Override
    protected void writeImpl() {
        writeC(0x0D);

        writeD(baseStats.size()); // length

        for (NewPlayerBaseStat baseStat : baseStats) {
            writeD(baseStat.getRaceId());
            writeD(baseStat.getClassId());

            // STR
            writeD(baseStat.maxSTR);
            writeD(baseStat.baseSTR);
            writeD(baseStat.minSTR);

            // DEX
            writeD(baseStat.maxDEX);
            writeD(baseStat.baseDEX);
            writeD(baseStat.minDEX);

            // CON
            writeD(baseStat.maxCON);
            writeD(baseStat.baseCON);
            writeD(baseStat.minCON);

            // INT
            writeD(baseStat.maxINT);
            writeD(baseStat.baseINT);
            writeD(baseStat.minINT);

            // WIT
            writeD(baseStat.maxWIT);
            writeD(baseStat.baseWIT);
            writeD(baseStat.minWIT);

            // MEN
            writeD(baseStat.maxMEN);
            writeD(baseStat.baseMEN);
            writeD(baseStat.minMEN);
        }
    }
}
