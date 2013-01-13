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
import ru.jts.data.holder.setting.*;
import ru.jts.data.holder.setting.common.ClassID;
import ru.jts.data.holder.setting.common.PlayerRace;
import ru.jts.data.holder.setting.model.NewPlayerBaseStat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Camelion
 * @date : 22.08.12  1:32
 */
public class SettingHolder extends AbstractHolder {
    @Element(start = "initial_equipment_begin", end = "initial_equipment_end")
    private InitialEquipment initialEquipment;

    @Element(start = "initial_custom_equipment_begin", end = "initial_custom_equipment_end")
    private InitialCustomEquipment initialCustomEquipment;

    @Element(start = "initial_start_point_begin", end = "initial_start_point_end")
    private InitialStartPoint initialStartPoint;

    @Element(start = "restart_point_begin", end = "restart_point_end")
    private RestartPoint restartPoint;

    @Element(start = "minimum_stat_begin", end = "minimum_stat_end")
    private MinimumStat minimumStat;

    @Element(start = "maximum_stat_begin", end = "maximum_stat_end")
    private MaximumStat maximumStat;

    @Element(start = "recommended_stat_begin", end = "recommended_stat_end")
    private RecommendedStat recommendedStat;

    @Element(start = "olympiad_arena_begin", end = "olympiad_arena_end")
    private OlympiadArena olympiadArena;

    @Element(start = "olympiad_general_setting_begin", end = "olympiad_general_setting_end")
    private OlympiadGeneralSetting olympiadGeneralSetting;

    @Element(start = "hero_general_setting_start", end = "hero_general_setting_end")
    private HeroGeneralSetting heroGeneralSetting;

    @Element(start = "pvpmatch_setting_start", end = "pvpmatch_setting_end")
    private PVPMatchSetting pvpMatchSetting;

    @Element(start = "cleft_setting_begin", end = "cleft_setting_end")
    private CleftSetting cleftSetting;

    // Базовые параметры для новых игроков
    private List<NewPlayerBaseStat> newPlayerBaseStats;

    private static SettingHolder ourInstance = new SettingHolder();

    public static SettingHolder getInstance() {
        return ourInstance;
    }

    private SettingHolder() {
        newPlayerBaseStats = new ArrayList<>();
    }

    @Override
    public int size() {
        return 12;
    }

