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

package ru.jts.data.holder.doordata;

import ru.jts.annotations.data.class_annotations.ParseSuper;
import ru.jts.annotations.data.value.StringValue;

import java.util.List;

/**
 * @author : Camelion
 * @date : 26.08.12  22:31
 */
@ParseSuper
public class ObserverSignBoard extends DefaultSignBoard {
    @StringValue
    public String display_npc; // неизвестно, есть в npcdata.txt

    // Заполняется через SignBoardObjectFactory
    public List<ObserverGroup> observers;

    // Создается и заполняется через SignBoardObjectFactory
    public static class ObserverGroup {
        public int observer_group; // Id группы, устанавливается через SignBoardObjectFactory
        public List<int[]> observer_poses; // Неизвестно, какие - то координаты, и ещё куча информации
    }
}
