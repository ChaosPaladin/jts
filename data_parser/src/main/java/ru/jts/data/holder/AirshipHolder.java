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
import ru.jts.data.holder.airship.AirPort;
import ru.jts.data.holder.airship.AirShip;
import ru.jts.data.holder.airship.AirshipArea;

import java.util.List;

/**
 * @author : Camelion
 * @date : 24.08.12  12:23
 * <p/>
 * Воздушные корабли и воздушные аэропорты
 */
public class AirshipHolder extends AbstractHolder {

    @Element(start = "airport_begin", end = "airport_end")
    private List<AirPort> airPorts;

    @Element(start = "airship_begin", end = "airship_end")
    private List<AirShip> airShips;

    @ElementArray(start = "airship_area_begin", end = "airship_area_end")
    private AirshipArea[] airshipAreas;

    private static AirshipHolder ourInstance = new AirshipHolder();

    public static AirshipHolder getInstance() {
        return ourInstance;
    }

    private AirshipHolder() {
    }

    @Override
    public int size() {
        return airPorts.size() + airShips.size() + airshipAreas.length;
    }

    public List<AirPort> getAirPorts() {
        return airPorts;
    }

    public List<AirShip> getAirShips() {
        return airShips;
    }

    public AirshipArea[] getAirshipAreas() {
        return airshipAreas;
    }
}
