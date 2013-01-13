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

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.buffer.HeapChannelBufferFactory;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.netty.handler.execution.OrderedMemoryAwareThreadPoolExecutor;

import java.nio.ByteOrder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author : Camelion
 * @date : 13.08.12  13:41
 */
public class NetworkThread {
    private final NetworkConfig _networkConfig;

    private Channel channel;

    public NetworkThread(NetworkConfig networkConfig) {
        _networkConfig = networkConfig;
    }

    public void startAsServer() {
        ExecutorService bossExec = new OrderedMemoryAwareThreadPoolExecutor(1, 400000000, 2000000000, 60, TimeUnit.SECONDS);
        ExecutorService ioExec = new OrderedMemoryAwareThreadPoolExecutor(_networkConfig.getThreadCount(), 400000000, 2000000000, 60, TimeUnit.SECONDS);
        ServerBootstrap networkServer = new ServerBootstrap(new NioServerSocketChannelFactory(bossExec, ioExec, _networkConfig.getThreadCount()));
        networkServer.setOption("child.bufferFactory", HeapChannelBufferFactory.getInstance(ByteOrder.LITTLE_ENDIAN));
        networkServer.setOption("child.tcpNoDelay", false);
        networkServer.setOption("child.keepAlive", false);
        networkServer.setOption("child.reuseAddress", false);
        networkServer.setPipelineFactory(_networkConfig.getPipelineFactory());
        channel = networkServer.bind(_networkConfig.getSocketAddress());
    }

    public void startAsClient() {
        if (_networkConfig.getSocketAddress().getAddress().getHostAddress().equals("0.0.0.0"))
            throw new ExceptionInInitializerError("Client thread can't connect without address");
        ExecutorService bossExec = new OrderedMemoryAwareThreadPoolExecutor(1, 400000000, 2000000000, 60, TimeUnit.SECONDS);
        ExecutorService ioExec = new OrderedMemoryAwareThreadPoolExecutor(_networkConfig.getThreadCount(), 400000000, 2000000000, 60, TimeUnit.SECONDS);
        ClientBootstrap networkClient = new ClientBootstrap(new NioClientSocketChannelFactory(bossExec, ioExec, _networkConfig.getThreadCount()));
        networkClient.setOption("bufferFactory", HeapChannelBufferFactory.getInstance(ByteOrder.LITTLE_ENDIAN));
        networkClient.setOption("tcpNoDelay", false);
        networkClient.setOption("keepAlive", false);
        networkClient.setOption("reuseAddress", false);
        networkClient.setOption("connectionTimeout", 5000);
        networkClient.setPipelineFactory(_networkConfig.getPipelineFactory());
        channel = networkClient.connect(_networkConfig.getSocketAddress()).awaitUninterruptibly().getChannel();
    }

    public void stop() {
        ChannelFuture future = channel.close();
        future.awaitUninterruptibly();
    }
}
