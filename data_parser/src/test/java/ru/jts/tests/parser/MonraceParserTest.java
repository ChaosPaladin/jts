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
import ru.jts.data.holder.MonraceHolder;
import ru.jts.data.holder.monrace.MonRuner;
import ru.jts.data.holder.monrace.MonTrack;
import ru.jts.data.parser.MonraceParser;

/**
 * @author : Camelion
 * @date : 30.08.12  14:03
 */
public class MonraceParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        MonraceParser.getInstance().load();
    }

    @Test
    public void test() {
        MonraceHolder holder = MonraceHolder.getInstance();
        assertNotNull(holder.getMonRace());

        assertFalse(holder.getMonRace().begin_music.isEmpty());
        assertFalse(holder.getMonRace().begin_sound.isEmpty());
        assertTrue(holder.getMonRace().race_areas.length > 0);

        assertFalse(holder.getMonTracks().size() == 0);
        for (MonTrack monTrack : holder.getMonTracks()) {
            assertTrue(monTrack.track_coords.length == 6);
        }

        assertFalse(holder.getMonRuners().size() == 0);
        for (MonRuner monRuner : holder.getMonRuners()) {
            assertTrue(monRuner.npc_class_id > 0);
            assertFalse(monRuner.mon_name.isEmpty());
            assertTrue(monRuner.guts.length == 20);
        }
    }
}
