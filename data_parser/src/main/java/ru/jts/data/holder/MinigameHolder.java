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

import ru.jts.annotations.data.Element;
import ru.jts.common.parser.AbstractHolder;
import ru.jts.data.holder.minigame.BlockupsetSettings;

/**
 * @author : Camelion
 * @date : 30.08.12  13:33
 */
public class MinigameHolder extends AbstractHolder {
    @Element(start = "blockupset_setting_begin", end = "blockupset_setting_end")
    private BlockupsetSettings blockupsetSettings;

    private static MinigameHolder ourInstance = new MinigameHolder();

    public static MinigameHolder getInstance() {
        return ourInstance;
    }

    private MinigameHolder() {
    }

    @Override
    public int size() {
        return 1;
    }

    public BlockupsetSettings getBlockupsetSettings() {
        return blockupsetSettings;
    }
}
