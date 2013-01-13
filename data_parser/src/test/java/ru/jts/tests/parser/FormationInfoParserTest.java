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
import ru.jts.data.holder.FormationInfoHolder;
import ru.jts.data.holder.formationinfo.FormationInfo;
import ru.jts.data.parser.FormationInfoParser;

/**
 * @author : Camelion
 * @date : 27.08.12  13:08
 */
public class FormationInfoParserTest extends Assert {

    @Before
    public void setUp() throws Exception {
        FormationInfoParser.getInstance().load();
    }

    @Test
    public void test() {
        FormationInfoHolder holder = FormationInfoHolder.getInstance();

        assertNotNull(holder.getFormationInfo());
        assertFalse(holder.getFormationInfo().formation_name.isEmpty());

        assertFalse(holder.getFormationInfo().poses.size() == 0);

        for (FormationInfo.FormationPos pos : holder.getFormationInfo().poses) {
            assertFalse(pos.pos_var.length == 0);
        }
    }
}
