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

import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.class_annotations.ParseSuper;
import ru.jts.data.common.Point3;

/**
 * @author : Camelion
 * @date : 25.08.12  14:19
 */
@ParseSuper
public class TeleportZone extends DefaultArea {
    // Обязательно должно присутствовать для всех зон телепорта
    @ObjectArray(canBeNull = false)
    private Point3[] teleport_points; // Точки телепорта (если больше одной, то выбирается случайным образом)

    public TeleportZone(DefaultArea defaultSetting) {
        super(defaultSetting);
        teleport_points = ((TeleportZone) defaultSetting).teleport_points;
    }

    public TeleportZone() {

    }
}
