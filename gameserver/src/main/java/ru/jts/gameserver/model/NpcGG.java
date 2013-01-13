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

package ru.jts.gameserver.model;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

/**
 * @author : Camelion
 * @date : 31.08.12  17:40
 */
public class NpcGG {
    public int GetAbnormalLevel(Creature sm, AIController.AbnormalType abnormalType) {
        // TODO: Возвращает уровень эффекта abnormalType, у персонажа sm
        return 0;
    }

    public int Rand(int max) {
        // TODO: Возвращает случайно число в промежутке от 0 до max
        return 0;
    }

    public int OwnItemCount(Player talker, String item_link) {
        //TODO: Возвращает количество предметов типа @item_link у игрока "talker"
        // GetItemNameId(item_link)
        return OwnItemCount(talker, 0 /* item_name_id */);
    }

    public int OwnItemCount(Player talker, int item_name_id) {
        //TODO: Возвращает количество предметов типа item_name_id у игрока "talker"
        return 0;
    }

    public int FloatToInt(float _f) {
        //TODO:
        return 0;
    }

    public String MakeFString(int fStringId, String s0, String s1, String s2, String s3, String s4) {
        return ""; // TODO Делает строку из файла fstring.txt
    }
}
