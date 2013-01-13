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

package ru.jts.data.holder.freeway;

import ru.jts.annotations.data.Element;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.ObjectValue;
import ru.jts.annotations.data.value.StringValue;
import ru.jts.data.common.Point3;

import java.util.List;

/**
 * @author : Camelion
 * @date : 27.08.12  13:16
 * <p/>
 * Что-то, связанное с decodata.txt
 */
public class Freeway {
    @IntValue
    public int freeway_id; // ID
    @StringValue
    public String freeway_name; // Название

    @Element(start = "node_begin", end = "node_end")
    public List<FreewayNode> nodes; // Список точек

    public static class FreewayNode {
        @IntValue
        public int node_id; // Ид точки
        @ObjectValue
        public Point3 pos; // Координата
        @IntValue
        public int delay; // Задержка перед выполнением действия
        @IntValue
        public int social; // Социальное действие в этой точке (-1 = нет действия)
        @IntValue
        public int state; // Неизвестно, всегда -1
    }
}
