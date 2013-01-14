package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_alexis extends merchant {
protected Object[][] SellList0 = {
{"necklace_of_wisdom";20;0.000000;0}, {"blue_diamond_necklace";20;0.000000;0}, {"necklace_of_devotion";20;0.000000;0}, {"cat'seye_earing";20;0.000000;0}, {"coral_earing";20;0.000000;0}, {"red_cresent_earing";20;0.000000;0}, {"ring_of_wisdom";20;0.000000;0}, {"blue_coral_ring";20;0.000000;0}, {"ring_of_devotion";20;0.000000;0}, {"moonstone_earing";20;0.000000;0}, {"aquastone_ring";20;0.000000;0}, {"aquastone_necklace";20;0.000000;0}, {"ring_of_protection";20;0.000000;0}, {"earing_of_protection";20;0.000000;0}, {"necklace_of_protection";20;0.000000;0}, {"ring_of_ages";20;0.000000;0}, {"earing_of_binding";20;0.000000;0}, {"necklace_of_mermaid";20;0.000000;0}, {"ring_of_binding";20;0.000000;0}, {"nassen's_earing";20;0.000000;0}, {"necklace_of_binding";20;0.000000;0}
};
protected Object[][] SellList1 = {
{"sb_adv_defence_power1";20;0.000000;0}, {"sb_advanced_attack_power1";20;0.000000;0}, {"sb_might1";20;0.000000;0}, {"sb_battle_heal1";20;0.000000;0}, {"sb_vampiric_touch1";20;0.000000;0}, {"sb_ice_bolt1";20;0.000000;0}, {"sb_heal1";20;0.000000;0}, {"sb_group_heal1";20;0.000000;0}, {"sb_shield1";20;0.000000;0}, {"sb_breeze1";20;0.000000;0}, {"sb_wind_walk1";20;0.000000;0}, {"sb_curse:weakness";20;0.000000;0}, {"sb_curse:poison1";20;0.000000;0}, {"sb_cure_poison1";20;0.000000;0}, {"sb_flame_strike1";20;0.000000;0}, {"sb_drain_energy1";20;0.000000;0}, {"sb_elemental_heal1";20;0.000000;0}, {"sb_disrupt_undead1";20;0.000000;0}, {"sb_resurrection1";20;0.000000;0}, {"sb_blaze1";20;0.000000;0}, {"sb_summon_shadow1";20;0.000000;0}, {"sb_summon_silhouette1";20;0.000000;0}, {"sb_summon_unicorn_boxer1";20;0.000000;0}, {"sb_summon_blackcat1";20;0.000000;0}, {"sb_servitor_heal1";20;0.000000;0}, {"sb_aqua_swirl1";20;0.000000;0}, {"sb_arcane_acumen1";20;0.000000;0}, {"sb_energy_bolt1";20;0.000000;0}, {"sb_aura_burn1";20;0.000000;0}, {"sb_charm11";20;0.000000;0}, {"sb_concentration1";20;0.000000;0}, {"sb_water_breathing";20;0.000000;0}, {"sb_twister1";20;0.000000;0}, {"sb_poison1";20;0.000000;0}, {"sb_poison_recovery1";20;0.000000;0}, {"sb_confusion1";20;0.000000;0}, {"sb_cure_bleeding1";20;0.000000;0}, {"sb_dryad_root1";20;0.000000;0}, {"sb_mental_shield1";20;0.000000;0}, {"sb_body_to_mind1";20;0.000000;0}, {"sb_shadow_spark1";20;0.000000;0}, {"sb_surrender_to_earth1";20;0.000000;0}, {"sb_surrender_to_fire1";20;0.000000;0}, {"sb_surrender_to_poison1";20;0.000000;0}, {"sb_summon_cuti_cat1";20;0.000000;0}, {"sb_summon_unicorn_mirage1";20;0.000000;0}, {"sb_servitor_mana_charge1";20;0.000000;0}, {"sb_solar_spark1";20;0.000000;0}, {"sb_agility1";20;0.000000;0}, {"sb_empower1";20;0.000000;0}, {"sb_poison_cloud1";20;0.000000;0}, {"sb_focus1";20;0.000000;0}, {"sb_holy_weapon1";20;0.000000;0}, {"sb_touch_of_god1";20;0.000000;0}, {"sb_fire_resist1";20;0.000000;0}, {"sb_recharge1";20;0.000000;0}, {"sb_vampiric_rage1";20;0.000000;0}, {"sb_sleep1";20;0.000000;0}, {"sb_corpse_life_drain1";20;0.000000;0}, {"sb_night_murmur1";20;0.000000;0}, {"sb_blood_lust1";20;0.000000;0}, {"sb_pain_thorn1";20;0.000000;0}, {"sb_devotioin_of_shine1";20;0.000000;0}, {"sb_chill_flame1";20;0.000000;0}, {"sb_mass_frenzy1";20;0.000000;0}, {"sb_external_fear1";20;0.000000;0}, {"sb_entice_madness1";20;0.000000;0}, {"sb_pain_edge1";20;0.000000;0}, {"sb_inspire_life_force1";20;0.000000;0}, {"sb_devotioin_of_soul1";20;0.000000;0}, {"sb_burning_spirit1";20;0.000000;0}, {"sb_blaze_quake1";20;0.000000;0}, {"sb_eternal_flame1";20;0.000000;0}, {"sb_bind_will1";20;0.000000;0}, {"sb_aura_sway1";20;0.000000;0}, {"sb_engrave_seal_of_timid1";20;0.000000;0}, {"sb_pure_inspiration1";20;0.000000;0}, {"sb_power_of_paagrio1";20;0.000000;0}, {"sb_summon_mechanic_golem1";20;0.000000;0}, {"sb_fallen_arrow1";20;0.000000;0}, {"sb_fallen_attack1";20;0.000000;0}, {"sb_rapid_attack1";20;0.000000;0}, {"sb_increase_power1";20;0.000000;0}, {"sb_detect_trap1";20;0.000000;0}, {"sb_defuse_trap1";20;0.000000;0}, {"sb_dark_strike1";20;0.000000;0}, {"sb_double_thrust1";20;0.000000;0}, {"sb_abyssal_blaze1";20;0.000000;0}, {"sb_penetrate_short1";20;0.000000;0}, {"sb_erase_mark1";20;0.000000;0}, {"sb_change_weapon1";20;0.000000;0}, {"sb_furious_soul1";20;0.000000;0}, {"sb_dark_explosion1";20;0.000000;0}, {"sb_death_mark1";20;0.000000;0}, {"sb_fire_trap1";20;0.000000;0}, {"sb_fast_shot1";20;0.000000;0}, {"sb_surrender_to_unholy1";20;0.000000;0}, {"sb_rush1";20;0.000000;0}, {"sb_warf1";20;0.000000;0}
};
protected Object[][] SellList4 = {
{"necklace_of_devotion_low";20;0.000000;0}, {"red_cresent_earing_low";20;0.000000;0}, {"ring_of_devotion_low";20;0.000000;0}, {"moonstone_earing_low";20;0.000000;0}, {"aquastone_ring_low";20;0.000000;0}, {"aquastone_necklace_low";20;0.000000;0}, {"ring_of_protection_low";20;0.000000;0}, {"earing_of_protection_low";20;0.000000;0}, {"necklace_of_protection_low";20;0.000000;0}, {"ring_of_ages_low";20;0.000000;0}, {"earing_of_binding_low";20;0.000000;0}, {"necklace_of_mermaid_low";20;0.000000;0}, {"ring_of_binding_low";20;0.000000;0}, {"nassen's_earing_low";20;0.000000;0}, {"necklace_of_binding_low";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 60 && gg.HaveMemo(talker, 37) == 0 && myself.GetOneTimeQuestFlag(talker, 37) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Make Formal Wear");

}
if (talker.level < 60 && gg.HaveMemo(talker, 37) == 0 && myself.GetOneTimeQuestFlag(talker, 37) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Make Formal Wear");

}
if (gg.HaveMemo(talker, 37) == 0 && myself.GetOneTimeQuestFlag(talker, 37) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Make Formal Wear (Done)");

}
if (gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Make Formal Wear (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 60 && gg.HaveMemo(talker, 37) == 0 && myself.GetOneTimeQuestFlag(talker, 37) == 0) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "trader_alexis_q0037_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 37);
myself.ShowQuestFHTML(talker, fhtml0, 37);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 60 && gg.HaveMemo(talker, 37) == 0 && myself.GetOneTimeQuestFlag(talker, 37) == 0) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_alexis_q0037_0103.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 37) == 0 && myself.GetOneTimeQuestFlag(talker, 37) == 1) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 1 * 10 + 1) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_alexis_q0037_0105.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 37) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 37);
myself.ShowQuestMark(talker, 37);
myself.SetMemoState(talker, 37, 1 * 10 + 1);
gg.AddLog(1, talker, 37);
myself.SetFlagJournal(talker, 37, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "trader_alexis_q0037_0104.htm", 37);

}
return;

}
super;
	}


}