    @Override
    public void afterParsing() {
        super.afterParsing();
        // Создание базовых конструкторов
        // Человек-воин
        newPlayerBaseStats.add(new NewPlayerBaseStat(PlayerRace.human, ClassID.fighter,
                maximumStat.getFor(PlayerRace.human, ClassID.fighter),
                recommendedStat.getFor(PlayerRace.human, ClassID.fighter),
                minimumStat.getFor(PlayerRace.human, ClassID.fighter)));
        // Человек-маг
        newPlayerBaseStats.add(new NewPlayerBaseStat(PlayerRace.human, ClassID.mage,
                maximumStat.getFor(PlayerRace.human, ClassID.mage),
                recommendedStat.getFor(PlayerRace.human, ClassID.mage),
                minimumStat.getFor(PlayerRace.human, ClassID.mage)));
        // Светлый эльф-воин
        newPlayerBaseStats.add(new NewPlayerBaseStat(PlayerRace.elf, ClassID.elven_fighter,
                maximumStat.getFor(PlayerRace.elf, ClassID.elven_fighter),
                recommendedStat.getFor(PlayerRace.elf, ClassID.elven_fighter),
                minimumStat.getFor(PlayerRace.elf, ClassID.elven_fighter)));
        // Светлый эльф-маг
        newPlayerBaseStats.add(new NewPlayerBaseStat(PlayerRace.elf, ClassID.elven_mage,
                maximumStat.getFor(PlayerRace.elf, ClassID.elven_mage),
                recommendedStat.getFor(PlayerRace.elf, ClassID.elven_mage),
                minimumStat.getFor(PlayerRace.elf, ClassID.elven_mage)));
        // Темный эльф-воин
        newPlayerBaseStats.add(new NewPlayerBaseStat(PlayerRace.darkelf, ClassID.dark_fighter,
                maximumStat.getFor(PlayerRace.darkelf, ClassID.dark_fighter),
                recommendedStat.getFor(PlayerRace.darkelf, ClassID.dark_fighter),
                minimumStat.getFor(PlayerRace.darkelf, ClassID.dark_fighter)));
        // Темный эльф-маг
        newPlayerBaseStats.add(new NewPlayerBaseStat(PlayerRace.darkelf, ClassID.dark_mage,
                maximumStat.getFor(PlayerRace.darkelf, ClassID.dark_mage),
                recommendedStat.getFor(PlayerRace.darkelf, ClassID.dark_mage),
                minimumStat.getFor(PlayerRace.darkelf, ClassID.dark_mage)));
        // Орк-воин
        newPlayerBaseStats.add(new NewPlayerBaseStat(PlayerRace.orc, ClassID.orc_fighter,
                maximumStat.getFor(PlayerRace.orc, ClassID.orc_fighter),
                recommendedStat.getFor(PlayerRace.orc, ClassID.orc_fighter),
                minimumStat.getFor(PlayerRace.orc, ClassID.orc_fighter)));
        // Орк-маг
        newPlayerBaseStats.add(new NewPlayerBaseStat(PlayerRace.orc, ClassID.orc_mage,
                maximumStat.getFor(PlayerRace.orc, ClassID.orc_mage),
                recommendedStat.getFor(PlayerRace.orc, ClassID.orc_mage),
                minimumStat.getFor(PlayerRace.orc, ClassID.orc_mage)));
        // Гном
        newPlayerBaseStats.add(new NewPlayerBaseStat(PlayerRace.dwarf, ClassID.dwarven_fighter,
                maximumStat.getFor(PlayerRace.dwarf, ClassID.dwarven_fighter),
                recommendedStat.getFor(PlayerRace.dwarf, ClassID.dwarven_fighter),
                minimumStat.getFor(PlayerRace.dwarf, ClassID.dwarven_fighter)));
        // Кмаэль - мужчина
        newPlayerBaseStats.add(new NewPlayerBaseStat(PlayerRace.kamael, ClassID.kamael_m_soldier,
                maximumStat.getFor(PlayerRace.kamael, ClassID.kamael_m_soldier),
                recommendedStat.getFor(PlayerRace.kamael, ClassID.kamael_m_soldier),
                minimumStat.getFor(PlayerRace.kamael, ClassID.kamael_m_soldier)));
        // Кмаэль - женщина
        newPlayerBaseStats.add(new NewPlayerBaseStat(PlayerRace.kamael, ClassID.kamael_f_soldier,
                maximumStat.getFor(PlayerRace.kamael, ClassID.kamael_f_soldier),
                recommendedStat.getFor(PlayerRace.kamael, ClassID.kamael_f_soldier),
                minimumStat.getFor(PlayerRace.kamael, ClassID.kamael_f_soldier)));
    }

    public InitialEquipment getInitialEquipment() {
        return initialEquipment;
    }

    public InitialStartPoint getInitialStartPoint() {
        return initialStartPoint;
    }

    public RestartPoint getRestartPoint() {
        return restartPoint;
    }

    public RecommendedStat getRecommendedStat() {
        return recommendedStat;
    }

    public OlympiadArena getOlympiadArena() {
        return olympiadArena;
    }

    public OlympiadGeneralSetting getOlympiadGeneralSetting() {
        return olympiadGeneralSetting;
    }

    public HeroGeneralSetting getHeroGeneralSetting() {
        return heroGeneralSetting;
    }

    public CleftSetting getCleftSetting() {
        return cleftSetting;
    }

    public List<NewPlayerBaseStat> getNewPlayerBaseStats() {
        return newPlayerBaseStats;
    }
}
