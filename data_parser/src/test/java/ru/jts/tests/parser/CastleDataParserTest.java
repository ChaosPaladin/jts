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
import ru.jts.data.holder.CastleDataHolder;
import ru.jts.data.holder.castledata.*;
import ru.jts.data.parser.CastleDataParser;

import static ru.jts.data.holder.castledata.Residence.ResidenceGuardMap;
import static ru.jts.data.holder.castledata.Residence.ResidenceHolything;

/**
 * @author : Camelion
 * @date : 25.08.12  23:05
 */
public class CastleDataParserTest extends Assert {
    @Before
    public void setUp() throws Exception {

        CastleDataParser.getInstance().load();
    }

    @Test
    public void test() {
        CastleDataHolder holder = CastleDataHolder.getInstance();

        testSiegeMusic(holder);

        testCastle(holder);
        testAgit(holder);
        testDominion(holder);
        testFortress(holder);
    }

    private void testFortress(CastleDataHolder holder) {
        for (Fortress fortress : holder.getFortresses()) {
            testResidence(fortress);

            assertNotNull(fortress.battlefield_territory);
            assertTrue(fortress.battlefield_territory.points.length > 2);
            assertNotNull(fortress.headquarter_territory);
            assertTrue(fortress.headquarter_territory.points.length > 2);

            assertFalse(fortress.chao_restart_point_list.length == 0);
            assertFalse(fortress.residence_gate_list.length == 0);
            assertFalse(fortress.residence_skill_list.length == 0);

            assertFalse(fortress.fortress_related_castle.length == 0);

            assertNotNull(fortress.fortress_flagpole);
            assertFalse(fortress.fortress_flagpole.fort_flagpole.isEmpty());
            assertNotNull(fortress.fortress_flagpole.point);

            assertFalse(fortress.fortress_flag.isEmpty());
            assertFalse(fortress.flag_points.length == 0);
        }
    }

    private void testDominion(CastleDataHolder holder) {
        for (Dominion dominion : holder.getDominions()) {
            testResidence(dominion);

            assertNotNull(dominion.battlefield_territory);
            assertTrue(dominion.battlefield_territory.points.length > 2);

            assertFalse(dominion.residence_guard_mapping.length == 0);
            for (ResidenceGuardMap map : dominion.residence_guard_mapping) {
                assertFalse(map.ssq_type.length == 0);
            }

            assertTrue(dominion.siege_term > 0);
            assertFalse(dominion.dominion_main_castle.isEmpty());
            assertTrue(dominion.ownthing.length == holder.getCastles().size());
            assertFalse(dominion.pickup_ownthing.isEmpty());
            assertFalse(dominion.hide_name_item.isEmpty());
        }
    }

    private void testAgit(CastleDataHolder holder) {
        for (Agit agit : holder.getAgits()) {
            testResidence(agit);

            assertFalse(agit.owning_npc_list.length == 0);
            assertFalse(agit.residence_gate_list.length == 0);
        }
    }

    private void testCastle(CastleDataHolder holder) {
        for (Castle castle : holder.getCastles()) {
            testResidence(castle);

            // Territory
            assertNotNull(castle.battlefield_territory);
            assertTrue(castle.battlefield_territory.points.length > 2);
            assertNotNull(castle.headquarter_territory);
            assertTrue(castle.headquarter_territory.points.length > 2);

            assertFalse(castle.chao_restart_point_list.length == 0);

            assertFalse(castle.residence_guard_mapping.length == 0);
            for (ResidenceGuardMap map : castle.residence_guard_mapping) {
                assertFalse(map.ssq_type.length == 0);
            }

            assertTrue(castle.siege_term > 0);

            assertFalse(castle.control_tower_list.length == 0);
            assertFalse(castle.holything.length == 0);

            for (ResidenceHolything holything : castle.holything) {
                assertFalse(holything.name.isEmpty());
            }

            assertNotNull(castle.owner_restart_territory);
            assertFalse(castle.owner_restart_territory.length == 0);
            assertFalse(castle.residence_skill_list.length == 0);

            assertFalse(castle.owning_npc_list.length == 0);
            assertFalse(castle.residence_gate_list.length == 0);
        }
    }

    private void testResidence(Residence residence) {
        assertFalse(residence.residence_name.isEmpty());
        assertTrue(residence.residence_id > 0);

        assertNotNull(residence.residence_territory);
        assertTrue(residence.residence_territory.points.length > 2);

        assertFalse(residence.owner_restart_point_list.length == 0);
        assertFalse(residence.other_restart_village_list.length == 0);
        assertFalse(residence.banish_point_list.length == 0);

        assertNotNull(residence.next_siege);
    }

    private void testSiegeMusic(CastleDataHolder holder) {
        // Test castle siege music
        for (SiegeMusic music : holder.getCastleSiegeMusic()) {
            assertNotNull(music.sound);
            assertFalse(music.sound.isEmpty());
        }

        // Test fortress siege music
        for (SiegeMusic music : holder.getFortressSiegeMusic()) {
            assertNotNull(music.sound);
            assertFalse(music.sound.isEmpty());
        }
    }
}
