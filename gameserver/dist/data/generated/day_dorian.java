package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class day_dorian extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 24) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Inhabitants of the Forest of the Dead");

}
if (gg.HaveMemo(talker, 24) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Inhabitants of the Forest of the Dead (Done)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 2) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 3) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 4 && gg.OwnItemCount(talker, 7153) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 4 && gg.OwnItemCount(talker, 7154) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 5) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 7 && gg.OwnItemCount(talker, 7148) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 7 && gg.OwnItemCount(talker, 7148) >= 1 || gg.GetMemoState(talker, 24) == 6) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 0) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "day_dorian_q0024_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 24);
myself.ShowQuestFHTML(talker, fhtml0, 24);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 1) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 1) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "day_dorian_q0024_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 2) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "day_dorian_q0024_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 3) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "day_dorian_q0024_09.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 4 && gg.OwnItemCount(talker, 7153) >= 1) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "day_dorian_q0024_14.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 4 && gg.OwnItemCount(talker, 7154) >= 1) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "day_dorian_q0024_15.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 5) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "day_dorian_q0024_20.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 7 && gg.OwnItemCount(talker, 7148) == 0) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7148, 1);
myself.ShowPage(talker, "day_dorian_q0024_21.htm");
myself.SetFlagJournal(talker, 24, 8);
myself.ShowQuestMark(talker, 24);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 7 && gg.OwnItemCount(talker, 7148) >= 1 || gg.GetMemoState(talker, 24) == 6) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "day_dorian_q0024_22.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 24) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 24) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 0 && myself.GetOneTimeQuestFlag(talker, 23) == 0 || talker.level < 65) {
myself.ShowQuestPage(talker, "day_dorian_q0024_02.htm", 24);

} else if (gg.HaveMemo(talker, 24) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 0 && myself.GetOneTimeQuestFlag(talker, 23) == 1 && talker.level >= 65) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7152, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 24);
myself.SetMemoState(talker, 24, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "day_dorian_q0024_03.htm", 24);
myself.SetFlagJournal(talker, 24, 1);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 24) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 24) {
if (reply == 1) {
myself.SetMemoState(talker, 24, 3);
myself.ShowPage(talker, "day_dorian_q0024_08.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "day_dorian_q0024_12.htm");

}
if (reply == 3) {
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7153, 1);
myself.SetMemoState(talker, 24, 4);
myself.ShowPage(talker, "day_dorian_q0024_13.htm");
myself.SetFlagJournal(talker, 24, 3);
myself.ShowQuestMark(talker, 24);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 24) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 24) {
if (reply == 4) {
myself.ShowPage(talker, "day_dorian_q0024_17.htm");

}
if (reply == 5) {
myself.ShowPage(talker, "day_dorian_q0024_18.htm");
myself.SoundEffect(talker, "InterfaceSound.charstat_open_01");

}
if (reply == 6) {
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 4 && gg.OwnItemCount(talker, 7154) >= 1) {
myself.DeleteItem1(talker, 7154, gg.OwnItemCount(talker, 7154));
myself.SetMemoState(talker, 24, 5);
myself.ShowPage(talker, "day_dorian_q0024_19.htm");
myself.SetFlagJournal(talker, 24, 5);
myself.ShowQuestMark(talker, 24);

}

}

}
super;
	}


}