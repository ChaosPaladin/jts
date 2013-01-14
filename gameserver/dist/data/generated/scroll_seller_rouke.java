package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class scroll_seller_rouke extends merchant {
protected Object[][] SellList0 = {
{"sb_adv_defence_power1";20;0.000000;0}, {"sb_advanced_attack_power1";20;0.000000;0}, {"sb_might1";20;0.000000;0}, {"sb_battle_heal1";20;0.000000;0}, {"sb_vampiric_touch1";20;0.000000;0}, {"sb_ice_bolt1";20;0.000000;0}, {"sb_heal1";20;0.000000;0}, {"sb_group_heal1";20;0.000000;0}, {"sb_shield1";20;0.000000;0}, {"sb_breeze1";20;0.000000;0}, {"sb_wind_walk1";20;0.000000;0}, {"sb_curse:weakness";20;0.000000;0}, {"sb_curse:poison1";20;0.000000;0}, {"sb_cure_poison1";20;0.000000;0}, {"sb_flame_strike1";20;0.000000;0}, {"sb_drain_energy1";20;0.000000;0}, {"sb_elemental_heal1";20;0.000000;0}, {"sb_disrupt_undead1";20;0.000000;0}, {"sb_resurrection1";20;0.000000;0}, {"sb_blaze1";20;0.000000;0}, {"sb_summon_shadow1";20;0.000000;0}, {"sb_summon_silhouette1";20;0.000000;0}, {"sb_summon_unicorn_boxer1";20;0.000000;0}, {"sb_summon_blackcat1";20;0.000000;0}, {"sb_servitor_heal1";20;0.000000;0}, {"sb_aqua_swirl1";20;0.000000;0}, {"sb_arcane_acumen1";20;0.000000;0}, {"sb_energy_bolt1";20;0.000000;0}, {"sb_aura_burn1";20;0.000000;0}, {"sb_charm11";20;0.000000;0}, {"sb_concentration1";20;0.000000;0}, {"sb_water_breathing";20;0.000000;0}, {"sb_twister1";20;0.000000;0}, {"sb_poison1";20;0.000000;0}, {"sb_poison_recovery1";20;0.000000;0}, {"sb_confusion1";20;0.000000;0}, {"sb_cure_bleeding1";20;0.000000;0}, {"sb_dryad_root1";20;0.000000;0}, {"sb_mental_shield1";20;0.000000;0}, {"sb_body_to_mind1";20;0.000000;0}, {"sb_shadow_spark1";20;0.000000;0}, {"sb_surrender_to_earth1";20;0.000000;0}, {"sb_surrender_to_fire1";20;0.000000;0}, {"sb_surrender_to_poison1";20;0.000000;0}, {"sb_summon_cuti_cat1";20;0.000000;0}, {"sb_summon_unicorn_mirage1";20;0.000000;0}, {"sb_servitor_mana_charge1";20;0.000000;0}, {"sb_solar_spark1";20;0.000000;0}, {"sb_agility1";20;0.000000;0}, {"sb_empower1";20;0.000000;0}, {"sb_poison_cloud1";20;0.000000;0}, {"sb_focus1";20;0.000000;0}, {"sb_holy_weapon1";20;0.000000;0}, {"sb_touch_of_god1";20;0.000000;0}, {"sb_fire_resist1";20;0.000000;0}, {"sb_recharge1";20;0.000000;0}, {"sb_vampiric_rage1";20;0.000000;0}, {"sb_sleep1";20;0.000000;0}, {"sb_corpse_life_drain1";20;0.000000;0}, {"sb_fallen_arrow1";20;0.000000;0}, {"sb_fallen_attack1";20;0.000000;0}, {"sb_rapid_attack1";20;0.000000;0}, {"sb_increase_power1";20;0.000000;0}, {"sb_detect_trap1";20;0.000000;0}, {"sb_defuse_trap1";20;0.000000;0}, {"sb_dark_strike1";20;0.000000;0}, {"sb_double_thrust1";20;0.000000;0}, {"sb_abyssal_blaze1";20;0.000000;0}, {"sb_penetrate_short1";20;0.000000;0}, {"sb_erase_mark1";20;0.000000;0}, {"sb_change_weapon1";20;0.000000;0}, {"sb_furious_soul1";20;0.000000;0}, {"sb_dark_explosion1";20;0.000000;0}, {"sb_death_mark1";20;0.000000;0}, {"sb_fire_trap1";20;0.000000;0}, {"sb_fast_shot1";20;0.000000;0}, {"sb_surrender_to_unholy1";20;0.000000;0}, {"sb_rush1";20;0.000000;0}, {"sb_warf1";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam c0, HandlerParam c1, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) < 2 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Temple Missionary (In Progress)");

}
if (gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 2 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Temple Missionary (In Progress)");

}
if (gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 3 && gg.OwnItemCount(talker, 10335) < 10 && gg.OwnItemCount(talker, 10337) < 3 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Temple Missionary (In Progress)");

}
if (gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 3 && gg.OwnItemCount(talker, 10335) >= 10 && gg.OwnItemCount(talker, 10337) < 3 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Temple Missionary (In Progress)");

}
if (gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 3 && gg.OwnItemCount(talker, 10337) >= 3 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Temple Missionary (In Progress)");

}
if (gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 4 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Temple Missionary (In Progress)");

}
if (gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) >= 5 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Temple Missionary (In Progress)");

}
if (myself.IsMyLord(talker) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Path to Becoming a Lord - Dion (In progress)");

}
if (gg.HaveMemo(talker, 709) == 1 && gg.GetMemoState(talker, 709) % 10 == 9) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Path to Becoming a Lord - Dion (In progress)");

}
if (myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Path to Becoming a Lord - Dion (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) < 2 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_rouke_q0134_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 2 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_rouke_q0134_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 3 && gg.OwnItemCount(talker, 10335) < 10 && gg.OwnItemCount(talker, 10337) < 3 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_rouke_q0134_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 3 && gg.OwnItemCount(talker, 10335) >= 10 && gg.OwnItemCount(talker, 10337) < 3 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.OwnItemCount(talker, 10335) / 10;
if (i0 <= 0) {
i0 = 0;

} else {
myself.GiveItem1(talker, 10336, i0);
myself.DeleteItem1(talker, 10335, i0 * 10);

}
myself.ShowPage(talker, "scroll_seller_rouke_q0134_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 3 && gg.OwnItemCount(talker, 10337) >= 3 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 10335, gg.OwnItemCount(talker, 10335));
myself.DeleteItem1(talker, 10336, gg.OwnItemCount(talker, 10336));
myself.DeleteItem1(talker, 10337, gg.OwnItemCount(talker, 10337));
myself.SetMemoState(talker, 134, 4);
myself.ShowPage(talker, "scroll_seller_rouke_q0134_06.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 4 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_rouke_q0134_08.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) >= 5 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_rouke_q0134_10.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || myself.IsMyLord(talker) == 0) {
myself.SetCurrentQuestID(709);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 709) == 1 && gg.GetMemoState(c0, 709) == 4) {
i0 = gg.GetMemoStateEx(c0, 709, 1);
if (talker.dbid == i0) {
myself.ShowPage(talker, "scroll_seller_rouke_q0709_03.htm");

} else {
myself.ShowPage(talker, "scroll_seller_rouke_q0709_02a.htm");

}

} else if (gg.HaveMemo(c0, 709) == 1 && gg.GetMemoState(c0, 709) % 10 == 5) {
i0 = gg.GetMemoStateEx(c0, 709, 1);
if (talker.dbid == i0) {
if (gg.OwnItemCount(talker, 13849) >= 100) {
myself.ShowPage(talker, "scroll_seller_rouke_q0709_08.htm");

} else {
myself.ShowPage(talker, "scroll_seller_rouke_q0709_07.htm");

}

} else {
myself.ShowPage(talker, "scroll_seller_rouke_q0709_07a.htm");

}

} else {
myself.ShowPage(talker, "scroll_seller_rouke_q0709_02.htm");

}

} else {
myself.ShowPage(talker, "scroll_seller_rouke_q0709_01.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 709) == 1 && gg.GetMemoState(talker, 709) % 10 == 9) {
myself.SetCurrentQuestID(709);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_rouke_q0709_12.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(709);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "scroll_seller_rouke_q0709_13.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam c0, HandlerParam c1, HandlerParam i1, HandlerParam i2, HandlerParam reply, HandlerParam talker) {
if (ask == 134) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 134) {
if (reply == 1) {
if (gg.HaveMemo(talker, 134) >= 1 && gg.GetMemoState(talker, 134) == 2 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetMemoState(talker, 134, 3);
myself.ShowPage(talker, "scroll_seller_rouke_q0134_03.htm");
myself.SetFlagJournal(talker, 134, 3);
myself.ShowQuestMark(talker, 134);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 134) >= 1 && gg.GetMemoState(talker, 134) == 4 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.ShowPage(talker, "scroll_seller_rouke_q0134_07.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 134) >= 1 && gg.GetMemoState(talker, 134) == 4 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetMemoState(talker, 134, 5);
myself.ShowPage(talker, "scroll_seller_rouke_q0134_09.htm");
myself.SetFlagJournal(talker, 134, 5);
myself.ShowQuestMark(talker, 134);
myself.GiveItem1(talker, 10338, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 709) {
myself.SetCurrentQuestID(709);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 709) {
if (reply == 1) {
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 709) == 1 && gg.GetMemoState(c0, 709) == 4) {
myself.ShowPage(talker, "scroll_seller_rouke_q0709_04.htm");

}

}

}
if (reply == 2) {
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 709) == 1 && gg.GetMemoState(c0, 709) == 4) {
myself.SetMemoState(c0, 709, 5);
myself.ShowPage(talker, "scroll_seller_rouke_q0709_05.htm");
myself.SetFlagJournal(c0, 709, 4);
myself.ShowQuestMark(c0, 709);
myself.SoundEffect(c0, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "scroll_seller_rouke_q0709_06.htm");

}

}
if (reply == 3) {
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 709) == 1 && gg.GetMemoState(c0, 709) % 10 == 5) {
i1 = gg.GetMemoState(c0, 709);
if (gg.OwnItemCount(talker, 13849) >= 100) {
myself.SetMemoState(c0, 709, i1 + 4);
myself.ShowPage(talker, "scroll_seller_rouke_q0709_09.htm");
myself.DeleteItem1(talker, 13849, gg.OwnItemCount(talker, 13849));

} else {
myself.ShowPage(talker, "scroll_seller_rouke_q0709_10.htm");

}

}

} else {
myself.ShowPage(talker, "scroll_seller_rouke_q0709_11.htm");

}

}

}
super;
	}


}