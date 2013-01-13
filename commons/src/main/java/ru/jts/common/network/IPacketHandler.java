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

import java.nio.ByteBuffer;

/**
 * @author : Camelion
 * @date : 13.08.12  20:41
 */
public interface IPacketHandler<T extends NetworkClient> {
    /**
     * Возвращает восстановленный пакет, либо null, если пакет не опознан.
     *
     * @param buffer - буффер, из которого считываются данные
     * @return - пакет, либо null
     */
    ClientPacket<T> handlePacket(ByteBuffer buffer);
}
