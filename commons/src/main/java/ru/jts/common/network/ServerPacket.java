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

import org.jboss.netty.buffer.ChannelBuffer;

/**
 * @author : Camelion
 * @date : 12.08.12  23:56
 * <p/>
 * TODO: Для наибольшей скорости можно сделать прямую запись в буфер через шифрующий алгоритм.
 * Для блочных алгоритмов данные будут скапливаться до заполнения блока и в конце щифроваться остаток.
 * Для всех остальных алгоритмов шифрование будет идти напрямую.
 */
public abstract class ServerPacket<T extends NetworkClient> extends Packet<T> {
    private ChannelBuffer buffer;

    /**
     * Подготавливает пакет к отправке
     */	/* package */ void write(ChannelBuffer buffer) {
        this.buffer = buffer;

        int beforeShift = getNetworkClient().getShiftBeforeWritePacket();
        buffer.writeBytes(new byte[beforeShift]);

        writeImpl(); // Запись данных

        int length = buffer.writerIndex() + getNetworkClient().getShiftAfterWritePacket(buffer.writerIndex() - beforeShift);
        byte data[] = new byte[length];

        buffer.markReaderIndex();
        buffer.readBytes(data, 0, buffer.writerIndex());

        // Reset buffer
        buffer.resetReaderIndex();
        buffer.writerIndex(data.length);

        getNetworkClient().getNetworkCrypt().encrypt(data, beforeShift, data.length);
        getNetworkClient().prepareToSend(data);

        buffer.setBytes(0, data);
    }

    /**
     * Записывает данные в буффер
     */
    protected abstract void writeImpl();

    /*
     * Следующие методы записывают данные в буффер
     * Размер данных равен размеру типа первого параметра
     */

    protected void writeC(int value) {
        buffer.writeByte(value);
    }

    protected void writeH(int value) {
        buffer.writeShort(value);
    }

    protected void writeD(int value) {
        buffer.writeInt(value);
    }

    protected void writeF(double value) {
        buffer.writeDouble(value);
    }

    protected void writeQ(long value) {
        buffer.writeLong(value);
    }

    protected void writeS(String charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        for (int i = 0; i < charSequence.length(); i++) {
            buffer.writeChar(charSequence.charAt(i));
        }
        buffer.writeChar('\000');
    }

    protected void writeB(byte[] data) {
        buffer.writeBytes(data);
    }
}
