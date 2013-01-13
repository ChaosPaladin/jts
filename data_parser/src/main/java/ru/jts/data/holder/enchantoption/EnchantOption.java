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

package ru.jts.data.holder.enchantoption;

import ru.jts.annotations.data.ElementArray;
import ru.jts.annotations.data.array.StringArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;

/**
 * @author : Camelion
 * @date : 27.08.12  2:02
 */
public class EnchantOption {
    @StringValue
    public String item; // Название предмета, есть в itemdata.txt

    @ElementArray(start = "option_begin", end = "option_end")
    public Option[] options;


    public static class Option {
        @IntValue
        public int enchant;// Уровень заточки
        @StringArray(name = "option")
        public String[] option_names; // Какие-то параметры. Есть в optiondata.txt
    }
}
