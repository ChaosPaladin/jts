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

package ru.jts;

import ru.jts.common.log.Log;
import ru.jts.data.Parser;
import ru.jts.data.parser.*;

/**
 * @author : Camelion
 * @date : 25.08.12  12:54
 * <p/>
 * Главный загрузчик, который управляет последовательностью загрузки датапака
 */
public class PTSDataLoader {

    public static void load() {
        try {
            AirshipParser.getInstance().load();
            AnnounceSphereParser.getInstance().load();
            AreaDataParser.getInstance().load();
            ArmorEnchantBonusDataParser.getInstance().load();
            AuctionDataParser.getInstance().load();
            BuilderCmdAliasParser.getInstance().load();
            CastleDataParser.getInstance().load();
            CategoryDataParser.getInstance().load();
            ConvertDataParser.getInstance().load();
            CubicDataParser.getInstance().load();
            CursedWeaponDataParser.getInstance().load();
            DecoDataParser.getInstance().load();
            DoorDataParser.getInstance().load();
            DyeDataParser.getInstance().load();
            EnchantOptionParser.getInstance().load();
            FieldCycleParser.getInstance().load();
            FishingDataParser.getInstance().load();
            FormationInfoParser.getInstance().load();
            FreewayInfoParser.getInstance().load();
            FStringParser.getInstance().load();
            InstantZoneDataParser.getInstance().load();
            ItemDataParser.getInstance().load();

            SettingParser.getInstance().load();

            Parser.clear();
        } catch (Exception e) {
            Log.w(e.getLocalizedMessage(), e);
        }
    }
}
