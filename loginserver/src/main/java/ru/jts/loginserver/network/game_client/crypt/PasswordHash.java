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

import org.bouncycastle.jce.provider.JDKMessageDigest;
import org.bouncycastle.util.encoders.Base64;
import ru.jts.common.log.Log;

import java.security.MessageDigest;

/**
 * @author : Camelion
 * @date : 17.08.12  14:28
 */
public final class PasswordHash {
    private static final String LOG_TAG = "PasswordHash.java";

    public static String hash(String input, String algorithm) {
        MessageDigest digest;
        String hash = input;
        switch (algorithm) {
            case "whirlpool":
                digest = new JDKMessageDigest.Whirlpool();
                byte[] outputBytes = digest.digest(input.getBytes());
                hash = new String(Base64.encode(outputBytes));
                break;
            default:
                Log.w(LOG_TAG, "Algorithm {} not found! string {} is not been hashed", algorithm, input);
        }
        return hash;
    }
}
