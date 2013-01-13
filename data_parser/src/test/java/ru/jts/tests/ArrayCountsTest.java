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
 * @date : 22.08.12  16:00
 * <p/>
 * Массив нулевого уровня: {abc}
 * Массив первого уровня: {{abc}}
 * Массив первого уровня, включающий в себя два массива нулевого уровня {{abc};{cba}}
 */
public class ArrayCountsTest extends Assert {
    public HashMap<String, Integer[]> equalsMap = new HashMap<>();
    public HashMap<String, Integer[]> notEqualsMap = new HashMap<>();

    @Before
    public void initData() {
        equalsMap.put("{absadasd}", new Integer[]{1, 1}); // 1 массив первого уровня
        equalsMap.put("{{asdas};{asdasd}}", new Integer[]{1, 1}); // 1 массив первого уровня
        equalsMap.put("{{asdas};{asdasd};{asdla}}", new Integer[]{3, 2}); // 3 массива второго уровня
        equalsMap.put("{asdas};{asdasd};{asdla}", new Integer[]{3, 1}); // 3 массива первого уровня
        equalsMap.put("{{{Массив второго уровня};{Массив второго уровня}}}", new Integer[]{2, 3}); // 2 массива третьего уровня
        equalsMap.put("{{a};{b};{c};{d};{e};{f};{g}}", new Integer[]{7, 2}); // 7 массивов второго уровня


        notEqualsMap.put("{{asdas};{asdasd};{asdla}}", new Integer[]{3, 3}); // в исходной строке отсутствуют массивы третьего уровня
        notEqualsMap.put("{{asdas};{asdasd};{asdla}}", new Integer[]{2, 1}); // в исходной строке только один массив первого уровня
    }

    @Test
    public void test() throws Exception {
        // Equals
        for (String key : equalsMap.keySet()) {
            Integer[] m = equalsMap.get(key);

            int arrayCounts = ParserUtil.getArrayCounts(new StringBuilder(key), m[1]);

            assertEquals((int) m[0], arrayCounts);
        }

        // Not equals
        for (String key : notEqualsMap.keySet()) {
            Integer[] m = notEqualsMap.get(key);

            int arrayCounts = ParserUtil.getArrayCounts(new StringBuilder(key), m[1]);

            assertFalse(m[0] == arrayCounts);
        }
    }
}
