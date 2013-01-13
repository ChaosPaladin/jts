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

package ru.jts.data.holder.setting.model;

import ru.jts.data.holder.setting.common.ClassID;
import ru.jts.data.holder.setting.common.PlayerRace;

/**
 * @author : Camelion
 * @date : 23.08.12  11:30
 * <p/>
 * Базовый конструктор статов для создания новых игроков.
 * <p/>
 * Используется при создании новых персонажей, для пакета NewCharacterSuccess
 */
public final class NewPlayerBaseStat {
    public final PlayerRace race;
    public final ClassID classId;

    // INT
    public final int maxINT;
    public final int baseINT;
    public final int minINT;

    // STR
    public final int maxSTR;
    public final int baseSTR;
    public final int minSTR;

    // CON
    public final int maxCON;
    public final int baseCON;
    public final int minCON;

    // MEN
    public final int maxMEN;
    public final int baseMEN;
    public final int minMEN;

    // DEX
    public final int maxDEX;
    public final int baseDEX;
    public final int minDEX;

    // WIT
    public final int maxWIT;
    public final int baseWIT;
    public final int minWIT;

    public NewPlayerBaseStat(PlayerRace race, ClassID classId, int[] maxStat, int[] baseStat, int[] minStat) {
        this.race = race;
        this.classId = classId;

        // INT
        maxINT = maxStat[0];
        baseINT = baseStat[0];
        minINT = minStat[0];

        // STR
        maxSTR = maxStat[1];
        baseSTR = baseStat[1];
        minSTR = minStat[1];

        // CON
        maxCON = maxStat[2];
        baseCON = baseStat[2];
        minCON = minStat[2];

        // MEN
        maxMEN = maxStat[3];
        baseMEN = baseStat[3];
        minMEN = minStat[3];

        // DEX
        maxDEX = maxStat[4];
        baseDEX = baseStat[4];
        minDEX = minStat[4];

        // WIT
        maxWIT = maxStat[5];
        baseWIT = baseStat[5];
        minWIT = minStat[5];
    }

    public int getRaceId() {
        return race.getID();
    }

    public int getClassId() {
        return classId.getClassId();
    }
}
