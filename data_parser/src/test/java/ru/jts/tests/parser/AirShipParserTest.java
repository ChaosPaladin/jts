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
import ru.jts.data.holder.AirshipHolder;
import ru.jts.data.holder.airship.AirPort;
import ru.jts.data.holder.airship.AirShip;
import ru.jts.data.holder.airship.AirshipArea;
import ru.jts.data.parser.AirshipParser;

import static ru.jts.data.holder.airship.AirShip.AirshipPathPoint;
import static ru.jts.data.holder.airship.AirShip.AirshipType;

/**
 * @author : Camelion
 * @date : 24.08.12  12:41
 */
public class AirShipParserTest extends Assert {
    @Before
    public void setUp() throws Exception {
        AirshipParser.getInstance().load();
    }

    @Test
    public void test() throws Exception {
        AirshipHolder holder = AirshipHolder.getInstance();

        testPorts(holder);

        testAirShips(holder);

        testAirshipAreas(holder);
    }

    private void testAirshipAreas(AirshipHolder holder) {
        assertFalse(holder.getAirshipAreas().length == 0);

        // Тест областей
        for (AirshipArea area : holder.getAirshipAreas()) {
            assertTrue(area.map.length == 2);
            assertNotNull(area.area_type);
            assertFalse(area.area_range.length == 0);
        }
    }

    private void testAirShips(AirshipHolder holder) throws Exception {
        assertFalse(holder.getAirShips().isEmpty());

        for (AirShip airShip : holder.getAirShips()) {

            assertFalse(airShip.collisions.length == 0);

            if (airShip.airship_type == AirshipType.REGULAR) { // Тесты для обычных летающих кораблей
                // То, чего не должно быть у корабля типа REGULAR
                assertNull(airShip.steering);
                assertNull(airShip.buy_cost);
                assertNull(airShip.summon_cost);

                // Тест пути следования корабля
                assertFalse(airShip.pathPoints.length == 0);
                for (AirshipPathPoint point : airShip.pathPoints) {
                    // Точка пути должна быть объектом класса MovePoint, AirportPoint или TeleportPoint
                    assertNotSame(point.getClass(), AirshipPathPoint.class);
                }
            } else if (airShip.airship_type == AirshipType.PLEDGE) { // Тесты для клановых кораблей
                // То, чего не должно быть у корабля типа PLEDGE
                assertNull(airShip.start_pos);
                assertNull(airShip.return_to_start);

                assertNotNull(airShip.steering);
                assertNotNull(airShip.buy_cost);
                assertNotNull(airShip.summon_cost);
            } else {
                throw new Exception(String.format("Unknown airship type: %s", airShip.airship_type));
            }
        }
    }

    private void testPorts(AirshipHolder holder) {
        assertFalse(holder.getAirPorts().isEmpty());

        for (AirPort port : holder.getAirPorts()) {
            if (port.airship_pos == null) {
                // Для портов, у которых не указана airship_pos должны быть альтернативный вариант парковки
                assertNotNull(port.platforms);
                assertFalse(port.platforms.isEmpty());

                // Тест платформ
                for (AirPort.AirportPlatform platform : port.platforms) {
                    assertNotNull(platform.landing_path);
                    assertFalse(platform.landing_path.length == 0);

                    assertNotNull(platform.airship_pos);

                    assertNotNull(platform.takeoff_path);
                    assertFalse(platform.takeoff_path.length == 0);

                    assertNotNull(platform.getoff_pos);
                    assertNotNull(platform.getoff_pos.point);
                }

                if (port.teleports != null) {// Тест телепортов
                    for (AirPort.AirportTeleport teleport : port.teleports) {
                        assertNotNull(teleport.tel_pos);
                    }
                }
            } else {
                assertNotNull(port.getoff_pos);

                assertNull(port.platforms);
            }
        }
    }
}
