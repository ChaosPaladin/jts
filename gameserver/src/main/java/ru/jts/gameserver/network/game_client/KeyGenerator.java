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

package ru.jts.gameserver.network.game_client;

import ru.jts.common.math.Rnd;

/**
 * @author : Camelion
 * @date : 15.11.11   23:45
 */
public final class KeyGenerator {
    /**
     * Генерирует Blowfish ключ
     * Для гейм сервера последние 8 байт в ключе постоянны. Клиенту отправляются только первые 8 байт
     *
     * @return blowFish ключ
     */
    public static byte[] generateBlowfishKey() {
        byte[] key = new byte[16];
        for (int i = 0; i < 8; i++) {
            key[i] = (byte) (Rnd.get(255) + 1);
        }

        key[8] = (byte) 0xc8;
        key[9] = (byte) 0x27;
        key[10] = (byte) 0x93;
        key[11] = (byte) 0x01;
        key[12] = (byte) 0xa1;
        key[13] = (byte) 0x6c;
        key[14] = (byte) 0x31;
        key[15] = (byte) 0x97;
        return key;
    }
}
