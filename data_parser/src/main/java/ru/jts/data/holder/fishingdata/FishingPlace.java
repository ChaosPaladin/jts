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
import ru.jts.data.common.Point4;

/**
 * @author : Camelion
 * @date : 27.08.12  3:03
 */
public class FishingPlace {
    @IntValue
    public int fishing_place_id;
    @ObjectArray
    public Point4[] territory;
    @IntValue
    public int limit_grid;
    @IntValue
    public int distribution_id;
    @EnumValue
    public FishingPlaceType fishing_place_type;
    @IntValue
    public int maintain_distribution_time;


    public static enum FishingPlaceType {
        fishing_place_default, fishing_place_type1, fishing_place_type2
    }
}
