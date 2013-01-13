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

package ru.jts.common.game.l2;

/**
 * @author : Camelion
 * @date : 18.08.12  20:12
 */
public class SessionKey {
    private final int loginOK1;
    private final int loginOK2;
    private final int playOK1;
    private final int playOK2;

    public SessionKey(int loginOK1, int loginOK2, int playOK1, int playOK2) {
        this.loginOK1 = loginOK1;
        this.loginOK2 = loginOK2;
        this.playOK1 = playOK1;
        this.playOK2 = playOK2;
    }

    public int getLoginOK1() {
        return loginOK1;
    }

    public int getLoginOK2() {
        return loginOK2;
    }

    public int getPlayOK1() {
        return playOK1;
    }

    public int getPlayOK2() {
        return playOK2;
    }

    public boolean checkKeyPair(int loginOKID1, int loginOKID2) {
        return loginOKID1 == loginOK1 && loginOKID2 == loginOK2;
    }
}
