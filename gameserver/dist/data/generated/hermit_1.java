package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hermit_1 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 8) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 10) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 8) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 10) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 8) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Ghost Hunter (In Progress)");

}
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Ghost Hunter (In Progress)");

}
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Ghost Hunter (In Progress)");

}
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 10) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Ghost Hunter (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 8) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_1_q0079_0121.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_1_q0079_0124.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_1_q0079_0125.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 10) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_1_q0079_0126.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 8) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_1_q0080_0121.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_1_q0080_0124.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_1_q0080_0125.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 10) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_1_q0080_0126.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 8) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_1_q0081_0121.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_1_q0081_0124.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_1_q0081_0125.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 10) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_1_q0081_0126.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 79) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 79) {
if (reply == 5) {
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 8) {
myself.ShowPage(talker, "hermit_1_q0079_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 8) {
myself.SetMemoState(talker, 79, 9);
myself.ShowPage(talker, "hermit_1_q0079_0122.htm");
myself.SetFlagJournal(talker, 79, 11);
myself.ShowQuestMark(talker, 79);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 8) {
myself.SetMemoState(talker, 79, 9);
myself.ShowPage(talker, "hermit_1_q0079_0123.htm");
myself.SetFlagJournal(talker, 79, 12);
myself.ShowQuestMark(talker, 79);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7370, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 79, 10);
myself.ShowPage(talker, "hermit_1_q0079_0128.htm");
myself.SetFlagJournal(talker, 79, 13);
myself.ShowQuestMark(talker, 79);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 80) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 80) {
if (reply == 5) {
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 8) {
myself.ShowPage(talker, "hermit_1_q0080_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 8) {
myself.SetMemoState(talker, 80, 9);
myself.ShowPage(talker, "hermit_1_q0080_0122.htm");
myself.SetFlagJournal(talker, 80, 11);
myself.ShowQuestMark(talker, 80);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 8) {
myself.SetMemoState(talker, 80, 9);
myself.ShowPage(talker, "hermit_1_q0080_0123.htm");
myself.SetFlagJournal(talker, 80, 12);
myself.ShowQuestMark(talker, 80);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7371, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 80, 10);
myself.ShowPage(talker, "hermit_1_q0080_0128.htm");
myself.SetFlagJournal(talker, 80, 13);
myself.ShowQuestMark(talker, 80);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 81) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 81) {
if (reply == 5) {
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 8) {
myself.ShowPage(talker, "hermit_1_q0081_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 8) {
myself.SetMemoState(talker, 81, 9);
myself.ShowPage(talker, "hermit_1_q0081_0122.htm");
myself.SetFlagJournal(talker, 81, 11);
myself.ShowQuestMark(talker, 81);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 8) {
myself.SetMemoState(talker, 81, 9);
myself.ShowPage(talker, "hermit_1_q0081_0123.htm");
myself.SetFlagJournal(talker, 81, 12);
myself.ShowQuestMark(talker, 81);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7372, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 81, 10);
myself.ShowPage(talker, "hermit_1_q0081_0128.htm");
myself.SetFlagJournal(talker, 81, 13);
myself.ShowQuestMark(talker, 81);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}