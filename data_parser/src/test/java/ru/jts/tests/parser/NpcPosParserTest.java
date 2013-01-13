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
import ru.jts.data.holder.NpcPosHolder;
import ru.jts.data.holder.npcpos.Domain;
import ru.jts.data.holder.npcpos.PosTerritory;
import ru.jts.data.parser.NpcPosParser;

/**
 * @author : Camelion
 * @date : 30.08.12  20:11
 */
public class NpcPosParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        NpcPosParser.getInstance().load();
    }

    @Test
    public void test() {
        NpcPosHolder holder = NpcPosHolder.getInstance();
        assertFalse(holder.getDomains().size() == 0);

        for (Domain domain : holder.getDomains()) {
            assertFalse(domain.name.isEmpty());
            assertTrue(domain.territory.length > 2);
        }

        assertFalse(holder.getTerritories().size() == 0);
        for (PosTerritory territory : holder.getTerritories()) {
            assertFalse(territory.name.isEmpty());
            assertTrue(territory.points.length > 2);
        }
    }
}
