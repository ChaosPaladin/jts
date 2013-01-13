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

package ru.jts.loginserver.network.game_client.crypt;

import ru.jts.common.log.Log;
import ru.jts.common.math.Rnd;
import ru.jts.common.network.INetworkCrypt;

import java.io.IOException;

/**
 * @author : Camelion
 * @date : 14.08.12  11:48
 */
public class LoginCrypt implements INetworkCrypt {
    public static final int CRYPT_BLOCK_SIZE = 8;

    private static final String LOG_TAG = "LoginCrypt.java";
    private static final byte[] STATIC_BLOWFISH_KEY = {
            (byte) 0x6b, (byte) 0x60, (byte) 0xcb, (byte) 0x5b,
            (byte) 0x82, (byte) 0xce, (byte) 0x90, (byte) 0xb1,
            (byte) 0xcc, (byte) 0x2b, (byte) 0x6c, (byte) 0x55,
            (byte) 0x6c, (byte) 0x6c, (byte) 0x6c, (byte) 0x6c
    };

    private byte[] key;
    private boolean _static = true;
    private final BlowfishEngine blowfishEngineEncrypt;
    private final BlowfishEngine blowfishEngineDecrypt;

    public LoginCrypt() {
        blowfishEngineEncrypt = new BlowfishEngine();
        blowfishEngineEncrypt.init(true, STATIC_BLOWFISH_KEY);
        blowfishEngineDecrypt = new BlowfishEngine();
    }

    @Override
    public void setKey(byte[] key) {
        this.key = key;
    }

    @Override
    public boolean encrypt(byte[] data, int from, int to) {
        int size = to - from;

        if (isStatic()) {
            encXORPass(data, from, size, Rnd.nextInt());

            encrypt0(data, from, to);

            blowfishEngineEncrypt.init(true, key);
            blowfishEngineDecrypt.init(false, key);
            _static = false;
            key = null;
        } else {
            appendChecksum(data, from, size);

            encrypt0(data, from, to);
        }
        return true;
    }

    @Override
    public boolean decrypt(byte[] data, int from, int to) {
        decrypt0(data, from, to);

        return verifyChecksum(data, from, (to - from));
    }

    private void encrypt0(byte[] data, int from, int to) {
        int count = (to - from) / 8;
        for (int i = 0; i < count; i++) {
            try {
                blowfishEngineEncrypt.processBlock(data, from + i * 8, data, from + i * 8);
            } catch (IOException e) {
                Log.w(LOG_TAG, "Exception in encrypt0", e);
                e.printStackTrace();
            }
        }
    }

    private void decrypt0(byte[] data, int from, int to) {
        int count = (to - from) / 8;
        for (int i = 0; i < count; i++) {
            try {
                blowfishEngineDecrypt.processBlock(data, from + i * 8, data, from + i * 8);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isStatic() {
        return _static;
    }

    /**
     * Packet is first XOR encoded with <code>key</code>
     * Then, the last 4 bytes are overwritten with the the XOR "key".
     * Thus this assume that there is enough room for the key to fit without overwriting data.
     *
     * @param raw    The raw bytes to be encrypted
     * @param offset The begining of the data to be encrypted
     * @param size   Length of the data to be encrypted
     * @param key    The 4 bytes (int) XOR key
     */
    private static void encXORPass(byte[] raw, final int offset, final int size, int key) {
        int stop = size - 8;
        int pos = 4 + offset;
        int edx;
        int ecx = key; // Initial xor key

        while (pos < stop) {
            edx = raw[pos] & 0xFF;
            edx |= (raw[pos + 1] & 0xFF) << 8;
            edx |= (raw[pos + 2] & 0xFF) << 16;
            edx |= (raw[pos + 3] & 0xFF) << 24;

            ecx += edx;

            edx ^= ecx;

            raw[pos++] = (byte) (edx & 0xFF);
            raw[pos++] = (byte) (edx >> 8 & 0xFF);
            raw[pos++] = (byte) (edx >> 16 & 0xFF);
            raw[pos++] = (byte) (edx >> 24 & 0xFF);
        }

        raw[pos++] = (byte) (ecx & 0xFF);
        raw[pos++] = (byte) (ecx >> 8 & 0xFF);
        raw[pos++] = (byte) (ecx >> 16 & 0xFF);
        raw[pos] = (byte) (ecx >> 24 & 0xFF);
    }

    private static void appendChecksum(byte[] raw, final int offset, final int size) {
        long chksum = 0;
        int count = size - 4;
        long ecx;
        int i;

        for (i = offset; i < count; i += 4) {
            ecx = raw[i] & 0xff;
            ecx |= raw[i + 1] << 8 & 0xff00;
            ecx |= raw[i + 2] << 0x10 & 0xff0000;
            ecx |= raw[i + 3] << 0x18 & 0xff000000;

            chksum ^= ecx;
        }

        ecx = raw[i] & 0xff;
        ecx |= raw[i + 1] << 8 & 0xff00;
        ecx |= raw[i + 2] << 0x10 & 0xff0000;
        ecx |= raw[i + 3] << 0x18 & 0xff000000;

        raw[i] = (byte) (chksum & 0xff);
        raw[i + 1] = (byte) (chksum >> 0x08 & 0xff);
        raw[i + 2] = (byte) (chksum >> 0x10 & 0xff);
        raw[i + 3] = (byte) (chksum >> 0x18 & 0xff);
    }

    private static boolean verifyChecksum(byte[] raw, final int offset, final int size) {
        // check if size is multiple of 4 and if there is more then only the checksum
        if ((size & 3) != 0 || size <= 4)
            return false;

        long chksum = 0;
        int count = size - 4;
        long check;
        int i;

        for (i = offset; i < count; i += 4) {
            check = raw[i] & 0xff;
            check |= raw[i + 1] << 8 & 0xff00;
            check |= raw[i + 2] << 0x10 & 0xff0000;
            check |= raw[i + 3] << 0x18 & 0xff000000;

            chksum ^= check;
        }

        check = raw[i] & 0xff;
        check |= raw[i + 1] << 8 & 0xff00;
        check |= raw[i + 2] << 0x10 & 0xff0000;
        check |= raw[i + 3] << 0x18 & 0xff000000;

        return check == chksum;
    }
}
