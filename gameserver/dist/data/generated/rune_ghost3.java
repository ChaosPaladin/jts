package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rune_ghost3 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 7 && gg.OwnItemCount(talker, 7143) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 8) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 9) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 10 && gg.OwnItemCount(talker, 7144) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 11 && gg.OwnItemCount(talker, 7144) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 11 && gg.OwnItemCount(talker, 7145) >= 1 && gg.OwnItemCount(talker, 7146) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 11 && gg.OwnItemCount(talker, 7145) >= 1 && gg.OwnItemCount(talker, 7146) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 12 && gg.OwnItemCount(talker, 7147) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 7 && gg.OwnItemCount(talker, 7143) >= 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rune_ghost3_q0022_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 8) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rune_ghost3_q0022_03a.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 9) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rune_ghost3_q0022_10.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 10 && gg.OwnItemCount(talker, 7144) >= 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rune_ghost3_q0022_12.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 11 && gg.OwnItemCount(talker, 7144) >= 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rune_ghost3_q0022_14.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 11 && gg.OwnItemCount(talker, 7145) >= 1 && gg.OwnItemCount(talker, 7146) == 0) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rune_ghost3_q0022_15.htm");
myself.SetFlagJournal(talker, 22, 12);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 11 && gg.OwnItemCount(talker, 7145) >= 1 && gg.OwnItemCount(talker, 7146) >= 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7147, 1);
myself.DeleteItem1(talker, 7146, gg.OwnItemCount(talker, 7146));
myself.DeleteItem1(talker, 7145, gg.OwnItemCount(talker, 7145));
myself.SetMemoState(talker, 22, 12);
myself.ShowPage(talker, "rune_ghost3_q0022_16.htm");
myself.SetFlagJournal(talker, 22, 14);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 12 && gg.OwnItemCount(talker, 7147) >= 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rune_ghost3_q0022_17.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 22) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 22) {
if (reply == 11) {
myself.ShowPage(talker, "rune_ghost3_q0022_02.htm");

}
if (reply == 12) {
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 7 && gg.OwnItemCount(talker, 7143) >= 1) {
myself.DeleteItem1(talker, 7143, gg.OwnItemCount(talker, 7143));
myself.SetMemoState(talker, 22, 8);
myself.ShowPage(talker, "rune_ghost3_q0022_03.htm");

}

}
if (reply == 13) {
myself.ShowPage(talker, "rune_ghost3_q0022_04.htm");

}
if (reply == 14) {
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 8) {
myself.SetMemoState(talker, 22, 9);
myself.ShowPage(talker, "rune_ghost3_q0022_08.htm");

}

}
if (reply == 16) {
myself.ShowPage(talker, "rune_ghost3_q0022_09.htm");

}
if (reply == 15) {
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 9) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7144, 1);
myself.SetMemoState(talker, 22, 10);
myself.ShowPage(talker, "rune_ghost3_q0022_11.htm");
myself.SetFlagJournal(talker, 22, 10);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}