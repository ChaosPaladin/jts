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

package ru.jts.data.holder;

import ru.jts.common.parser.AbstractHolder;

import java.util.HashMap;

/**
 * @author : Camelion
 * @date : 27.08.12  13:30
 */
public class FStringHolder extends AbstractHolder {
    private HashMap<Integer, String> fStringMap;

    private static FStringHolder ourInstance = new FStringHolder();

    public static FStringHolder getInstance() {
        return ourInstance;
    }

    private FStringHolder() {
        fStringMap = new HashMap<>();
    }

    @Override
    public int size() {
        return fStringMap.size();
    }

    public void addFString(int id, String value) {
        fStringMap.put(id, value);
    }

    public HashMap<Integer, String> getFStrings() {
        return fStringMap;
    }
}
