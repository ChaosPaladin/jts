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
 * @date : 13.08.12  14:55
 * <p/>
 * Класс для шифрования \ дешифрования пакетов
 */
public interface INetworkCrypt {

    /**
     * Шифрование пакета
     *
     * @param data - исходный массив
     */
    public boolean encrypt(byte[] data, int from, int to);

    /**
     * Дешифрование пакета
     *
     * @param data - исходный массив
     */
    public boolean decrypt(byte[] data, int from, int to);

    /**
     * Устанавливает ключ шифрования
     *
     * @param key - ключ шифрования
     */
    public void setKey(byte[] key);
}
