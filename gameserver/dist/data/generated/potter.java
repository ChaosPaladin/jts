package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class potter extends cleric_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 9) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 10) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 11) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 12 && gg.OwnItemCount(talker, 2730)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Pilgrim (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 9) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "potter_q0215_01.htm");
myself.GiveItem1(talker, 2728, 1);
myself.SetMemoState(talker, 215, 10);
myself.SetFlagJournal(talker, 215, 10);
myself.ShowQuestMark(talker, 215);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 10) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "potter_q0215_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 11) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "potter_q0215_03.htm");
myself.GiveItem1(talker, 2730, 1);
myself.DeleteItem1(talker, 2728, gg.OwnItemCount(talker, 2728));
myself.DeleteItem1(talker, 2729, gg.OwnItemCount(talker, 2729));
myself.SetMemoState(talker, 215, 12);
myself.SetFlagJournal(talker, 215, 12);
myself.ShowQuestMark(talker, 215);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 12 && gg.OwnItemCount(talker, 2730)) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "potter_q0215_04.htm");

}
break;

}

}
return;

}
super;
	}


}