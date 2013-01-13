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

import ru.jts.annotations.data.array.LinkedArray;
import ru.jts.annotations.data.class_annotations.ParseSuper;
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;
import ru.jts.data.holder.areadata.SkillActionType;

import static ru.jts.data.holder.areadata.area.DefaultArea.OnOffZoneParam.off;

/**
 * @author : Camelion
 * @date : 25.08.12  2:36
 */
@ParseSuper
public class PoisonZone extends DefaultArea {
    // Активно не для всех poison зон
    @LinkedArray
    private int[] skill_list; // Список скилов

    // Активно не для всех poison зон
    @EnumValue
    private SkillActionType skill_action_type; // Неизвестно, вероятно обозначение того, как будут использоваться скилы из skill_list

    // Активно не для всех poison зон (но присутствует в параметрах по умолчанию)
    @StringValue
    private String skill_name; // название скила, используемого зоной

    @IntValue
    private int skill_prob; // неизвестно


    // Активно не для всех poison зон
    @EnumValue
    private OnOffZoneParam show_dangerzone = off; // Показывать или нет значок опасной зоны?

    public PoisonZone(DefaultArea defaultSetting) {
        super(defaultSetting);
        skill_list = ((PoisonZone) defaultSetting).skill_list;
        skill_action_type = ((PoisonZone) defaultSetting).skill_action_type;
        skill_name = ((PoisonZone) defaultSetting).skill_name;
        skill_prob = ((PoisonZone) defaultSetting).skill_prob;
    }

    public PoisonZone() {

    }
}
