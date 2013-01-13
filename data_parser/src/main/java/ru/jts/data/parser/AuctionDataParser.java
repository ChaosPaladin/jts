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
import ru.jts.data.holder.AuctionDataHolder;

/**
 * @author : Camelion
 * @date : 25.08.12  18:50
 */
public class AuctionDataParser extends AbstractDataParser<AuctionDataHolder> {
    private static AuctionDataParser ourInstance = new AuctionDataParser();

    public static AuctionDataParser getInstance() {
        return ourInstance;
    }

    private AuctionDataParser() {
        super(AuctionDataHolder.getInstance());
    }

    @Override
    protected String getFileName() {
        return "data/auctiondata.txt";
    }
}
