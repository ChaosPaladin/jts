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

package ru.jts.data.holder.areadata.area;

import ru.jts.annotations.data.class_annotations.ParseSuper;
import ru.jts.annotations.data.value.DoubleValue;
import ru.jts.annotations.data.value.ObjectValue;

/**
 * @author : Camelion
 * @date : 24.08.12  23:43
 * <p/>
 * Водные области
 */
@ParseSuper
public class WaterArea extends DefaultArea {
    @ObjectValue(canBeNull = false)
    private WaterRange water_range;

    public WaterArea() {
    }

    public WaterArea(DefaultArea setting) {
        super(setting);
    }

    public static class WaterRange {
        // Min range
        @DoubleValue(withoutName = true)
        private double min_x;
        @DoubleValue(withoutName = true)
        private double min_y;
        @DoubleValue(withoutName = true)
        private double min_z;

        // Max range
        @DoubleValue(withoutName = true)
        private double max_x;
        @DoubleValue(withoutName = true)
        private double max_y;
        @DoubleValue(withoutName = true)
        private double max_z;
    }
}
