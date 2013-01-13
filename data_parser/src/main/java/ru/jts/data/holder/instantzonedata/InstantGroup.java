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

package ru.jts.data.holder.instantzonedata;

import ru.jts.annotations.data.array.IntArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.ObjectValue;

import static ru.jts.data.holder.instantzonedata.InstantZone.ResetBindig;

/**
 * @author : Camelion
 * @date : 27.08.12  15:39
 */
public class InstantGroup {
    @IntValue
    public int group_id; // ID группы
    @IntValue
    public int max_entrance; // Максимальное кол-во входов в один из инстансов группы
    @IntValue
    public int extra_entrance; // Максимальное кол-во входов в один из инстансов группы, с использованием спец. билетов
    @IntArray
    public int[] instantzone_list; // Список инстанс зон, попадающих в эту группу
    @IntValue
    public int time_limit; // Время отката для группы
    @ObjectValue
    public ResetBindig reset_binding; // Время сброса откатов
}
