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
import ru.jts.data.holder.ManorDataHolder;

/**
 * @author : Camelion
 * @date : 30.08.12  13:13
 */
public class ManorDataParser extends AbstractDataParser<ManorDataHolder> {
    private static ManorDataParser ourInstance = new ManorDataParser();

    public static ManorDataParser getInstance() {
        return ourInstance;
    }

    private ManorDataParser() {
        super(ManorDataHolder.getInstance());
    }

    @Override
    protected String getFileName() {
        return "data/manordata.txt";
    }
}
