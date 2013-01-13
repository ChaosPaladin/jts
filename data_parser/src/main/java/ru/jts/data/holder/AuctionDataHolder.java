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
import ru.jts.data.holder.auctiondata.Auction;

import java.util.List;

/**
 * @author : Camelion
 * @date : 25.08.12  18:50
 */
public class AuctionDataHolder extends AbstractHolder {
    @Element(start = "auction_begin", end = "auction_end")
    private List<Auction> auctions;

    private static AuctionDataHolder ourInstance = new AuctionDataHolder();

    public static AuctionDataHolder getInstance() {
        return ourInstance;
    }

    private AuctionDataHolder() {
    }

    @Override
    public int size() {
        return auctions.size();
    }

    public List<Auction> getAuctions() {
        return auctions;
    }
}
