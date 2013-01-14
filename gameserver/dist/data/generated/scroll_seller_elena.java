package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class scroll_seller_elena extends merchant {
protected Object[][] SellList0 = {
{"sb_adv_defence_power1";20;0.000000;0}, {"sb_advanced_attack_power1";20;0.000000;0}, {"sb_might1";20;0.000000;0}, {"sb_battle_heal1";20;0.000000;0}, {"sb_vampiric_touch1";20;0.000000;0}, {"sb_ice_bolt1";20;0.000000;0}, {"sb_heal1";20;0.000000;0}, {"sb_group_heal1";20;0.000000;0}, {"sb_shield1";20;0.000000;0}, {"sb_breeze1";20;0.000000;0}, {"sb_wind_walk1";20;0.000000;0}, {"sb_curse:weakness";20;0.000000;0}, {"sb_curse:poison1";20;0.000000;0}, {"sb_cure_poison1";20;0.000000;0}, {"sb_flame_strike1";20;0.000000;0}, {"sb_drain_energy1";20;0.000000;0}, {"sb_elemental_heal1";20;0.000000;0}, {"sb_disrupt_undead1";20;0.000000;0}, {"sb_resurrection1";20;0.000000;0}, {"sb_blaze1";20;0.000000;0}, {"sb_summon_shadow1";20;0.000000;0}, {"sb_summon_silhouette1";20;0.000000;0}, {"sb_summon_unicorn_boxer1";20;0.000000;0}, {"sb_summon_blackcat1";20;0.000000;0}, {"sb_servitor_heal1";20;0.000000;0}, {"sb_aqua_swirl1";20;0.000000;0}, {"sb_arcane_acumen1";20;0.000000;0}, {"sb_energy_bolt1";20;0.000000;0}, {"sb_aura_burn1";20;0.000000;0}, {"sb_charm11";20;0.000000;0}, {"sb_concentration1";20;0.000000;0}, {"sb_water_breathing";20;0.000000;0}, {"sb_twister1";20;0.000000;0}, {"sb_poison1";20;0.000000;0}, {"sb_poison_recovery1";20;0.000000;0}, {"sb_confusion1";20;0.000000;0}, {"sb_cure_bleeding1";20;0.000000;0}, {"sb_dryad_root1";20;0.000000;0}, {"sb_mental_shield1";20;0.000000;0}, {"sb_body_to_mind1";20;0.000000;0}, {"sb_shadow_spark1";20;0.000000;0}, {"sb_surrender_to_earth1";20;0.000000;0}, {"sb_surrender_to_fire1";20;0.000000;0}, {"sb_surrender_to_poison1";20;0.000000;0}, {"sb_summon_cuti_cat1";20;0.000000;0}, {"sb_summon_unicorn_mirage1";20;0.000000;0}, {"sb_servitor_mana_charge1";20;0.000000;0}, {"sb_solar_spark1";20;0.000000;0}, {"sb_agility1";20;0.000000;0}, {"sb_empower1";20;0.000000;0}, {"sb_poison_cloud1";20;0.000000;0}, {"sb_focus1";20;0.000000;0}, {"sb_holy_weapon1";20;0.000000;0}, {"sb_touch_of_god1";20;0.000000;0}, {"sb_fire_resist1";20;0.000000;0}, {"sb_recharge1";20;0.000000;0}, {"sb_vampiric_rage1";20;0.000000;0}, {"sb_sleep1";20;0.000000;0}, {"sb_corpse_life_drain1";20;0.000000;0}, {"sb_decrease_weight1";20;0.000000;0}, {"sb_auqa_resist1";20;0.000000;0}, {"sb_wind_resist1";20;0.000000;0}, {"sb_resist_poison1";20;0.000000;0}, {"sb_regeneration1";20;0.000000;0}, {"sb_mighty_servitor1";20;0.000000;0}, {"sb_berserker_spirit1";20;0.000000;0}, {"sb_bright_servitor1";20;0.000000;0}, {"sb_slow1";20;0.000000;0}, {"sb_curse_bleary1";20;0.000000;0}, {"sb_fast_servitor1";20;0.000000;0}, {"sb_erase_hostility1";20;0.000000;0}, {"sb_speed_walk1";20;0.000000;0}, {"sb_zero_g1";20;0.000000;0}, {"sb_power_break1";20;0.000000;0}, {"sb_freezing_strike1";20;0.000000;0}, {"sb_fallen_arrow1";20;0.000000;0}, {"sb_fallen_attack1";20;0.000000;0}, {"sb_rapid_attack1";20;0.000000;0}, {"sb_increase_power1";20;0.000000;0}, {"sb_detect_trap1";20;0.000000;0}, {"sb_defuse_trap1";20;0.000000;0}, {"sb_dark_strike1";20;0.000000;0}, {"sb_double_thrust1";20;0.000000;0}, {"sb_abyssal_blaze1";20;0.000000;0}, {"sb_penetrate_short1";20;0.000000;0}, {"sb_erase_mark1";20;0.000000;0}, {"sb_change_weapon1";20;0.000000;0}, {"sb_furious_soul1";20;0.000000;0}, {"sb_dark_explosion1";20;0.000000;0}, {"sb_death_mark1";20;0.000000;0}, {"sb_fire_trap1";20;0.000000;0}, {"sb_fast_shot1";20;0.000000;0}, {"sb_surrender_to_unholy1";20;0.000000;0}, {"sb_rush1";20;0.000000;0}, {"sb_warf1";20;0.000000;0}, {"sb_soul_shock1";20;0.000000;0}, {"sb_sword_shield1";20;0.000000;0}, {"sb_courage1";20;0.000000;0}, {"sb_disarm1";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) >= 2 && gg.GetMemoState(talker, 80) <= 4 && gg.OwnItemCount(talker, 7517) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) >= 2 && gg.GetMemoState(talker, 80) <= 4 && gg.OwnItemCount(talker, 7517) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 5) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) >= 2 && gg.GetMemoState(talker, 96) <= 4 && gg.OwnItemCount(talker, 7527) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) >= 2 && gg.GetMemoState(talker, 96) <= 4 && gg.OwnItemCount(talker, 7527) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 5) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 8) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 10) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 11) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 12) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Spectral Dancer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 1) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_elena_q0080_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) >= 2 && gg.GetMemoState(talker, 80) <= 4 && gg.OwnItemCount(talker, 7517) == 0) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_elena_q0080_0102.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) >= 2 && gg.GetMemoState(talker, 80) <= 4 && gg.OwnItemCount(talker, 7517) >= 1) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_elena_q0080_0103.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 5) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_elena_q0080_0104.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 1) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_elena_q0096_0101.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) >= 2 && gg.GetMemoState(talker, 96) <= 4 && gg.OwnItemCount(talker, 7527) == 0) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_elena_q0096_0102.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) >= 2 && gg.GetMemoState(talker, 96) <= 4 && gg.OwnItemCount(talker, 7527) >= 1) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_elena_q0096_0103.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 5) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_elena_q0096_0104.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 8) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_elena_q0096_0121.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_elena_q0096_0124.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_elena_q0096_0125.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 10) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_elena_q0096_0126.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 11) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_elena_q0096_0131.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 12) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_elena_q0096_0132.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 80) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 80) {
if (reply == 1) {
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 1) {
myself.SetMemoState(talker, 80, 2);
myself.ShowPage(talker, "scroll_seller_elena_q0080_0105.htm");
myself.SetFlagJournal(talker, 80, 2);
myself.ShowQuestMark(talker, 80);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) >= 2 && gg.GetMemoState(talker, 80) <= 4 && gg.OwnItemCount(talker, 7517) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7278, 1);
myself.DeleteItem1(talker, 7517, gg.OwnItemCount(talker, 7517));
myself.SetMemoState(talker, 80, 5);
myself.ShowPage(talker, "scroll_seller_elena_q0080_0106.htm");
myself.SetFlagJournal(talker, 80, 5);
myself.ShowQuestMark(talker, 80);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 96) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 96) {
if (reply == 1) {
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 1) {
myself.SetMemoState(talker, 96, 2);
myself.ShowPage(talker, "scroll_seller_elena_q0096_0105.htm");
myself.SetFlagJournal(talker, 96, 2);
myself.ShowQuestMark(talker, 96);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) >= 2 && gg.GetMemoState(talker, 96) <= 4 && gg.OwnItemCount(talker, 7527) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7294, 1);
myself.DeleteItem1(talker, 7527, gg.OwnItemCount(talker, 7527));
myself.SetMemoState(talker, 96, 5);
myself.ShowPage(talker, "scroll_seller_elena_q0096_0106.htm");
myself.SetFlagJournal(talker, 96, 5);
myself.ShowQuestMark(talker, 96);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 96) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 96) {
if (reply == 5) {
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 8) {
myself.ShowPage(talker, "scroll_seller_elena_q0096_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 8) {
myself.SetMemoState(talker, 96, 9);
myself.ShowPage(talker, "scroll_seller_elena_q0096_0122.htm");
myself.SetFlagJournal(talker, 96, 11);
myself.ShowQuestMark(talker, 96);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 8) {
myself.SetMemoState(talker, 96, 9);
myself.ShowPage(talker, "scroll_seller_elena_q0096_0123.htm");
myself.SetFlagJournal(talker, 96, 12);
myself.ShowQuestMark(talker, 96);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7387, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 96, 10);
myself.ShowPage(talker, "scroll_seller_elena_q0096_0128.htm");
myself.SetFlagJournal(talker, 96, 13);
myself.ShowQuestMark(talker, 96);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 96) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 96) {
if (reply == 9) {
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 11) {
myself.SetMemoState(talker, 96, 12);
myself.ShowPage(talker, "scroll_seller_elena_q0096_0133.htm");
myself.SetFlagJournal(talker, 96, 15);
myself.ShowQuestMark(talker, 96);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}