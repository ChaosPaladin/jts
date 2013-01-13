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

package ru.jts.data.holder.setting;

import ru.jts.annotations.data.array.IntArray;
import ru.jts.data.holder.setting.common.ClassID;
import ru.jts.data.holder.setting.common.PlayerRace;

/**
 * @author : Camelion
 * @date : 22.08.12  23:37
 * <p/>
 * Класс, содержащий в себе минимальные базовые статы(INT/STR/CON/MEN/DEX/WIT) персонажей
 */
public class MinimumStat {
    // Список статов для каждого начального класса
    @IntArray(canBeNull = false)
    public int[] human_fighter;

    @IntArray(canBeNull = false)
    public int[] human_magician;

    @IntArray(canBeNull = false)
    public int[] elf_fighter;

    @IntArray(canBeNull = false)
    public int[] elf_magician;

    @IntArray(canBeNull = false)
    public int[] darkelf_fighter;

    @IntArray(canBeNull = false)
    public int[] darkelf_magician;

    @IntArray(canBeNull = false)
    public int[] orc_fighter;

    @IntArray(canBeNull = false)
    public int[] orc_shaman;

    @IntArray(canBeNull = false)
    public int[] dwarf_apprentice;

    @IntArray(canBeNull = false)
    public int[] kamael_m_soldier;

    @IntArray(canBeNull = false)
    public int[] kamael_f_soldier;

    public int[] getFor(PlayerRace race, ClassID classID) {
        int[] stat = new int[6];
        switch (race) {
            case human:
                if (classID == ClassID.fighter)
                    return human_fighter;
                else if (classID == ClassID.mage)
                    return human_magician;
                break;
            case elf:
                if (classID == ClassID.elven_fighter)
                    return elf_fighter;
                else if (classID == ClassID.elven_mage)
                    return elf_magician;
                break;
            case darkelf:
                if (classID == ClassID.dark_fighter)
                    return darkelf_fighter;
                else if (classID == ClassID.dark_mage)
                    return darkelf_magician;
                break;
            case orc:
                if (classID == ClassID.orc_fighter)
                    return orc_fighter;
                else if (classID == ClassID.orc_mage)
                    return orc_shaman;
                break;
            case dwarf:
                if (classID == ClassID.dwarven_fighter)
                    return dwarf_apprentice;
                break;
            case kamael:
                if (classID == ClassID.kamael_f_soldier)
                    return kamael_f_soldier;
                else if (classID == ClassID.kamael_m_soldier)
                    return kamael_f_soldier;
                break;
        }

        return stat;
    }
}
