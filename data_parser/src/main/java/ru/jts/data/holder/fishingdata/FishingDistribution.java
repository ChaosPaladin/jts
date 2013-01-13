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
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;

/**
 * @author : Camelion
 * @date : 27.08.12  2:54
 */
public class FishingDistribution {
    @IntValue
    public int distribution_id;

    @ObjectArray
    public Distribution[] default_distribution;
    @ObjectArray
    public Distribution[] night_fishing_distribution;

    public static class Distribution {
        @EnumValue(withoutName = true)
        public FishGroup fish_group;
        @IntValue(withoutName = true)
        public int unknown;
    }

    public static enum FishGroup {
        easy_wide, easy_swift, easy_ugly,
        wide, swift, ugly,
        fish_box,
        hard_wide, hard_swift, hard_ugly,
        hs_fish
    }
}
