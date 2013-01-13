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
import ru.jts.data.holder.FreewayInfoHolder;
import ru.jts.data.holder.freeway.Freeway;
import ru.jts.data.parser.FreewayInfoParser;

/**
 * @author : Camelion
 * @date : 27.08.12  13:15
 */
public class FreewayInfoParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        FreewayInfoParser.getInstance().load();
    }

    @Test
    public void test() {
        FreewayInfoHolder holder = FreewayInfoHolder.getInstance();

        assertFalse(holder.getFreeways().size() == 0);
        for (Freeway way : holder.getFreeways()) {
            assertFalse(way.freeway_name.isEmpty());

            assertFalse(way.nodes.size() == 0);

            for (Freeway.FreewayNode node : way.nodes) {
                assertNotNull(node.pos);
            }
        }
    }
}
