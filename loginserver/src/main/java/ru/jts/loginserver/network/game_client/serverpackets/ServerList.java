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

package ru.jts.loginserver.network.game_client.serverpackets;

import ru.jts.common.network.ServerPacket;
import ru.jts.loginserver.model.Account;
import ru.jts.loginserver.model.GameServer;

import java.util.Collection;

/**
 * @author : Camelion
 * @date : 18.08.12  22:52
 */
public class ServerList extends ServerPacket {

    private Account account;
    private Collection<GameServer> serverList;

    public ServerList(Account account, Collection<GameServer> serverList) {
        this.account = account;
        this.serverList = serverList;
    }

    @Override
    protected void writeImpl() {
        writeC(0x04);
        writeC(serverList.size());
        writeC(account.getLastServer());
        for (GameServer server : serverList) {
            writeC(server.getServerId());
            byte[] IP = server.getIpForAccount(account);
            writeC(IP[0] & 0xff);
            writeC(IP[1] & 0xff);
            writeC(IP[2] & 0xff);
            writeC(IP[3] & 0xff);
            writeD(server.getPort());
            writeC(server.isAgeLimit() ? 0x01 : 0x00); // age limit
            writeC(server.isPvp() ? 0x01 : 0x00);
            writeH(server.getOnline());
            writeH(server.getMaxOnline());
            writeC(server.isOnline() ? 0x01 : 0x00);
            writeD(server.getServerType());
            writeC(server.isBracketsEnabled() ? 0x01 : 0x00);
        }

        writeH(0x00);
        /*
        writeC(serverList.size());
        for (GameServer server : serverList) {
            writeC(server.getServerId());
            writeC(server.playerSize); // acc player size
            writeC(server.deleteChars.length);
            for (int t : server.deleteChars) {
                writeD((int) (t - System.currentTimeMillis() / 1000L));
            }
        } */
    }
}
