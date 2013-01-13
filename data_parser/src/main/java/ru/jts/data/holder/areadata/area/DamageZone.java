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
import ru.jts.annotations.data.value.IntValue;

/**
 * @author : Camelion
 * @date : 25.08.12  2:19
 * <p/>
 * Зоны, в которых тем или иным образом персонажам наносится урон
 */
@ParseSuper
public class DamageZone extends DefaultArea {
    @IntValue
    private int damage_on_hp; // Урон по HP

    // Активно не для всех damage зон
    @IntValue
    private int damage_on_mp; // Урон по MP

    // Активно не для всех damage зон
    @IntValue
    private int message_no; // Номер сообщения из Systemmsg.dat эффекте зоны (вызывается с интервалом unit_tick)

    public DamageZone(DefaultArea defaultSetting) {
        super(defaultSetting);
        damage_on_hp = ((DamageZone) defaultSetting).damage_on_hp;
        damage_on_mp = ((DamageZone) defaultSetting).damage_on_mp;
        message_no = ((DamageZone) defaultSetting).message_no;
    }

    public DamageZone() {

    }
}
