package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gentler extends merchant {
protected Object[][] SellList0 = {
{"sb_adv_defence_power1";10;0.000000;0}, {"sb_advanced_attack_power1";10;0.000000;0}, {"sb_might1";10;0.000000;0}, {"sb_battle_heal1";10;0.000000;0}, {"sb_vampiric_touch1";10;0.000000;0}, {"sb_ice_bolt1";10;0.000000;0}, {"sb_heal1";10;0.000000;0}, {"sb_group_heal1";10;0.000000;0}, {"sb_shield1";10;0.000000;0}, {"sb_breeze1";10;0.000000;0}, {"sb_wind_walk1";10;0.000000;0}, {"sb_curse:weakness";10;0.000000;0}, {"sb_curse:poison1";10;0.000000;0}, {"sb_cure_poison1";10;0.000000;0}, {"sb_flame_strike1";10;0.000000;0}, {"sb_drain_energy1";10;0.000000;0}, {"sb_elemental_heal1";10;0.000000;0}, {"sb_disrupt_undead1";10;0.000000;0}, {"sb_resurrection1";10;0.000000;0}, {"sb_blaze1";10;0.000000;0}, {"sb_summon_shadow1";10;0.000000;0}, {"sb_summon_silhouette1";10;0.000000;0}, {"sb_summon_unicorn_boxer1";10;0.000000;0}, {"sb_summon_blackcat1";10;0.000000;0}, {"sb_servitor_heal1";10;0.000000;0}, {"sb_aqua_swirl1";10;0.000000;0}, {"sb_arcane_acumen1";10;0.000000;0}, {"sb_energy_bolt1";10;0.000000;0}, {"sb_aura_burn1";10;0.000000;0}, {"sb_charm11";10;0.000000;0}, {"sb_concentration1";10;0.000000;0}, {"sb_water_breathing";10;0.000000;0}, {"sb_twister1";10;0.000000;0}, {"sb_poison1";10;0.000000;0}, {"sb_poison_recovery1";10;0.000000;0}, {"sb_confusion1";10;0.000000;0}, {"sb_cure_bleeding1";10;0.000000;0}, {"sb_dryad_root1";10;0.000000;0}, {"sb_mental_shield1";10;0.000000;0}, {"sb_body_to_mind1";10;0.000000;0}, {"sb_shadow_spark1";10;0.000000;0}, {"sb_surrender_to_earth1";10;0.000000;0}, {"sb_surrender_to_fire1";10;0.000000;0}, {"sb_surrender_to_poison1";10;0.000000;0}, {"sb_summon_cuti_cat1";10;0.000000;0}, {"sb_summon_unicorn_mirage1";10;0.000000;0}, {"sb_servitor_mana_charge1";10;0.000000;0}, {"sb_solar_spark1";10;0.000000;0}, {"sb_agility1";10;0.000000;0}, {"sb_empower1";10;0.000000;0}, {"sb_poison_cloud1";10;0.000000;0}, {"sb_focus1";10;0.000000;0}, {"sb_holy_weapon1";10;0.000000;0}, {"sb_touch_of_god1";10;0.000000;0}, {"sb_fire_resist1";10;0.000000;0}, {"sb_recharge1";10;0.000000;0}, {"sb_vampiric_rage1";10;0.000000;0}, {"sb_sleep1";10;0.000000;0}, {"sb_corpse_life_drain1";10;0.000000;0}, {"sb_decrease_weight1";10;0.000000;0}, {"sb_auqa_resist1";10;0.000000;0}, {"sb_wind_resist1";10;0.000000;0}, {"sb_resist_poison1";10;0.000000;0}, {"sb_regeneration1";10;0.000000;0}, {"sb_mighty_servitor1";10;0.000000;0}, {"sb_berserker_spirit1";10;0.000000;0}, {"sb_bright_servitor1";10;0.000000;0}, {"sb_slow1";10;0.000000;0}, {"sb_curse_bleary1";10;0.000000;0}, {"sb_fast_servitor1";10;0.000000;0}, {"sb_erase_hostility1";10;0.000000;0}, {"sb_speed_walk1";10;0.000000;0}, {"sb_zero_g1";10;0.000000;0}, {"sb_power_break1";10;0.000000;0}, {"sb_freezing_strike1";10;0.000000;0}, {"sb_night_murmur1";10;0.000000;0}, {"sb_blood_lust1";10;0.000000;0}, {"sb_pain_thorn1";10;0.000000;0}, {"sb_devotioin_of_shine1";10;0.000000;0}, {"sb_chill_flame1";10;0.000000;0}, {"sb_mass_frenzy1";10;0.000000;0}, {"sb_external_fear1";10;0.000000;0}, {"sb_entice_madness1";10;0.000000;0}, {"sb_pain_edge1";10;0.000000;0}, {"sb_inspire_life_force1";10;0.000000;0}, {"sb_fallen_arrow1";10;0.000000;0}, {"sb_fallen_attack1";10;0.000000;0}, {"sb_rapid_attack1";10;0.000000;0}, {"sb_increase_power1";10;0.000000;0}, {"sb_detect_trap1";10;0.000000;0}, {"sb_defuse_trap1";10;0.000000;0}, {"sb_dark_strike1";10;0.000000;0}, {"sb_double_thrust1";10;0.000000;0}, {"sb_abyssal_blaze1";10;0.000000;0}, {"sb_penetrate_short1";10;0.000000;0}, {"sb_erase_mark1";10;0.000000;0}, {"sb_change_weapon1";10;0.000000;0}, {"sb_furious_soul1";10;0.000000;0}, {"sb_dark_explosion1";10;0.000000;0}, {"sb_death_mark1";10;0.000000;0}, {"sb_fire_trap1";10;0.000000;0}, {"sb_fast_shot1";10;0.000000;0}, {"sb_surrender_to_unholy1";10;0.000000;0}, {"sb_rush1";10;0.000000;0}, {"sb_warf1";10;0.000000;0}, {"sb_soul_shock1";10;0.000000;0}, {"sb_sword_shield1";10;0.000000;0}, {"sb_courage1";10;0.000000;0}, {"sb_disarm1";10;0.000000;0}
};
protected Object[][] SellList1 = {
{"apprentice's_staff";10;0.000000;0}, {"relic_of_saints";10;0.000000;0}, {"mage_staff";10;0.000000;0}, {"crucifix_of_blessing";10;0.000000;0}, {"voodoo_doll";10;0.000000;0}, {"bone_staff";10;0.000000;0}, {"scroll_of_wisdom";10;0.000000;0}, {"branch_of_life";10;0.000000;0}, {"proof_of_revenge";10;0.000000;0}, {"mace_of_prayer";10;0.000000;0}, {"doom_hammer";10;0.000000;0}, {"mystic_staff";10;0.000000;0}, {"staff_of_mana";10;0.000000;0}, {"divine_tome";10;0.000000;0}, {"sword_of_magic";10;0.000000;0}, {"sword_of_mystic";10;0.000000;0}, {"sword_of_occult";10;0.000000;0}, {"dagger_of_mana";10;0.000000;0}, {"mystic_knife";10;0.000000;0}, {"conjure_knife";10;0.000000;0}, {"knife_o'_silenus";10;0.000000;0}, {"staff_of_magicpower";10;0.000000;0}, {"blood_of_saints";10;0.000000;0}, {"tome_of_blood";10;0.000000;0}, {"goathead_staff";10;0.000000;0}, {"crucifix_of_blood";10;0.000000;0}, {"demon_fangs";10;0.000000;0}, {"atuba_hammer";10;0.000000;0}, {"ghost_staff";10;0.000000;0}, {"life_stick";10;0.000000;0}, {"atuba_mace";10;0.000000;0}, {"hose_of_devotion";10;0.000000;0}, {"tunic_of_devotion";10;0.000000;0}, {"hose_of_magicpower";10;0.000000;0}, {"tunic_of_magicpower";10;0.000000;0}, {"cursed_hose";10;0.000000;0}, {"cursed_tunic";10;0.000000;0}, {"dark_hose";10;0.000000;0}, {"white_tunic";10;0.000000;0}, {"mage's_hose";10;0.000000;0}, {"mage's_tunic";10;0.000000;0}, {"hose_of_knowledge";10;0.000000;0}, {"tunic_of_knowledge";10;0.000000;0}, {"mithril_hose";10;0.000000;0}, {"mithril_tunic";10;0.000000;0}, {"sage's_rag";10;0.000000;0}, {"round_shield";10;0.000000;0}, {"bone_shield";10;0.000000;0}, {"bronze_shield";10;0.000000;0}, {"aspis";10;0.000000;0}, {"hoplon";10;0.000000;0}, {"kite_shield";10;0.000000;0}, {"brigandine_shield";10;0.000000;0}, {"square_shield";10;0.000000;0}, {"plate_shield";10;0.000000;0}, {"leather_gloves";10;0.000000;0}, {"bracer";10;0.000000;0}, {"excellence_leather_gloves";10;0.000000;0}, {"leather_gauntlet";10;0.000000;0}, {"gauntlet";10;0.000000;0}, {"gauntlet_of_repose_of_the_soul";10;0.000000;0}, {"gloves_of_knowledge";10;0.000000;0}, {"elven_mithril_gloves";10;0.000000;0}, {"mithril_glove";10;0.000000;0}, {"ogre_power_gauntlet";10;0.000000;0}, {"sage's_worn_gloves";10;0.000000;0}, {"low_boots";10;0.000000;0}, {"boots";10;0.000000;0}, {"leather_boots";10;0.000000;0}, {"blue_buckskin_boots";10;0.000000;0}, {"iron_boots";10;0.000000;0}, {"boots_of_power";10;0.000000;0}, {"boots_of_knowledge";10;0.000000;0}, {"elven_mithril_boots";10;0.000000;0}, {"assault_boots";10;0.000000;0}, {"slamander_skin_boots";10;0.000000;0}, {"plate_boots";10;0.000000;0}, {"leather_helmet";10;0.000000;0}, {"hard_leather_helmet";10;0.000000;0}, {"bone_helmet";10;0.000000;0}, {"bronze_helmet";10;0.000000;0}, {"helmet";10;0.000000;0}, {"brigandine_helmet";10;0.000000;0}, {"plate_helmet";10;0.000000;0}, {"tshirt";10;0.000000;0}, {"cotton_tshirt";10;0.000000;0}, {"pattern_tshirt";10;0.000000;0}, {"pattern_cotton_tshirt";10;0.000000;0}
};
protected Object[][] SellList5 = {
{"bone_staff_low";10;0.000000;0}, {"scroll_of_wisdom_low";10;0.000000;0}, {"branch_of_life_low";10;0.000000;0}, {"proof_of_revenge_low";10;0.000000;0}, {"mace_of_prayer_low";10;0.000000;0}, {"doom_hammer_low";10;0.000000;0}, {"mystic_staff_low";10;0.000000;0}, {"staff_of_mana_low";10;0.000000;0}, {"divine_tome_low";10;0.000000;0}, {"sword_of_magic_low";10;0.000000;0}, {"sword_of_mystic_low";10;0.000000;0}, {"sword_of_occult_low";10;0.000000;0}, {"dagger_of_mana_low";10;0.000000;0}, {"mystic_knife_low";10;0.000000;0}, {"conjure_knife_low";10;0.000000;0}, {"knife_o'_silenus_low";10;0.000000;0}, {"staff_of_magicpower_low";10;0.000000;0}, {"blood_of_saints_low";10;0.000000;0}, {"tome_of_blood_low";10;0.000000;0}, {"goathead_staff_low";10;0.000000;0}, {"crucifix_of_blood_low";10;0.000000;0}, {"demon_fangs_low";10;0.000000;0}, {"atuba_hammer_low";10;0.000000;0}, {"ghost_staff_low";10;0.000000;0}, {"life_stick_low";10;0.000000;0}, {"atuba_mace_low";10;0.000000;0}, {"cursed_hose_low";10;0.000000;0}, {"cursed_tunic_low";10;0.000000;0}, {"dark_hose_low";10;0.000000;0}, {"white_tunic_low";10;0.000000;0}, {"mage's_hose_low";10;0.000000;0}, {"mage's_tunic_low";10;0.000000;0}, {"hose_of_knowledge_low";10;0.000000;0}, {"tunic_of_knowledge_low";10;0.000000;0}, {"mithril_hose_low";10;0.000000;0}, {"mithril_tunic_low";10;0.000000;0}, {"sage's_rag_low";10;0.000000;0}, {"bronze_shield_low";10;0.000000;0}, {"aspis_low";10;0.000000;0}, {"hoplon_low";10;0.000000;0}, {"kite_shield_low";10;0.000000;0}, {"brigandine_shield_low";10;0.000000;0}, {"square_shield_low";10;0.000000;0}, {"plate_shield_low";10;0.000000;0}, {"excellence_leather_gloves_low";10;0.000000;0}, {"leather_gauntlet_low";10;0.000000;0}, {"gauntlet_low";10;0.000000;0}, {"gauntlet_of_repose_of_the_soul_low";10;0.000000;0}, {"gloves_of_knowledge_low";10;0.000000;0}, {"reinforce_leather_gloves_low";10;0.000000;0}, {"manticor_skin_gloves_low";10;0.000000;0}, {"brigandine_gauntlet_low";10;0.000000;0}, {"mithril_glove_low";10;0.000000;0}, {"ogre_power_gauntlet_low";10;0.000000;0}, {"sage's_worn_gloves_low";10;0.000000;0}, {"leather_boots_low";10;0.000000;0}, {"blue_buckskin_boots_low";10;0.000000;0}, {"iron_boots_low";10;0.000000;0}, {"boots_of_power_low";10;0.000000;0}, {"reinforce_leather_boots_low";10;0.000000;0}, {"boots_of_knowledge_low";10;0.000000;0}, {"manticor_skin_boots_low";10;0.000000;0}, {"brigandine_boots_low";10;0.000000;0}, {"assault_boots_low";10;0.000000;0}, {"slamander_skin_boots_low";10;0.000000;0}, {"plate_boots_low";10;0.000000;0}, {"bone_helmet_low";10;0.000000;0}, {"bronze_helmet_low";10;0.000000;0}, {"helmet_low";10;0.000000;0}, {"brigandine_helmet_low";10;0.000000;0}, {"plate_helmet_low";10;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 45) == 1 && gg.OwnItemCount(talker, 7563) >= 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "To Talking Island (In Progress)");

}
if (gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "To Talking Island (In Progress)");

}
if (gg.HaveMemo(talker, 46) == 1 && gg.OwnItemCount(talker, 7563) >= 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Once More In the Arms of the Mother Tree (In Progress)");

}
if (gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Once More In the Arms of the Mother Tree (In Progress)");

}
if (gg.HaveMemo(talker, 47) == 1 && gg.OwnItemCount(talker, 7563) >= 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Into the Dark Elven Forest (In Progress)");

}
if (gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Into the Dark Elven Forest (In Progress)");

}
if (gg.HaveMemo(talker, 48) == 1 && gg.OwnItemCount(talker, 7563) >= 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "To the Immortal Plateau (In Progress)");

}
if (gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "To the Immortal Plateau (In Progress)");

}
if (gg.HaveMemo(talker, 49) == 1 && gg.OwnItemCount(talker, 7563) >= 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "The Road Home (In Progress)");

}
if (gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "The Road Home (In Progress)");

}
if (gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0 && gg.GetMemoState(talker, 32) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "An Obvious Lie (In Progress)");

}
if (gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0 && gg.GetMemoState(talker, 32) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "An Obvious Lie (In Progress)");

}
if (gg.HaveMemo(talker, 32) == 1 && gg.GetMemoState(talker, 32) == 3 * 10 + 2 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "An Obvious Lie (In Progress)");

}
if (gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0 && gg.GetMemoState(talker, 32) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "An Obvious Lie (In Progress)");

}
if (gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0 && gg.GetMemoState(talker, 32) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "An Obvious Lie (In Progress)");

}
if (gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0 && gg.GetMemoState(talker, 32) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "An Obvious Lie (In Progress)");

}
if (gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0 && gg.GetMemoState(talker, 32) == 7 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "An Obvious Lie (In Progress)");

}
if (gg.HaveMemo(talker, 173) == 1 && gg.GetMemoState(talker, 173) == 1) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "To the Isle of Souls (In Progress)");

}
if (gg.HaveMemo(talker, 173) == 1 && gg.GetMemoState(talker, 173) == 2) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "To the Isle of Souls (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 45) == 1 && gg.OwnItemCount(talker, 7563) >= 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 1 * 10 + 1) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 45, 1);
myself.ShowPage(talker, "gentler_q0045_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 2 * 10 + 1) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gentler_q0045_0203.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 46) == 1 && gg.OwnItemCount(talker, 7563) >= 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 1 * 10 + 1) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 46, 1);
myself.ShowPage(talker, "gentler_q0046_0101.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 2 * 10 + 1) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gentler_q0046_0203.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 47) == 1 && gg.OwnItemCount(talker, 7563) >= 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 1 * 10 + 1) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 47, 1);
myself.ShowPage(talker, "gentler_q0047_0101.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 2 * 10 + 1) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gentler_q0047_0203.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 48) == 1 && gg.OwnItemCount(talker, 7563) >= 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 1 * 10 + 1) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 48, 1);
myself.ShowPage(talker, "gentler_q0048_0101.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 2 * 10 + 1) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gentler_q0048_0203.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 49) == 1 && gg.OwnItemCount(talker, 7563) >= 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 1 * 10 + 1) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 49, 1);
myself.ShowPage(talker, "gentler_q0049_0101.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 2 * 10 + 1) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gentler_q0049_0203.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0 && gg.GetMemoState(talker, 32) == 1 * 10 + 1) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 32, 1);
myself.ShowPage(talker, "gentler_q0032_0101.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0 && gg.GetMemoState(talker, 32) == 2 * 10 + 1) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gentler_q0032_0202.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 32) == 1 && gg.GetMemoState(talker, 32) == 3 * 10 + 2 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7166) >= 20) {
myself.SetHTMLCookie(talker, 32, 3);
myself.ShowPage(talker, "gentler_q0032_0301.htm");

} else {
myself.ShowPage(talker, "gentler_q0032_0302.htm");

}

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0 && gg.GetMemoState(talker, 32) == 4 * 10 + 1) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3031) >= 500) {
myself.SetHTMLCookie(talker, 32, 4);
myself.ShowPage(talker, "gentler_q0032_0403.htm");

} else {
myself.ShowPage(talker, "gentler_q0032_0404.htm");

}

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0 && gg.GetMemoState(talker, 32) == 5 * 10 + 1) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gentler_q0032_0503.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0 && gg.GetMemoState(talker, 32) == 6 * 10 + 1) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 32, 6);
myself.ShowPage(talker, "gentler_q0032_0601.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0 && gg.GetMemoState(talker, 32) == 7 * 10 + 1) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1868) >= 1000 && gg.OwnItemCount(talker, 1866) >= 500) {
myself.SetHTMLCookie(talker, 32, 7);
myself.ShowPage(talker, "gentler_q0032_0702.htm");

} else {
myself.ShowPage(talker, "gentler_q0032_0703.htm");

}

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 173) == 1 && gg.GetMemoState(talker, 173) == 1) {
myself.SetCurrentQuestID(173);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gentler_q0173_01.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 173) == 1 && gg.GetMemoState(talker, 173) == 2) {
myself.SetCurrentQuestID(173);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gentler_q0173_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 45) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 45) {
i0 = myself.GetHTMLCookie(talker, 45, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0) {
if (gg.OwnItemCount(talker, 7563) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7563, 1);
myself.GiveItem1(talker, 7568, 1);
myself.ShowPage(talker, "gentler_q0045_0201.htm");
myself.SetMemoState(talker, 45, 2 * 10 + 1);
myself.SetFlagJournal(talker, 45, 2);
myself.ShowQuestMark(talker, 45);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "gentler_q0045_0202.htm");

}

}

}

}
if (ask == 46) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 46) {
i0 = myself.GetHTMLCookie(talker, 46, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0) {
if (gg.OwnItemCount(talker, 7563) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7563, 1);
myself.GiveItem1(talker, 7568, 1);
myself.ShowPage(talker, "gentler_q0046_0201.htm");
myself.SetMemoState(talker, 46, 2 * 10 + 1);
myself.SetFlagJournal(talker, 46, 2);
myself.ShowQuestMark(talker, 46);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "gentler_q0046_0202.htm");

}

}

}

}
if (ask == 47) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 47) {
i0 = myself.GetHTMLCookie(talker, 47, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0) {
if (gg.OwnItemCount(talker, 7563) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7563, 1);
myself.GiveItem1(talker, 7568, 1);
myself.ShowPage(talker, "gentler_q0047_0201.htm");
myself.SetMemoState(talker, 47, 2 * 10 + 1);
myself.SetFlagJournal(talker, 47, 2);
myself.ShowQuestMark(talker, 47);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "gentler_q0047_0202.htm");

}

}

}

}
if (ask == 48) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 48) {
i0 = myself.GetHTMLCookie(talker, 48, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0) {
if (gg.OwnItemCount(talker, 7563) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7563, 1);
myself.GiveItem1(talker, 7568, 1);
myself.ShowPage(talker, "gentler_q0048_0201.htm");
myself.SetMemoState(talker, 48, 2 * 10 + 1);
myself.SetFlagJournal(talker, 48, 2);
myself.ShowQuestMark(talker, 48);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "gentler_q0048_0202.htm");

}

}

}

}
if (ask == 49) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 49) {
i0 = myself.GetHTMLCookie(talker, 49, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0) {
if (gg.OwnItemCount(talker, 7563) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7563, 1);
myself.GiveItem1(talker, 7568, 1);
myself.ShowPage(talker, "gentler_q0049_0201.htm");
myself.SetMemoState(talker, 49, 2 * 10 + 1);
myself.SetFlagJournal(talker, 49, 2);
myself.ShowQuestMark(talker, 49);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "gentler_q0049_0202.htm");

}

}

}

}
if (ask == 32) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 32) {
i0 = myself.GetHTMLCookie(talker, 32, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7165, 1);
myself.ShowPage(talker, "gentler_q0032_0201.htm");
myself.SetMemoState(talker, 32, 2 * 10 + 1);
myself.SetFlagJournal(talker, 32, 2);
myself.ShowQuestMark(talker, 32);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 32) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 32) {
i0 = myself.GetHTMLCookie(talker, 32, 4 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
if (gg.OwnItemCount(talker, 7166) >= 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7166, 20);
myself.ShowPage(talker, "gentler_q0032_0401.htm");
myself.SetMemoState(talker, 32, 4 * 10 + 1);
myself.SetFlagJournal(talker, 32, 5);
myself.ShowQuestMark(talker, 32);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "gentler_q0032_0402.htm");

}

}

}

}
if (ask == 32) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 32) {
i0 = myself.GetHTMLCookie(talker, 32, 5 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
if (gg.OwnItemCount(talker, 3031) >= 500) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 3031, 500);
myself.ShowPage(talker, "gentler_q0032_0501.htm");
myself.SetMemoState(talker, 32, 5 * 10 + 1);
myself.SetFlagJournal(talker, 32, 6);
myself.ShowQuestMark(talker, 32);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "gentler_q0032_0502.htm");

}

}

}

}
if (ask == 32) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 32) {
i0 = myself.GetHTMLCookie(talker, 32, 7 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gentler_q0032_0701.htm");
myself.SetMemoState(talker, 32, 7 * 10 + 1);
myself.SetFlagJournal(talker, 32, 8);
myself.ShowQuestMark(talker, 32);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 32) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 32 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
i0 = myself.GetHTMLCookie(talker, 32, 8 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
myself.ShowPage(talker, "gentler_q0032_0801.htm");

}
if (reply == 11 && gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
if (gg.OwnItemCount(talker, 1868) >= 1000 && gg.OwnItemCount(talker, 1866) >= 500) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1868, 1000);
myself.DeleteItem1(talker, 1866, 500);
myself.GiveItem1(talker, 6843, 1);
gg.AddLog(2, talker, 32);
myself.RemoveMemo(talker, 32);
myself.SetOneTimeQuestFlag(talker, 32, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "gentler_q0032_0802.htm");

}

} else {
myself.ShowPage(talker, "gentler_q0032_0803.htm");

}

}
if (reply == 12 && gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
if (gg.OwnItemCount(talker, 1868) >= 1000 && gg.OwnItemCount(talker, 1866) >= 500) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1868, 1000);
myself.DeleteItem1(talker, 1866, 500);
myself.GiveItem1(talker, 7680, 1);
gg.AddLog(2, talker, 32);
myself.RemoveMemo(talker, 32);
myself.SetOneTimeQuestFlag(talker, 32, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "gentler_q0032_0802.htm");

}

} else {
myself.ShowPage(talker, "gentler_q0032_0803.htm");

}

}
if (reply == 13 && gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
if (gg.OwnItemCount(talker, 1868) >= 1000 && gg.OwnItemCount(talker, 1866) >= 500) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1868, 1000);
myself.DeleteItem1(talker, 1866, 500);
myself.GiveItem1(talker, 7683, 1);
gg.AddLog(2, talker, 32);
myself.RemoveMemo(talker, 32);
myself.SetOneTimeQuestFlag(talker, 32, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "gentler_q0032_0802.htm");

}

} else {
myself.ShowPage(talker, "gentler_q0032_0803.htm");

}

}

}

}
if (ask == 173) {
myself.SetCurrentQuestID(173);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 173) {
if (reply == 1) {
if (gg.HaveMemo(talker, 173) == 1 && gg.GetMemoState(talker, 173) == 1) {
myself.GiveItem1(talker, 7568, 1);
myself.DeleteItem1(talker, 7563, gg.OwnItemCount(talker, 7563));
myself.SetMemoState(talker, 173, 2);
myself.ShowPage(talker, "gentler_q0173_02.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 173, 2);
myself.ShowQuestMark(talker, 173);

}

}

}
super;
	}


}