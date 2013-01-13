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
import ru.jts.common.network.INetworkCrypt;
import ru.jts.common.network.IPacketHandler;
import ru.jts.common.network.NetworkClient;
import ru.jts.loginserver.model.Account;
import ru.jts.loginserver.network.game_client.crypt.LoginCrypt;
import ru.jts.loginserver.network.game_client.serverpackets.LoginInit;

import java.net.InetAddress;
import java.security.interfaces.RSAPrivateKey;

/**
 * @author : Camelion
 * @date : 13.08.12  20:27
 */
public class LoginClient extends NetworkClient {
    private static final int HEADER_SIZE = 2;

    private final int sessionId;
    private ScrambledKeyPair scrambledKeyPair;
    private byte[] blowfishKey;
    private SessionKey sessionKey;
    private Account account;

    public LoginClient(INetworkCrypt networkCrypt, IPacketHandler packetHandler) {
        super(networkCrypt, packetHandler);
        sessionId = hashCode();
        scrambledKeyPair = KeyGenerator.generateScrambledKeyPair();
        blowfishKey = KeyGenerator.generateBlowfishKey();
        sessionKey = KeyGenerator.generateSessionKey();
        getNetworkCrypt().setKey(blowfishKey);
    }

    @Override
    public void prepareToSend(byte[] data) {
        // write short (size)
        data[0] = (byte) (data.length & 0xFF);
        data[1] = (byte) (data.length >> 8 & 0xFF);
    }

    @Override
    public int getShiftBeforeReadPacket() {
        return HEADER_SIZE;
    }

    @Override
    public int getShiftBeforeWritePacket() {
        return HEADER_SIZE;
    }

    @Override
    public int getShiftAfterWritePacket(int dataLength) {
        int add = 4; // Reserve for checksum
        if (((LoginCrypt) getNetworkCrypt()).isStatic())
            add += 4;// Reserve for XOR key
        dataLength += add;
        return LoginCrypt.CRYPT_BLOCK_SIZE - dataLength % LoginCrypt.CRYPT_BLOCK_SIZE + add; // reserve for XOR key;
    }


    @Override
    public void onConnected() {
        sendPacket(new LoginInit(getSessionId(), scrambledKeyPair.scrambledModulus, blowfishKey));
        blowfishKey = null;
    }

    @Override
    public void onDisconnect() {
        scrambledKeyPair = null;
        sessionKey = null;
        account = null;
    }

    public int getSessionId() {
        return sessionId;
    }

    public RSAPrivateKey getRSAPrivateKey() {
        return (RSAPrivateKey) scrambledKeyPair.getKeyPair().getPrivate();
    }

    public SessionKey getSessionKey() {
        return sessionKey;
    }

    public String getIPAddress() {
        InetAddress address = getInetAddress();
        if (address != null)
            return address.getHostAddress();
        else
            return "0.0.0.0";
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
}
