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

package ru.jts.common.network;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelFutureListener;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

/**
 * @author : Camelion
 * @date : 13.08.12  16:12
 */
public abstract class NetworkClient {
    private Channel channel;
    private final INetworkCrypt networkCrypt;
    private final IPacketHandler packetHandler;

    protected NetworkClient(INetworkCrypt networkCrypt, IPacketHandler packetHandler) {
        this.networkCrypt = networkCrypt;
        this.packetHandler = packetHandler;
    }

    /**
     * Подготовка пакета к отправке
     */
    public abstract void prepareToSend(byte[] data);

    public abstract int getShiftBeforeReadPacket();

    public abstract int getShiftBeforeWritePacket();

    public abstract int getShiftAfterWritePacket(int packetSize);

    /**
     * Вызывается при подключении клиента к каналу
     */
    public void onConnected() {

    }

    /**
     * Вызывается при отключении клиента от канала
     */
    public void onDisconnect() {

    }

    /* package */ ClientPacket tryReadPacket(ByteBuffer buffer, int from, int to) {

        byte[] data = buffer.array();
        boolean success = getNetworkCrypt().decrypt(data, from, to);

        if (!success) {
            close();
            return null;
        }
        ClientPacket packet = packetHandler.handlePacket(buffer);
        if (packet != null)
            packet.read(buffer);
        return packet;
    }

    /* package */ Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public INetworkCrypt getNetworkCrypt() {
        return networkCrypt;
    }

    public void sendPacket(ServerPacket packet) {
        channel.write(packet);
    }

    public void close() {
        if (getChannel().isOpen())
            getChannel().close();
    }

    public void close(ServerPacket reason) {
        ChannelFuture future = getChannel().write(reason);
        future.addListener(ChannelFutureListener.CLOSE);
    }

    public InetAddress getInetAddress() {
        if (channel == null)
            return null;
        return ((InetSocketAddress) channel.getRemoteAddress()).getAddress();
    }
}
