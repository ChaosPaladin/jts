package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wanderer_dorf extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 6 && gg.OwnItemCount(talker, 2733)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 7 && gg.OwnItemCount(talker, 2733)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 8) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Pilgrim (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 6 && gg.OwnItemCount(talker, 2733)) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "wanderer_dorf_q0215_01.htm");
myself.GiveItem1(talker, 2727, 1);
myself.DeleteItem1(talker, 2733, 1);
myself.SetMemoState(talker, 215, 8);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 7 && gg.OwnItemCount(talker, 2733)) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "wanderer_dorf_q0215_02.htm");
myself.GiveItem1(talker, 2727, 1);
myself.DeleteItem1(talker, 2733, 1);
myself.SetMemoState(talker, 215, 8);

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 8) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wanderer_dorf_q0215_03.htm");
myself.SetFlagJournal(talker, 215, 8);
myself.ShowQuestMark(talker, 215);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}

}
return;

}
super;
	}


}