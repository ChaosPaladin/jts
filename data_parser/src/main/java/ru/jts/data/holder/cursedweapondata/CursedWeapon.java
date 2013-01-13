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

package ru.jts.data.holder.cursedweapondata;

import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;

/**
 * @author : Camelion
 * @date : 26.08.12  21:36
 */
public class CursedWeapon {
    @StringValue
    public String item_name; // Название предмета (есть в itemdata.txt)
    @IntValue
    public int create_rate_per_10min; // * 0.001
    @IntValue
    public int create_rate_per_npc; // * 0.001
    @IntValue
    public int drop_rate_ondying; // * 0.001
    @IntValue
    public int life_time; // Время жизни? В секундах
    @IntValue
    public int expire_by_nonpk; // Не известно, какое-то время (секунды)
    @IntValue
    public int expire_by_drop; // Не известно, какое-то время (секунды)
    @IntValue
    public int transform_id; // ID трансформации, которая появляется при подборе этого оружия
}
