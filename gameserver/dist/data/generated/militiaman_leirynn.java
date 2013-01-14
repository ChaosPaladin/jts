package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class militiaman_leirynn extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2785) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2786) == 1 && gg.OwnItemCount(talker, 2787) < 10) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2786) == 1 && gg.OwnItemCount(talker, 2787) >= 10) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2788) == 1 && gg.OwnItemCount(talker, 2789) < 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2788) == 1 && gg.OwnItemCount(talker, 2789) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2790) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2808) == 1 || gg.OwnItemCount(talker, 2794) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of the Searcher (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2785) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "militiaman_leirynn_q0225_01.htm");
myself.DeleteItem1(talker, 2785, 1);
myself.GiveItem1(talker, 2786, 1);
myself.SetFlagJournal(talker, 225, 3);
myself.ShowQuestMark(talker, 225);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2786) == 1 && gg.OwnItemCount(talker, 2787) < 10) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "militiaman_leirynn_q0225_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2786) == 1 && gg.OwnItemCount(talker, 2787) >= 10) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "militiaman_leirynn_q0225_03.htm");
myself.DeleteItem1(talker, 2787, gg.OwnItemCount(talker, 2787));
myself.DeleteItem1(talker, 2786, gg.OwnItemCount(talker, 2786));
myself.GiveItem1(talker, 2788, 1);
myself.SetFlagJournal(talker, 225, 5);
myself.ShowQuestMark(talker, 225);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2788) == 1 && gg.OwnItemCount(talker, 2789) < 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "militiaman_leirynn_q0225_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2788) == 1 && gg.OwnItemCount(talker, 2789) >= 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "militiaman_leirynn_q0225_05.htm");
myself.DeleteItem1(talker, 2789, 1);
myself.GiveItem1(talker, 2790, 1);
myself.DeleteItem1(talker, 2788, gg.OwnItemCount(talker, 2788));
myself.SetFlagJournal(talker, 225, 7);
myself.ShowQuestMark(talker, 225);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2790) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "militiaman_leirynn_q0225_06.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2808) == 1 || gg.OwnItemCount(talker, 2794) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "militiaman_leirynn_q0225_07.htm");

}
break;

}

}
return;

}
super;
	}


}