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

package ru.jts.loginserver.database;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import ru.jts.common.database.DatabaseFactory;
import ru.jts.common.log.Log;
import ru.jts.loginserver.model.Account;

import java.util.List;

/**
 * @author : Camelion
 * @date : 16.08.12  19:47
 */
public class AccountsDAO {
    private static final String LOG_TAG = "AccountsDAO.java";
    private static AccountsDAO ourInstance = new AccountsDAO();

    public static AccountsDAO getInstance() {
        return ourInstance;
    }

    private AccountsDAO() {
    }

    public Account restoreByLogin(String login) {
        Account account = null;
        Session session = DatabaseFactory.getInstance().openSession();
        try {
            Criteria criteria = session.createCriteria(Account.class);
            criteria.add(Restrictions.eq("login", login));
            criteria.setMaxResults(1);

            List acs = criteria.list();
            if (acs.size() == 1)
                account = (Account) acs.get(0);
        } catch (Exception e) {
            Log.w(LOG_TAG, "Exception in restoreByLogin() for account '" + login + "'", e);
        } finally {
            DatabaseFactory.close(session);
        }
        return account;
    }

    public void saveAccount(Account account) {
        Session session = DatabaseFactory.getInstance().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();

            session.saveOrUpdate(account);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
            Log.w(LOG_TAG, "Exception in saveAccount() for account '" + account.getLogin() + "'", e);
        } finally {
            DatabaseFactory.close(session);
        }
    }
}
