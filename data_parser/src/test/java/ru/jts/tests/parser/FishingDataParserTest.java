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
import ru.jts.data.holder.FishingDataHolder;
import ru.jts.data.holder.fishingdata.*;
import ru.jts.data.parser.FishingDataParser;

import static ru.jts.data.holder.fishingdata.FishingDistribution.Distribution;

/**
 * @author : Camelion
 * @date : 27.08.12  2:51
 */
public class FishingDataParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        FishingDataParser.getInstance().load();
    }

    @Test
    public void test() {
        FishingDataHolder holder = FishingDataHolder.getInstance();

        assertFalse(holder.getDistributions().size() == 0);

        for (FishingDistribution distribution : holder.getDistributions()) {
            assertNotNull(distribution.default_distribution);
            assertNotNull(distribution.night_fishing_distribution);

            assertTrue(distribution.default_distribution.length > 0);
            assertTrue(distribution.night_fishing_distribution.length > 0);

            for (Distribution d : distribution.default_distribution) {
                assertNotNull(d.fish_group);
            }
            for (Distribution d : distribution.night_fishing_distribution) {
                assertNotNull(d.fish_group);
            }
        }

        assertFalse(holder.getFishingPlaces().size() == 0);

        for (FishingPlace place : holder.getFishingPlaces()) {
            assertNotNull(place.fishing_place_type);
            assertTrue(place.territory.length > 2);
        }

        assertFalse(holder.getFishingLures().size() == 0);

        for (Lure lure : holder.getFishingLures()) {
            assertNotNull(lure.lure_type);
            assertTrue(lure.fish_group_preference.length > 0);
            for (Distribution d : lure.fish_group_preference) {
                assertNotNull(d.fish_group);
            }
        }

        assertFalse(holder.getFishes().size() == 0);

        for (Fish fish : holder.getFishes()) {
            assertFalse(fish.item_name.isEmpty());
            assertNotNull(fish.fish_group);
            assertNotNull(fish.fish_grade);
        }

        assertFalse(holder.getFishingRods().size() == 0);

        for (FishingRod rod : holder.getFishingRods()) {
            assertFalse(rod.fishingrod_name.isEmpty());
        }
        assertFalse(holder.getFishingMonsters().size() == 0);

        for (FishingMonster monster : holder.getFishingMonsters()) {
            assertTrue(monster.user_level.length == 2);
            assertFalse(monster.fishingmonsters.length == 0);
        }
    }
}
