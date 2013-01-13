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

package ru.jts.data.holder.instantzonedata.entrance_cond;

import ru.jts.annotations.data.value.EnumValue;
import ru.jts.annotations.data.value.IntValue;

/**
 * @author : Camelion
 * @date : 27.08.12  15:18
 */
public class DefaultEntranceCond {
    @EnumValue(withoutName = true)
    public EntranceCond cond; // Проверять уровень, или проверять квест

    @IntValue(withoutName = true)
    public int cond_param; // Неизвестно (принимает значения 0 или 1)

    public static enum EntranceCond {
        check_level, check_quest
    }
}
