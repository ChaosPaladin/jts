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
 * @date : 24.08.12  22:56
 * <p/>
 * Выбирает класс, из которого будет создаваться объект
 * на основе анализа данных будущего объекта.
 * Может спарсить и задать какие-либо значения по умолчанию.
 * <p/>
 * Используется для создания объектов, помеченных аннотациями @Element, @ObjectArray
 * Возможно потребуется поддержка этой фабрики для аннотаций @ElementArray и для @ObjectValue
 * <p/>
 * Внимание! ObjecFactory переключает управление данными в ручной режим,
 * позволяя делать невероятные финты ушами, обходя коварство разработчиков PTS датапака,
 * считывая данные из структур, которые ни как нельзя структурировать (cubicdata.txt),
 * НО! За всё это приходится расплачиваться производительностью.
 * Обработка данных через ObjectFactory выполняется значительно медленнее, чем остальных данных,
 * поэтому использовать её рекомендуется только в крайних случаях.
 */
public interface IObjectFactory<T> {
    /**
     * Функция, возвращающая созданный на основе анализа объект
     *
     * @param data - данные для анализа
     * @return - Созданный объект, либо null
     */
    T createObjectFor(StringBuilder data) throws IllegalAccessException, InstantiationException, NoSuchFieldException;

    /**
     * Устанавливает класс обрабатываемого поля, может использоваться для создания объектов по умолчанию
     *
     * @param clazz - класс обрабатываемого поля
     */
    void setFieldClass(Class<?> clazz);
}

