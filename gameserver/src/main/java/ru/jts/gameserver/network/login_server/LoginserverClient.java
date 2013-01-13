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

package ru.jts.gameserver.network.login_server;

import ru.jts.common.configuration.Config;
import ru.jts.common.log.Log;
import ru.jts.common.network.INetworkCrypt;
import ru.jts.common.network.IPacketHandler;
import ru.jts.common.network.NetworkClient;
import ru.jts.common.network.util.IPRange;
import ru.jts.gameserver.network.IpRangeHolder;
import ru.jts.gameserver.network.login_server.serverpackets.GameserverInfo;
import ru.jts.gameserver.world.World;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/**
 * @author : Camelion
 * @date : 18.08.12  13:32
 */
public class LoginserverClient extends NetworkClient {
    private static final String LOG_TAG = "LoginserverClient.java";
    private static final int HEADER_SIZE = 2;

    protected LoginserverClient(INetworkCrypt networkCrypt, IPacketHandler packetHandler) {
        super(networkCrypt, packetHandler);
    }

    @Override
    public void prepareToSend(byte[] data) {
        // write short (size)
        data[0] = (byte) (data.length & 0xFF);
        data[1] = (byte) (data.length >> 8 & 0xFF);
    }

    @Override
    public int getShiftBeforeReadPacket() {
        return HEADER_SIZE;
    }

    @Override
    public int getShiftBeforeWritePacket() {
        return HEADER_SIZE;
    }

    @Override
    public int getShiftAfterWritePacket(int packetSize) {
        return 0;
    }


    @Override
    public void onConnected() {
        List<IPRange> ipRangeList = IpRangeHolder.getInstance().getIPRangesList();
        String address;
        try {
            address = InetAddress.getByName(Config.getString("gameserver.network.game_clients.external_address")).getHostAddress();
        } catch (UnknownHostException e) {
            Log.e(LOG_TAG, "Exception while getting inet address " + Config.getString("gameserver.network.game_clients.external_address"), e);
            return;
        }
        sendPacket(new GameserverInfo(Config.getInt("gameserver.gamserver_id"),
                IPRange.toByteArray(address), Config.getInt("gameserver.network.game_clients.port"),
                Config.getBool("gameserver.age_limit"), Config.getBool("gameserver.is_pvp"),
                World.getOnlinePlayersCount(), Config.getInt("gameserver.max_players"),
                1, // Server Type (1 = NORMAL)
                Config.getBool("gameserver.brackets"),
                ipRangeList));
    }
}
