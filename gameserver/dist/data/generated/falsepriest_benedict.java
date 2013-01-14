package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class falsepriest_benedict extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 7 && gg.OwnItemCount(talker, 7140) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 8 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 1 || gg.GetMemoStateEx(talker, 21, 1) == 4) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 8 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 2) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 9 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 5) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 9 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) != 5) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 10 && gg.OwnItemCount(talker, 7140) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 0 && myself.GetOneTimeQuestFlag(talker, 25) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 1 && talker.level >= 66) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Hiding Behind the Truth");

}
if (gg.HaveMemo(talker, 25) == 0 && myself.GetOneTimeQuestFlag(talker, 25) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 0 || talker.level < 66) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Hiding Behind the Truth");

}
if (gg.HaveMemo(talker, 25) == 0 && myself.GetOneTimeQuestFlag(talker, 25) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Hiding Behind the Truth (Done)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 2) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Hiding Behind the Truth (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 7 && gg.OwnItemCount(talker, 7140) >= 1) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 21, gg.GetMemoState(talker, 21) + 1);
myself.SetMemoStateEx(talker, 21, 1, gg.GetMemoStateEx(talker, 21, 1) + 2);
myself.ShowPage(talker, "falsepriest_benedict_q0021_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 8 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 1 || gg.GetMemoStateEx(talker, 21, 1) == 4) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 21, gg.GetMemoState(talker, 21) + 1);
myself.SetMemoStateEx(talker, 21, 1, gg.GetMemoStateEx(talker, 21, 1) + 2);
myself.ShowPage(talker, "falsepriest_benedict_q0021_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 8 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 2) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_benedict_q0021_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 9 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 5) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 21, 10);
myself.ShowPage(talker, "falsepriest_benedict_q0021_03.htm");
myself.SetFlagJournal(talker, 21, 7);
myself.ShowQuestMark(talker, 21);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 9 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) != 5) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_benedict_q0021_02.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 10 && gg.OwnItemCount(talker, 7140) >= 1) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_benedict_q0021_03.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 0 && myself.GetOneTimeQuestFlag(talker, 25) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 1 && talker.level >= 66) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "falsepriest_benedict_q0025_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 25);
myself.ShowQuestFHTML(talker, fhtml0, 25);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 0 && myself.GetOneTimeQuestFlag(talker, 25) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 0 || talker.level < 66) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_benedict_q0025_02.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 0 && myself.GetOneTimeQuestFlag(talker, 25) == 1) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 1) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_benedict_q0025_03a.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 2) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_benedict_q0025_11.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 25) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 25) == 0 && myself.GetOneTimeQuestFlag(talker, 25) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 1 && talker.level >= 66) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 25);
myself.SetMemoState(talker, 25, 1);
gg.AddLog(1, talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "falsepriest_benedict_q0025_03.htm", 25);
myself.SetFlagJournal(talker, 25, 1);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 25) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 25) {
if (reply == 1) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 1 && gg.OwnItemCount(talker, 7156) >= 1) {
myself.ShowPage(talker, "falsepriest_benedict_q0025_04.htm");

} else if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 1 && gg.OwnItemCount(talker, 7156) == 0) {
myself.ShowPage(talker, "falsepriest_benedict_q0025_05.htm");
myself.SetFlagJournal(talker, 25, 2);
myself.ShowQuestMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 25) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 25) {
if (reply == 2) {
myself.ShowPage(talker, "falsepriest_benedict_q0025_06.htm");

}
if (reply == 3) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 1 && gg.OwnItemCount(talker, 7156) >= 1) {
myself.SetMemoState(talker, 25, 2);
myself.ShowPage(talker, "falsepriest_benedict_q0025_10.htm");
myself.SetFlagJournal(talker, 25, 4);
myself.ShowQuestMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}