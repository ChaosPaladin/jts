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

package ru.jts.data.holder.minigame;

import ru.jts.annotations.data.Element;
import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.array.StringArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.ObjectValue;
import ru.jts.annotations.data.value.StringValue;
import ru.jts.data.common.ItemName_Count;
import ru.jts.data.common.Point3;
import ru.jts.data.common.Point4;

import java.util.List;

/**
 * @author : Camelion
 * @date : 30.08.12  13:34
 */
public class BlockupsetSettings {
    @IntValue
    public int game_period;
    @StringArray
    public String[] blue_enter_skill;
    @StringArray
    public String[] red_enter_skill;
    @StringArray
    public String[] waiting_skill;
    @ObjectValue
    public ItemName_Count default_reward;
    @ObjectValue
    public WinnerReward winner_reward;
    @StringArray
    public String[] delete_items_after_match;

    @Element(start = "blockupset_stage_begin", end = "blockupset_stage_end")
    public List<BlockupsetStage> stages;

    public static class BlockupsetStage {
        @IntValue
        public int stage;
        @ObjectArray
        public Point4[] blockupset_zone_territory;

        @Element(start = "red_start_point_begin", end = "red_start_point_end")
        public PointList red_start_point;

        @Element(start = "blue_start_point_begin", end = "blue_start_point_end")
        public PointList blue_start_point;

        @Element(start = "red_banish_point_begin", end = "red_banish_point_end")
        public PointList red_banish_point;

        @Element(start = "blue_banish_point_begin", end = "blue_banish_point_end")
        public PointList blue_banish_point;
    }

    public static class WinnerReward {
        @StringValue(withoutName = true)
        public String item_name;
        @IntValue(withoutName = true)
        public int count;
        @IntValue(withoutName = true)
        public int unknown;
    }

    public static class PointList {
        @ObjectValue(name = "point")
        public List<Point3> points;
    }
}
