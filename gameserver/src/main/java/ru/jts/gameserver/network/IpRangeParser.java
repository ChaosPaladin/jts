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

import org.dom4j.Element;
import ru.jts.common.network.util.IPRange;
import ru.jts.common.xml.AbstractXMLFileParser;

import java.util.Iterator;

/**
 * @author : Camelion
 * @date : 18.08.12  1:47
 */
public class IpRangeParser extends AbstractXMLFileParser<IpRangeHolder> {
    private static IpRangeParser ourInstance = new IpRangeParser();

    public static IpRangeParser getInstance() {
        return ourInstance;
    }

    public IpRangeParser() {
        super(IpRangeHolder.getInstance());
    }

    @Override
    protected String getXMLFileName() {
        return "config/ip_range.xml";
    }

    @Override
    protected String getDTDFileName() {
        return "config/ip_range.dtd";
    }

    @Override
    protected void readData(Element rootElement) {
        for (Iterator iterator = rootElement.elementIterator("iprange"); iterator.hasNext(); ) {
            Element ipRangeElement = (Element) iterator.next();
            String min_range = ipRangeElement.attributeValue("min_range");
            String max_range = ipRangeElement.attributeValue("max_range");
            String route_address = ipRangeElement.attributeValue("route_address");

            IPRange ipRange = new IPRange(min_range, max_range, route_address);

            getHolder().addIPRange(ipRange);
        }
    }
}
