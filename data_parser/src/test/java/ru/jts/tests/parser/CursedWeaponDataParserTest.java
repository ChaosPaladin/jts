package ru.jts.tests.parser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.jts.data.holder.CursedWeaponDataHolder;
import ru.jts.data.holder.cursedweapondata.CursedWeapon;
import ru.jts.data.parser.CursedWeaponDataParser;

/**
 * @author : Camelion
 * @date : 26.08.12  21:34
 */
public class CursedWeaponDataParserTest extends Assert {

    @Before
    public void setUp() throws Exception {
        CursedWeaponDataParser.getInstance().load();
    }

    @Test
    public void test() {
        CursedWeaponDataHolder holder = CursedWeaponDataHolder.getInstance();
        assertFalse(holder.getCursedWeapons().size() == 0);

        for (CursedWeapon weapon : holder.getCursedWeapons()) {
            assertFalse(weapon.item_name.isEmpty());
        }
    }
}
