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

import ru.jts.common.network.INetworkCrypt;

/**
 * @author : Camelion
 * @date : 17.08.12  20:50
 */
public class GameCrypt implements INetworkCrypt {
    private byte[] inKey;
    private byte[] outKey;
    private boolean isEnabled;

    @Override
    public boolean encrypt(byte[] data, int from, int to) {
        if (!isEnabled) {
            isEnabled = true; // Шифрование включается после первого отправленного пакета, (VersionCheck)
            return true;
        }
        int size = to - from;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            int temp2 = data[from + i] & 0xFF;
            temp = temp2 ^ outKey[i & 15] ^ temp;
            data[from + i] = (byte) temp;
        }

        int old = outKey[8] & 0xff;
        old |= outKey[9] << 8 & 0xff00;
        old |= outKey[10] << 0x10 & 0xff0000;
        old |= outKey[11] << 0x18 & 0xff000000;

        old += size;

        outKey[8] = (byte) (old & 0xff);
        outKey[9] = (byte) (old >> 0x08 & 0xff);
        outKey[10] = (byte) (old >> 0x10 & 0xff);
        outKey[11] = (byte) (old >> 0x18 & 0xff);
        return true;
    }

    @Override
    public boolean decrypt(byte[] data, int from, int to) {
        if (!isEnabled) {
            return true;
        }
        int size = to - from;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            int temp2 = data[from + i] & 0xFF;
            data[from + i] = (byte) (temp2 ^ inKey[i & 15] ^ temp);
            temp = temp2;
        }

        int old = inKey[8] & 0xff;
        old |= inKey[9] << 8 & 0xff00;
        old |= inKey[10] << 0x10 & 0xff0000;
        old |= inKey[11] << 0x18 & 0xff000000;

        old += size;

        inKey[8] = (byte) (old & 0xff);
        inKey[9] = (byte) (old >> 0x08 & 0xff);
        inKey[10] = (byte) (old >> 0x10 & 0xff);
        inKey[11] = (byte) (old >> 0x18 & 0xff);
        return true;
    }

    @Override
    public void setKey(byte[] key) {
        inKey = key;
        outKey = new byte[16];
        System.arraycopy(inKey, 0, outKey, 0, outKey.length);
    }
}
