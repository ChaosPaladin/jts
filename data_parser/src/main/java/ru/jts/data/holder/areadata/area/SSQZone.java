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
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;

/**
 * @author : Camelion
 * @date : 25.08.12  14:23
 */
@ParseSuper
public class SSQZone extends DefaultArea {
    @IntValue
    private int exp_penalty_per; // штраф к опыту (в процентах)

    @EnumValue
    private OnOffZoneParam item_drop; // дроп вещей вкл/выкл

    public SSQZone(DefaultArea defaultSetting) {
        super(defaultSetting);
        exp_penalty_per = ((SSQZone) defaultSetting).exp_penalty_per;
        item_drop = ((SSQZone) defaultSetting).item_drop;
    }

    public SSQZone() {

    }
}
