package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sir_kiel_nighthawk extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 4) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 5 && gg.OwnItemCount(talker, 2639) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 5 && gg.OwnItemCount(talker, 2639)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 6) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 7 && gg.OwnItemCount(talker, 2637)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 8) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of Duty (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 4) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_kiel_nighthawk_q0212_01.htm");
myself.SetMemoState(talker, 212, 5);
myself.SetFlagJournal(talker, 212, 5);
myself.ShowQuestMark(talker, 212);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 5 && gg.OwnItemCount(talker, 2639) == 0) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_kiel_nighthawk_q0212_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 5 && gg.OwnItemCount(talker, 2639)) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sir_kiel_nighthawk_q0212_03.htm");
myself.SetMemoState(talker, 212, 6);
myself.SetFlagJournal(talker, 212, 7);
myself.ShowQuestMark(talker, 212);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 2636, 1);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 6) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_kiel_nighthawk_q0212_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 7 && gg.OwnItemCount(talker, 2637)) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_kiel_nighthawk_q0212_05.htm");
myself.DeleteItem1(talker, 2637, 1);
myself.SetMemoState(talker, 212, 8);
myself.SetFlagJournal(talker, 212, 10);
myself.ShowQuestMark(talker, 212);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 8) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_kiel_nighthawk_q0212_06.htm");

}
break;

}

}
return;

}
super;
	}


}