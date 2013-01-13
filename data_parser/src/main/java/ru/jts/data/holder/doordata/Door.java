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

import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.ObjectValue;
import ru.jts.annotations.data.value.StringValue;
import ru.jts.data.common.Point3;

/**
 * @author : Camelion
 * @date : 27.08.12  0:04
 */
public class Door {
    @StringValue(withoutName = true)
    public String door_name; // имя
    @StringValue
    public String parent; // название родительской двери (указано для DoorType.type = child_type)
    @StringValue
    public String master_name; // название master-двери,
    @EnumValue
    public DoorType type; // тип
    @IntValue
    public int editor_id; // неизвестно
    @IntValue
    public int emitter_id; // неизвестно
    @EnumValue
    public OpenMethod open_method; // как открывается дверь
    @IntValue
    public int height; // высота, указана не у всех дверей

    @IntValue
    public int hp; // кол-во HP двери, указано не у всех дверей
    @IntValue
    public int physical_defence; // P.Def двери, указан не у всех
    @IntValue
    public int magical_defence; // M.Def двери, указан не у всех

    @IntValue
    public int is_open; // Открыта ли дверь изначально (0 - закрыта, 1- открыта)
    @EnumValue
    public DefaultStatus default_status; // Открыта ли дверь изначально, не понятно, зачем дублируется
    @IntValue
    public int hp_showable = 1; // Отображается ли HP двери (1-отображается, 0 - не отображается)
    @IntValue
    public int targetable = 1; // Можно ли выделить дверь
    @IntValue
    public int stealth = 1; // Неизвестно
    @IntValue
    public int check_collision = 1; // Проверять ли коллизию
    @IntValue
    public int need_to_log = 0; //

    @IntValue
    public int open_time; // Время открытия. Активно не для всех
    @IntValue
    public int close_time; // Время закрытия. Активно не для всех
    @IntValue
    public int random_time; // Случайный промежуток времени  Активно не для всех

    @IntValue
    public int level; // Активно не для всех
    @IntValue
    public int instantzone_id; // id инстанс зоны, в которой используется дверь

    @EnumValue
    public MasterDoorEvent master_open_event;
    @EnumValue
    public MasterDoorEvent master_close_event;

    @ObjectValue
    public Point3 pos; // позиция двери
    @ObjectArray
    public Point3[] range; //


    public static enum DoorType {
        normal_type, wall_type, parent_type, child_type
    }

    public static enum OpenMethod {
        by_npc,
        by_click,
        by_skill,
        by_time,
        by_time_skill,
        by_skill_item,
        by_item,
        by_cycle
    }

    public static enum DefaultStatus {
        open, close
    }

    public static enum MasterDoorEvent {
        act_open, act_close
    }
}
