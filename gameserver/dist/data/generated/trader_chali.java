package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_chali extends merchant_for_newbie {
protected Object[][] SellList0 = {
{"pants";15;0.000000;0}, {"shirt";15;0.000000;0}, {"leather_pants";15;0.000000;0}, {"leather_shirt";15;0.000000;0}, {"hard_leather_pants";15;0.000000;0}, {"wooden_gaiters";15;0.000000;0}, {"wooden_breastplate";15;0.000000;0}, {"tights_pants";15;0.000000;0}, {"tights_shirt";15;0.000000;0}, {"bone_breastplate";15;0.000000;0}, {"bone_gaiters";15;0.000000;0}, {"leather_shield";15;0.000000;0}, {"small_shield";15;0.000000;0}, {"buckler";15;0.000000;0}, {"round_shield";15;0.000000;0}, {"short_gloves";15;0.000000;0}, {"short_leather_gloves";15;0.000000;0}, {"gloves";15;0.000000;0}, {"leather_gloves";15;0.000000;0}, {"apprentice's_shoes";15;0.000000;0}, {"cloth_shoes";15;0.000000;0}, {"leather_sandals";15;0.000000;0}, {"crude_leather_shoes";15;0.000000;0}, {"cotton_shoes";15;0.000000;0}, {"leather_shoes";15;0.000000;0}, {"low_boots";15;0.000000;0}, {"cloth_cap";15;0.000000;0}, {"leather_cap";15;0.000000;0}, {"wooden_helmet";15;0.000000;0}, {"leather_helmet";15;0.000000;0}, {"tshirt";15;0.000000;0}, {"pattern_tshirt";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"hose";15;0.000000;0}, {"tunic";15;0.000000;0}, {"cotton_hose";15;0.000000;0}, {"cotton_tunic";15;0.000000;0}, {"feriotic_hose";15;0.000000;0}, {"feriotic_tunic";15;0.000000;0}, {"leather_hose";15;0.000000;0}, {"leather_tunic";15;0.000000;0}, {"hose_of_devotion";15;0.000000;0}, {"tunic_of_devotion";15;0.000000;0}, {"leather_shield";15;0.000000;0}, {"small_shield";15;0.000000;0}, {"buckler";15;0.000000;0}, {"round_shield";15;0.000000;0}, {"short_gloves";15;0.000000;0}, {"short_leather_gloves";15;0.000000;0}, {"gloves";15;0.000000;0}, {"leather_gloves";15;0.000000;0}, {"apprentice's_shoes";15;0.000000;0}, {"cloth_shoes";15;0.000000;0}, {"leather_sandals";15;0.000000;0}, {"crude_leather_shoes";15;0.000000;0}, {"cotton_shoes";15;0.000000;0}, {"leather_shoes";15;0.000000;0}, {"low_boots";15;0.000000;0}, {"cloth_cap";15;0.000000;0}, {"leather_cap";15;0.000000;0}, {"wooden_helmet";15;0.000000;0}, {"leather_helmet";15;0.000000;0}, {"tshirt";15;0.000000;0}, {"pattern_tshirt";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1648) == 1 && gg.GetMemoStateEx(talker, 417, 1) < 20) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1648) == 1 && gg.GetMemoStateEx(talker, 417, 1) >= 20) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1651) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1550) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Miner's Favor (In Progress)");

}
if (gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1550)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Miner's Favor (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3258) == 0 && gg.OwnItemCount(talker, 3252) == 0 && gg.OwnItemCount(talker, 3247) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3252) >= 1 && gg.OwnItemCount(talker, 3247) == 0 && gg.OwnItemCount(talker, 3258) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Prosperity (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1648) == 1 && gg.GetMemoStateEx(talker, 417, 1) < 20) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_chali_q0417_01.htm");
myself.DeleteItem1(talker, 1648, 1);
myself.GiveItem1(talker, 1651, 1);
myself.SetMemoStateEx(talker, 417, 1, gg.GetMemoStateEx(talker, 417, 1) + 10);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1648) == 1 && gg.GetMemoStateEx(talker, 417, 1) >= 20) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemoState(talker, 417, 1);
myself.ShowPage(talker, "trader_chali_q0417_02.htm");
myself.DeleteItem1(talker, 1648, 1);
myself.GiveItem1(talker, 1651, 1);
myself.SetMemoStateEx(talker, 417, 1, gg.GetMemoStateEx(talker, 417, 1) + 10);
myself.SetFlagJournal(talker, 417, 3);
myself.ShowQuestMark(talker, 417);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1651) == 1) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_chali_q0417_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1550) == 0) {
myself.SetCurrentQuestID(5);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_chali_q0005_01.htm");
myself.GiveItem1(talker, 1550, 1);
if (gg.OwnItemCount(talker, 1548) + gg.OwnItemCount(talker, 1549) + gg.OwnItemCount(talker, 1550) + gg.OwnItemCount(talker, 1551) >= 3) {
myself.SetFlagJournal(talker, 5, 2);
myself.ShowQuestMark(talker, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1550)) {
myself.SetCurrentQuestID(5);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_chali_q0005_02.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3258) == 0 && gg.OwnItemCount(talker, 3252) == 0 && gg.OwnItemCount(talker, 3247) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_chali_q0221_01.htm");
myself.GiveItem1(talker, 3252, 1);

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3252) >= 1 && gg.OwnItemCount(talker, 3247) == 0 && gg.OwnItemCount(talker, 3258) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_chali_q0221_02.htm");

}
break;

}

}
return;

}
super;
	}


}