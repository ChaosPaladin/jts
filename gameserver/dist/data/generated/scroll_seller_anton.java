package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class scroll_seller_anton extends merchant {
protected Object[][] SellList0 = {
{"sb_adv_defence_power1";20;0.000000;0}, {"sb_advanced_attack_power1";20;0.000000;0}, {"sb_might1";20;0.000000;0}, {"sb_battle_heal1";20;0.000000;0}, {"sb_vampiric_touch1";20;0.000000;0}, {"sb_ice_bolt1";20;0.000000;0}, {"sb_heal1";20;0.000000;0}, {"sb_group_heal1";20;0.000000;0}, {"sb_shield1";20;0.000000;0}, {"sb_breeze1";20;0.000000;0}, {"sb_wind_walk1";20;0.000000;0}, {"sb_curse:weakness";20;0.000000;0}, {"sb_curse:poison1";20;0.000000;0}, {"sb_cure_poison1";20;0.000000;0}, {"sb_flame_strike1";20;0.000000;0}, {"sb_drain_energy1";20;0.000000;0}, {"sb_elemental_heal1";20;0.000000;0}, {"sb_disrupt_undead1";20;0.000000;0}, {"sb_resurrection1";20;0.000000;0}, {"sb_blaze1";20;0.000000;0}, {"sb_summon_shadow1";20;0.000000;0}, {"sb_summon_silhouette1";20;0.000000;0}, {"sb_summon_unicorn_boxer1";20;0.000000;0}, {"sb_summon_blackcat1";20;0.000000;0}, {"sb_servitor_heal1";20;0.000000;0}, {"sb_aqua_swirl1";20;0.000000;0}, {"sb_arcane_acumen1";20;0.000000;0}, {"sb_energy_bolt1";20;0.000000;0}, {"sb_aura_burn1";20;0.000000;0}, {"sb_charm11";20;0.000000;0}, {"sb_concentration1";20;0.000000;0}, {"sb_water_breathing";20;0.000000;0}, {"sb_twister1";20;0.000000;0}, {"sb_poison1";20;0.000000;0}, {"sb_poison_recovery1";20;0.000000;0}, {"sb_confusion1";20;0.000000;0}, {"sb_cure_bleeding1";20;0.000000;0}, {"sb_dryad_root1";20;0.000000;0}, {"sb_mental_shield1";20;0.000000;0}, {"sb_body_to_mind1";20;0.000000;0}, {"sb_shadow_spark1";20;0.000000;0}, {"sb_surrender_to_earth1";20;0.000000;0}, {"sb_surrender_to_fire1";20;0.000000;0}, {"sb_surrender_to_poison1";20;0.000000;0}, {"sb_summon_cuti_cat1";20;0.000000;0}, {"sb_summon_unicorn_mirage1";20;0.000000;0}, {"sb_servitor_mana_charge1";20;0.000000;0}, {"sb_solar_spark1";20;0.000000;0}, {"sb_agility1";20;0.000000;0}, {"sb_empower1";20;0.000000;0}, {"sb_poison_cloud1";20;0.000000;0}, {"sb_focus1";20;0.000000;0}, {"sb_holy_weapon1";20;0.000000;0}, {"sb_touch_of_god1";20;0.000000;0}, {"sb_fire_resist1";20;0.000000;0}, {"sb_recharge1";20;0.000000;0}, {"sb_vampiric_rage1";20;0.000000;0}, {"sb_sleep1";20;0.000000;0}, {"sb_corpse_life_drain1";20;0.000000;0}, {"sb_decrease_weight1";20;0.000000;0}, {"sb_auqa_resist1";20;0.000000;0}, {"sb_wind_resist1";20;0.000000;0}, {"sb_resist_poison1";20;0.000000;0}, {"sb_regeneration1";20;0.000000;0}, {"sb_mighty_servitor1";20;0.000000;0}, {"sb_berserker_spirit1";20;0.000000;0}, {"sb_bright_servitor1";20;0.000000;0}, {"sb_slow1";20;0.000000;0}, {"sb_curse_bleary1";20;0.000000;0}, {"sb_fast_servitor1";20;0.000000;0}, {"sb_erase_hostility1";20;0.000000;0}, {"sb_speed_walk1";20;0.000000;0}, {"sb_zero_g1";20;0.000000;0}, {"sb_power_break1";20;0.000000;0}, {"sb_freezing_strike1";20;0.000000;0}, {"sb_fallen_arrow1";20;0.000000;0}, {"sb_fallen_attack1";20;0.000000;0}, {"sb_rapid_attack1";20;0.000000;0}, {"sb_increase_power1";20;0.000000;0}, {"sb_detect_trap1";20;0.000000;0}, {"sb_defuse_trap1";20;0.000000;0}, {"sb_dark_strike1";20;0.000000;0}, {"sb_double_thrust1";20;0.000000;0}, {"sb_abyssal_blaze1";20;0.000000;0}, {"sb_penetrate_short1";20;0.000000;0}, {"sb_erase_mark1";20;0.000000;0}, {"sb_change_weapon1";20;0.000000;0}, {"sb_furious_soul1";20;0.000000;0}, {"sb_dark_explosion1";20;0.000000;0}, {"sb_death_mark1";20;0.000000;0}, {"sb_fire_trap1";20;0.000000;0}, {"sb_fast_shot1";20;0.000000;0}, {"sb_surrender_to_unholy1";20;0.000000;0}, {"sb_rush1";20;0.000000;0}, {"sb_warf1";20;0.000000;0}, {"sb_soul_shock1";20;0.000000;0}, {"sb_sword_shield1";20;0.000000;0}, {"sb_courage1";20;0.000000;0}, {"sb_disarm1";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 110) == 0 && talker.level >= 75 && myself.GetOneTimeQuestFlag(talker, 110) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "To the Primeval Isle");

}
if (gg.HaveMemo(talker, 110) == 0 && talker.level < 75 && myself.GetOneTimeQuestFlag(talker, 110) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "To the Primeval Isle");

}
if (gg.HaveMemo(talker, 110) == 0 && myself.GetOneTimeQuestFlag(talker, 110) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "To the Primeval Isle (Done)");

}
if (gg.HaveMemo(talker, 110) == 1 && gg.GetMemoState(talker, 110) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "To the Primeval Isle (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 110) == 0 && talker.level >= 75 && myself.GetOneTimeQuestFlag(talker, 110) == 0) {
myself.SetCurrentQuestID(110);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "scroll_seller_anton_q0110_01.htm", 110);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 110) == 0 && talker.level < 75 && myself.GetOneTimeQuestFlag(talker, 110) == 0) {
myself.SetCurrentQuestID(110);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "scroll_seller_anton_q0110_02.htm", 110);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 110) == 0 && myself.GetOneTimeQuestFlag(talker, 110) == 1) {
myself.SetCurrentQuestID(110);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 110) == 1 && gg.GetMemoState(talker, 110) == 1) {
myself.SetCurrentQuestID(110);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_anton_q0110_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 110) {
myself.SetCurrentQuestID(110);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 110) == 0 && myself.GetOneTimeQuestFlag(talker, 110) == 0 && talker.level >= 75 && myself.GetMemoCount(talker) < 41) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 8777, 1);
myself.SetMemo(talker, 110);
myself.ShowQuestMark(talker, 110);
myself.SetMemoState(talker, 110, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "scroll_seller_anton_q0110_05.htm", 110);
gg.AddLog(1, talker, 110);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 110) {
myself.SetCurrentQuestID(110);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 110) {
if (reply == 1) {
myself.ShowQuestPage(talker, "scroll_seller_anton_q0110_03.htm", 110);

}
if (reply == 2) {
myself.FHTML_SetFileName(fhtml0, "scroll_seller_anton_q0110_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 110);
myself.ShowQuestFHTML(talker, fhtml0, 110);

}

}
super;
	}


}