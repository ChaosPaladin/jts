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

import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.value.DoubleValue;
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;

import static ru.jts.data.holder.fishingdata.FishingDistribution.Distribution;

/**
 * @author : Camelion
 * @date : 27.08.12  3:09
 */
public class Lure {
    @IntValue
    public int lure_id;
    @IntValue
    public int lure_item_id;
    @DoubleValue
    public double revision_number;
    @IntValue
    public int length_bonus;
    @DoubleValue
    public double length_rate_bonus;

    @EnumValue
    public LureType lure_type;

    @ObjectArray
    public Distribution[] fish_group_preference;

    public static enum LureType {
        normal_lure, night_lure
    }
}
