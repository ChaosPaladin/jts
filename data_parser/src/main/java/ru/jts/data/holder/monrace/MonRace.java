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

package ru.jts.data.holder.monrace;

import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.ObjectValue;
import ru.jts.annotations.data.value.StringValue;
import ru.jts.data.common.Point3;

/**
 * @author : Camelion
 * @date : 30.08.12  14:05
 */
public class MonRace {
    @IntValue
    public int return_rate;
    @IntValue
    public int residenceid;
    @StringValue
    public String begin_music;
    @StringValue
    public String begin_sound;

    @ObjectArray(name = "race_area")
    public MonArea[] race_areas;

    public static class MonArea {
        @IntValue(withoutName = true)
        public int unknown;

        @ObjectValue(withoutName = true)
        public Point3 point1;
        @ObjectValue(withoutName = true)
        public Point3 point2;
        @ObjectValue(withoutName = true)
        public Point3 point3;
        @ObjectValue(withoutName = true)
        public Point3 point4;
    }
}
