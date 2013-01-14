package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_toma extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1646) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1653) == 1 && gg.OwnItemCount(talker, 1655) < 5) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1653) == 1 && gg.OwnItemCount(talker, 1655) >= 5) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1654) == 1 && gg.OwnItemCount(talker, 1656) < 20) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1654) == 1 && gg.OwnItemCount(talker, 1656) >= 20) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1657) > 0 && gg.OwnItemCount(talker, 8543) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 8543) > 0 && gg.OwnItemCount(talker, 1657) == 0 && gg.GetMemoState(talker, 417) == 2) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1644) > 0 || gg.OwnItemCount(talker, 1645) > 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 3 && gg.OwnItemCount(talker, 2871)) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 3 && gg.OwnItemCount(talker, 2916)) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 3 && gg.OwnItemCount(talker, 2872) == 5) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3262) == 0 && gg.OwnItemCount(talker, 3256) == 0 && gg.OwnItemCount(talker, 3251) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3256) >= 1 && gg.OwnItemCount(talker, 3262) == 0 && gg.OwnItemCount(talker, 3251) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Testimony of Prosperity (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1646) == 1) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_toma_q0417_01.htm");
myself.DeleteItem1(talker, 1646, 1);
myself.GiveItem1(talker, 1653, 1);
myself.SetFlagJournal(talker, 417, 5);
myself.ShowQuestMark(talker, 417);
myself.SoundEffect(talker, "ItemSound.quest_middle");
talker.flag = 0;

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1653) == 1 && gg.OwnItemCount(talker, 1655) < 5) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_toma_q0417_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1653) == 1 && gg.OwnItemCount(talker, 1655) >= 5) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_toma_q0417_03.htm");
myself.DeleteItem1(talker, 1655, gg.OwnItemCount(talker, 1655));
myself.DeleteItem1(talker, 1653, 1);
myself.GiveItem1(talker, 1654, 1);
myself.SetFlagJournal(talker, 417, 7);
myself.ShowQuestMark(talker, 417);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1654) == 1 && gg.OwnItemCount(talker, 1656) < 20) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_toma_q0417_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1654) == 1 && gg.OwnItemCount(talker, 1656) >= 20) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_toma_q0417_05a.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1657) > 0 && gg.OwnItemCount(talker, 8543) == 0) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_toma_q0417_06a.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 8543) > 0 && gg.OwnItemCount(talker, 1657) == 0 && gg.GetMemoState(talker, 417) == 2) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_toma_q0417_06c.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1644) > 0 || gg.OwnItemCount(talker, 1645) > 0) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_toma_q0417_07.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 3 && gg.OwnItemCount(talker, 2871)) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_toma_q0231_01.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 3 && gg.OwnItemCount(talker, 2916)) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_toma_q0231_06.htm");
myself.GiveItem1(talker, 2872, 5);
myself.DeleteItem1(talker, 2916, 1);

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 3 && gg.OwnItemCount(talker, 2872) == 5) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_toma_q0231_07.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3262) == 0 && gg.OwnItemCount(talker, 3256) == 0 && gg.OwnItemCount(talker, 3251) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_toma_q0221_01.htm");
myself.GiveItem1(talker, 3256, 1);

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3256) >= 1 && gg.OwnItemCount(talker, 3262) == 0 && gg.OwnItemCount(talker, 3251) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_toma_q0221_02.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 417) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 417) {
if (reply == 10 && gg.OwnItemCount(talker, 1654) == 1 && gg.OwnItemCount(talker, 1656) >= 20 && gg.HaveMemo(talker, 417) == 1) {
myself.GiveItem1(talker, 1657, 1);
myself.DeleteItem1(talker, 1654, gg.OwnItemCount(talker, 1654));
myself.DeleteItem1(talker, 1656, gg.OwnItemCount(talker, 1656));
myself.ShowPage(talker, "master_toma_q0417_05b.htm");
myself.SetFlagJournal(talker, 417, 9);
myself.ShowQuestMark(talker, 417);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
if (reply == 11 && gg.OwnItemCount(talker, 1654) == 1 && gg.OwnItemCount(talker, 1656) >= 20 && gg.HaveMemo(talker, 417) == 1) {
myself.GiveItem1(talker, 8543, 1);
myself.DeleteItem1(talker, 1654, gg.OwnItemCount(talker, 1654));
myself.DeleteItem1(talker, 1656, gg.OwnItemCount(talker, 1656));
myself.ShowPage(talker, "master_toma_q0417_06b.htm");
myself.SetMemoState(talker, 417, 2);
myself.SetFlagJournal(talker, 417, 12);
myself.ShowQuestMark(talker, 417);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 231) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 231) {
if (reply == 1) {
myself.ShowPage(talker, "master_toma_q0231_02.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "master_toma_q0231_03.htm");

} else if (reply == 3 && gg.OwnItemCount(talker, 2871) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_toma_q0231_05.htm");
myself.GiveItem1(talker, 2916, 1);
myself.DeleteItem1(talker, 2871, 1);
myself.InstantTeleport(talker, 140352, -194133, -3146);
myself.CreateOnePrivateEx(1020150, "king_bugbear", 0, 5, 140333, -194153, -3138, 0, gg.GetIndexFromCreature(talker), 0, 0);
myself.CreateOnePrivateEx(1020150, "king_bugbear", 0, 5, 140395, -194147, -3146, 0, gg.GetIndexFromCreature(talker), 0, 0);
myself.CreateOnePrivateEx(1020150, "king_bugbear", 0, 5, 140304, -194082, -3157, 0, gg.GetIndexFromCreature(talker), 0, 0);

}

} else if (reply == 4) {
myself.ShowPage(talker, "master_toma_q0231_04.htm");

}

}
super;
	}


}