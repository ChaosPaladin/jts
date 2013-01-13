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
import ru.jts.data.holder.AnnounceSphereHolder;
import ru.jts.data.holder.announce_sphere.AnnounceArea;
import ru.jts.data.parser.AnnounceSphereParser;

/**
 * @author : Camelion
 * @date : 24.08.12  21:33
 */
public class AnnounceSphereParserTest extends Assert {

    @Before
    public void setUp() throws Exception {
        AnnounceSphereParser.getInstance().load();
    }

    @Test
    public void test() {
        AnnounceSphereHolder holder = AnnounceSphereHolder.getInstance();

        assertFalse(holder.getAnnounceAreas().isEmpty());

        for (AnnounceArea area : holder.getAnnounceAreas()) {
            // Test String id
            assertNotNull(area.string_id);
            assertFalse(area.string_id.isEmpty());

            //Test area range
            assertNotNull(area.area_range);
            assertTrue(area.area_range.length > 2); // У области должно быть больше двух точек
        }
    }
}
