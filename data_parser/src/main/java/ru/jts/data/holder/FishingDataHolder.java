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
import ru.jts.annotations.data.factory.IObjectFactory;
import ru.jts.common.parser.AbstractHolder;
import ru.jts.data.holder.fishingdata.*;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : Camelion
 * @date : 27.08.12  2:50
 */
public class FishingDataHolder extends AbstractHolder {
    @Element(start = "distribution_begin", end = "distribution_end")
    public List<FishingDistribution> distributions;
    @Element(start = "fishing_place_begin", end = "fishing_place_end")
    public List<FishingPlace> fishingPlaces;
    @Element(start = "lure_begin", end = "lure_end")
    public List<Lure> fishingLures;
    @Element(start = "fish_begin", end = "fish_end")
    public List<Fish> fishes;
    @Element(start = "fishingrod_begin", end = "fishingrod_end")
    public List<FishingRod> fishingRods;

    @Element(start = "fishingmonster_begin", end = "fishingmonster_end", objectFactory = FishingMonsterObjectFactory.class)
    public List<FishingMonster> fishingMonsters;

    private static FishingDataHolder ourInstance = new FishingDataHolder();

    public static FishingDataHolder getInstance() {
        return ourInstance;
    }

    private FishingDataHolder() {
    }

    @Override
    public int size() {
        return distributions.size() + fishingPlaces.size() + fishingLures.size() + fishes.size() + fishingRods.size()
                + fishingMonsters.size();
    }

    public List<FishingDistribution> getDistributions() {
        return distributions;
    }

    public List<FishingPlace> getFishingPlaces() {
        return fishingPlaces;
    }

    public List<Lure> getFishingLures() {
        return fishingLures;
    }

    public List<Fish> getFishes() {
        return fishes;
    }

    public List<FishingRod> getFishingRods() {
        return fishingRods;
    }

    public List<FishingMonster> getFishingMonsters() {
        return fishingMonsters;
    }

    private static final Pattern fishingMonsterPattern = Pattern.compile("fishingmonsters=\\{([\\S;]+)}");

    public static class FishingMonsterObjectFactory implements IObjectFactory<FishingMonster> {
        private Class<?> clazz;

        @Override
        public FishingMonster createObjectFor(StringBuilder data) throws IllegalAccessException, InstantiationException {
            FishingMonster monster = (FishingMonster) clazz.newInstance();

            Matcher matcher = fishingMonsterPattern.matcher(data);
            if (matcher.find()) {
                monster.fishingmonsters = matcher.group(1).split(";");
            }

            return monster;
        }

        @Override
        public void setFieldClass(Class<?> clazz) {
            this.clazz = clazz;
        }
    }
}
