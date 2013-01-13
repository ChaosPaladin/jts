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

import ru.jts.annotations.data.value.DoubleValue;
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;

import static ru.jts.data.holder.fishingdata.FishingDistribution.FishGroup;

/**
 * @author : Camelion
 * @date : 27.08.12  3:13
 */
public class Fish {
    @IntValue
    public int fish_id;
    @IntValue
    public int item_id;
    @StringValue
    public String item_name;
    @EnumValue
    public FishGroup fish_group;
    @IntValue
    public int fish_level;
    @DoubleValue
    public double fish_bite_rate;
    @DoubleValue
    public double fish_guts;
    @IntValue
    public int fish_hp;
    @IntValue
    public int fish_max_length;
    @DoubleValue
    public double fish_length_rate;
    @DoubleValue
    public double hp_regen;

    @IntValue
    public int start_combat_time;
    @IntValue
    public int combat_duration;
    @IntValue
    public int guts_check_time;

    @DoubleValue
    public double guts_check_probability;
    @DoubleValue
    public double cheating_prob;

    @EnumValue
    public FishGrade fish_grade;

    public static enum FishGrade {
        fish_normal, fish_easy, fish_hard
    }
}
