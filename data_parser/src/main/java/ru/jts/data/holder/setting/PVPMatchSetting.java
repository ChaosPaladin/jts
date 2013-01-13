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

package ru.jts.data.holder.setting;

import ru.jts.annotations.data.Element;
import ru.jts.annotations.data.array.IntArray;

/**
 * @author : Camelion
 * @date : 23.08.12  2:26
 * <p/>
 * Содержит в себе информацию о настройках неизвестного PVPMatch'а.
 */
public class PVPMatchSetting {
    @Element(start = "give_pvppoint_time_start", end = "give_pvppoint_time_end")
    public GivePVPPointTime givePVPPointTime;

    public static class GivePVPPointTime {
        // Время начала матча (часы:минуты)
        @IntArray(canBeNull = false, splitter = ":")
        public int[] give_pvppoint_start_time;
        // Время окончания матча (часы:минуты)
        @IntArray(canBeNull = false, splitter = ":")
        public int[] give_pvppoint_end_time;
        // Дни недели, по которым запускается матч
        @IntArray(canBeNull = false)
        public int[] give_pvppoint_week_days;
    }
}
