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

package ru.jts.loginserver.network.game_server.clientpackets;

import ru.jts.common.log.Log;
import ru.jts.common.network.ClientPacket;
import ru.jts.common.network.util.IPRange;
import ru.jts.loginserver.database.GameserversDAO;
import ru.jts.loginserver.model.GameServer;
import ru.jts.loginserver.network.game_server.GameserverClient;
import ru.jts.loginserver.network.game_server.serverpackets.RegistrationInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Camelion
 * @date : 18.08.12  14:56
 */
public class GameserverInfo extends ClientPacket<GameserverClient> {
    private static final String LOG_TAG = "GameserverInfo.java";

    private int serverId;
    private byte[] address;
    private int port;
    private boolean ageLimit;
    private boolean isPvp;
    private short online, maxOnline;
    private int serverType;
    private boolean brackets;
    private List<IPRange> ipRanges;

    @Override
    protected void readImpl() {
        serverId = readD();
        address = new byte[4];
        readB(address);

        port = readD();
        ageLimit = readC() == 0x01;
        isPvp = readC() == 0x01;
        online = readH();
        maxOnline = readH();
        serverType = readD();
        brackets = readC() == 0x01;

        int listSize = readD();
        if (listSize == 0) {
            ipRanges = Collections.emptyList();
        } else {
            ipRanges = new ArrayList<>(listSize);

            for (int i = 0; i < listSize; i++) {
                byte[] minAddress = new byte[4];
                byte[] maxAddress = new byte[4];
                byte[] routeAddress = new byte[4];
                readB(minAddress);
                readB(maxAddress);
                readB(routeAddress);

                ipRanges.add(new IPRange(minAddress, maxAddress, routeAddress));
            }
        }
    }

    @Override
    protected void runImpl() {
        GameServer gameServer = GameserversDAO.getInstance().getGameServerByID(serverId);
        if (gameServer == null) {
            getNetworkClient().sendPacket(RegistrationInfo.WRONG_ID);
            return;
        }

        // Обмен ссылками
        gameServer.setNetworkClient(getNetworkClient());
        getNetworkClient().setGameServer(gameServer);

        // Обновление информации
        gameServer.setIPAddress(address);
        gameServer.setPort(port);
        gameServer.setAgeLimit(ageLimit);
        gameServer.setIsPvp(isPvp);
        gameServer.setIpRanges(ipRanges);
        gameServer.setOnline(online);
        gameServer.setMaxOnline(maxOnline);
        gameServer.setServerType(serverType);
        gameServer.setBracketsEnabled(brackets);

        gameServer.setIsOnline(true);

        GameserversDAO.getInstance().updateServer(gameServer);

        gameServer.sendPacket(RegistrationInfo.SUCCESS);

        Log.i(LOG_TAG, String.format("Connected server with ID %d (IP: %d.%d.%d.%d)", serverId,
                address[0], address[1], address[2], address[3]));
    }
}
