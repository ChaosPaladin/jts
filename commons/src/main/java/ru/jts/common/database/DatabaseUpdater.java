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

import ru.jts.common.log.Log;

/**
 * @author : Camelion
 * @date : 17.08.12  0:44
 * <p/>
 * Класс обновлящий версию базы данных
 * <p/>
 * Для его работы необходимо в mapping'e hibernat'а прописать класс {@link DBParams}
 */
public final class DatabaseUpdater {
    private static final String LOG_TAG = "DatabaseUpdater.java";

    /**
     * Вызывается после загрузки DatabaseFactory,
     * в основном используется для drop column запросов,
     * чтобы не засорять базу.
     * <p/>
     * Производит обновление с шагом в n,
     * Например, необходимо обновить базу данных с версии 3 до версии 8,
     * между версией 3 и 8 есть обновления версий 5 и 7.
     * Сперва происходит обновление с версии 3 до версии 5,
     * затем с версии 5 до версии 7, и с версии 7 до версии 8.
     *
     * @param from - версия с которой обновляется база
     * @param to   - версия до которой обновляется база
     */
    public static void updateDatabase(int from, int to, IDBUpdateListener listener) {
        int updatesCount = 0;
        for (int tempTo = from + 1; tempTo <= to; tempTo++) {
            boolean hasUpdate = listener.update(from, tempTo);
            // Обновление прошло успешно, сдвигаем указатели
            if (hasUpdate) {
                ++updatesCount;
                Log.i(LOG_TAG, "Update database from version {} to version {} has been applied", from, tempTo);
                from = tempTo;
            }
        }
        if (updatesCount == 0) {
            Log.w(LOG_TAG, "updateDatabase() called, but update is not installed");
        }
    }

    public static interface IDBUpdateListener {
        /**
         * Метод вызывается для обновления базы данных.
         * Обновление базы даных происходит во время загрузки {@link DatabaseFactory}.
         * Должен содержать в себе HQL запросы, выполняющие работу, с которой сам Hibernate не справится.
         * <p/>
         * Переопределенный метод должден возвращать true,
         * если существует обновление с версии "from" до версии "to"
         *
         * @param from - версия, с которой происходит обновление
         * @param to   - версия, до которой обновляетс база данных
         * @return - true, если обновление для таких версий существует, и было выполнено
         */
        public boolean update(int from, int to);
    }
}
