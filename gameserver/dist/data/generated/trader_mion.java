package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_mion extends merchant_for_newbie {
protected Object[][] SellList0 = {
{"soulshot_none";15;0.000000;0}, {"spiritshot_none";15;0.000000;0}, {"blessed_spiritshot_none";15;0.000000;0}, {"comp_bspiritshot_none";15;0.000000;0}, {"comp_spiritshot_none";15;0.000000;0}, {"comp_soulshot_none";15;0.000000;0}, {"adv_comp_bspiritshot_none";15;0.000000;0}, {"adv_comp_spiritshot_none";15;0.000000;0}, {"adv_comp_soulshot_none";15;0.000000;0}, {"wooden_arrow";15;0.000000;0}, {"bone_arrow";15;0.000000;0}, {"lesser_healing_potion";15;0.000000;0}, {"antidote";15;0.000000;0}, {"bandage";15;0.000000;0}, {"quick_step_potion";15;0.000000;0}, {"swift_attack_potion";15;0.000000;0}, {"potion_of_acumen2";15;0.000000;0}, {"scroll_of_escape";15;0.000000;0}, {"scroll_of_resurrection";15;0.000000;0}, {"spirit_ore";15;0.000000;0}, {"soul_ore";15;0.000000;0}, {"energy_stone";15;0.000000;0}, {"key_of_thief";15;0.000000;0}, {"rope_of_magic_d";15;0.000000;0}, {"rope_of_magic_c";15;0.000000;0}, {"rope_of_magic_b";15;0.000000;0}, {"rope_of_magic_a";15;0.000000;0}, {"gemstone_d";15;0.000000;0}, {"bone_bolt";15;0.000000;0}, {"recovery_scroll_none";15;0.000000;0}, {"recovery_scroll_d";15;0.000000;0}, {"elixir_of_life_none";15;0.000000;0}, {"elixir_of_life_d";15;0.000000;0}, {"elixir_of_mental_none";15;0.000000;0}, {"elixir_of_mental_d";15;0.000000;0}, {"elixir_of_combative_none";15;0.000000;0}, {"elixir_of_combative_d";15;0.000000;0}, {"crystal_of_summon";15;0.000000;0}, {"dice_heart";15;0.000000;0}, {"dice_spade";15;0.000000;0}, {"dice_clover";15;0.000000;0}, {"dice_diamond";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"sb_adv_defence_power1";15;0.000000;0}, {"sb_advanced_attack_power1";15;0.000000;0}, {"sb_might1";15;0.000000;0}, {"sb_battle_heal1";15;0.000000;0}, {"sb_vampiric_touch1";15;0.000000;0}, {"sb_ice_bolt1";15;0.000000;0}, {"sb_heal1";15;0.000000;0}, {"sb_group_heal1";15;0.000000;0}, {"sb_shield1";15;0.000000;0}, {"sb_breeze1";15;0.000000;0}, {"sb_wind_walk1";15;0.000000;0}, {"sb_curse:weakness";15;0.000000;0}, {"sb_curse:poison1";15;0.000000;0}, {"sb_cure_poison1";15;0.000000;0}, {"sb_flame_strike1";15;0.000000;0}, {"sb_drain_energy1";15;0.000000;0}, {"sb_elemental_heal1";15;0.000000;0}, {"sb_disrupt_undead1";15;0.000000;0}, {"sb_resurrection1";15;0.000000;0}, {"sb_blaze1";15;0.000000;0}, {"sb_summon_shadow1";15;0.000000;0}, {"sb_summon_silhouette1";15;0.000000;0}, {"sb_summon_unicorn_boxer1";15;0.000000;0}, {"sb_summon_blackcat1";15;0.000000;0}, {"sb_servitor_heal1";15;0.000000;0}, {"sb_aqua_swirl1";15;0.000000;0}, {"sb_arcane_acumen1";15;0.000000;0}, {"sb_energy_bolt1";15;0.000000;0}, {"sb_aura_burn1";15;0.000000;0}, {"sb_charm11";15;0.000000;0}, {"sb_concentration1";15;0.000000;0}, {"sb_water_breathing";15;0.000000;0}, {"sb_twister1";15;0.000000;0}, {"sb_poison1";15;0.000000;0}, {"sb_poison_recovery1";15;0.000000;0}, {"sb_summon_mechanic_golem1";15;0.000000;0}, {"sb_fallen_arrow1";15;0.000000;0}, {"sb_fallen_attack1";15;0.000000;0}, {"sb_rapid_attack1";15;0.000000;0}, {"sb_increase_power1";15;0.000000;0}, {"sb_detect_trap1";15;0.000000;0}, {"sb_defuse_trap1";15;0.000000;0}, {"sb_summon_siege_golem";15;0.000000;0}, {"sb_summon_bigboom1";15;0.000000;0}, {"sb_summon_wild_hog_cannon";15;0.000000;0}, {"sb_summon_swoop_cannon1";15;0.000000;0}, {"sb_summon_merchant_golem1";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1643) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) && gg.OwnItemCount(talker, 1648) + gg.OwnItemCount(talker, 1647) + gg.OwnItemCount(talker, 1649) == 1 && gg.GetMemoStateEx(talker, 417, 1) % 10 == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) && gg.OwnItemCount(talker, 1648) + gg.OwnItemCount(talker, 1647) + gg.OwnItemCount(talker, 1649) == 1 && gg.GetMemoStateEx(talker, 417, 1) % 10 > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) && gg.OwnItemCount(talker, 1651) + gg.OwnItemCount(talker, 1650) + gg.OwnItemCount(talker, 1652) == 1 && gg.GetMemoStateEx(talker, 417, 1) < 50) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) && gg.OwnItemCount(talker, 1651) + gg.OwnItemCount(talker, 1650) + gg.OwnItemCount(talker, 1652) == 1 && gg.GetMemoStateEx(talker, 417, 1) >= 50) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) && gg.OwnItemCount(talker, 1646)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) && gg.OwnItemCount(talker, 1653) || gg.OwnItemCount(talker, 1654) || gg.OwnItemCount(talker, 1657) || gg.OwnItemCount(talker, 1644) || gg.OwnItemCount(talker, 1645)) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 296) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Tarantula's Spider Silk");

}
if (gg.HaveMemo(talker, 296) == 1 && gg.OwnItemCount(talker, 1493) < 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Tarantula's Spider Silk (In Progress)");

}
if (gg.HaveMemo(talker, 296) == 1 && gg.OwnItemCount(talker, 1493) >= 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Tarantula's Spider Silk (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3253) == 0 && gg.OwnItemCount(talker, 3248) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3253) >= 1 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3248) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Testimony of Prosperity (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1643) == 1) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_mion_q0417_01.htm");
myself.SetFlagJournal(talker, 417, 2);
myself.ShowQuestMark(talker, 417);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) && gg.OwnItemCount(talker, 1648) + gg.OwnItemCount(talker, 1647) + gg.OwnItemCount(talker, 1649) == 1 && gg.GetMemoStateEx(talker, 417, 1) % 10 == 0) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_mion_q0417_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) && gg.OwnItemCount(talker, 1648) + gg.OwnItemCount(talker, 1647) + gg.OwnItemCount(talker, 1649) == 1 && gg.GetMemoStateEx(talker, 417, 1) % 10 > 0) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_mion_q0417_08.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) && gg.OwnItemCount(talker, 1651) + gg.OwnItemCount(talker, 1650) + gg.OwnItemCount(talker, 1652) == 1 && gg.GetMemoStateEx(talker, 417, 1) < 50) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_mion_q0417_12.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) && gg.OwnItemCount(talker, 1651) + gg.OwnItemCount(talker, 1650) + gg.OwnItemCount(talker, 1652) == 1 && gg.GetMemoStateEx(talker, 417, 1) >= 50) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_mion_q0417_15.htm");
myself.GiveItem1(talker, 1646, 1);
myself.DeleteItem1(talker, 1651, gg.OwnItemCount(talker, 1651));
myself.DeleteItem1(talker, 1652, gg.OwnItemCount(talker, 1652));
myself.DeleteItem1(talker, 1650, gg.OwnItemCount(talker, 1650));
myself.SetFlagJournal(talker, 417, 4);
myself.ShowQuestMark(talker, 417);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) && gg.OwnItemCount(talker, 1646)) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_mion_q0417_13.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) && gg.OwnItemCount(talker, 1653) || gg.OwnItemCount(talker, 1654) || gg.OwnItemCount(talker, 1657) || gg.OwnItemCount(talker, 1644) || gg.OwnItemCount(talker, 1645)) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_mion_q0417_14.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 296) == 0) {
myself.SetCurrentQuestID(296);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 15) {
myself.FHTML_SetFileName(fhtml0, "trader_mion_q0296_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 296);
myself.ShowQuestFHTML(talker, fhtml0, 296);

} else {
myself.ShowQuestPage(talker, "trader_mion_q0296_01.htm", 296);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 296) == 1 && gg.OwnItemCount(talker, 1493) < 1) {
myself.SetCurrentQuestID(296);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_mion_q0296_04.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 296) == 1 && gg.OwnItemCount(talker, 1493) >= 1) {
myself.SetCurrentQuestID(296);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_mion_q0296_05.htm");
if (gg.OwnItemCount(talker, 1493) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1493) * 30 + 2000);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1493) * 30);

}
myself.DeleteItem1(talker, 1493, gg.OwnItemCount(talker, 1493));
gg.AddLog(3, talker, 296);
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 100000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4155, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 100000000 / 10000000 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 10000000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4155, "", "", "", "", ""));

}

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3253) == 0 && gg.OwnItemCount(talker, 3248) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_mion_q0221_01.htm");
myself.GiveItem1(talker, 3253, 1);

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3253) >= 1 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3248) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_mion_q0221_02.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 296) {
myself.SetCurrentQuestID(296);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 296);
myself.ShowQuestMark(talker, 296);
gg.AddLog(1, talker, 296);
myself.SetFlagJournal(talker, 296, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "trader_mion_q0296_03.htm", 296);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 417) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 417 && reply == 1 && gg.OwnItemCount(talker, 1643) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
switch (gg.Rand(3)) {
case 0: {
myself.ShowPage(talker, "trader_mion_q0417_02.htm");
myself.DeleteItem1(talker, 1643, 1);
myself.GiveItem1(talker, 1649, 1);
break;

}
case 1: {
myself.ShowPage(talker, "trader_mion_q0417_03.htm");
myself.DeleteItem1(talker, 1643, 1);
myself.GiveItem1(talker, 1648, 1);
break;

}
case 2: {
myself.ShowPage(talker, "trader_mion_q0417_04.htm");
myself.DeleteItem1(talker, 1643, 1);
myself.GiveItem1(talker, 1647, 1);
break;

}

}

}

}
if (ask == 417 && reply == 2) {
myself.ShowPage(talker, "trader_mion_q0417_06.htm");

}
if (ask == 417 && reply == 3) {
myself.ShowPage(talker, "trader_mion_q0417_07.htm");
myself.SetMemoStateEx(talker, 417, 1, gg.GetMemoStateEx(talker, 417, 1) + 1);

}
if (ask == 417 && reply == 4) {
switch (gg.Rand(2)) {
case 0: {
myself.ShowPage(talker, "trader_mion_q0417_06.htm");
break;

}
case 1: {
myself.ShowPage(talker, "trader_mion_q0417_11.htm");
break;

}

}

}
if (ask == 417 && reply == 5) {
if (gg.GetMemoStateEx(talker, 417, 1) % 10 < 2) {
myself.ShowPage(talker, "trader_mion_q0417_07.htm");
myself.SetMemoStateEx(talker, 417, 1, gg.GetMemoStateEx(talker, 417, 1) + 1);

} else if (gg.GetMemoStateEx(talker, 417, 1) % 10 == 2 && gg.GetMemoState(talker, 417) == 0) {
myself.ShowPage(talker, "trader_mion_q0417_07.htm");

} else if (gg.GetMemoStateEx(talker, 417, 1) % 10 == 2 && gg.GetMemoState(talker, 417) == 1) {
myself.ShowPage(talker, "trader_mion_q0417_09.htm");
myself.SetMemoStateEx(talker, 417, 1, gg.GetMemoStateEx(talker, 417, 1) + 1);

} else if (gg.GetMemoStateEx(talker, 417, 1) % 10 >= 3 && gg.GetMemoState(talker, 417) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_mion_q0417_10.htm");
myself.GiveItem1(talker, 1646, 1);
myself.DeleteItem1(talker, 1648, gg.OwnItemCount(talker, 1648));
myself.DeleteItem1(talker, 1649, gg.OwnItemCount(talker, 1649));
myself.DeleteItem1(talker, 1647, gg.OwnItemCount(talker, 1647));
myself.SetFlagJournal(talker, 417, 4);
myself.ShowQuestMark(talker, 417);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 417 && reply == 6) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
switch (gg.Rand(3)) {
case 0: {
myself.ShowPage(talker, "trader_mion_q0417_02.htm");
myself.DeleteItem1(talker, 1652, gg.OwnItemCount(talker, 1652));
myself.DeleteItem1(talker, 1651, gg.OwnItemCount(talker, 1651));
myself.DeleteItem1(talker, 1650, gg.OwnItemCount(talker, 1650));
myself.GiveItem1(talker, 1649, 1);
break;

}
case 1: {
myself.ShowPage(talker, "trader_mion_q0417_03.htm");
myself.DeleteItem1(talker, 1652, gg.OwnItemCount(talker, 1652));
myself.DeleteItem1(talker, 1651, gg.OwnItemCount(talker, 1651));
myself.DeleteItem1(talker, 1650, gg.OwnItemCount(talker, 1650));
myself.GiveItem1(talker, 1648, 1);
break;

}
case 2: {
myself.ShowPage(talker, "trader_mion_q0417_04.htm");
myself.DeleteItem1(talker, 1652, gg.OwnItemCount(talker, 1652));
myself.DeleteItem1(talker, 1651, gg.OwnItemCount(talker, 1651));
myself.DeleteItem1(talker, 1650, gg.OwnItemCount(talker, 1650));
myself.GiveItem1(talker, 1647, 1);
break;

}

}

}

}
if (ask == 296) {
myself.SetCurrentQuestID(296);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 296) {
if (reply == 1) {
myself.ShowPage(talker, "trader_mion_q0296_06.htm");
myself.DeleteItem1(talker, 1494, gg.OwnItemCount(talker, 1494));
myself.RemoveMemo(talker, 296);
gg.AddLog(2, talker, 296);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (reply == 2) {
myself.ShowPage(talker, "trader_mion_q0296_07.htm");

}

}
super;
	}


}