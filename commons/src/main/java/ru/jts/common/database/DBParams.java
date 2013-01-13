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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author : Camelion
 * @date : 17.08.12  0:47
 * <p/>
 * Класс - помощник для обновления базы данных,
 * хранит в себе единственную int переменную - номер версии базы данных
 */
@Entity
@Table(name = "db_params")
public class DBParams implements Serializable {
    public static final String DB_VERSION = "db_version";

    @Id
    @Column(name = "_key", length = 25)
    private String _key;

    @Column(name = "value")
    private String value;

    public DBParams() {
    }

    public DBParams(String key, Object value) {
        this._key = key;
        this.value = String.valueOf(value);
    }

    public void setValue(Object value) {
        this.value = String.valueOf(value);
    }

    public int getAsInt() {
        return Integer.parseInt(value);
    }
}
