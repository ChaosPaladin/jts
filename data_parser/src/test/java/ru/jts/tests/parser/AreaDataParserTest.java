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
import ru.jts.data.holder.AreaDataHolder;
import ru.jts.data.holder.areadata.AreaType;
import ru.jts.data.holder.areadata.area.DefaultArea;
import ru.jts.data.parser.AreaDataParser;

/**
 * @author : Camelion
 * @date : 24.08.12  23:25
 */
public class AreaDataParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        AreaDataParser.getInstance().load();
    }

    @Test
    public void test() {
        AreaDataHolder holder = AreaDataHolder.getInstance();

        for (DefaultArea area : holder.getAreas()) {
            assertFalse(area.name.isEmpty());
            assertFalse(area.map.length == 0);

            if (area.type != AreaType.water)
                assertFalse(area.ranges.length == 0);
        }
    }
}
