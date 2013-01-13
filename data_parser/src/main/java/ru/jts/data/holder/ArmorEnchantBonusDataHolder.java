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

import ru.jts.annotations.data.array.IntArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.common.parser.AbstractHolder;

/**
 * @author : Camelion
 * @date : 24.08.12  21:39
 */
public class ArmorEnchantBonusDataHolder extends AbstractHolder {
    @IntValue
    private int onepiece_factor; // неизвестно

    @IntArray
    private int[] bonus_grade_none; // Бонус от заточки No-grade предметов

    @IntArray
    private int[] bonus_grade_d; // Бонус от заточки D-grade предметов

    @IntArray
    private int[] bonus_grade_c; // Бонус от заточки C-grade предметов

    @IntArray
    private int[] bonus_grade_b; // Бонус от заточки B-grade предметов

    @IntArray
    private int[] bonus_grade_a; // Бонус от заточки A-grade предметов

    @IntArray
    private int[] bonus_grade_s; // Бонус от заточки S-grade предметов

    private static ArmorEnchantBonusDataHolder ourInstance = new ArmorEnchantBonusDataHolder();

    public static ArmorEnchantBonusDataHolder getInstance() {
        return ourInstance;
    }

    private ArmorEnchantBonusDataHolder() {
    }

    @Override
    public int size() {
        return bonus_grade_none.length + bonus_grade_d.length + bonus_grade_c.length + bonus_grade_b.length
                + bonus_grade_a.length + bonus_grade_s.length;
    }
}
