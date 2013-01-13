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

package ru.jts.data.holder.fishingdata;

import ru.jts.annotations.data.array.IntArray;
import ru.jts.annotations.data.value.DoubleValue;

/**
 * @author : Camelion
 * @date : 27.08.12  3:22
 */
public class FishingMonster {
    @IntArray
    public int[] user_level;
    @DoubleValue
    public double monster_probability;


    // Устанавливается через фабрику объектов
    public String[] fishingmonsters;
}
