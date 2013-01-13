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

package ru.jts.tests.parser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.jts.data.holder.NpcDataHolder;
import ru.jts.data.holder.npcdata.NpcData;
import ru.jts.data.parser.NpcDataParser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Camelion
 * @date : 30.08.12  14:45
 */
public class NpcDataParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        NpcDataParser.getInstance().load();
    }

    @Test
    public void test() {
        NpcDataHolder holder = NpcDataHolder.getInstance();
        assertFalse(holder.getNpcDatas().size() == 0);

        List<Integer> npcIds = new ArrayList<>();
        for (NpcData npcData : holder.getNpcDatas()) {
            assertFalse(npcData.npc_name.isEmpty());
            assertFalse(npcIds.contains(npcData.npc_class_id));
            npcIds.add(npcData.npc_class_id);

            assertNotNull(npcData.base_attack_type);
            assertNotNull(npcData.base_damage_range);
            assertNotNull(npcData.base_attribute_attack);
            assertNotNull(npcData.base_attribute_defend);
            assertNotNull(npcData.event_flag);

            // Test Drop data
            if (npcData.corpse_make_list.length > 0) {
                for (NpcData.DropInfo dropInfo : npcData.corpse_make_list) {
                    assertFalse(dropInfo.item_name.isEmpty());
                    assertTrue(dropInfo.min > 0);
                    //assertTrue(dropInfo.max >= dropInfo.min);
                    assertTrue(dropInfo.chance >= 0D);
                    assertTrue(dropInfo.chance <= 100D);
                }
            }
            if (npcData.additional_make_list.length > 0) {
                for (NpcData.DropInfo dropInfo : npcData.additional_make_list) {
                    assertFalse(dropInfo.item_name.isEmpty());
                    assertTrue(dropInfo.min > 0);
                    //assertTrue(dropInfo.max >= dropInfo.min);
                    assertTrue(dropInfo.chance >= 0D);
                    assertTrue(dropInfo.chance <= 100D);
                }
            }
            if (npcData.additional_make_multi_list.length > 0) {
                for (NpcData.DropGroup dropGroup : npcData.additional_make_multi_list) {
                    assertTrue(dropGroup.group_chance > 0D);

                    for (NpcData.DropInfo dropInfo : dropGroup.drops) {
                        assertFalse(dropInfo.item_name.isEmpty());
                        assertTrue(dropInfo.min > 0);
                        //assertTrue(dropInfo.max >= dropInfo.min);
                        assertTrue(dropInfo.chance >= 0D);
                        assertTrue(dropInfo.chance <= 100D);
                    }
                }
            }
            if (npcData.ex_item_drop_list.length > 0) {
                for (NpcData.DropGroup dropGroup : npcData.ex_item_drop_list) {
                    assertTrue(dropGroup.group_chance > 0D);

                    for (NpcData.DropInfo dropInfo : dropGroup.drops) {
                        assertFalse(dropInfo.item_name.isEmpty());
                        assertTrue(dropInfo.min > 0);
                        //assertTrue(dropInfo.max >= dropInfo.min);
                        assertTrue(dropInfo.chance >= 0D);
                        assertTrue(dropInfo.chance <= 100D);
                    }
                }
            }


            // Тест NPC AI
            assertNotNull(npcData.npc_ai);
            for (String key : npcData.npc_ai.params.keySet()) {
                assertFalse(key.isEmpty());
                Object val = npcData.npc_ai.params.get(key);
                assertNotNull(val);
                if (val instanceof String) {
                    assertFalse(((String) val).isEmpty());
                }
            }
        }
    }
}
