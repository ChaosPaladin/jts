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

package ru.jts.data.holder.npcpos.common;

import ru.jts.annotations.data.array.StringArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;
import ru.jts.annotations.data.value.TimeValue;

/**
 * @author : Camelion
 * @date : 30.08.12  20:55
 */
public class DefaultMakerNpc {
    @StringValue(withoutName = true)
    public String npc_name; // Имя NPC
    @StringValue(withoutBounds = true)
    public String pos; // Позиция. pos = anywhere - в любой точке территории, pos = {x,y,z,heading} - фиксированная точка, pos = {{x1, y1, z1, h1, chanse_to_this_pos1%};{x2, y2, z2, h2, chanse_to_this_pos2%}}
    @IntValue
    public int total; // Количество NPC в этой точке
    @TimeValue
    public long respawn; // Время респауна
    @TimeValue
    public long respawn_rand; // Случайный промежуток +- к респауну
    @StringValue
    public String Privates; // Минионы

    @StringValue
    public String dbname; // Имя, под которым NPC сохраняется в базе данных (может отсутствовать)
    @StringArray
    public String[] dbsaving; // Что сохранять в базу данных (death_time - время смерти, parameters - параметры NPC, pos - позиция)
}
