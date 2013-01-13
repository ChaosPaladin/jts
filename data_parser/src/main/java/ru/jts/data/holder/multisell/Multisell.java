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

package ru.jts.data.holder.multisell;

import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.array.StringArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;
import ru.jts.data.common.ItemName_Count;

/**
 * @author : Camelion
 * @date : 30.08.12  14:24
 */
public class Multisell {
    @StringValue(withoutName = true)
    public String multisell_name;
    @IntValue(withoutName = true)
    public int multisell_id;

    @StringArray(name = "required_npc")
    public String[] required_npcs = new String[0];

    @IntValue
    public int is_dutyfree = 0;
    @IntValue
    public int is_show_all = 1;
    @IntValue
    public int keep_enchanted = 0;
    @IntValue
    public int show_variation_item = 0;

    @ObjectArray
    public SellInfo[] selllist;

    public static class SellInfo {
        @ObjectArray(withoutName = true)
        public ItemName_Count[] product_infos;
        @ObjectArray(withoutName = true)
        public ItemName_Count[] ingredient_infos;
    }
}
