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
import ru.jts.data.holder.MinigameHolder;
import ru.jts.data.holder.minigame.BlockupsetSettings;
import ru.jts.data.parser.MinigameParser;

/**
 * @author : Camelion
 * @date : 30.08.12  13:34
 */
public class MingameParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        MinigameParser.getInstance().load();
    }

    @Test
    public void test() {
        MinigameHolder holder = MinigameHolder.getInstance();

        assertNotNull(holder.getBlockupsetSettings());
        assertTrue(holder.getBlockupsetSettings().blue_enter_skill.length > 0);
        assertTrue(holder.getBlockupsetSettings().red_enter_skill.length > 0);
        assertTrue(holder.getBlockupsetSettings().waiting_skill.length > 0);

        assertNotNull(holder.getBlockupsetSettings().default_reward);
        assertNotNull(holder.getBlockupsetSettings().winner_reward);

        assertTrue(holder.getBlockupsetSettings().delete_items_after_match.length > 0);

        assertTrue(holder.getBlockupsetSettings().stages.size() > 0);
        for (BlockupsetSettings.BlockupsetStage stage : holder.getBlockupsetSettings().stages) {
            assertTrue(stage.blockupset_zone_territory.length > 2);
            assertTrue(stage.red_start_point.points.size() > 0);
            assertTrue(stage.blue_start_point.points.size() > 0);
            assertTrue(stage.red_banish_point.points.size() > 0);
            assertTrue(stage.blue_banish_point.points.size() > 0);
        }
    }
}
