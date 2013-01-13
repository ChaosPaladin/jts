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

package ru.jts.data.holder.doordata;

import ru.jts.annotations.data.array.StringArray;
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.ObjectValue;
import ru.jts.annotations.data.value.StringValue;
import ru.jts.data.common.Point3;

/**
 * @author : Camelion
 * @date : 27.08.12  1:39
 */
public class ControlTower {
    @StringValue(withoutName = true)
    public String name;
    @EnumValue
    public ControlTowerType controltower_type; // Тип контрольной башни
    @EnumValue
    public ControlTowerToggle toggle; // Неизвестно
    @ObjectValue
    public Point3 pos; // позиция башни
    @IntValue
    public int hp; // HP башни
    @IntValue
    public int physical_defence; // P.Def башни
    @IntValue
    public int magical_defence; // M.Def башни
    @StringValue
    public String display_npc_working; // NPC, который отображается на месте работающей башни
    @StringValue
    public String display_npc_not_working; // NPC, который отображается на месте не работающей башни
    @StringArray
    public String[] control_area; // Список каких-то зон, отсутвует для башен типа life_control

    public static enum ControlTowerType {
        support_control, life_control, trap_control
    }

    public static enum ControlTowerToggle {
        flase
    }
}
