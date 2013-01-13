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
import ru.jts.data.holder.instantzonedata.ArmorData;
import ru.jts.data.holder.itemdata.*;
import ru.jts.data.holder.itemdata.item.ec_cond.*;
import ru.jts.data.holder.itemdata.item.use_cond.*;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : Camelion
 * @date : 27.08.12  17:09
 */
public class ItemDataHolder extends AbstractHolder {
    @Element(start = "item_begin", end = "item_end", objectFactory = ItemDataObjectFactory.class)
    public List<ItemData> items;
    @Element(start = "set_begin", end = "set_end")
    public List<ItemSet> sets;

    private static ItemDataHolder ourInstance = new ItemDataHolder();

    public static ItemDataHolder getInstance() {
        return ourInstance;
    }

    private ItemDataHolder() {
    }

    @Override
    public int size() {
        return items.size() + sets.size();
    }

    public List<ItemData> getItemDatas() {
        return items;
    }

    public List<ItemSet> getItemSets() {
        return sets;
    }

    public static class ItemDataObjectFactory implements IObjectFactory<ItemData> {
        public static Pattern pattern = Pattern.compile("(\\S++)");

        @Override
        public ItemData createObjectFor(StringBuilder data) throws IllegalAccessException, InstantiationException {
            Matcher m = pattern.matcher(data);
            if (m.find()) {
                String type = m.group(1);
                switch (type) {
                    case "weapon":
                        return new WeaponData();
                    case "armor":
                        return new ArmorData();
                    case "etcitem":
                        return new EtcitemData();
                    case "asset":
                        return new AssetData();
                    case "accessary":
                        return new AccessaryData();
                    case "questitem":
                        return new QuestItemData();
                }
            }
            return null;
        }

        @Override
        public void setFieldClass(Class<?> clazz) {
            // Ignore
        }
    }

    public static class UseCondObjectFactory implements IObjectFactory<DefaultUseCond> {
        @Override
        public DefaultUseCond createObjectFor(StringBuilder data) throws IllegalAccessException, InstantiationException {
            String[] parts = data.toString().split(";");
            data.delete(0, parts[0].length() + 1);
            switch (parts[0]) {
                case "uc_transmode_exclude":
                    return new UCTransmodeExclude();
                case "uc_transmode_include":
                    return new UCTransmodeInclude();
                case "uc_category":
                    return new UCCategory();
                case "uc_race":
                    return new UCRace();
                case "uc_requiredlevel":
                    return new UCRequiredLevel();
                case "uc_in_residence_siege_field":
                    return new UCInResidenceSiegeField();
                case "uc_inzone_num":
                    return new UCInzoneNum();
                case "uc_level":
                    return new UCLevel();
                case "uc_restart_point":
                    return new UCRestartPoint();
            }
            return null;
        }

        @Override
        public void setFieldClass(Class<?> clazz) {
            // Ignore
        }
    }

    public static class EquipCondObjectFactory implements IObjectFactory<DefaultEquipCond> {

        @Override
        public DefaultEquipCond createObjectFor(StringBuilder data) throws IllegalAccessException, InstantiationException {
            String[] parts = data.toString().split(";");
            data.delete(0, parts[0].length() + 1);
            switch (parts[0]) {
                case "ec_race":
                    return new ECRace();
                case "ec_category":
                    return new ECCategory();
                case "ec_hero":
                    return new ECHero();
                case "ec_castle":
                    return new ECCastle();
                case "ec_castle_num":
                    return new ECCastleNum();
                case "ec_clan_leader":
                    return new ECClanLeader();
                case "ec_sex":
                    return new ECSex();
                case "ec_agit":
                    return new ECAgit();
                case "ec_agit_num":
                    return new ECAgitNum();
                case "ec_nobless":
                    return new ECNobless();
                case "ec_academy":
                    return new ECAcademy();
                case "ec_social_class":
                    return new ECSocialClass();
                case "ec_subjob":
                    return new ECSubjob();
                case "ec_requiredlevel":
                    return new ECRequiredLevel();
                case "ec_fortress":
                    return new ECFortress();
                case "ec_chao":
                    return new ECChao();
                case "ec_inzone_num":
                    return new ECInzoneNum();
            }
            return null;
        }

        @Override
        public void setFieldClass(Class<?> clazz) {
            // Ignore
        }
    }
}
