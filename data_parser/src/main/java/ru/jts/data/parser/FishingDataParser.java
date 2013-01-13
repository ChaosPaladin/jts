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

package ru.jts.data.parser;

import ru.jts.data.AbstractDataParser;
import ru.jts.data.holder.FishingDataHolder;

/**
 * @author : Camelion
 * @date : 27.08.12  2:50
 */
public class FishingDataParser extends AbstractDataParser<FishingDataHolder> {
    private static FishingDataParser ourInstance = new FishingDataParser();

    public static FishingDataParser getInstance() {
        return ourInstance;
    }

    private FishingDataParser() {
        super(FishingDataHolder.getInstance());
    }

    @Override
    protected String getFileName() {
        return "data/fishingdata.txt";
    }
}
