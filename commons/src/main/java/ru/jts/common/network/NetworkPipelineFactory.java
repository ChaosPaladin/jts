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

import org.jboss.netty.channel.ChannelHandler;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;

/**
 * @author : Camelion
 * @date : 13.08.12  13:48
 */
public class NetworkPipelineFactory implements ChannelPipelineFactory {
    private final ChannelHandler[] handlers;

    public NetworkPipelineFactory(ChannelHandler... handlers) {
        this.handlers = handlers;
    }

    @Override
    public ChannelPipeline getPipeline() throws Exception {
        return Channels.pipeline(handlers);
    }
}
