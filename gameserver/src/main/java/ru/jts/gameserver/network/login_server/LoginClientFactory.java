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

package ru.jts.gameserver.network.login_server;

import ru.jts.common.network.DefaultNetworkCrypt;
import ru.jts.common.network.IClientFactory;
import ru.jts.common.network.NetworkClient;
import ru.jts.common.network.ServerPacket;

/**
 * @author : Camelion
 * @date : 20.08.12  14:47
 */
public class LoginClientFactory implements IClientFactory {
    private static LoginClientFactory ourInstance = new LoginClientFactory();
    private LoginserverClient loginserverClient;

    public static LoginClientFactory getInstance() {
        return ourInstance;
    }

    private LoginClientFactory() {
    }

    @Override
    public NetworkClient createNewClient() {
        if (loginserverClient != null)
            loginserverClient.close();
        loginserverClient = new LoginserverClient(new DefaultNetworkCrypt(), LoginserverPacketHandler.getInstance());
        return loginserverClient;
    }

    public void sendPacket(ServerPacket packet) {
        if (loginserverClient != null)
            loginserverClient.sendPacket(packet);
    }
}
