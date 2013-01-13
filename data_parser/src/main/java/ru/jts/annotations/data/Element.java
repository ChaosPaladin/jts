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

package ru.jts.annotations.data;

import ru.jts.annotations.data.factory.DefaultFactory;
import ru.jts.annotations.data.factory.IObjectFactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : Camelion
 * @date : 22.08.12  2:09
 * <p/>
 * Показывает парсеру, что поле класса должно считываться как элемент.
 * <p/>
 * Классы переменных, помеченных аттрибутом @Element:
 * 1) не должны быть вложенными, либо должны иметь модификаторы public static
 * 2) должны иметь конструктор без аргументов
 * <p/>
 * Если поле класса имеет тип List<E>, то этот список будет заполняться элементами типа E
 */
@Target(ElementType.FIELD) // Target field
@Retention(RetentionPolicy.RUNTIME)
public @interface Element {
    /**
     * @return - строка - индикатор начала элемента
     */
    String start();

    /**
     * @return - строка - индикатор окончания элемента
     */
    String end();

    /**
     * Возвращает класс-фабрику, которая управляет созданием Element-объектов.
     * Позволяет указать в качестве типа поля - какой-нибудь супер-класс, а управление объектами повесить на данную фабрику.
     * <p/>
     * Необходима при создании сложных структур
     *
     * @return класс-фабрика, создающая объекты нужного типа.
     */
    Class<? extends IObjectFactory> objectFactory() default DefaultFactory.class;
}
