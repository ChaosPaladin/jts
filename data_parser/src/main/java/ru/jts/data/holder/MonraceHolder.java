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

package ru.jts.data.holder;

import ru.jts.annotations.data.Element;
import ru.jts.common.parser.AbstractHolder;
import ru.jts.data.holder.monrace.MonRace;
import ru.jts.data.holder.monrace.MonRuner;
import ru.jts.data.holder.monrace.MonTrack;

import java.util.List;

/**
 * @author : Camelion
 * @date : 30.08.12  14:02
 */
public class MonraceHolder extends AbstractHolder {
    @Element(start = "race_begin", end = "race_end")
    private MonRace monRace;
    @Element(start = "track_begin", end = "track_end")
    private List<MonTrack> monTracks;
    @Element(start = "mon_begin", end = "mon_end")
    private List<MonRuner> monRuners;

    private static MonraceHolder ourInstance = new MonraceHolder();

    public static MonraceHolder getInstance() {
        return ourInstance;
    }

    private MonraceHolder() {
    }

    @Override
    public int size() {
        return 1 + monTracks.size() + monRuners.size();
    }

    public MonRace getMonRace() {
        return monRace;
    }

    public List<MonTrack> getMonTracks() {
        return monTracks;
    }

    public List<MonRuner> getMonRuners() {
        return monRuners;
    }
}
