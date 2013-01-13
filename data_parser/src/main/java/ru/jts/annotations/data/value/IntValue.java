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
 * @date : 22.08.12  14:39
 * <p/>
 * Показывает парсеру, что поле класса должно считываться как элемент типа int
 */
@Target(ElementType.FIELD) // Target field
@Retention(RetentionPolicy.RUNTIME)
public @interface IntValue {
    /**
     * Имя, по которому будет произведен поиск переменной в буфере, если withoutName() == false
     * Если не указано - подставляется имя аннотированного поля
     *
     * @return - имя переменной в буфере
     */
    String name() default "";

    /**
     * Если true - поиск будет произведен по шаблону (\d+)
     * Если false - поиск будет произведен по шаблону name + "\s*?=\s*?(\d+)"
     *
     * @return true - поиск по шаблону, false - поиск по имени
     */
    boolean withoutName() default false;

    /**
     * Указывает дполнительные представления для числа
     * Например, имеется список:
     * element_begin id = expel1 element_end
     * element_begin id = expel2 element_end
     * element_begin id = 1 element_end
     * element_begin id = 2 element_end
     * <p/>
     * Для корректной обработки Int необходимо будет expel1 и expel2 заменить на число (к примеру, -1 и -2).
     * <p/>
     * В этом случае, к аннотации @IntValue необходимо будет добавить аттрибут replacements = {"expel1", "-1", "expel2", "-2"}
     *
     * @return - пары типа ключ-значение
     */
    String[] replacements() default {};
}
