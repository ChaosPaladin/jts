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
import ru.jts.data.holder.cursedweapondata.CursedWeapon;

import java.util.List;

/**
 * @author : Camelion
 * @date : 26.08.12  21:35
 */
public class CursedWeaponDataHolder extends AbstractHolder {
    @Element(start = "cursed_weapon_begin", end = "cursed_weapon_end")
    private List<CursedWeapon> cursedWeapons;

    private static CursedWeaponDataHolder ourInstance = new CursedWeaponDataHolder();

    public static CursedWeaponDataHolder getInstance() {
        return ourInstance;
    }

    private CursedWeaponDataHolder() {
    }

    @Override
    public int size() {
        return cursedWeapons.size();
    }

    public List<CursedWeapon> getCursedWeapons() {
        return cursedWeapons;
    }
}
