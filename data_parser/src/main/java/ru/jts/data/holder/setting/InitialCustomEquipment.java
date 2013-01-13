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

package ru.jts.data.holder.setting;

import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.data.common.ItemName_Count;

/**
 * @author : Camelion
 * @date : 21.08.12  14:13
 * <p/>
 * Содержит в себе информацию о преметах, выдаваемых игрокам.
 * (Используется на китайских серверах взамен InitialEquipment)
 */
public class InitialCustomEquipment {
    // Список предметов для каждого класса
    @ObjectArray
    public ItemName_Count[] human_fighter;
    @ObjectArray
    public ItemName_Count[] human_magician;
    @ObjectArray
    public ItemName_Count[] elf_fighter;
    @ObjectArray
    public ItemName_Count[] elf_magician;
    @ObjectArray
    public ItemName_Count[] darkelf_fighter;
    @ObjectArray
    public ItemName_Count[] darkelf_magician;
    @ObjectArray
    public ItemName_Count[] orc_fighter;
    @ObjectArray
    public ItemName_Count[] orc_shaman;
    @ObjectArray
    public ItemName_Count[] dwarf_apprentice;
    @ObjectArray
    public ItemName_Count[] kamael_m_soldier;
    @ObjectArray
    public ItemName_Count[] kamael_f_soldier;
}
