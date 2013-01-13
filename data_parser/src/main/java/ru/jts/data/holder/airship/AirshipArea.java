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

package ru.jts.data.holder.airship;

import ru.jts.annotations.data.array.IntArray;
import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.ObjectValue;
import ru.jts.data.common.Point4;

/**
 * @author : Camelion
 * @date : 24.08.12  20:31
 */
public class AirshipArea {
    @IntValue
    private int id; // ID бласти

    @IntArray(name = "map_no")
    public int[] map;

    @ObjectValue
    public AreaType area_type; // Тип области. При type = AIRPORT param = ID Аэропорта. При type = SPEED, значение param неизвествно

    @ObjectArray(canBeNull = false)
    public Point4[] area_range;

    public static enum Type {
        AIRPORT, SPEED
    }

    public static class AreaType {
        @EnumValue(withoutName = true)
        private Type type;

        @IntValue(withoutName = true)
        private int param;
    }
}
