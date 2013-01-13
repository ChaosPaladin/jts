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

package ru.jts.gameserver.network.login_server.clientpackets;

import ru.jts.common.network.ClientPacket;
import ru.jts.gameserver.network.login_server.LoginserverClient;

/**
 * @author : Camelion
 * @date : 19.08.12  10:04
 */
public class GetAccountInfo extends ClientPacket<LoginserverClient> {
    private String account;

    @Override
    protected void readImpl() {
        account = readS();
    }

    @Override
    protected void runImpl() {
        // Отсылка обратно информации о кол-ве игроков и времени их удаления(если есть) с сервера
    }
}
