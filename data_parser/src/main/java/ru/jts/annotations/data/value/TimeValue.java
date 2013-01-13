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

package ru.jts.annotations.data.value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : Camelion
 * @date : 25.08.12  1:57
 * Показывает парсеру, что поле класса должно считываться как элемент типа Long (с преобразованием по времени (к секундам))
 * Поле типа TimeValue соответствует одному из шаблонов (\d+)sec, (\d+)min, (\d+)hour. Они и используются при поиске значения
 * <p/>
 * Не группируется в список List!
 */
@Target(ElementType.FIELD) // Target field
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeValue {
    /**
     * Имя, по которому будет произведен поиск переменной в буфере, если withoutName() == false
     * Если не указано - подставляется имя аннотированного поля
     *
     * @return - имя переменной в буфере
     */
    String name() default "";

    /**
     * Если true - поиск будет произведен по одному из шаблонов (\d+)sec, (\d+)min, (\d+)time
     * Если false - поиск будет произведен по одному из шаблонов:
     * name + "\s*=\s*(\d+)sec", name + "\s*=\s*(\d+)min", name + "\s*=\s*(\d+)time"
     *
     * @return true - поиск по шаблону, false - поиск по имени
     */
    boolean withoutName() default false;
}
