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
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.handler.codec.frame.FrameDecoder;
import ru.jts.common.GlobalConstans;
import ru.jts.common.log.Log;

import java.nio.ByteBuffer;

/**
 * @author : Camelion
 * @date : 13.08.12  14:06
 */
public class PacketDecoder extends FrameDecoder {
    private static final String LOG_TAG = "PacketDecoder.java";

    @Override
    public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        ctx.sendUpstream(e);
    }

    @Override
    protected Object decode(ChannelHandlerContext ctx, Channel channel, ChannelBuffer buffer) throws Exception {
        if (GlobalConstans.DEBUG)
            Log.d(LOG_TAG, "decode() buffer == " + buffer.toString());

        if (channel.getAttachment() == null || !(channel.getAttachment() instanceof NetworkClient))
            return null;

        if (buffer.readableBytes() < 2)
            return null;

        buffer.markReaderIndex();

        byte first = buffer.readByte();
        byte second = buffer.readByte();
        int length = first & 0xff;
        length |= second << 8 & 0xff00;

        NetworkClient networkClient = (NetworkClient) channel.getAttachment();

        if (buffer.readableBytes() < length - networkClient.getShiftBeforeReadPacket()) {
            buffer.resetReaderIndex();
            return null;
        }

        ChannelBuffer b = buffer.readBytes(length - networkClient.getShiftBeforeReadPacket());

        ByteBuffer buf = b.toByteBuffer();

        return networkClient.tryReadPacket(buf, 0, b.readableBytes()); /* Return ClientPacket or null */
    }
}
