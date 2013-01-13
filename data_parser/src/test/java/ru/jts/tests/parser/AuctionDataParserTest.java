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

package ru.jts.tests.parser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.jts.data.holder.AuctionDataHolder;
import ru.jts.data.holder.auctiondata.Auction;
import ru.jts.data.holder.auctiondata.AuctionItem;
import ru.jts.data.parser.AuctionDataParser;

/**
 * @author : Camelion
 * @date : 25.08.12  19:02
 */
public class AuctionDataParserTest extends Assert {

    @Before
    public void setUp() throws Exception {
        AuctionDataParser.getInstance().load();
    }

    @Test
    public void test() {
        AuctionDataHolder holder = AuctionDataHolder.getInstance();

        assertFalse(holder.getAuctions().size() == 0);
        for (Auction auction : holder.getAuctions()) {
            assertFalse(auction.getAuctionItems().size() == 0);
            for (AuctionItem item : auction.getAuctionItems()) {
                assertFalse(item.item.isEmpty());
                assertFalse(item.amount <= 0);
                assertFalse(item.price <= 0);
            }
        }
    }
}
