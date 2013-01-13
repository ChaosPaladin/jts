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

import ru.jts.annotations.data.Element;
import ru.jts.annotations.data.ElementArray;
import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.ObjectValue;
import ru.jts.data.common.Point3;

import java.util.List;

/**
 * @author : Camelion
 * @date : 24.08.12  12:25
 * <p/>
 * Содержит в себе информацию об аэропортах
 */
public class AirPort {
    @IntValue
    private int id; // ID аэропорта

    @EnumValue
    private AirportType airport_type; // Тип аэропорта

    @ElementArray(start = "teleport_begin", end = "teleport_end")
    public AirportTeleport[] teleports; // Может быть null, для тех аэроопортов, у которых нет платформы (в этом случае должно быть указано airship_pos)

    @Element(start = "platform_begin", end = "platform_end")
    public List<AirportPlatform> platforms; // Может быть null, для тех аэроопортов, у которых нет платформы (в этом случае должно быть указано airship_pos)

    @ObjectValue(canBeNull = true)
    public Point3 airship_pos; // Позиция корабля (null для тех аэропорторв, у которых указаны платформы)

    @ObjectArray
    public Point3[][] getoff_pos; // (null для тех аэропорторв, у которых указаны платформы)

    @IntValue
    private int stopover;

    public static class AirportTeleport {
        @IntValue(replacements = {"expel", "-1"}) // Для обхода бестолковых параметров оффа
        private int id;
        @IntValue
        private int fuel; // Количество топлива
        @ObjectValue(canBeNull = false)
        public Point3 tel_pos; // Возможно, позиция телепорта
    }

    public static class AirportPlatform {
        @IntValue
        private int id; // ID платофрмы

        @ObjectArray
        public Point3[] landing_path; // Неизвестно

        @ObjectValue
        public Point3 airship_pos; // Какая-то позиция корабля

        @ObjectArray
        public Point3[] takeoff_path; // Неизвестно

        @ObjectValue
        public AirportPlatformGetoffPos getoff_pos;
    }

    public static class AirportPlatformGetoffPos {
        @IntValue(withoutName = true)
        private int id;// Возможно, ID проигрываемого ролика
        @ObjectValue(withoutName = true)
        public Point3 point;//
    }


    private enum AirportType {
        REGULAR, FREE
    }
}
