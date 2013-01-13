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

package ru.jts.annotations.data.factory;

/**
 * @author : Camelion
 * @date : 24.08.12  22:57
 */

/**
 * Реализация фабрики по умолчанию (всегда используется тип аннотированного поля)
 */
public class DefaultFactory implements IObjectFactory<Object> {
    private Class<?> clazz;

    /**
     * Устанавливает класс, из которого будут создаваться объекты.
     * Данный метод гарантировано вызывается перед createObjectFor, если используется NoneFactory
     *
     * @param clazz
     */
    @Override
    public void setFieldClass(Class<?> clazz) {
        this.clazz = clazz;
    }

    @Override
    public Object createObjectFor(StringBuilder data) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }
}