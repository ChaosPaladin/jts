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
import ru.jts.data.holder.ItemDataHolder;
import ru.jts.data.holder.itemdata.ItemData;
import ru.jts.data.holder.itemdata.ItemSet;
import ru.jts.data.parser.ItemDataParser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Camelion
 * @date : 27.08.12  17:10
 */
public class ItemDataParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        ItemDataParser.getInstance().load();
    }

    @Test
    public void test() {
        ItemDataHolder holder = ItemDataHolder.getInstance();

        assertFalse(holder.getItemDatas().size() == 0);
        for (ItemData itemData : holder.getItemDatas()) {
            assertFalse(itemData.item_name.isEmpty());
            assertNotNull(itemData.item_type);
            assertNotNull(itemData.default_action);
            assertNotNull(itemData.consume_type);
            assertNotNull(itemData.material_type);
            assertNotNull(itemData.crystal_type);
            assertFalse(itemData.html.isEmpty());

            switch (itemData.item_type) {
                case weapon:
                    assertNotNull(itemData.weapon_type);
                    break;
                case armor:
                    assertNotNull(itemData.armor_type);
                    break;
                case etcitem:
                    assertNotNull(itemData.etcitem_type);
                    break;
            }
        }

        assertFalse(holder.getItemSets().size() == 0);

        List<Integer> setIds = new ArrayList<>();
        for (ItemSet itemSet : holder.getItemSets()) {
            assertTrue(itemSet.set_id > 0);
            assertFalse(setIds.contains(itemSet.set_id));
            setIds.add(itemSet.set_id);
        }
    }
}
