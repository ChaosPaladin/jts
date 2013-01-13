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
import ru.jts.annotations.data.value.StringValue;

/**
 * @author : Camelion
 * @date : 25.08.12  13:59
 */
@ParseSuper
public class InstantSkillZone extends DefaultArea {
    @StringValue
    private String skill_name; // название скила, используемого зоной

    @IntValue
    private int skill_prob; // неизвестно

    public InstantSkillZone(DefaultArea defaultSetting) {
        super(defaultSetting);
        skill_name = ((InstantSkillZone) defaultSetting).skill_name;
        skill_prob = ((InstantSkillZone) defaultSetting).skill_prob;
    }

    public InstantSkillZone() {


    }
}
