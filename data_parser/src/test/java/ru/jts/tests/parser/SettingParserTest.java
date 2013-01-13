package ru.jts.tests.parser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.jts.data.common.ItemName_Count;
import ru.jts.data.holder.SettingHolder;
import ru.jts.data.parser.SettingParser;

import static ru.jts.data.holder.setting.InitialStartPoint.StartPoint;
import static ru.jts.data.holder.setting.OlympiadArena.Arena;
import static ru.jts.data.holder.setting.RestartPoint.Area;
import static ru.jts.data.holder.setting.RestartPoint.Point;

/**
 * @author : Camelion
 * @date : 22.08.12  1:39
 */
public class SettingParserTest extends Assert {

    @Before
    public void setUp() throws Exception {
        SettingParser.getInstance().load();
    }

    @Test
    public void test() {
        SettingHolder holder = SettingHolder.getInstance();

        testEquipment(holder);
        testStartPoint(holder);
        testRestartPoint(holder);
        testStat(holder);
        testOlympiadArena(holder);
        testOlympiadGeneralSetting(holder);
        testHeroGeneralSetting(holder);

        // Неизвестный эвент
        testCleftSetting(holder);
    }

    private void testCleftSetting(SettingHolder holder) {
        assertFalse(holder.getCleftSetting().cleft_zone_territory.length == 0);

        assertNotNull(holder.getCleftSetting().redStartPoint);
        assertNotNull(holder.getCleftSetting().blueStartPoint);
        assertNotNull(holder.getCleftSetting().redBanishPoint);
        assertNotNull(holder.getCleftSetting().blueBanishPoint);

        assertNotNull(holder.getCleftSetting().redStartPoint.points.isEmpty());
        assertNotNull(holder.getCleftSetting().blueStartPoint.points.isEmpty());
        assertNotNull(holder.getCleftSetting().redBanishPoint.points.isEmpty());
        assertNotNull(holder.getCleftSetting().blueBanishPoint.points.isEmpty());
    }

    private void testHeroGeneralSetting(SettingHolder holder) {
        assertFalse(holder.getHeroGeneralSetting().hero_skill.length == 0);
    }

    private void testOlympiadGeneralSetting(SettingHolder holder) {
        assertFalse(holder.getOlympiadGeneralSetting().forbidden_weapons.length == 0);
        assertNotNull(holder.getOlympiadGeneralSetting().classless_bonus);
        assertNotNull(holder.getOlympiadGeneralSetting().class_bonus);
        assertFalse(holder.getOlympiadGeneralSetting().olympiad_time_setting.length == 0);
        assertFalse(holder.getOlympiadGeneralSetting().olympiad_point_denominator.length == 0);
        assertFalse(holder.getOlympiadGeneralSetting().olympiad_point_weight.length == 0);
    }

    private void testOlympiadArena(SettingHolder holder) {
        assertFalse(holder.getOlympiadArena().arenas.isEmpty());
        for (Arena arena : holder.getOlympiadArena().arenas) {
            assertFalse(arena.ranges.length == 0);
            assertFalse(arena.points1.length == 0);
            assertFalse(arena.points2.length == 0);
            assertFalse(arena.olympiad_doors.length == 0);
        }
    }

    private void testStat(SettingHolder holder) {
        // Test recomended stat
        int stat_count = 6;
        assertEquals(holder.getRecommendedStat().human_fighter.length, stat_count);
        assertEquals(holder.getRecommendedStat().human_magician.length, stat_count);
        assertEquals(holder.getRecommendedStat().elf_fighter.length, stat_count);
        assertEquals(holder.getRecommendedStat().elf_magician.length, stat_count);
        assertEquals(holder.getRecommendedStat().darkelf_fighter.length, stat_count);
        assertEquals(holder.getRecommendedStat().darkelf_magician.length, stat_count);
        assertEquals(holder.getRecommendedStat().orc_fighter.length, stat_count);
        assertEquals(holder.getRecommendedStat().orc_shaman.length, stat_count);
        assertEquals(holder.getRecommendedStat().dwarf_apprentice.length, stat_count);
        assertEquals(holder.getRecommendedStat().kamael_m_soldier.length, stat_count);
        assertEquals(holder.getRecommendedStat().kamael_f_soldier.length, stat_count);
    }

    private void testRestartPoint(SettingHolder holder) {
        assertFalse(holder.getRestartPoint().areas.isEmpty());
        assertFalse(holder.getRestartPoint().points.isEmpty());

        // Test areas
        for (Area area : holder.getRestartPoint().areas) {
            assertFalse(area.ranges.length == 0);
            assertFalse(area.race.isEmpty());
        }

        // Test points
        for (Point point : holder.getRestartPoint().points) {
            assertFalse(point.point_name.isEmpty());
            assertFalse(point.points.isEmpty());
            assertFalse(point.chao_points.isEmpty());
        }
    }

    private void testStartPoint(SettingHolder holder) {
        assertFalse(holder.getInitialStartPoint().points.isEmpty());

        for (StartPoint point : holder.getInitialStartPoint().points) {
            assertFalse(point.points.isEmpty());
            assertFalse(point.classes.length == 0);
        }
    }

    private void testEquipment(SettingHolder holder) {
        // initial equipment test
        for (ItemName_Count pair : holder.getInitialEquipment().human_fighter)
            assertFalse(pair.itemName.isEmpty());
        for (ItemName_Count pair : holder.getInitialEquipment().human_magician)
            assertFalse(pair.itemName.isEmpty());
        for (ItemName_Count pair : holder.getInitialEquipment().elf_fighter)
            assertFalse(pair.itemName.isEmpty());
        for (ItemName_Count pair : holder.getInitialEquipment().elf_magician)
            assertFalse(pair.itemName.isEmpty());
        for (ItemName_Count pair : holder.getInitialEquipment().darkelf_fighter)
            assertFalse(pair.itemName.isEmpty());
        for (ItemName_Count pair : holder.getInitialEquipment().darkelf_magician)
            assertFalse(pair.itemName.isEmpty());
        for (ItemName_Count pair : holder.getInitialEquipment().orc_fighter)
            assertFalse(pair.itemName.isEmpty());
        for (ItemName_Count pair : holder.getInitialEquipment().orc_shaman)
            assertFalse(pair.itemName.isEmpty());
        for (ItemName_Count pair : holder.getInitialEquipment().dwarf_apprentice)
            assertFalse(pair.itemName.isEmpty());
        for (ItemName_Count pair : holder.getInitialEquipment().kamael_m_soldier)
            assertFalse(pair.itemName.isEmpty());
        for (ItemName_Count pair : holder.getInitialEquipment().kamael_f_soldier)
            assertFalse(pair.itemName.isEmpty());
    }
}
