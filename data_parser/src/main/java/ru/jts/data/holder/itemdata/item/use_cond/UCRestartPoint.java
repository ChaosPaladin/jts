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

package ru.jts.data.holder.itemdata.item.use_cond;

import ru.jts.annotations.data.class_annotations.ParseSuper;
import ru.jts.annotations.data.value.IntValue;

/**
 * @author : Camelion
 * @date : 28.08.12  5:02
 */
@ParseSuper
public class UCRestartPoint extends DefaultUseCond {
    @IntValue(withoutName = true)
    public int point_id;
}
