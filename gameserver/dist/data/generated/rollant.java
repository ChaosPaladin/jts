package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rollant extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1439) == 0 && gg.OwnItemCount(talker, 1441) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1439) == 1 && gg.OwnItemCount(talker, 1440) < 30) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1439) == 1 && gg.OwnItemCount(talker, 1440) >= 30) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1439) == 0 && gg.OwnItemCount(talker, 1441) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 380) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Bring Out the Flavor of the Ingredients!");

}
if (gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 1 && gg.OwnItemCount(talker, 5897) < 10 || gg.OwnItemCount(talker, 5896) < 20 || gg.OwnItemCount(talker, 5895 < 4) || gg.OwnItemCount(talker, 1831) < 2) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Bring Out the Flavor of the Ingredients! (In Progress)");

}
if (gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 1 && gg.OwnItemCount(talker, 5897) >= 10 && gg.OwnItemCount(talker, 5896) >= 20 && gg.OwnItemCount(talker, 5895) >= 4 && gg.OwnItemCount(talker, 1831) >= 2) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Bring Out the Flavor of the Ingredients! (In Progress)");

}
if (gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 2) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Bring Out the Flavor of the Ingredients! (In Progress)");

}
if (gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 3) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Bring Out the Flavor of the Ingredients! (In Progress)");

}
if (gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 4) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Bring Out the Flavor of the Ingredients! (In Progress)");

}
if (gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 5) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Bring Out the Flavor of the Ingredients! (In Progress)");

}
if (gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 6) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Bring Out the Flavor of the Ingredients! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1439) == 0 && gg.OwnItemCount(talker, 1441) == 0) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "rollant_q0330_01.htm");
myself.GiveItem1(talker, 1439, 1);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1439) == 1 && gg.OwnItemCount(talker, 1440) < 30) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rollant_q0330_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1439) == 1 && gg.OwnItemCount(talker, 1440) >= 30) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "rollant_q0330_03.htm");
myself.DeleteItem1(talker, 1439, 1);
myself.DeleteItem1(talker, 1440, gg.OwnItemCount(talker, 1440));
myself.GiveItem1(talker, 1441, 1);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5 && gg.OwnItemCount(talker, 1439) == 0 && gg.OwnItemCount(talker, 1441) == 1) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rollant_q0330_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 380) == 0) {
myself.SetCurrentQuestID(380);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 24) {
myself.ShowPage(talker, "rollant_q0380_01.htm");

} else if (talker.level >= 24) {
myself.ShowQuestPage(talker, "rollant_q0380_02.htm", 380);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 1 && gg.OwnItemCount(talker, 5897) < 10 || gg.OwnItemCount(talker, 5896) < 20 || gg.OwnItemCount(talker, 5895 < 4) || gg.OwnItemCount(talker, 1831) < 2) {
myself.SetCurrentQuestID(380);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rollant_q0380_06.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 1 && gg.OwnItemCount(talker, 5897) >= 10 && gg.OwnItemCount(talker, 5896) >= 20 && gg.OwnItemCount(talker, 5895) >= 4 && gg.OwnItemCount(talker, 1831) >= 2) {
myself.SetCurrentQuestID(380);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 5895, gg.OwnItemCount(talker, 5895));
myself.DeleteItem1(talker, 5896, gg.OwnItemCount(talker, 5896));
myself.DeleteItem1(talker, 5897, gg.OwnItemCount(talker, 5897));
myself.DeleteItem1(talker, 1831, 2);
myself.SetMemoState(talker, 380, 2);
myself.SetFlagJournal(talker, 380, 3);
myself.ShowQuestMark(talker, 380);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "rollant_q0380_07.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 2) {
myself.SetCurrentQuestID(380);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 380, 3);
myself.SetFlagJournal(talker, 380, 4);
myself.ShowQuestMark(talker, 380);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "rollant_q0380_08.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 3) {
myself.SetCurrentQuestID(380);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 380, 4);
myself.SetFlagJournal(talker, 380, 5);
myself.ShowQuestMark(talker, 380);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "rollant_q0380_09.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 4) {
myself.SetCurrentQuestID(380);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 380, 5);
myself.SetFlagJournal(talker, 380, 6);
myself.ShowQuestMark(talker, 380);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "rollant_q0380_10.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 5) {
myself.SetCurrentQuestID(380);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.Rand(100) < 56) {
myself.GiveItem1(talker, 5960, 1);
myself.SetMemoState(talker, 380, 6);
gg.AddLog(3, talker, 380);
myself.ShowPage(talker, "rollant_q0380_11.htm");

} else {
myself.GiveItem1(talker, 5960, 1);
myself.RemoveMemo(talker, 380);
gg.AddLog(2, talker, 380);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "rollant_q0380_14.htm");

}

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 6) {
myself.SetCurrentQuestID(380);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 5959, 1);
myself.RemoveMemo(talker, 380);
gg.AddLog(2, talker, 380);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "rollant_q0380_13.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 380) {
myself.SetCurrentQuestID(380);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 380);
myself.ShowQuestMark(talker, 380);
myself.SetMemoState(talker, 380, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "rollant_q0380_05.htm", 380);
myself.SetFlagJournal(talker, 380, 1);
gg.AddLog(1, talker, 380);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 380) {
myself.SetCurrentQuestID(380);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 380) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "rollant_q0380_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 380);
myself.ShowQuestFHTML(talker, fhtml0, 380);

}
if (reply == 2 && gg.HaveMemo(talker, 380) == 1 && gg.GetMemoState(talker, 380) == 6) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 5959, 1);
myself.RemoveMemo(talker, 380);
gg.AddLog(2, talker, 380);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "rollant_q0380_12.htm");

}

}

}
super;
	}


}