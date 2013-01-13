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

package ru.jts.common.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import ru.jts.common.log.Log;

/**
 * @author : Camelion
 * @date : 16.08.12  19:51
 */
public class DatabaseFactory {
    private static final String LOG_TAG = "DatabaseFactory.java";

    private int db_version;
    private boolean initied = false;
    private static DatabaseFactory ourInstance = new DatabaseFactory();

    private Configuration configuration;
    private SessionFactory sessionFactory;
    private ServiceRegistry serviceRegistry;

    public static DatabaseFactory getInstance() {
        return ourInstance;
    }

    private DatabaseFactory() {
        configuration = new Configuration();
        configuration.configure();
        serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }

    public void init(int db_version, DatabaseUpdater.IDBUpdateListener updateListener) {
        this.db_version = db_version;

        // DB Update actions
        String className = DBParams.class.getName();
        if (configuration.getClassMapping(className) != null) {
            Session session = sessionFactory.openSession();
            Transaction transaction = null;
            try {

                DBParams version = (DBParams) session.get(DBParams.class, DBParams.DB_VERSION);

                boolean saveOrUpdateVersion = false;
                if (version == null) {
                    version = new DBParams("db_version", String.valueOf(db_version));
                    saveOrUpdateVersion = true;
                }

                int oldDBVersion = version.getAsInt();

                if (this.db_version != oldDBVersion) {
                    if (oldDBVersion > db_version)
                        throw new UnsupportedOperationException(String.format("Downgrade from %d to %d is impossible!", oldDBVersion, db_version));

                    DatabaseUpdater.updateDatabase(oldDBVersion, db_version, updateListener);

                    version.setValue(db_version);
                    saveOrUpdateVersion = true;
                }

                if (saveOrUpdateVersion) {
                    transaction = session.beginTransaction();
                    session.saveOrUpdate(version);
                    transaction.commit();
                }
            } catch (Exception e) {
                if (transaction != null)
                    transaction.rollback();
                Log.w(LOG_TAG, "Exception in db updater", e);
            } finally {
                close(session);
            }
        }

        initied = true;
    }

    public Session openSession() {
        if (!initied) {
            throw new IllegalStateException("DatabaseFactory openSession() called, but factory is not initialized");
        }
        return sessionFactory.openSession();
    }

    public void close() {
        sessionFactory.close();
    }

    public static void close(Session session) {
        try {
            session.close();
        } catch (Exception e) {
            // ignored
        }
    }
}
