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

package ru.jts.data.holder.npcpos.maker_ex;

import ru.jts.annotations.data.Element;
import ru.jts.annotations.data.class_annotations.ParseSuper;
import ru.jts.annotations.data.value.ObjectValue;
import ru.jts.annotations.data.value.StringValue;
import ru.jts.data.holder.NpcPosHolder;
import ru.jts.data.holder.npcpos.DefaultMaker;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author : Camelion
 * @date : 30.08.12  21:15
 */
@ParseSuper
public class NpcMakerEx extends DefaultMaker {
    @StringValue
    public String name;
    @StringValue
    public String ai;

    @ObjectValue(dotAll = false, objectFactory = NpcPosHolder.AiParamsObjectFactory.class)
    public AIParameters ai_parameters = new AIParameters(); // Присутствует всегда, params может быть пустым

    @Element(start = "npc_ex_begin", end = "npc_ex_end")
    public List<NpcEx> npcs;

    public static class AIParameters {
        public Map<String, Object> params;

        public AIParameters(Map<String, Object> params) { // Конструктор для NpcAIObjectFactory
            this.params = params;
        }

        public AIParameters() {
            this.params = Collections.emptyMap();
        }
    }
}
