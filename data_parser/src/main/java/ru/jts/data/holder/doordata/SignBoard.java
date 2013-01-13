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

import ru.jts.annotations.data.array.IntArray;
import ru.jts.annotations.data.class_annotations.ParseSuper;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;

/**
 * @author : Camelion
 * @date : 26.08.12  22:31
 */
@ParseSuper
public class SignBoard extends DefaultSignBoard {
    @IntValue
    public int editor_id;
    @StringValue
    public String html; // Есть не у всех
    @StringValue
    public String texture_name;// Есть не у всех
    @IntArray
    public int[] map_pos; // Есть не у всех
}
