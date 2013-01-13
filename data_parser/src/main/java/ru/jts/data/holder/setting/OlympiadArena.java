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
import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.array.StringArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.data.common.Point3;
import ru.jts.data.common.Point4;

import java.util.List;

/**
 * @author : Camelion
 * @date : 23.08.12  0:07
 * <p/>
 * Содержит в себе информацию об олимпиадных аренах
 */
public class OlympiadArena {

    @Element(start = "arena_begin", end = "arena_end")
    public List<Arena> arenas; // Список олимпиадных арен

    public static class Arena {
        @IntValue
        public int id; // ID арены

        @ObjectArray(name = "range")
        public Point4[] ranges;// Список точек, составляющих область арены

        // Список точек, которыми окружена область.
        @ObjectArray(name = "point1")
        public Point3[] points1;// Список точек, телепорта первого игрока(ов) (три координаты, возможно для боев 3x3)

        @ObjectArray(name = "point2")
        public Point3[] points2;// Список точек, телепорта первого игрока(ов) (три координаты, возможно для боев 3x3)

        @StringArray(name = "olympiad_door", canBeNull = false)
        public String[] olympiad_doors;
    }

}
