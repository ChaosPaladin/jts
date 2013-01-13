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
import ru.jts.data.holder.ManorDataHolder;
import ru.jts.data.holder.manordata.ManorData;
import ru.jts.data.parser.ManorDataParser;

/**
 * @author : Camelion
 * @date : 30.08.12  13:17
 */
public class ManorDataParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        ManorDataParser.getInstance().load();
    }

    @Test
    public void test() {
        ManorDataHolder holder = ManorDataHolder.getInstance();

        assertFalse(holder.getManorDatas().size() == 0);

        for (ManorData manorData : holder.getManorDatas()) {
            assertTrue(manorData.manor_id > 0);
            assertTrue(manorData.residence_id > 0);
            assertFalse(manorData.manor_name.isEmpty());
            assertFalse(manorData.crop_list.length == 0);

            for (ManorData.CropInfo cropInfo : manorData.crop_list) {
                assertFalse(cropInfo.unknownItem1.isEmpty());
                assertFalse(cropInfo.unknownItem2.isEmpty());
                assertFalse(cropInfo.unknownItem3.isEmpty());

                assertTrue(cropInfo.unknownInt1 > 0);
                assertTrue(cropInfo.unknownInt2 > 0);
                assertTrue(cropInfo.unknownInt3 > 0);
            }
        }
    }
}
