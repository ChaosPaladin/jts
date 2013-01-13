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

import ru.jts.annotations.data.array.IntArray;
import ru.jts.annotations.data.value.IntValue;

/**
 * @author : Camelion
 * @date : 30.08.12  14:11
 */
public class MonTrack {
    @IntValue(withoutName = true)
    public int track_id;

    @IntArray(withoutName = true, splitter = ",")
    public int[] track_coords; // begin_x, begin_y, begin_z, end_x, end_y, end_z
}
