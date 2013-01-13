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

import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.ObjectValue;
import ru.jts.annotations.data.value.StringValue;
import ru.jts.data.common.Point3;

/**
 * @author : Camelion
 * @date : 27.08.12  0:57
 */
public class Chair {
    @StringValue(withoutName = true)
    public String name; // название
    @IntValue
    public int editor_id;
    @ObjectValue
    public Point3 pos; // Позиция
}
