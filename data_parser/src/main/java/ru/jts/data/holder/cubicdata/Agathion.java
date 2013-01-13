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

package ru.jts.data.holder.cubicdata;

import ru.jts.annotations.data.array.IntArray;
import ru.jts.annotations.data.class_annotations.ParseSuper;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;

/**
 * @author : Camelion
 * @date : 26.08.12  13:19
 */
@ParseSuper
public class Agathion extends DefaultCubicData {
    @StringValue
    public String npc_name; // имя Npc, соответствующего агатиону (есть в npcdata.txt)

    @IntArray
    public int[] item_ids = new int[0]; // Какие_то ID предметов
    @IntValue
    public int energy; // Какая-то энергия, активно везде, где item_ids.length > 0
    @IntValue
    public int max_energy; // Максимальное кол-во энергии, активно везде, где item_ids.length > 0

    // Присутствуют только у трех агатионов
    public AgathionTimeSkill timeskill1;
    public AgathionTimeSkill timeskill2;
    public AgathionTimeSkill timeskill3;

    public static class AgathionTimeSkill {
        public String skill_name; // Название скила
        public int targetStaticObject;
        public TargetType skill_target_type; // тип цели
        public int unknown; // Неизвестное значение
    }
}
