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
import ru.jts.data.holder.CubicDataHolder;
import ru.jts.data.holder.cubicdata.Agathion;
import ru.jts.data.holder.cubicdata.Cubic;
import ru.jts.data.holder.cubicdata.DefaultCubicData;
import ru.jts.data.parser.CubicDataParser;

import static ru.jts.data.holder.cubicdata.DefaultCubicData.TargetType;

/**
 * @author : Camelion
 * @date : 26.08.12  13:13
 */
public class CubicDataParserTest extends Assert {

    @Before
    public void setUp() throws Exception {
        CubicDataParser.getInstance().load();
    }

    @Test
    public void test() {
        CubicDataHolder holder = CubicDataHolder.getInstance();
        for (Cubic cubic : holder.getCubics()) {
            testCubicData(cubic);
        }

        for (Agathion agathion : holder.getAgathions()) {
            testCubicData(agathion);
            if (agathion.timeskill1 != null) {
                assertFalse(agathion.timeskill1.skill_name.isEmpty());

                if (agathion.target_type.type == TargetType.by_skill) {
                    assertNotNull(agathion.timeskill1.skill_target_type);
                }
            }
            if (agathion.timeskill2 != null) {
                assertFalse(agathion.timeskill2.skill_name.isEmpty());

                if (agathion.target_type.type == TargetType.by_skill) {
                    assertNotNull(agathion.timeskill2.skill_target_type);
                }
            }
            if (agathion.timeskill3 != null) {
                assertFalse(agathion.timeskill3.skill_name.isEmpty());

                if (agathion.target_type.type == TargetType.by_skill) {
                    assertNotNull(agathion.timeskill3.skill_target_type);
                }
            }
        }
    }

    private void testCubicData(DefaultCubicData cubic) {
        assertNotNull(cubic.target_type);

        if (cubic.target_type.type == TargetType.target) {
            assertNotNull(cubic.op_cond);
        } else {
            assertNull(cubic.op_cond);
        }

        if (cubic.skill1 != null) {
            assertFalse(cubic.skill1.skill_name.isEmpty());

            if (cubic.target_type.type == TargetType.by_skill) {
                assertNotNull(cubic.skill1.skill_target_type);
                assertNotNull(cubic.skill1.skill_op_cond);
            }
        }
        if (cubic.skill2 != null) {
            assertFalse(cubic.skill2.skill_name.isEmpty());

            if (cubic.target_type.type == TargetType.by_skill) {
                assertNotNull(cubic.skill2.skill_target_type);
                assertNotNull(cubic.skill2.skill_op_cond);
            }
        }
        if (cubic.skill3 != null) {
            assertFalse(cubic.skill3.skill_name.isEmpty());

            if (cubic.target_type.type == TargetType.by_skill) {
                assertNotNull(cubic.skill3.skill_target_type);
                assertNotNull(cubic.skill3.skill_op_cond);
            }
        }
    }
}
