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

package ru.jts.data.holder.monrace;

import ru.jts.annotations.data.array.IntArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;

/**
 * @author : Camelion
 * @date : 30.08.12  14:14
 */
public class MonRuner {
    @IntValue(withoutName = true)
    public int runner_id;
    @IntValue(withoutName = true)
    public int npc_class_id;
    @StringValue(withoutName = true)
    public String mon_name;

    @IntValue
    public int sys_string;
    @IntValue
    public int max_speed;
    @IntValue
    public int min_speed;
    @IntArray(splitter = ",")
    public int[] guts;
    @IntValue
    public int initial_cond;
    @IntValue
    public int initial_win;
    @IntValue
    public int initial_runcount;
    @IntValue
    public int initial_wincount;
}
