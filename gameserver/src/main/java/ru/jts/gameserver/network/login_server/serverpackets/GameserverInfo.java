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

package ru.jts.gameserver.network.login_server.serverpackets;

import ru.jts.common.network.ServerPacket;
import ru.jts.common.network.util.IPRange;

import java.util.List;

/**
 * @author : Camelion
 * @date : 18.08.12  14:50
 */
public class GameserverInfo extends ServerPacket {
    private final int serverId;
    private final byte[] address;
    private final int port;
    private final boolean ageLimit;
    private final short online, maxOnline;
    private final boolean isPvp;
    private final int serverType;
    private final boolean brackets;
    private final List<IPRange> ipRanges;

    public GameserverInfo(int serverId, byte[] address, int port, boolean ageLimit, boolean isPvp,
                          int online, int maxOnline, int serverType, boolean brackets, List<IPRange> ipRanges) {
        this.serverId = serverId;
        this.address = address;
        this.port = port;
        this.ageLimit = ageLimit;
        this.isPvp = isPvp;
        this.online = (short) online;
        this.maxOnline = (short) maxOnline;
        this.serverType = serverType;
        this.brackets = brackets;
        this.ipRanges = ipRanges;
    }

    @Override
    protected void writeImpl() {
        writeC(0x00);
        writeD(serverId);
        writeB(address);
        writeD(port);
        writeC(ageLimit ? 0x01 : 0x00);
        writeC(isPvp ? 0x01 : 0x00);
        writeH(online);
        writeH(maxOnline);
        writeD(serverType);
        writeC(brackets ? 0x01 : 0x00);
        writeD(ipRanges.size());
        for (IPRange ipRange : ipRanges) {
            writeB(ipRange.getMinAddressInByte());
            writeB(ipRange.getMaxAddressInByte());
            writeB(ipRange.getRouteAddress());
        }
    }
}
