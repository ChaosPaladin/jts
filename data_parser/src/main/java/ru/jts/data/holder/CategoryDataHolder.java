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
import ru.jts.common.parser.AbstractHolder;
import ru.jts.data.holder.categorydata.CategoryDefine;

import java.util.List;

/**
 * @author : Camelion
 * @date : 26.08.12  12:11
 */
public class CategoryDataHolder extends AbstractHolder {
    @Element(start = "category_define_begin", end = "category_define_end")
    private List<CategoryDefine> definedCategories;

    private static CategoryDataHolder ourInstance = new CategoryDataHolder();

    public static CategoryDataHolder getInstance() {
        return ourInstance;
    }

    private CategoryDataHolder() {
    }

    @Override
    public int size() {
        return definedCategories.size();
    }

    public List<CategoryDefine> getDefinedCategories() {
        return definedCategories;
    }
}
