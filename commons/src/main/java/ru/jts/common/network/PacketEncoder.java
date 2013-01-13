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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder;
import ru.jts.common.GlobalConstans;
import ru.jts.common.log.Log;

import java.nio.ByteOrder;

/**
 * @author : Camelion
 * @date : 13.08.12  14:07
 */
public class PacketEncoder extends OneToOneEncoder {
    private static final String LOG_TAG = "PacketEncoder.java";

    @Override
    protected Object encode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {
        if (GlobalConstans.DEBUG)
            Log.d(LOG_TAG, "encode() msg == {}", String.valueOf(msg));

        if (!(msg instanceof ServerPacket))
            return msg; // Если это не пакет, то просто пропускаем его дальше
        ServerPacket packet = (ServerPacket) msg;

        if (channel.getAttachment() == null || !(channel.getAttachment() instanceof NetworkClient))
            return msg; // Если не присоединен объект типа INetworkClient, то пропускаем пакет дальше

        //noinspection unchecked
        packet.setNetworkClient((NetworkClient) channel.getAttachment());

        ChannelBuffer buffer = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 256);
        packet.write(buffer); // Пишем пакет в буфер

        return buffer; // Возвращаем буфер
    }
}
