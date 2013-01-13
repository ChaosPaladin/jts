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

import ru.jts.common.game.l2.SessionKey;
import ru.jts.common.math.Rnd;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.RSAKeyGenParameterSpec;

/**
 * @author : Camelion
 * @date : 15.11.11   23:45
 */
public final class KeyGenerator {

    /**
     * Генерирует RSA ключи
     *
     * @return ключ
     */
    public static ScrambledKeyPair generateScrambledKeyPair() {
        KeyPairGenerator keygen;
        try {
            keygen = KeyPairGenerator.getInstance("RSA");
            RSAKeyGenParameterSpec spec = new RSAKeyGenParameterSpec(1024, RSAKeyGenParameterSpec.F4);
            keygen.initialize(spec);
        } catch (NoSuchAlgorithmException | InvalidAlgorithmParameterException e) {
            e.printStackTrace();
            return null;
        }
        return new ScrambledKeyPair(keygen.generateKeyPair());
    }

    /**
     * Генерирует Blowfish ключ
     *
     * @return blowFish ключ
     */
    public static byte[] generateBlowfishKey() {
        byte[] key = new byte[16];
        for (int i = 0; i < key.length; i++) {
            key[i] = (byte) (Rnd.get(255) + 1);
        }
        return key;
    }

    public static SessionKey generateSessionKey() {
        return new SessionKey(Rnd.nextInt(), Rnd.nextInt(), Rnd.nextInt(), Rnd.nextInt());
    }
}
