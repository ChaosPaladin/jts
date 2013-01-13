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

package ru.jts.data.holder.auctiondata;

import ru.jts.annotations.data.Element;
import ru.jts.annotations.data.array.IntArray;
import ru.jts.annotations.data.value.IntValue;

import java.util.List;

/**
 * @author : Camelion
 * @date : 25.08.12  18:51
 */
public class Auction {
    @IntValue
    private int npc_id; // NPC ID
    @IntValue
    private int auction_doing; // Неизвестно, принимает значения 0 или 1
    @IntArray
    private int[] auction_week_day; // Дни, (день?) недели аукциона ( 1 = понедельник, 2 = вторник, итд.)
    @IntValue
    private int auction_start_time; // Время начала аукциона. Неизвестный формат
    @IntValue
    private int auction_duration; // Продолжительность аукциона ( в минутах )
    @IntValue
    private int item_count; // Кол-во предметов?

    @Element(start = "item_begin", end = "item_end")
    public List<AuctionItem> auctionItems;

    public List<AuctionItem> getAuctionItems() {
        return auctionItems;
    }
}
