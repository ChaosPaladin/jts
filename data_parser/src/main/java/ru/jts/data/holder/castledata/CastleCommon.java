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

package ru.jts.data.holder.castledata;

import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.value.DateValue;
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;

import java.util.Calendar;
import java.util.Date;

/**
 * @author : Camelion
 * @date : 26.08.12  0:56
 * Содержит в себе основные настройки для замков
 */
public class CastleCommon {
    @DateValue(format = "yyyy / MM / dd / HH / mm")
    public Date base_siege_time;
    @ObjectArray
    public ReservableSiegeTime[] reservable_siege_time; // Время, на которое владелец замка может назначить осаду
    @IntValue
    public int max_concurrent_siege; // Возможно, максимальное кол-во одновременно запущенных осад

    public static class ReservableSiegeTime {
        @EnumValue(withoutName = true)
        public DayOfWeek day_of_week; // День недели
        @IntValue(withoutName = true)
        public int hour; // Час
    }

    public static enum DayOfWeek {
        SUN(Calendar.SUNDAY),
        MON(Calendar.MONDAY),
        TUE(Calendar.TUESDAY),
        WED(Calendar.WEDNESDAY),
        THU(Calendar.THURSDAY),
        FRI(Calendar.FRIDAY),
        SAT(Calendar.SATURDAY);

        public int day;

        DayOfWeek(int day) {
            this.day = day;
        }
    }
}
