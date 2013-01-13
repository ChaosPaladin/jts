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
import ru.jts.annotations.data.array.StringArray;
import ru.jts.annotations.data.class_annotations.ParseSuper;
import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.ObjectValue;
import ru.jts.annotations.data.value.StringValue;
import ru.jts.data.common.Point3;

/**
 * @author : Camelion
 * @date : 26.08.12  0:41
 */
@ParseSuper
public class Fortress extends Residence {
    @EnumValue
    public Scale fortress_scale; // Размер форта
    @StringArray
    public String[] fortress_related_castle; // Замки, к которым относится форт

    @ObjectValue
    public FortFlagpole fortress_flagpole; // Точка, куда устанавливает флаг
    @StringValue
    public String fortress_flag; // Название итема - флага. (есть в itemdata.txt)
    @ObjectArray(withoutName = true)
    public Point3[] flag_points; // Точки установки флага

    public static enum Scale {
        small, large
    }

    public static class FortFlagpole {
        @StringValue(withoutName = true)
        public String fort_flagpole; // всегда=flag_pole. если добавить имя форта(без _fort), то получится имя NPC, соответствующего форту
        @ObjectValue(withoutName = true)
        public Point3 point; // всегда=flag_pole. если добавить имя форта(без _fort), то получится имя NPC, соответствующего форту
        @IntValue(withoutName = true)
        public int id; // Какой-то идентификатор, скорее всего чтоб не могли ставить флаги от других фортов.
    }
}
