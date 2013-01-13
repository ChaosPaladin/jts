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
import ru.jts.annotations.data.array.EnumArray;
import ru.jts.annotations.data.array.IntArray;

import java.util.List;

/**
 * @author : Camelion
 * @date : 21.08.12  22:23
 * <p/>
 * Класс, хранящий в себе координаты появления новых персонажей
 * Координата выбирается случайным образом из списка, который зависит от класса игрока
 */
public class InitialStartPoint {
    @Element(start = "point_begin", end = "point_end")
    public List<StartPoint> points;

    public static class StartPoint {
        // Список точек.
        @IntArray(name = "point", canBeNull = false)
        public List<int[]> points;

        // Целевые классы игроков
        @EnumArray(name = "class")
        public PlayerClasses[] classes;
    }

    public static enum PlayerClasses {
        human_fighter,
        human_magician,
        elf_fighter,
        elf_magician,
        darkelf_fighter,
        darkelf_magician,
        dwarf_apprentice,
        orc_fighter,
        orc_shaman,
        kamael_m_soldier,
        kamael_f_soldier
    }
}
