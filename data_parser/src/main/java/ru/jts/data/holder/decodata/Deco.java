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

package ru.jts.data.holder.decodata;

import ru.jts.annotations.data.array.IntArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;

/**
 * @author : Camelion
 * @date : 26.08.12  21:45
 */
public class Deco {
    @IntValue
    public int id;
    @StringValue
    public String name; // Больше нет ни в каких файлах
    @IntValue
    public int type;
    @IntValue
    public int level;
    @IntValue
    public int depth;

    // Задается через DecoObjectFactory
    public DecoFunc func;
    public double func_param; // Может отсутствовать для func = none

    @IntArray(splitter = ":")
    public int[] cost;

    public static enum DecoFunc {
        none, hp_regen, mp_regen, exp_restore,
    }
}
