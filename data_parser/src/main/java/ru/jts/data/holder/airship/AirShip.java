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

package ru.jts.data.holder.airship;

import ru.jts.annotations.data.Element;
import ru.jts.annotations.data.array.IntArray;
import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.factory.IObjectFactory;
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.ObjectValue;
import ru.jts.annotations.data.value.StringValue;
import ru.jts.data.common.ItemName_Count;
import ru.jts.data.common.Point3;

/**
 * @author : Camelion
 * @date : 24.08.12  18:37
 * <p/>
 * Недостаточно хорошо обработана переменная path, для её обработки нужен какой-либо механизм условий для объектов
 */
public class AirShip {
    @IntValue
    private int id; // ID Корабля

    @EnumValue
    public AirshipType airship_type; // Тип корабля

    @IntArray
    private int[] speed; // Скорость корабля {1;2;3}

    @ObjectArray(name = "collision", canBeNull = false)
    public AirshipCollision[] collisions; // Коллизии корабля.

    // Null для кораблей типа PLEDGE
    @ObjectArray(name = "path", objectFactory = AirshipPathObjectFactory.class)
    public AirshipPathPoint[] pathPoints; // Путь, по которому движется корабль. AirshipPathPoint может принимать значения MovePoint, AirportPoint, TeleportPoint.

    // Null для кораблей типа PLEDGE
    @ObjectValue
    public AirshipStartPos start_pos; // Возможно, стартовая позиция корабля

    // Null для кораблей типа PLEDGE
    @EnumValue
    public AirshipMoveType return_to_start; // Каким образом корабль будет возвращаться к стартовой позиции (tel = teleport)

    // Null для кораблей типа REGULAR
    @Element(start = "steering_begin", end = "steering_end")
    public Steering steering;// Что-то связанное с водителем, для кораблей типа PLEDGE

    // Отсутствует у кораблей типа REGULAR
    @IntValue
    private int fuel_max; // Запас топлива для кораблей типа PLEDGE

    // Отсутствует у кораблей типа REGULAR
    @IntValue
    private int fuel_consume; // Запас топлива для кораблей типа PLEDGE

    // Отсутствует у кораблей типа REGULAR
    @ObjectValue(canBeNull = true)
    public ItemName_Count buy_cost; // Стоимость покупки?

    // Отсутствует у кораблей типа REGULAR
    @ObjectValue(canBeNull = true)
    public ItemName_Count summon_cost; // Стоимость призыва?

    public static enum AirshipMoveType {
        tel, move, airport
    }

    public static class AirshipStartPos {
        @ObjectValue(withoutName = true, canBeNull = false)
        private Point3 point;

        @IntValue(withoutName = true)
        private int unknown;
    }

    public static class AirshipCollision { // Коллизии корабля
        @ObjectValue(withoutName = true, canBeNull = false)
        private Point3 point; // Точка, относительно координат корабля

        @IntValue(withoutName = true)
        private int radius; // Радиус в данной точке

        @IntValue(withoutName = true)
        private int height; // Высота в данной точке

    }

    public static enum AirshipType {
        REGULAR, PLEDGE
    }

    public static class AirshipPathPoint {
    }

    public static class MovePoint extends AirshipPathPoint { // move
        @ObjectValue(withoutName = true, canBeNull = false)
        private Point3 point; // Точка, в которую необходимо двигаться
    }

    public static class AirportPoint extends AirshipPathPoint { // airport
        @IntValue(withoutName = true)
        private int airport_id;//id аэропорта
    }

    public static class TeleportPoint extends AirshipPathPoint { // tel
        @ObjectValue(withoutName = true, canBeNull = false)
        private Point3 point;// Точка, в которую необходимо телепортироваться

        @IntValue(withoutName = true)
        private int heading;// угол поворота
    }

    public static class AirshipPathObjectFactory implements IObjectFactory<AirshipPathPoint> {
        @Override
        public AirshipPathPoint createObjectFor(StringBuilder data) {
            String stringData = data.toString();
            if (stringData.startsWith("move"))
                return new MovePoint();
            else if (stringData.startsWith("airport"))
                return new AirportPoint();
            else if (stringData.startsWith("tel"))
                return new TeleportPoint();

            return new AirshipPathPoint();
        }

        @Override
        public void setFieldClass(Class<?> clazz) {
            // Ignored
        }
    }

    // Какие-то параметры управления
    public static class Steering {
        @ObjectValue(canBeNull = false)
        private Point3 steering_pos; // Какая то позиция (относительно корабля)

        @ObjectValue(canBeNull = false)
        private Point3 driver_pos; // Позиция водителя (относительно корабля)

        @StringValue
        private String steering_item; // Управляющий предмет
    }
}
