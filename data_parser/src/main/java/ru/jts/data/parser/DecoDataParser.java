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
import ru.jts.data.holder.DecoDataHolder;

/**
 * @author : Camelion
 * @date : 26.08.12  21:44
 */
public class DecoDataParser extends AbstractDataParser<DecoDataHolder> {
    private static DecoDataParser ourInstance = new DecoDataParser();

    public static DecoDataParser getInstance() {
        return ourInstance;
    }

    private DecoDataParser() {
        super(DecoDataHolder.getInstance());
    }

    @Override
    protected String getFileName() {
        return "data/decodata.txt";
    }
}
