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

package ru.jts.loginserver.manager;

import ru.jts.common.game.l2.SessionKey;
import ru.jts.common.threading.ThreadPoolManager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : Camelion
 * @date : 20.08.12  17:55
 */
public class SessionManager {
    private static final int LOGIN_TIMEOUT = 60_000;
    private static SessionManager ourInstance = new SessionManager();

    private final Map<String, Session> sessionMap;
    private final ReentrantLock lock;

    public static SessionManager getInstance() {
        return ourInstance;
    }

    private SessionManager() {
        sessionMap = new HashMap<>();
        lock = new ReentrantLock();
        ThreadPoolManager.getInstance().scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                long currentTime = System.currentTimeMillis();
                lock.lock();
                try {
                    for (Iterator<Session> iterator = sessionMap.values().iterator(); iterator.hasNext(); ) {
                        Session session = iterator.next();
                        if (session.getExpireTime() < currentTime)
                            iterator.remove();
                    }
                } finally {
                    lock.unlock();
                }
            }
        }, LOGIN_TIMEOUT, LOGIN_TIMEOUT / 2);
    }

    public void openSession(String accountName, SessionKey sessionKey) {
        lock.lock();
        try {
            sessionMap.put(accountName, new Session(sessionKey));
        } finally {
            lock.unlock();
        }
    }

    public boolean closeSession(String accountName, SessionKey sessionKey) {
        lock.lock();
        try {
            if (!sessionMap.containsKey(accountName))
                return false;
            Session session = sessionMap.remove(accountName);
            return session.checkSessionKey(sessionKey);
        } finally {
            lock.unlock();
        }
    }

    private class Session {
        private final SessionKey sessionKey;
        private final long expireTime;

        private Session(SessionKey sessionKey) {
            this.sessionKey = sessionKey;
            expireTime = System.currentTimeMillis() + LOGIN_TIMEOUT;
        }

        public long getExpireTime() {
            return expireTime;
        }

        public boolean checkSessionKey(SessionKey key) {
            return sessionKey.getLoginOK1() == key.getLoginOK1() && sessionKey.getLoginOK2() == key.getLoginOK2()
                    && sessionKey.getPlayOK1() == key.getPlayOK1() && sessionKey.getPlayOK2() == key.getPlayOK2();
        }
    }
}
