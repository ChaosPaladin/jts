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

package ru.jts.data.holder.areadata.area;

import ru.jts.annotations.data.class_annotations.ParseSuper;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.TimeValue;

/**
 * @author : Camelion
 * @date : 25.08.12  1:25
 * <p/>
 * Зоны, в которых запрещён рестарт
 */
@ParseSuper
public class NoRestartZone extends DefaultArea {
    @IntValue
    private int restart_time; // Неизвестно

    // Активно не во всех no_restart областях
    @TimeValue
    private long restart_allowed_time; // Неизвестно

    public NoRestartZone(DefaultArea defaultSetting) {
        super(defaultSetting);
        restart_time = ((NoRestartZone) defaultSetting).restart_time;
    }

    public NoRestartZone() {

    }
}
