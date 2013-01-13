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

package ru.jts.common.network.handlers;

import org.jboss.netty.channel.*;
import ru.jts.common.GlobalConstans;
import ru.jts.common.log.Log;
import ru.jts.common.network.ClientPacket;
import ru.jts.common.network.IClientFactory;
import ru.jts.common.network.NetworkClient;
import ru.jts.common.threading.ThreadPoolManager;

/**
 * @author : Camelion
 * @date : 13.08.12  14:07
 */
public class NetworkHandler extends SimpleChannelUpstreamHandler {
    private static final String LOG_TAG = "NetworkHandler.java";

    private final IClientFactory clientFactory;

    public NetworkHandler(IClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        super.channelOpen(ctx, e);
        // TODO: Сюда можно добавить фильтр для подключений, например, для системы бана по IP адресу.
    }

    @Override
    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        if (GlobalConstans.DEBUG)
            Log.d(LOG_TAG, "New connection initialized");

        super.channelConnected(ctx, e);
        NetworkClient networkClient = clientFactory.createNewClient();
        networkClient.setChannel(e.getChannel());
        e.getChannel().setAttachment(networkClient);
        networkClient.onConnected();
    }

    @Override
    public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        if (GlobalConstans.DEBUG)
            Log.d(LOG_TAG, "client disconnected");

        super.channelDisconnected(ctx, e);
        if (e.getChannel().getAttachment() == null || !(e.getChannel().getAttachment() instanceof NetworkClient))
            return;
        NetworkClient networkClient = (NetworkClient) e.getChannel().getAttachment();
        networkClient.onDisconnect();
    }

    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        super.messageReceived(ctx, e);
        if (GlobalConstans.DEBUG)
            Log.d(LOG_TAG, "Received message {}", e);

        if (e.getMessage() == null || !(e.getMessage() instanceof ClientPacket))
            return;
        if (e.getChannel().getAttachment() == null || !(e.getChannel().getAttachment() instanceof NetworkClient))
            return;

        ClientPacket packet = (ClientPacket) e.getMessage();
        NetworkClient networkClient = (NetworkClient) e.getChannel().getAttachment();
        //noinspection unchecked
        packet.setNetworkClient(networkClient);

        // Выполнение действий пакета в отдельном потоке
        ThreadPoolManager.getInstance().execute(packet);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {
        // На канале произошло исключение. Выводим ошибку, закрываем канал.
        Log.i(LOG_TAG, "Exception from upstream: {}", e.getCause().getMessage());
        if (GlobalConstans.DEBUG)
            Log.d("Exception from upstream:", e.getCause());
        ctx.getChannel().close();
    }
}
