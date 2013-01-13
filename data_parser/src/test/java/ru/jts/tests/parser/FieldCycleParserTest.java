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
import ru.jts.data.holder.FieldCycleHolder;
import ru.jts.data.holder.fieldcycle.FieldCycle;
import ru.jts.data.parser.FieldCycleParser;

import java.util.ArrayList;
import java.util.List;

import static ru.jts.data.holder.fieldcycle.FieldCycle.Step;

/**
 * @author : Camelion
 * @date : 27.08.12  2:22
 */
public class FieldCycleParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        FieldCycleParser.getInstance().load();
    }

    @Test
    public void test() {
        FieldCycleHolder holder = FieldCycleHolder.getInstance();

        assertFalse(holder.getFieldCycles().size() == 0);

        for (FieldCycle cycle : holder.getFieldCycles()) {
            assertFalse(cycle.steps.size() == 0);

            List<Integer> stepIds = new ArrayList<>();
            for (Step step : cycle.steps) {
                assertFalse(stepIds.contains(step.step));
                stepIds.add(step.step);

                if (step.step_restart != null) {

                    assertTrue(step.step_restart.range.length > 2);
                    assertNotNull(step.step_restart.normal_point);
                    assertNotNull(step.step_restart.chao_point);
                }
                if (step.step_change_time != null) {
                    assertFalse(step.step_change_time.day_of_week.isEmpty());
                    assertTrue(step.step_change_time.time.length == 2);
                }
            }
        }
    }
}
