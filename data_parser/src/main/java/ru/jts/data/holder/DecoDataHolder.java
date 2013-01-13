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

import ru.jts.annotations.data.Element;
import ru.jts.annotations.data.factory.IObjectFactory;
import ru.jts.common.parser.AbstractHolder;
import ru.jts.data.holder.decodata.Deco;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : Camelion
 * @date : 26.08.12  21:44
 */
public class DecoDataHolder extends AbstractHolder {
    @Element(start = "deco_begin", end = "deco_end", objectFactory = DecoObjectFactory.class)
    private List<Deco> decos;

    private static DecoDataHolder ourInstance = new DecoDataHolder();

    public static DecoDataHolder getInstance() {
        return ourInstance;
    }

    private DecoDataHolder() {
    }

    @Override
    public int size() {
        return decos.size();
    }

    public List<Deco> getDecos() {
        return decos;
    }

    private static final Pattern funcPattern = Pattern.compile("func=(none|hp_regen\\(([\\d\\.]+)\\)|mp_regen\\(([\\d\\.]+)\\)|exp_restore\\(([\\d\\.]+)\\))");

    public static class DecoObjectFactory implements IObjectFactory<Deco> {

        @Override
        public Deco createObjectFor(StringBuilder data) throws IllegalAccessException, InstantiationException {
            Deco deco = new Deco();
            Matcher matcher = funcPattern.matcher(data);
            matcher.find();
            String value = matcher.group(1);

            if (value.contains("none")) {
                deco.func = Deco.DecoFunc.none;
            } else {
                String param = value.substring(value.indexOf("(") + 1, value.indexOf(")"));
                value = value.substring(0, value.indexOf("("));
                deco.func = Deco.DecoFunc.valueOf(value);
                deco.func_param = Double.valueOf(param);
            }
            return deco;
        }

        @Override
        public void setFieldClass(Class<?> clazz) {
            // Ignored
        }
    }
}
