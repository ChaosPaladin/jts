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

package ru.jts.loginserver.network.game_client;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.interfaces.RSAPublicKey;

public class ScrambledKeyPair {
    private final KeyPair keyPair;
    public final byte[] scrambledModulus;

    public ScrambledKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
        scrambledModulus = scrambleModulus(((RSAPublicKey) keyPair.getPublic()).getModulus());
    }

    private byte[] scrambleModulus(BigInteger modulus) {
        byte[] scrambledMod = modulus.toByteArray();

        if (scrambledMod.length == 0x81 && scrambledMod[0] == 0x00) {
            byte[] temp = new byte[0x80];
            System.arraycopy(scrambledMod, 1, temp, 0, 0x80);
            scrambledMod = temp;
        }
        // step 1 : 0x4d-0x50 <-> 0x00-0x04
        for (int i = 0; i < 4; i++) {
            byte temp = scrambledMod[i];
            scrambledMod[i] = scrambledMod[0x4d + i];
            scrambledMod[0x4d + i] = temp;
        }
        // step 2 : xor first 0x40 bytes with  last 0x40 bytes
        for (int i = 0; i < 0x40; i++)
            scrambledMod[i] = (byte) (scrambledMod[i] ^ scrambledMod[0x40 + i]);
        // step 3 : xor bytes 0x0d-0x10 with bytes 0x34-0x38
        for (int i = 0; i < 4; i++)
            scrambledMod[0x0d + i] = (byte) (scrambledMod[0x0d + i] ^ scrambledMod[0x34 + i]);
        // step 4 : xor last 0x40 bytes with  first 0x40 bytes
        for (int i = 0; i < 0x40; i++)
            scrambledMod[0x40 + i] = (byte) (scrambledMod[0x40 + i] ^ scrambledMod[i]);

        return scrambledMod;
    }

    public KeyPair getKeyPair() {
        return keyPair;
    }
}
