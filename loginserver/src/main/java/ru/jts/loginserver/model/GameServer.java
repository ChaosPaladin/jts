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

package ru.jts.loginserver.model;

import ru.jts.common.network.ServerPacket;
import ru.jts.common.network.util.IPRange;
import ru.jts.loginserver.network.game_server.GameserverClient;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

/**
 * @author : Camelion
 * @date : 18.08.12  16:49
 */
@Entity
@Table(name = "gameservers")
public class GameServer {

    @Id
    @Column(name = "id")
    private int serverId;

    @Transient
    private List<IPRange> ipRanges = Collections.emptyList();
    @Transient
    private GameserverClient networkClient;
    @Transient
    private byte[] address;
    @Transient
    private int port;

    @Column(name = "age_limit")
    private boolean ageLimit;
    @Column(name = "is_pvp")
    private boolean isPvp;

    @Transient
    private short online;

    @Column(name = "max_online")
    private short maxOnline;

    @Transient
    private boolean isOnline;

    @Column(name = "server_type_mask")
    private int serverType;
    @Column(name = "brackets_enabled")
    private boolean bracketsEnabled;

    public GameServer() {
        address = new byte[4];
        ageLimit = false;
        isPvp = false;
        online = 0;
        isOnline = false;
        serverType = 0; // NORMAL
        bracketsEnabled = false;
    }

    public GameServer(int serverId) {
        this();
        this.serverId = serverId;
    }

    public int getServerId() {
        return serverId;
    }

    public void setIpRanges(List<IPRange> ipRanges) {
        this.ipRanges = ipRanges;
    }

    public void setNetworkClient(GameserverClient networkClient) {
        this.networkClient = networkClient;
    }

    public byte[] getIpForAccount(Account account) {
        String accountIP = account.getLastIP();
        for (IPRange ipRange : ipRanges) {
            if (ipRange.isInRange(accountIP))
                return ipRange.getRouteAddress();
        }
        return address;
    }

    public void setIPAddress(byte[] IPAddress) {
        this.address = IPAddress;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setAgeLimit(boolean ageLimit) {
        this.ageLimit = ageLimit;
    }

    public boolean isAgeLimit() {
        return ageLimit;
    }

    public void setIsPvp(boolean pvp) {
        isPvp = pvp;
    }

    public boolean isPvp() {
        return isPvp;
    }

    public void setOnline(short online) {
        this.online = online;
    }

    public void setMaxOnline(short maxOnline) {
        this.maxOnline = maxOnline;
    }

    public short getOnline() {
        return online;
    }

    public short getMaxOnline() {
        return maxOnline;
    }

    public void setIsOnline(boolean online) {
        isOnline = online;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setServerType(int serverType) {
        this.serverType = serverType;
    }

    public int getServerType() {
        return serverType;
    }

    public void setBracketsEnabled(boolean bracketsEnable) {
        this.bracketsEnabled = bracketsEnable;
    }

    public boolean isBracketsEnabled() {
        return bracketsEnabled;
    }

    public GameserverClient getNetworkClient() {
        return networkClient;
    }

    public void sendPacket(ServerPacket packet) {
        getNetworkClient().sendPacket(packet);
    }
}
