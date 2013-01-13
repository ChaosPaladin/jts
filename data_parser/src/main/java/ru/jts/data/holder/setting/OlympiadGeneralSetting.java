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
import ru.jts.annotations.data.array.StringArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.ObjectValue;
import ru.jts.data.common.ItemName_Count;

/**
 * @author : Camelion
 * @date : 23.08.12  1:10
 * <p/>
 * Содержит в себе информацию о настройках олимпиады
 * <p/>
 * Не обработаны параметры give_skill_class, give_skill_classless, give_skill_team
 * Так как эти параметры во первых пусты, во вторых - пока не понятно, какая структура наиболее подходит к ним
 */
public class OlympiadGeneralSetting {
    // Запрещенное на олимпиаде оружие.
    @StringArray(name = "forbidden_weapon", canBeNull = false)
    public String[] forbidden_weapons;
    // Награда за внеклассовые бои
    @ObjectValue(canBeNull = false)
    public ItemName_Count classless_bonus;
    // Награда за классовые бои
    @ObjectValue(canBeNull = false)
    public ItemName_Count class_bonus;
    // Награда за командные бои
    @ObjectValue(canBeNull = false)
    public ItemName_Count team_bonus;

    // Время запуска олимпиады (часы:минуты)
    @IntArray(canBeNull = false, splitter = ":")
    public int[] olympiad_time_setting;

    // Неизвестно
    @IntArray(canBeNull = false)
    public int[] olympiad_point_denominator;
    // Неизвестно
    @IntArray(canBeNull = false)
    public int[] olympiad_point_weight;

    // Точно не известно, предположительно сброс отката скилов
    @IntValue
    public int olympiad_reset_skill;

    // Список скилов, которые не будут сбрасываться
    @StringArray
    public String[] olympiad_reset_skill_excluded;
}
