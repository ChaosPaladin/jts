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
import ru.jts.annotations.data.factory.DefaultFactory;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.data.Parser;

/**
 * @author : Camelion
 * @date : 24.08.12  13:55
 */
public class FillObjectArrayTest extends Assert {
    public static final Object[][] TEST_DATA = {{
            // Заполняемый массив, строка буффера, canBeNull, ожидаемые значения
            new IntObj[1], "{{234}}", false, new IntObj[]{new IntObj(234)}
    }, {
            new IntObj[2], "{{345};{543}}", false, new IntObj[]{new IntObj(345), new IntObj(543)}
    }, {
            new IntObj[3], "{{456};{654};{546}}", false, new IntObj[]{new IntObj(456), new IntObj(654), new IntObj(546)}
    }, {
            new IntObj[2][], "{{{567};{654}};{{546}}}", false, new IntObj[][]{{new IntObj(567), new IntObj(654)}, {new IntObj(546)}}
    }, {
            new IntObj[2], "{{};{1}}", true, new IntObj[]{null, new IntObj(1)}
    },};

    @Test
    public void test() throws Exception {
        DefaultFactory factory = new DefaultFactory();
        factory.setFieldClass(IntObj.class);
        for (Object[] objects : TEST_DATA) {
            Object[] array = (Object[]) objects[0];
            StringBuilder buffer = new StringBuilder((String) objects[1]);
            Boolean canBeNull = (Boolean) objects[2];
            Object[] expected = (Object[]) objects[3];

            Parser.fillObjectArray(array, buffer, array.getClass().getComponentType(), factory, canBeNull);

            assertArrayEquals(expected, array);
        }
    }

    public static class IntObj {
        public IntObj() {

        }

        public IntObj(int intValue) {
            this.intValue = intValue;
        }

        @IntValue(withoutName = true)
        public int intValue;

        @Override
        public boolean equals(Object object) {
            return object instanceof IntObj
                    && ((IntObj) object).intValue == intValue;
        }
    }
}
