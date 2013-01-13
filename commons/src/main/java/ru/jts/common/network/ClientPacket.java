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
 * @date : 12.08.12  23:57
 */
public abstract class ClientPacket<T extends NetworkClient> extends Packet<T> implements Runnable {
    private ByteBuffer buffer;	/*
    * Следующие методы считывают данные из буффера
    * Размер данных равен размеру типа возвращаемого значения
    */

    /* package */  void read(ByteBuffer buffer) {
        this.buffer = buffer;
        readImpl();
    }

    @Override
    public void run() {
        runImpl();
    }

    protected abstract void readImpl();

    protected abstract void runImpl();

    public byte readC() {
        return (byte) (buffer.get() & 0xFF);
    }

    public short readH() {
        return (short) (buffer.getShort() & 0xFFFF);
    }

    public double readF() {
        return buffer.getDouble();
    }

    public int readD() {
        return buffer.getInt();
    }

    public long readQ() {
        return buffer.getLong();
    }

    public void readB(byte[] dst) {
        buffer.get(dst);
    }

    public String readS() {
        StringBuilder sb = new StringBuilder();
        char ch;
        while ((ch = buffer.getChar()) != 0)
            sb.append(ch);
        return sb.toString();
    }
}
