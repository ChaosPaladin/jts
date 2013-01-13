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
import org.junit.Before;
import org.junit.Test;
import ru.jts.data.ParserUtil;

import java.util.HashMap;

/**
 * @author : Camelion
 * @date : 22.08.12  19:28
 */
public class GetArrayTest extends Assert {
    public HashMap<String, String> equalsMap = new HashMap<>();
    public HashMap<String, String> notEqualsMap = new HashMap<>();

    @Before
    public void initData() {
        equalsMap.put("aaa = {absadasd}", "{absadasd}");
        equalsMap.put("aaa = {absadasd }", "{absadasd }");
        equalsMap.put(" aaa = { absadasd }", "{ absadasd }");
        equalsMap.put("aaa = {{bbb}}", "{{bbb}}");
        equalsMap.put("{ccc}", "{ccc}");
    }

    @Test
    public void test() {
        // Equals
        for (String key : equalsMap.keySet()) {
            String value = equalsMap.get(key);

            String array = String.valueOf(ParserUtil.getArray(0, new StringBuilder(key)));

            assertEquals(value, array);
        }
    }
}
