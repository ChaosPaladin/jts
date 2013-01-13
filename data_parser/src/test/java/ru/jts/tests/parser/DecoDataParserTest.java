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
import ru.jts.data.holder.DecoDataHolder;
import ru.jts.data.holder.decodata.Deco;
import ru.jts.data.parser.DecoDataParser;

/**
 * @author : Camelion
 * @date : 26.08.12  21:43
 */
public class DecoDataParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        DecoDataParser.getInstance().load();
    }

    @Test
    public void test() {
        DecoDataHolder holder = DecoDataHolder.getInstance();
        assertFalse(holder.getDecos().size() == 0);

        for (Deco deco : holder.getDecos()) {
            assertFalse(deco.name.isEmpty());
            assertTrue(deco.cost.length == 2);
            if (deco.func != Deco.DecoFunc.none) {
                assertTrue(deco.func_param > 0.0);
            }
        }
    }
}
