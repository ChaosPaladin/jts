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
import ru.jts.data.holder.DyeDataHolder;
import ru.jts.data.holder.dyedata.DyeData;
import ru.jts.data.parser.DyeDataParser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Camelion
 * @date : 27.08.12  1:49
 */
public class DyeDataParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        DyeDataParser.getInstance().load();
    }

    @Test
    public void test() {
        DyeDataHolder holder = DyeDataHolder.getInstance();

        assertFalse(holder.getDyes().size() == 0);

        List<Integer> dyeIds = new ArrayList<>();
        for (DyeData dye : holder.getDyes()) {
            assertFalse(dye.dye_name.isEmpty());
            assertFalse(dyeIds.contains(dye.dye_id));
            dyeIds.add(dye.dye_id);

            assertTrue(dye.dye_item_id > 0);
            assertTrue(dye.need_count > 0);
            assertFalse(dye.wear_class.length == 0);
        }
    }
}
