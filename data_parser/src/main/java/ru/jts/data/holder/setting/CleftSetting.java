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

import ru.jts.annotations.data.Element;
import ru.jts.annotations.data.array.IntArray;
import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.array.StringArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.ObjectValue;
import ru.jts.data.common.ItemName_Count;
import ru.jts.data.common.Point4;

import java.util.List;

/**
 * @author : Camelion
 * @date : 23.08.12  2:32
 * <p/>
 * Содержит в себе информацию о каком-то эвенте.
 */
public class CleftSetting {
    @ObjectArray
    public Point4[] cleft_zone_territory;

    // Точки старта синей и красной команды
    @Element(start = "red_start_point_begin", end = "red_start_point_end")
    public ListPoint redStartPoint;

    @Element(start = "blue_start_point_begin", end = "blue_start_point_end")
    public ListPoint blueStartPoint;

    // Какие-то точки для синей и красной команды
    @Element(start = "red_banish_point_begin", end = "red_banish_point_end")
    public ListPoint redBanishPoint;

    @Element(start = "blue_banish_point_begin", end = "blue_banish_point_end")
    public ListPoint blueBanishPoint;

    // Период категорий?
    @IntValue
    public int CAT_period;

    // Награда победителю
    @ObjectValue(canBeNull = false)
    public ItemName_Count winner_reward;

    // Награда проигравшему
    @ObjectValue(canBeNull = false)
    public ItemName_Count loser_reward;

    // Награда в SP победителю
    @IntValue
    public int winner_sp_bonus;

    // Награда в SP победителю
    @IntValue
    public int loser_sp_bonus;

    // Неизвестно. Возможно награда за убийство
    @IntValue
    public int kill_sp_bonus;

    @StringArray
    public String[] waiting_skill;


    public static class ListPoint {
        @IntArray(name = "point", canBeNull = false)
        public List<int[]> points;
    }
}
