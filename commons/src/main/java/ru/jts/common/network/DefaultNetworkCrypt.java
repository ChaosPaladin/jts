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

package ru.jts.common.network;

/**
 * @author : Camelion
 * @date : 17.08.12  19:44
 * <p/>
 * Класс для шифрований, не производит ни каких изменений в данных.
 * Данные отправляются в незашифрованном виде
 */
public class DefaultNetworkCrypt implements INetworkCrypt {
    @Override
    public boolean encrypt(byte[] data, int from, int to) {
        return true;
    }

    @Override
    public boolean decrypt(byte[] data, int from, int to) {
        return true;
    }

    @Override
    public void setKey(byte[] key) {
        // Ignored
    }
}
