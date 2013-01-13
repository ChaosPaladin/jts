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

package ru.jts.data.holder.areadata.area;

import ru.jts.annotations.data.array.IntArray;
import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;
import ru.jts.data.common.Point4;
import ru.jts.data.holder.areadata.AreaType;
import ru.jts.data.holder.areadata.TargetType;

import static ru.jts.data.holder.areadata.TargetType.pc;
import static ru.jts.data.holder.areadata.area.DefaultArea.OnOffZoneParam.off;

/**
 * @author : Camelion
 * @date : 24.08.12  23:36
 * <p/>
 * Базовый класс для областей
 */
public class DefaultArea {
    // Обязательные для всех зон параметры
    @StringValue
    public String name; // Название области

    @IntArray(name = "map_no")
    public int[] map; // квадрат карты, в котором находится область

    @EnumValue
    public AreaType type; // тип области

    // Null для WaterArea
    @ObjectArray(name = "range") // Null для WaterArea
    public Point4[] ranges; // точки - границы зоны

    // Параметры, заданные по умолчанию и необязательные параметры (также, должно использоваться DefaultSetting в зависимости от типа зоны)
    @EnumValue
    public OnOffZoneParam default_status = off; // Статус зоны по умолчанию (будет выставлено после загрузки сервера)

    @EnumValue
    public TargetType target = pc; // цель, на которую направлено воздействие

    @IntArray(bounds = {"", ""})  //instance_id;cluster_id
    public int[] instantzone_id; // ID Инстанс зоны, привязанной к этой области

    @IntValue
    public int initial_delay; // Вероятно, первоначальная задержка перед активацией зоны.

    @IntValue
    public int on_time; // Вероятно, время, в течении которого работает зона до того, как выключится

    @IntValue
    public int off_time; // Вероятно, время, в течении которого зона находится в выключенном состоянии, перед включением

    @IntValue
    public int random_time; // Вероятно, случайный +- промежуток времени, добавляемый к on_time и off_time

    @IntValue
    public int unit_tick = 9; // Перерыв между "воздействием" зоны

    @IntValue
    public int event_id; // неизвестно


    // Конструктор для настроек по умолчанию
    public DefaultArea() {
    }

    // Используется для создания объекта из настроек по умолчанию (описываются в заголовке файла)
    public DefaultArea(DefaultArea defaultSetting) {
        default_status = defaultSetting.default_status;
        target = defaultSetting.target;
        instantzone_id = defaultSetting.instantzone_id;
        initial_delay = defaultSetting.initial_delay;
        on_time = defaultSetting.on_time;
        off_time = defaultSetting.off_time;
        random_time = defaultSetting.random_time;
        unit_tick = defaultSetting.unit_tick;
        event_id = defaultSetting.event_id;
    }

    public static enum OnOffZoneParam {
        on, off
    }
}
