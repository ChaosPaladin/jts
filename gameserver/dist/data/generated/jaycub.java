package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class jaycub extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1426) == 0 && gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1426) == 1 && gg.OwnItemCount(talker, 1427) < 20) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1426) == 1 && gg.OwnItemCount(talker, 1427) >= 20 && gg.OwnItemCount(talker, 1428) < 10) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1426) == 1 && gg.OwnItemCount(talker, 1427) >= 20 && gg.OwnItemCount(talker, 1428) >= 10) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1426) == 0 && gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 6 && gg.GetMemoStateEx(talker, 65, 1) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Certified Soul Breaker (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 6 && gg.GetMemoStateEx(talker, 65, 1) == 10) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Certified Soul Breaker (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 6 && gg.GetMemoStateEx(talker, 65, 1) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Certified Soul Breaker (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 7) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Certified Soul Breaker (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1426) == 0 && gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) == 0) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "jaycub_q0330_01.htm");
myself.GiveItem1(talker, 1426, 1);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1426) == 1 && gg.OwnItemCount(talker, 1427) < 20) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jaycub_q0330_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1426) == 1 && gg.OwnItemCount(talker, 1427) >= 20 && gg.OwnItemCount(talker, 1428) < 10) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jaycub_q0330_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1426) == 1 && gg.OwnItemCount(talker, 1427) >= 20 && gg.OwnItemCount(talker, 1428) >= 10) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jaycub_q0330_06.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1426, 1);
myself.DeleteItem1(talker, 1427, gg.OwnItemCount(talker, 1427));
myself.DeleteItem1(talker, 1428, gg.OwnItemCount(talker, 1428));
myself.GiveItem1(talker, 1430, 1);

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1426) == 0 && gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) == 1) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jaycub_q0330_07.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 6 && gg.GetMemoStateEx(talker, 65, 1) == 0) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoStateEx(talker, 65, 1, 10);
myself.ShowPage(talker, "jaycub_q0065_01.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 6 && gg.GetMemoStateEx(talker, 65, 1) == 10) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jaycub_q0065_01a.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 6 && gg.GetMemoStateEx(talker, 65, 1) == 1) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 65, 7);
myself.SetMemoStateEx(talker, 65, 1, 0);
myself.ShowPage(talker, "jaycub_q0065_02.htm");
myself.SetFlagJournal(talker, 65, 7);
myself.ShowQuestMark(talker, 65);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 7) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jaycub_q0065_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 330) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 330) {
if (reply == 1 && gg.OwnItemCount(talker, 1426) && gg.OwnItemCount(talker, 1427) >= 20 && gg.OwnItemCount(talker, 1428) < 10) {
myself.ShowPage(talker, "jaycub_q0330_05.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1426, 1);
myself.DeleteItem1(talker, 1427, gg.OwnItemCount(talker, 1427));
myself.DeleteItem1(talker, 1428, gg.OwnItemCount(talker, 1428));
myself.GiveItem1(talker, 1429, 1);

}

}

}
super;
	}


}