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

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;
import ru.jts.common.GlobalConstans;
import ru.jts.common.log.Log;
import ru.jts.common.threading.ThreadPoolManager;

/**
 * @author : Camelion
 * @date : 18.08.12  14:26
 */
public class ClientReconnectHandler extends SimpleChannelUpstreamHandler {
    private static final String LOG_TAG = "ClientReconnectHandler.java";

    private final ReconnectListener reconnectListener;

    public ClientReconnectHandler(ReconnectListener reconnectListener) {
        this.reconnectListener = reconnectListener;
    }

    @Override
    public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        if (GlobalConstans.DEBUG)
            Log.d(LOG_TAG, "channel closed");

        super.channelClosed(ctx, e);

        reconnectListener.msgBeforeReconnect();
        ThreadPoolManager.getInstance().schedule(new Runnable() {
            @Override
            public void run() {
                reconnectListener.reconnect();
            }
        }, 10000);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {
        // На канале произошло исключение. Выводим ошибку, закрываем канал.
        Log.e(LOG_TAG, "Exception from upstream", e.getCause());
        ctx.getChannel().close();
    }

    public static interface ReconnectListener {
        void msgBeforeReconnect();

        void reconnect();
    }
}
