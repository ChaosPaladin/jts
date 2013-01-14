package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class glyvka extends cleric_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1434) == 0 && gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1434) == 1 && gg.OwnItemCount(talker, 1435) + gg.OwnItemCount(talker, 1436) < 20) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1434) == 1 && gg.OwnItemCount(talker, 1435) + gg.OwnItemCount(talker, 1436) >= 20 && gg.OwnItemCount(talker, 1436) < 20) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1434) == 1 && gg.OwnItemCount(talker, 1435) + gg.OwnItemCount(talker, 1436) >= 20 && gg.OwnItemCount(talker, 1436) >= 20) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1434) == 0 && gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 134) == 0 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Temple Missionary");

}
if (myself.GetOneTimeQuestFlag(talker, 134) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Temple Missionary (Done)");

}
if (gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 1 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Temple Missionary (In Progress)");

}
if (gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) >= 2 && gg.GetMemoState(talker, 134) < 5 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Temple Missionary (In Progress)");

}
if (gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 5 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Temple Missionary (In Progress)");

}
if (gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 6 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Temple Missionary (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1434) == 0 && gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) == 0) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "glyvka_q0330_01.htm");
myself.GiveItem1(talker, 1434, 1);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1434) == 1 && gg.OwnItemCount(talker, 1435) + gg.OwnItemCount(talker, 1436) < 20) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "glyvka_q0330_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1434) == 1 && gg.OwnItemCount(talker, 1435) + gg.OwnItemCount(talker, 1436) >= 20 && gg.OwnItemCount(talker, 1436) < 20) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "glyvka_q0330_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1434) == 1 && gg.OwnItemCount(talker, 1435) + gg.OwnItemCount(talker, 1436) >= 20 && gg.OwnItemCount(talker, 1436) >= 20) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "glyvka_q0330_06.htm");
myself.DeleteItem1(talker, 1434, 1);
myself.DeleteItem1(talker, 1435, gg.OwnItemCount(talker, 1435));
myself.DeleteItem1(talker, 1436, gg.OwnItemCount(talker, 1436));
myself.GiveItem1(talker, 1438, 1);

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1434) == 0 && gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) == 1) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "glyvka_q0330_07.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 134) == 0 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 35) {
myself.FHTML_SetFileName(fhtml0, "glyvka_q0134_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 134);
myself.ShowQuestFHTML(talker, fhtml0, 134);

} else {
myself.ShowQuestPage(talker, "glyvka_q0134_02.htm", 134);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 134) == 1) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 1 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "glyvka_q0134_04.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) >= 2 && gg.GetMemoState(talker, 134) < 5 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "glyvka_q0134_07.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 5 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 10338, gg.OwnItemCount(talker, 10338));
myself.SetMemoState(talker, 134, 6);
myself.ShowPage(talker, "glyvka_q0134_08.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 134) == 1 && gg.GetMemoState(talker, 134) == 6 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "glyvka_q0134_10.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 134) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 134) == 0 && myself.GetOneTimeQuestFlag(talker, 134) == 0 && talker.level >= 35) {
myself.SetMemoState(talker, 134, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "glyvka_q0134_03.htm", 134);
gg.AddLog(1, talker, quest_id);
myself.SetFlagJournal(talker, 134, 1);
myself.ShowQuestMark(talker, 134);

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
if (reply == 1 && gg.OwnItemCount(talker, 1434) == 1 && gg.OwnItemCount(talker, 1435) + gg.OwnItemCount(talker, 1436) >= 20 && gg.OwnItemCount(talker, 1436) < 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "glyvka_q0330_05.htm");
myself.DeleteItem1(talker, 1434, 1);
myself.DeleteItem1(talker, 1435, gg.OwnItemCount(talker, 1435));
myself.DeleteItem1(talker, 1436, gg.OwnItemCount(talker, 1436));
myself.GiveItem1(talker, 1437, 1);

}

}

}
if (ask == 134) {
myself.SetCurrentQuestID(134);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 134) {
if (reply == 1) {
if (gg.HaveMemo(talker, 134) >= 1 && gg.GetMemoState(talker, 134) == 1 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.ShowPage(talker, "glyvka_q0134_05.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 134) >= 1 && gg.GetMemoState(talker, 134) == 1 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.SetMemoState(talker, 134, 2);
myself.ShowPage(talker, "glyvka_q0134_06.htm");
myself.SetFlagJournal(talker, 134, 2);
myself.ShowQuestMark(talker, 134);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 134) >= 1 && gg.GetMemoState(talker, 134) == 6 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.ShowPage(talker, "glyvka_q0134_09.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 134) >= 1 && gg.GetMemoState(talker, 134) == 6 && myself.GetOneTimeQuestFlag(talker, 134) == 0) {
myself.GiveItem1(talker, 10339, 1);
myself.ShowPage(talker, "glyvka_q0134_11.htm");
myself.RemoveMemo(talker, 134);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 134);
myself.SetOneTimeQuestFlag(talker, 134, 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 41) {
myself.GiveItem1(talker, 57, 15100);
myself.IncrementParam(talker, 0, 30000);
myself.IncrementParam(talker, 1, 2000);

} else {
myself.GiveItem1(talker, 57, 15100);

}
gg.AddLog(3, talker, 134);

}

}

}

}
super;
	}


}