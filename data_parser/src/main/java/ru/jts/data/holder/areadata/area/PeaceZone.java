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

import ru.jts.annotations.data.array.EnumArray;
import ru.jts.annotations.data.class_annotations.ParseSuper;
import ru.jts.data.common.PlayerAction;

/**
 * @author : Camelion
 * @date : 25.08.12  0:31
 */
@ParseSuper
public class PeaceZone extends DefaultArea {
    // активно не во всех peace_zone областях
    @EnumArray
    private PlayerAction[] blocked_actions; // Запрещенные в этой зоне действия

    public PeaceZone() {
    }

    public PeaceZone(DefaultArea defaultSetting) {
        super(defaultSetting);
        blocked_actions = ((PeaceZone) defaultSetting).blocked_actions;
    }
}
