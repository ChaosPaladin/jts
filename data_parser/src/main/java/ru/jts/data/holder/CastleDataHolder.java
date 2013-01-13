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
import ru.jts.annotations.data.ElementArray;
import ru.jts.common.parser.AbstractHolder;
import ru.jts.data.holder.castledata.*;

import java.util.List;

/**
 * @author : Camelion
 * @date : 25.08.12  22:53
 */
public class CastleDataHolder extends AbstractHolder {
    @ElementArray(start = "castle_siege_music_begin", end = "castle_siege_music_end")
    private SiegeMusic[] castleSiegeMusic;
    @ElementArray(start = "fortress_siege_music_begin", end = "fortress_siege_music_end")
    private SiegeMusic[] fortressSiegeMusic;

    @Element(start = "castle_begin", end = "castle_end")
    private List<Castle> castles;

    @Element(start = "agit_begin", end = "agit_end")
    private List<Agit> agits;

    @Element(start = "dominion_begin", end = "dominion_end")
    private List<Dominion> dominions;

    @Element(start = "fortress_begin", end = "fortress_end")
    private List<Fortress> fortresses;

    @Element(start = "castle_common_begin", end = "castle_common_end")
    private CastleCommon castle_common;

    private static CastleDataHolder ourInstance = new CastleDataHolder();

    public static CastleDataHolder getInstance() {
        return ourInstance;
    }

    private CastleDataHolder() {
    }

    @Override
    public int size() {
        return castleSiegeMusic.length + fortressSiegeMusic.length
                + castles.size() + agits.size() + dominions.size() + fortresses.size();
    }

    public SiegeMusic[] getCastleSiegeMusic() {
        return castleSiegeMusic;
    }

    public SiegeMusic[] getFortressSiegeMusic() {
        return fortressSiegeMusic;
    }

    public List<Castle> getCastles() {
        return castles;
    }

    public List<Agit> getAgits() {
        return agits;
    }

    public List<Dominion> getDominions() {
        return dominions;
    }

    public List<Fortress> getFortresses() {
        return fortresses;
    }
}
