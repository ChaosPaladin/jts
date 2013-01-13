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

package ru.jts.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.jts.data.ParserUtil;

/**
 * @author : Camelion
 * @date : 22.08.12  22:57
 */
public class MayBeNullTest extends Assert {
    public Object[][] data = {
            {"", true}, {"{}", true},
            {"{a}", false}, {"0101", false},
            {"abc", false}, {"   \t\n;", true},
            {"{asda} \n\t{sad}", false}, {"{asd}  \t\n;", false},

    };


    @Test
    public void test() {
        for (Object[] object : data) {
            StringBuffer buffer = new StringBuffer((String) object[0]);

            Boolean excepted = (Boolean) object[1];

            Boolean actual = ParserUtil.mayBeNullObject(buffer);
            assertEquals(excepted, actual);
        }
    }
}
