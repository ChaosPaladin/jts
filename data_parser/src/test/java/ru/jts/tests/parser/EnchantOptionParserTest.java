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
import ru.jts.data.holder.EnchantOptionHolder;
import ru.jts.data.holder.enchantoption.EnchantOption;
import ru.jts.data.parser.EnchantOptionParser;

import static ru.jts.data.holder.enchantoption.EnchantOption.Option;

/**
 * @author : Camelion
 * @date : 27.08.12  2:02
 */
public class EnchantOptionParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        EnchantOptionParser.getInstance().load();
    }

    @Test
    public void test() {
        EnchantOptionHolder holder = EnchantOptionHolder.getInstance();

        assertFalse(holder.getEnchantOptions().size() == 0);

        for (EnchantOption enchantOption : holder.getEnchantOptions()) {
            assertFalse(enchantOption.item.isEmpty());
            assertTrue(enchantOption.options.length > 0);

            for (Option option : enchantOption.options) {
                assertTrue(option.option_names.length > 0);
            }
        }
    }
}
