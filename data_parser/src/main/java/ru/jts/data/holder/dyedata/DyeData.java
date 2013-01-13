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

package ru.jts.data.holder.dyedata;

import ru.jts.annotations.data.array.IntArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;

/**
 * @author : Camelion
 * @date : 27.08.12  1:37
 */
public class DyeData {
    @StringValue
    public String dye_name; // Название, есть в itemdata.txt
    @IntValue
    public int dye_id; // ID
    @IntValue
    public int dye_item_id; // Item ID
    @IntValue
    public int dye_level; //

    @IntValue
    public int str; // STR
    @IntValue
    public int con; // CON
    @IntValue
    public int dex; // DEX
    @IntValue(name = "int")
    public int _int; // INT
    @IntValue
    public int men; // MEN
    @IntValue
    public int wit; // WIT

    @IntValue
    public int need_count; // Необходимое кол-во таких предметов для нанесения тату
    @IntValue
    public int wear_fee; // Вероятно, цена нанесения
    @IntValue
    public int cancel_count; // Количество предметов, возвращаемое при снятии тату
    @IntValue
    public int cancel_fee; // Цена снятия тату

    @IntArray
    public int[] wear_class; // Список классов, которым доступна эта тату
}
