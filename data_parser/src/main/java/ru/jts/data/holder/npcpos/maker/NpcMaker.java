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

package ru.jts.data.holder.npcpos.maker;

import ru.jts.annotations.data.Element;
import ru.jts.annotations.data.class_annotations.ParseSuper;
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.data.holder.npcpos.DefaultMaker;
import ru.jts.data.holder.npcpos.maker.spawn_time.DefaultSpawnTime;

import java.util.List;

/**
 * @author : Camelion
 * @date : 30.08.12  20:20
 */
@ParseSuper
public class NpcMaker extends DefaultMaker {
    @EnumValue
    public InitialSpawn initial_spawn; // Присутствует везде

    public DefaultSpawnTime spawn_time; // Может быть null. Задается через NpcMakerObjectFactory

    @Element(start = "npc_begin", end = "npc_end")
    public List<Npc> npcs;

    public static enum InitialSpawn {
        all, // Остальные значения не известны
    }
}
