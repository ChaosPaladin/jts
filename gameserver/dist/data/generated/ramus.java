package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ramus extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 15 && gg.OwnItemCount(talker, 5568) > 0 && gg.OwnItemCount(talker, 2829) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Reformer (In Progress)");

}
if (gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 16) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Reformer (In Progress)");

}
if (gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 17) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Reformer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 15 && gg.OwnItemCount(talker, 5568) > 0 && gg.OwnItemCount(talker, 2829) == 0) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "ramus_q0227_01.htm");
myself.SetMemoState(talker, 227, 16);
myself.GiveItem1(talker, 2829, 1);
myself.DeleteItem1(talker, 5568, gg.OwnItemCount(talker, 5568));
myself.SetFlagJournal(talker, 227, 18);
myself.ShowQuestMark(talker, 227);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 16) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ramus_q0227_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 17) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2829) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "ramus_q0227_03.htm");
myself.SetMemoState(talker, 227, 18);
myself.DeleteItem1(talker, 2834, gg.OwnItemCount(talker, 2834));
myself.DeleteItem1(talker, 2835, gg.OwnItemCount(talker, 2835));
myself.DeleteItem1(talker, 2836, gg.OwnItemCount(talker, 2836));
myself.DeleteItem1(talker, 2837, gg.OwnItemCount(talker, 2837));
myself.DeleteItem1(talker, 2838, gg.OwnItemCount(talker, 2838));
myself.GiveItem1(talker, 2830, 1);
myself.DeleteItem1(talker, 2829, gg.OwnItemCount(talker, 2829));
myself.SetFlagJournal(talker, 227, 20);
myself.ShowQuestMark(talker, 227);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}

}
return;

}
super;
	}


}