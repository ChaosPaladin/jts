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
import ru.jts.data.holder.MultisellHolder;
import ru.jts.data.holder.multisell.Multisell;
import ru.jts.data.parser.MultisellParser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Camelion
 * @date : 30.08.12  14:25
 */
public class MultisellParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        MultisellParser.getInstance().load();
    }

    @Test
    public void test() {
        MultisellHolder holder = MultisellHolder.getInstance();

        assertFalse(holder.getMultisells().size() == 0);

        List<Integer> multisellIds = new ArrayList<>();
        for (Multisell multisell : holder.getMultisells()) {
            assertFalse(multisell.multisell_name.isEmpty());
            assertFalse(multisellIds.contains(multisell.multisell_id));
            multisellIds.add(multisell.multisell_id);

            assertFalse(multisell.selllist.length == 0);
            for (Multisell.SellInfo sellInfo : multisell.selllist) {
                assertFalse(sellInfo.product_infos.length == 0);
                assertFalse(sellInfo.ingredient_infos.length == 0);
            }
        }
    }
}
