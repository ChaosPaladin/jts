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
import ru.jts.data.holder.InstantZoneDataHolder;
import ru.jts.data.holder.instantzonedata.InstantGroup;
import ru.jts.data.holder.instantzonedata.InstantZone;
import ru.jts.data.parser.InstantZoneDataParser;

import java.util.ArrayList;
import java.util.List;

import static ru.jts.data.holder.instantzonedata.InstantZone.EndPosType;

/**
 * @author : Camelion
 * @date : 27.08.12  14:00
 */
public class InstantZoneDataParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        InstantZoneDataParser.getInstance().load();
    }

    @Test
    public void test() {
        InstantZoneDataHolder holder = InstantZoneDataHolder.getInstance();

        assertFalse(holder.getInstantZones().size() == 0);
        for (InstantZone zone : holder.getInstantZones()) {
            assertFalse(zone.name.isEmpty());
            assertTrue(zone.max_channel > 0);
            assertTrue(zone.max_user > 0);
            assertNotNull(zone.entrance_conds);
            assertNotNull(zone.required_item);

            assertFalse(zone.start_poses.length == 0);
            if (zone.order_end_pos_type == EndPosType.nomination) {
                assertFalse(zone.end_poses.length == 0);
            } else if (zone.order_end_pos_type == EndPosType.origin) {
                assertTrue(zone.end_poses.length == 0);
            }
            if (zone.disorder_end_pos_type == EndPosType.nomination) {
                assertFalse(zone.disorder_end_poses.length == 0);
            } else if (zone.disorder_end_pos_type == EndPosType.origin) {
                assertTrue(zone.disorder_end_poses.length == 0);
            }

            assertNotNull(zone.door_list);
            assertNotNull(zone.area_list);
        }

        List<Integer> groupedInstanceIds = new ArrayList<>();
        assertFalse(holder.getInstantGroups().size() == 0);
        for (InstantGroup group : holder.getInstantGroups()) {
            assertFalse(group.instantzone_list.length == 0);
            for (int id : group.instantzone_list) { // Каждый инстанс может входить только в одну группу
                //assertFalse(groupedInstanceIds.contains(id));
                groupedInstanceIds.add(id);
            }

            assertNotNull(group.reset_binding);
        }
    }
}
