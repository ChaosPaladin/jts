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

package ru.jts.gameserver.network;

import ru.jts.common.network.util.IPRange;
import ru.jts.common.parser.AbstractHolder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Camelion
 * @date : 18.08.12  1:45
 */
public class IpRangeHolder extends AbstractHolder {
    private static IpRangeHolder ourInstance = new IpRangeHolder();

    private List<IPRange> ipRanges;

    public static IpRangeHolder getInstance() {
        return ourInstance;
    }

    private IpRangeHolder() {
        ipRanges = new ArrayList<>();
    }

    public void addIPRange(IPRange ipRange) {
        ipRanges.add(ipRange);
    }

    @Override
    public int size() {
        return ipRanges.size();
    }

    public List<IPRange> getIPRangesList() {
        return Collections.unmodifiableList(ipRanges);
    }
}
