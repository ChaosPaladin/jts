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

package ru.jts.loginserver.network.game_client.serverpackets;

import ru.jts.common.network.ServerPacket;

/**
 * @author : Camelion
 * @date : 15.08.12  14:32
 * <p/>
 * Набор постоянных пакетов, отсылаются клиенту при проблемах в подключении,
 * например, неправильный пароль, неверный ключ соединения, забаненный адрес
 */
public class LoginFail extends ServerPacket {
    public static final LoginFail REASON_PASS_WRONG = new LoginFail(2); ////The password you have entered is incorrect. Confirm your ...
    public static final LoginFail REASON_USER_OR_PASS_WRONG = new LoginFail(3);
    public static final LoginFail REASON_ACCESS_FAILED_TRY_AGAIN_LATER_1 = new LoginFail(4); //Access failed. Please try again later.
    public static final LoginFail REASON_ACCESS_FAILED = new LoginFail(21); //Access Failed.

    private final int reason_code;

    public LoginFail(int reason_code) {
        this.reason_code = reason_code;
    }

    @Override
    protected void writeImpl() {
        writeC(0x01);
        writeD(reason_code);
    }
}
