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
import ru.jts.data.holder.instantzonedata.InstantGroup;
import ru.jts.data.holder.instantzonedata.InstantZone;
import ru.jts.data.holder.instantzonedata.entrance_cond.CheckLevelEntranceCond;
import ru.jts.data.holder.instantzonedata.entrance_cond.CheckQuestEntranceCond;
import ru.jts.data.holder.instantzonedata.entrance_cond.DefaultEntranceCond;

import java.util.List;

/**
 * @author : Camelion
 * @date : 27.08.12  13:54
 */
public class InstantZoneDataHolder extends AbstractHolder {
    @Element(start = "instantzone_begin", end = "instantzone_end")
    private List<InstantZone> instantZones;
    @Element(start = "group_begin", end = "group_end")
    private List<InstantGroup> instantGroups;

    private static InstantZoneDataHolder ourInstance = new InstantZoneDataHolder();

    public static InstantZoneDataHolder getInstance() {
        return ourInstance;
    }

    private InstantZoneDataHolder() {
    }

    @Override
    public int size() {
        return instantZones.size() + instantGroups.size();
    }

    public List<InstantZone> getInstantZones() {
        return instantZones;
    }

    public List<InstantGroup> getInstantGroups() {
        return instantGroups;
    }

    public static class EntranceCondObjectFactory implements IObjectFactory<DefaultEntranceCond> {

        @Override
        public DefaultEntranceCond createObjectFor(StringBuilder data) throws IllegalAccessException, InstantiationException {
            if (data.indexOf("check_level") >= 0)
                return new CheckLevelEntranceCond();
            else if (data.indexOf("check_quest") >= 0)
                return new CheckQuestEntranceCond();

            return null;
        }

        @Override
        public void setFieldClass(Class<?> clazz) {
            // Ignored
        }
    }
}
