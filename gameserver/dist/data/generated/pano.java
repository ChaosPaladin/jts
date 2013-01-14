package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pano extends merchant_for_chaotic {
protected Object[][] SellList0 = {
{"soulshot_none";50;0.000000;0}, {"spiritshot_none";50;0.000000;0}, {"blessed_spiritshot_none";50;0.000000;0}, {"soulshot_d";50;0.000000;0}, {"soulshot_c";50;0.000000;0}, {"blessed_spiritshot_d";50;0.000000;0}, {"blessed_spiritshot_c";50;0.000000;0}, {"comp_bspiritshot_none";50;0.000000;0}, {"comp_spiritshot_none";50;0.000000;0}, {"comp_soulshot_none";50;0.000000;0}, {"adv_comp_bspiritshot_none";50;0.000000;0}, {"adv_comp_spiritshot_none";50;0.000000;0}, {"adv_comp_soulshot_none";50;0.000000;0}, {"wooden_arrow";50;0.000000;0}, {"bone_arrow";50;0.000000;0}, {"fine_steel_arrow";50;0.000000;0}, {"lesser_healing_potion";50;0.000000;0}, {"healing_potion";50;0.000000;0}, {"antidote";50;0.000000;0}, {"advanced_antidote";50;0.000000;0}, {"bandage";50;0.000000;0}, {"emergency_dressing";50;0.000000;0}, {"quick_step_potion";50;0.000000;0}, {"swift_attack_potion";50;0.000000;0}, {"potion_of_acumen2";50;0.000000;0}, {"scroll_of_awake";50;0.000000;0}, {"scroll_of_escape";50;0.000000;0}, {"scroll_of_resurrection";50;0.000000;0}, {"scroll_of_escape_to_agit";50;0.000000;0}, {"spirit_ore";50;0.000000;0}, {"soul_ore";50;0.000000;0}, {"energy_stone";50;0.000000;0}, {"key_of_thief";50;0.000000;0}, {"rope_of_magic_d";50;0.000000;0}, {"rope_of_magic_c";50;0.000000;0}, {"rope_of_magic_b";50;0.000000;0}, {"gemstone_d";50;0.000000;0}, {"bone_bolt";50;0.000000;0}, {"fine_steel_bolt";50;0.000000;0}, {"recovery_scroll_none";50;0.000000;0}, {"recovery_scroll_d";50;0.000000;0}, {"recovery_scroll_c";50;0.000000;0}, {"recovery_scroll_b";50;0.000000;0}, {"elixir_of_life_none";50;0.000000;0}, {"elixir_of_life_d";50;0.000000;0}, {"elixir_of_life_c";50;0.000000;0}, {"elixir_of_mental_d";50;0.000000;0}, {"elixir_of_combative_none";50;0.000000;0}, {"elixir_of_combative_d";50;0.000000;0}, {"elixir_of_combative_c";50;0.000000;0}, {"elixir_of_combative_b";50;0.000000;0}, {"crystal_of_summon";50;0.000000;0}, {"blank_soul_bottle_5";50;0.000000;0}, {"dice_heart";50;0.000000;0}, {"dice_spade";50;0.000000;0}, {"dice_clover";50;0.000000;0}, {"dice_diamond";50;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1431) == 0 && gg.OwnItemCount(talker, 1433) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1431) == 1 && gg.OwnItemCount(talker, 1432) < 30) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1431) == 1 && gg.OwnItemCount(talker, 1432) >= 30) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1431) == 0 && gg.OwnItemCount(talker, 1433) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3813) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3815) == 1 || gg.OwnItemCount(talker, 3814) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 341) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Hunting for Wild Beasts");

}
if (gg.HaveMemo(talker, 341) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Hunting for Wild Beasts (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) < 2) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Temple Executor (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 2 || gg.GetMemoState(talker, 135) == 3) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Temple Executor (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 4 && gg.OwnItemCount(talker, 10329) < 10 && gg.OwnItemCount(talker, 10332) < 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Temple Executor (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 5 && gg.OwnItemCount(talker, 10329) >= 10 && gg.OwnItemCount(talker, 10332) < 1 && gg.GetMemoStateEx(talker, 135, 1) % 10 == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Temple Executor (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) >= 5 && gg.GetMemoStateEx(talker, 135, 1) % 10 >= 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Temple Executor (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1431) == 0 && gg.OwnItemCount(talker, 1433) == 0) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "pano_q0330_01.htm");
myself.GiveItem1(talker, 1431, 1);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1431) == 1 && gg.OwnItemCount(talker, 1432) < 30) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pano_q0330_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1431) == 1 && gg.OwnItemCount(talker, 1432) >= 30) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "pano_q0330_03.htm");
myself.DeleteItem1(talker, 1431, 1);
myself.DeleteItem1(talker, 1432, gg.OwnItemCount(talker, 1432));
myself.GiveItem1(talker, 1433, 1);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1431) == 0 && gg.OwnItemCount(talker, 1433) == 1) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pano_q0330_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3813) == 1) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
talker.weight_point = 0;
talker.param1 = 0;
talker.param2 = 0;
talker.param3 = 0;
talker.flag = 0;
myself.ShowPage(talker, "pano_q0336_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3815) == 1 || gg.OwnItemCount(talker, 3814) == 1) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pano_q0336_54.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 341) == 0) {
myself.SetCurrentQuestID(341);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 20) {
myself.ShowQuestPage(talker, "pano_q0341_01.htm", 341);

} else if (talker.level < 20) {
myself.ShowQuestPage(talker, "pano_q0341_02.htm", 341);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 341) == 1) {
myself.SetCurrentQuestID(341);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 4259) >= 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 3710);
myself.DeleteItem1(talker, 4259, gg.OwnItemCount(talker, 4259));
myself.RemoveMemo(talker, 341);
gg.AddLog(2, talker, 341);
gg.AddLog(3, talker, 341);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "pano_q0341_05.htm");

}

} else {
myself.ShowPage(talker, "pano_q0341_06.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) < 2) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pano_q0135_01.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 2 || gg.GetMemoState(talker, 135) == 3) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pano_q0135_02.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 4 && gg.OwnItemCount(talker, 10329) < 10 && gg.OwnItemCount(talker, 10332) < 1) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pano_q0135_02a.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 5 && gg.OwnItemCount(talker, 10329) >= 10 && gg.OwnItemCount(talker, 10332) < 1 && gg.GetMemoStateEx(talker, 135, 1) % 10 == 0) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 10332, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
i0 = gg.GetMemoStateEx(talker, 135, 1);
myself.SetMemoStateEx(talker, 135, 1, i0 + 1);
myself.DeleteItem1(talker, 10329, gg.OwnItemCount(talker, 10329));
myself.ShowPage(talker, "pano_q0135_03.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) >= 5 && gg.GetMemoStateEx(talker, 135, 1) % 10 >= 1) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 10332) == 0) {
myself.GiveItem1(talker, 10332, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
myself.ShowPage(talker, "pano_q0135_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 341) {
myself.SetCurrentQuestID(341);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 341);
myself.SetFlagJournal(talker, 341, 1);
gg.AddLog(1, talker, 341);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "pano_q0341_04.htm", 341);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam reply, HandlerParam talker) {
if (ask == 336) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
i0 = 0;
i1 = 0;
i2 = 0;
i3 = 0;
i4 = 0;
i5 = 0;
if (ask == 336) {
if (reply == 1) {
myself.ShowPage(talker, "pano_q0336_02.htm");
talker.param2 = 11;

} else if (reply == 2) {
myself.ShowPage(talker, "pano_q0336_03.htm");
talker.param2 = 21;

} else if (reply == 3) {
myself.ShowPage(talker, "pano_q0336_04.htm");
talker.param2 = 31;

} else if (reply == 4) {
myself.ShowPage(talker, "pano_q0336_05.htm");
talker.param2 = 42;

} else if (reply == 5) {
myself.ShowPage(talker, "pano_q0336_06.htm");

} else if (reply == 6) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3492) >= 4 && gg.OwnItemCount(talker, 3495) >= 4) {
talker.flag = 1;
myself.DeleteItem1(talker, 3492, 4);
myself.DeleteItem1(talker, 3495, 4);
myself.ShowPage(talker, "pano_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3484) >= 4 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3484, 4 * 1);
myself.ShowPage(talker, "pano_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3492) >= 4 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3492, 4 * 1);
myself.ShowPage(talker, "pano_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3474) >= 4 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3474, 4 * 1);
myself.ShowPage(talker, "pano_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

}

} else if (reply == 7) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3492) >= 8 && gg.OwnItemCount(talker, 3495) >= 8) {
talker.flag = 1;
myself.DeleteItem1(talker, 3492, 8);
myself.DeleteItem1(talker, 3495, 8);
myself.ShowPage(talker, "pano_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3484) >= 8 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3484, 8 * 1);
myself.ShowPage(talker, "pano_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3492) >= 8 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3492, 8 * 1);
myself.ShowPage(talker, "pano_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3474) >= 8 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3474, 8 * 1);
myself.ShowPage(talker, "pano_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

}

} else if (reply == 8) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3492) >= 9 && gg.OwnItemCount(talker, 3495) >= 9) {
talker.flag = 1;
myself.DeleteItem1(talker, 3492, 9);
myself.DeleteItem1(talker, 3495, 9);
myself.ShowPage(talker, "pano_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3484) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3484, 9 * 1);
myself.ShowPage(talker, "pano_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3492) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3492, 9 * 1);
myself.ShowPage(talker, "pano_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3474) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3474, 9 * 1);
myself.ShowPage(talker, "pano_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

}

} else if (reply == 9) {
myself.ShowPage(talker, "pano_q0336_53.htm");

} else if (reply == 10) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3492) >= 5 * 2 && gg.OwnItemCount(talker, 3495) >= 5 * 2) {
myself.ShowPage(talker, "pano_q0336_07.htm");
myself.DeleteItem1(talker, 3495, 5 * 2);
myself.DeleteItem1(talker, 3492, 5 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3496, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3484) >= 5 * 1 && gg.OwnItemCount(talker, 3486) >= 5 * 1) {
myself.ShowPage(talker, "pano_q0336_07.htm");
myself.DeleteItem1(talker, 3484, 5 * 1);
myself.DeleteItem1(talker, 3486, 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3481, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3492) >= 5 * 1 && gg.OwnItemCount(talker, 3495) >= 5 * 1) {
myself.ShowPage(talker, "pano_q0336_07.htm");
myself.DeleteItem1(talker, 3495, 5 * 1);
myself.DeleteItem1(talker, 3492, 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3493, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3474) >= 5 * 1 && gg.OwnItemCount(talker, 3476) >= 5 * 1) {
myself.ShowPage(talker, "pano_q0336_07.htm");
myself.DeleteItem1(talker, 3474, 5 * 1);
myself.DeleteItem1(talker, 3476, 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3477, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

}

} else if (reply == 11) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3492) >= 5 * 5 * 2 && gg.OwnItemCount(talker, 3495) >= 5 * 5 * 2) {
myself.ShowPage(talker, "pano_q0336_07.htm");
myself.DeleteItem1(talker, 3495, 5 * 5 * 2);
myself.DeleteItem1(talker, 3492, 5 * 5 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3496, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3484) >= 5 * 5 * 1 && gg.OwnItemCount(talker, 3486) >= 5 * 5 * 1) {
myself.ShowPage(talker, "pano_q0336_07.htm");
myself.DeleteItem1(talker, 3484, 5 * 5 * 1);
myself.DeleteItem1(talker, 3486, 5 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3481, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3492) >= 5 * 5 * 1 && gg.OwnItemCount(talker, 3495) >= 5 * 5 * 1) {
myself.ShowPage(talker, "pano_q0336_07.htm");
myself.DeleteItem1(talker, 3495, 5 * 5 * 1);
myself.DeleteItem1(talker, 3492, 5 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3493, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3474) >= 5 * 5 * 1 && gg.OwnItemCount(talker, 3476) >= 5 * 5 * 1) {
myself.ShowPage(talker, "pano_q0336_07.htm");
myself.DeleteItem1(talker, 3474, 5 * 5 * 1);
myself.DeleteItem1(talker, 3476, 5 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3477, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

}

} else if (reply == 12) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3492) >= 5 * 10 * 2 && gg.OwnItemCount(talker, 3495) >= 5 * 10 * 2) {
myself.ShowPage(talker, "pano_q0336_07.htm");
myself.DeleteItem1(talker, 3495, 5 * 10 * 2);
myself.DeleteItem1(talker, 3492, 5 * 10 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3496, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3484) >= 5 * 10 * 1 && gg.OwnItemCount(talker, 3486) >= 5 * 10 * 1) {
myself.ShowPage(talker, "pano_q0336_07.htm");
myself.DeleteItem1(talker, 3484, 5 * 10 * 1);
myself.DeleteItem1(talker, 3486, 5 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3481, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3492) >= 5 * 10 * 1 && gg.OwnItemCount(talker, 3495) >= 5 * 10 * 1) {
myself.ShowPage(talker, "pano_q0336_07.htm");
myself.DeleteItem1(talker, 3495, 5 * 10 * 1);
myself.DeleteItem1(talker, 3492, 5 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3493, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3474) >= 5 * 10 * 1 && gg.OwnItemCount(talker, 3476) >= 5 * 10 * 1) {
myself.ShowPage(talker, "pano_q0336_07.htm");
myself.DeleteItem1(talker, 3474, 5 * 10 * 1);
myself.DeleteItem1(talker, 3476, 5 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3477, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pano_q0336_10.htm");

}

}

} else if (reply == 13 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "pano_q0336_14.htm");
talker.flag = talker.flag + 4 * 4 * 1;

} else if (reply == 14 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "pano_q0336_15.htm");
talker.flag = talker.flag + 4 * 4 * 2;

} else if (reply == 15 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "pano_q0336_16.htm");
talker.flag = talker.flag + 4 * 4 * 3;

} else if (reply == 16) {
myself.ShowPage(talker, "pano_q0336_17.htm");
talker.flag = talker.flag + 4 * 1 * 1;

} else if (reply == 17) {
myself.ShowPage(talker, "pano_q0336_18.htm");
talker.flag = talker.flag + 4 * 1 * 2;

} else if (reply == 18) {
myself.ShowPage(talker, "pano_q0336_19.htm");
talker.flag = talker.flag + 4 * 1 * 3;

} else if (reply == 19) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 1;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "pano_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3496, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3481, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3493, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3477, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "pano_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "pano_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "pano_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "pano_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "pano_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "pano_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "pano_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "pano_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "pano_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "pano_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "pano_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "pano_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "pano_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "pano_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "pano_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "pano_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "pano_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "pano_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "pano_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "pano_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "pano_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "pano_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "pano_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "pano_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "pano_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "pano_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "pano_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "pano_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "pano_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "pano_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 20) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 2;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "pano_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3496, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3481, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3493, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3477, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "pano_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "pano_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "pano_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "pano_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "pano_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "pano_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "pano_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "pano_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "pano_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "pano_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "pano_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "pano_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "pano_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "pano_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "pano_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "pano_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "pano_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "pano_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "pano_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "pano_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "pano_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "pano_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "pano_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "pano_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "pano_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "pano_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "pano_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "pano_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "pano_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "pano_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 21) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 3;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "pano_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3496, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3481, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3493, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3477, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "pano_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "pano_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "pano_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "pano_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "pano_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "pano_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "pano_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "pano_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "pano_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "pano_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "pano_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "pano_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "pano_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "pano_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "pano_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "pano_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "pano_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "pano_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "pano_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "pano_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "pano_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "pano_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "pano_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "pano_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "pano_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "pano_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "pano_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "pano_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "pano_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "pano_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 22) {
myself.ShowPage(talker, "pano_q0336_01.htm");

}

}
if (ask == 341) {
myself.SetCurrentQuestID(341);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 341) {
if (reply == 21) {
myself.FHTML_SetFileName(fhtml0, "pano_q0341_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 341);
myself.ShowQuestFHTML(talker, fhtml0, 341);

}

}
if (ask == 135) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 135) {

}
super;
	}


}