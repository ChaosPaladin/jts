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

package ru.jts.data.holder.manordata;

import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;

/**
 * @author : Camelion
 * @date : 30.08.12  13:14
 */
public class ManorData {
    @IntValue
    public int manor_id;
    @IntValue
    public int residence_id;
    @StringValue
    public String manor_name;
    @ObjectArray
    public CropInfo[] crop_list;

    public static class CropInfo {
        @StringValue(withoutName = true, withoutBounds = true)
        public String unknownItem1;
        @StringValue(withoutName = true, withoutBounds = true)
        public String unknownItem2;
        @StringValue(withoutName = true, withoutBounds = true)
        public String unknownItem3;

        @IntValue(withoutName = true)
        public int unknownInt1;
        @IntValue(withoutName = true)
        public int unknownInt2;
        @IntValue(withoutName = true)
        public int unknownInt3;
    }
}
