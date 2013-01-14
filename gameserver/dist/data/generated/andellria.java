package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class andellria extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 161) == 0 && myself.GetOneTimeQuestFlag(talker, 161) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Fruit of the Mother Tree");

}
if (gg.HaveMemo(talker, 161) == 0 && myself.GetOneTimeQuestFlag(talker, 161) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Fruit of the Mother Tree (Done)");

}
if (gg.HaveMemo(talker, 161)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Fruit of the Mother Tree (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 12) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 13) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 14) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 15 && gg.OwnItemCount(talker, 2731)) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 16) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 15 && gg.OwnItemCount(talker, 2731) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Trial of the Pilgrim (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 161) == 0 && myself.GetOneTimeQuestFlag(talker, 161) == 0) {
myself.SetCurrentQuestID(161);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 1) {
myself.ShowQuestPage(talker, "andellria_q0312_00.htm", 161);

} else if (talker.level >= 3) {
myself.FHTML_SetFileName(fhtml0, "andellria_q0312_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 161);
myself.ShowQuestFHTML(talker, fhtml0, 161);

} else {
myself.ShowQuestPage(talker, "andellria_q0312_02.htm", 161);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 161) == 0 && myself.GetOneTimeQuestFlag(talker, 161) == 1) {
myself.SetCurrentQuestID(161);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 161)) {
myself.SetCurrentQuestID(161);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1036) == 1 && gg.OwnItemCount(talker, 1037) == 0) {
myself.ShowPage(talker, "andellria_q0312_05.htm");

} else if (gg.OwnItemCount(talker, 1037) == 1 && myself.GetOneTimeQuestFlag(talker, 161) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "andellria_q0312_06.htm");
myself.GiveItem1(talker, 57, 1000);
myself.IncrementParam(talker, 0, 1000);
myself.DeleteItem1(talker, 1037, 1);
myself.RemoveMemo(talker, 161);
gg.AddLog(2, talker, 161);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 161, 1);

}

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 12) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 0) {
myself.ShowPage(talker, "andellria_q0215_01.htm");
myself.SetMemoState(talker, 215, 13);
myself.SetFlagJournal(talker, 215, 13);
myself.ShowQuestMark(talker, 215);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowPage(talker, "andellria_q0215_01a.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 13) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "andellria_q0215_02.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 14) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "andellria_q0215_02a.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 15 && gg.OwnItemCount(talker, 2731)) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "andellria_q0215_03.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 16) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "andellria_q0215_06.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 15 && gg.OwnItemCount(talker, 2731) == 0) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "andellria_q0215_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 161) {
myself.SetCurrentQuestID(161);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "andellria_q0312_04.htm", 161);
myself.GiveItem1(talker, 1036, 1);
myself.SetMemo(talker, 161);
myself.ShowQuestMark(talker, 161);
gg.AddLog(1, talker, 161);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 161, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 215) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 215) {
if (reply == 1 && gg.GetMemoState(talker, 215) == 15 && gg.OwnItemCount(talker, 2731) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "andellria_q0215_05.htm");
myself.DeleteItem1(talker, 2731, gg.OwnItemCount(talker, 2731));
myself.SetMemoState(talker, 215, 16);
myself.SetFlagJournal(talker, 215, 16);
myself.ShowQuestMark(talker, 215);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 2 && gg.GetMemoState(talker, 215) == 15 && gg.OwnItemCount(talker, 2731) > 0) {
myself.ShowPage(talker, "andellria_q0215_04.htm");
myself.SetMemoState(talker, 215, 16);
myself.SetFlagJournal(talker, 215, 16);
myself.ShowQuestMark(talker, 215);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
super;
	}


}