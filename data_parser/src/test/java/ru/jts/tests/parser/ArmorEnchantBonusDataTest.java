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

import org.junit.Test;
import ru.jts.data.parser.ArmorEnchantBonusDataParser;

/**
 * @author : Camelion
 * @date : 24.08.12  21:43
 * <p/>
 * Тут собственно и нечего тестировать. Разве что успещную загрузку
 */
public class ArmorEnchantBonusDataTest {

    @Test
    public void test() throws Exception {
        ArmorEnchantBonusDataParser.getInstance().load();
    }
}
