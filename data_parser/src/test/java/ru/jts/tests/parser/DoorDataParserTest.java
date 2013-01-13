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
import ru.jts.data.holder.DoorDataHolder;
import ru.jts.data.holder.doordata.Chair;
import ru.jts.data.holder.doordata.ControlTower;
import ru.jts.data.holder.doordata.DefaultSignBoard;
import ru.jts.data.holder.doordata.Door;
import ru.jts.data.parser.DoorDataParser;

import static ru.jts.data.holder.doordata.ControlTower.ControlTowerType;
import static ru.jts.data.holder.doordata.Door.DoorType;

/**
 * @author : Camelion
 * @date : 26.08.12  22:57
 */
public class DoorDataParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        DoorDataParser.getInstance().load();
    }

    @Test
    public void test() {
        DoorDataHolder holder = DoorDataHolder.getInstance();

        assertFalse(holder.getDoors().size() == 0);

        for (Door door : holder.getDoors()) {
            assertFalse(door.door_name.isEmpty());
            assertNotNull(door.type);
            if (door.master_name != null) {
                assertNotNull(door.master_open_event);
                assertNotNull(door.master_close_event);
            }

            if (door.type == DoorType.child_type) {
                assertNotNull(door.parent);
                assertFalse(door.parent.isEmpty());
            }
        }

        assertFalse(holder.getChairs().size() == 0);

        for (Chair chair : holder.getChairs()) {
            assertFalse(chair.name.isEmpty());
            assertNotNull(chair.pos);
        }

        assertFalse(holder.getSignBoards().size() == 0);

        for (DefaultSignBoard signBoard : holder.getSignBoards()) {
            assertFalse(signBoard.signBoardName.isEmpty());
            assertNotNull(signBoard.pos);
        }

        assertFalse(holder.getControlTowers().size() == 0);

        for (ControlTower tower : holder.getControlTowers()) {
            assertFalse(tower.name.isEmpty());
            assertFalse(tower.display_npc_working.isEmpty());
            assertFalse(tower.display_npc_not_working.isEmpty());
            assertNotNull(tower.pos);
            assertNotNull(tower.controltower_type);
            assertNotNull(tower.toggle);
            if (tower.controltower_type != ControlTowerType.life_control)
                assertFalse(tower.control_area.length == 0);
        }
    }
}
