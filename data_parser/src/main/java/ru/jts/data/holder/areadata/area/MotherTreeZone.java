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

package ru.jts.data.holder.areadata.area;

import ru.jts.annotations.data.class_annotations.ParseSuper;
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;

/**
 * @author : Camelion
 * @date : 25.08.12  0:22
 */
@ParseSuper
public class MotherTreeZone extends DefaultArea {
    @EnumValue
    private AffectRace affect_race; // Раса, на которую направлен эффект зоны, либо all-все расы

    @IntValue
    private int entering_message_no; // ID сообщения(из SystemMessage.dat), отображаемого при входе в зону

    @IntValue
    private int leaving_message_no; // ID сообщения(из SystemMessage.dat), отображаемого при выходе из зоны

    // активно не во всех mother_tree областях
    @IntValue
    public int hp_regen_bonus; // Бонус к восстановлению hp.

    // активно не во всех mother_tree областях
    @IntValue
    private int mp_regen_bonus; // Бонус к восстановлению mp.

    public MotherTreeZone() {
        super();
    }

    public MotherTreeZone(DefaultArea defaultSetting) {
        super(defaultSetting);
        affect_race = ((MotherTreeZone) defaultSetting).affect_race;
        entering_message_no = ((MotherTreeZone) defaultSetting).entering_message_no;
        leaving_message_no = ((MotherTreeZone) defaultSetting).leaving_message_no;
        hp_regen_bonus = ((MotherTreeZone) defaultSetting).hp_regen_bonus;
        mp_regen_bonus = ((MotherTreeZone) defaultSetting).mp_regen_bonus;
    }

    public static enum AffectRace {
        human,
        elf,
        darkelf,
        orc,
        dwarf,
        kamael,
        all
    }
}
