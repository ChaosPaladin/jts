package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dark_pilgrim1 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 8) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 10) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 8) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 10) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 8) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 10) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Ghost Sentinel (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 8) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim1_q0082_0121.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim1_q0082_0124.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim1_q0082_0125.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 10) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim1_q0082_0126.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 8) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim1_q0083_0121.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim1_q0083_0124.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim1_q0083_0125.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 10) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim1_q0083_0126.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 8) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim1_q0084_0121.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim1_q0084_0124.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim1_q0084_0125.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 10) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim1_q0084_0126.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 82) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 82) {
if (reply == 5) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 8) {
myself.ShowPage(talker, "dark_pilgrim1_q0082_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 8) {
myself.SetMemoState(talker, 82, 9);
myself.ShowPage(talker, "dark_pilgrim1_q0082_0122.htm");
myself.SetFlagJournal(talker, 82, 11);
myself.ShowQuestMark(talker, 82);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 8) {
myself.SetMemoState(talker, 82, 9);
myself.ShowPage(talker, "dark_pilgrim1_q0082_0123.htm");
myself.SetFlagJournal(talker, 82, 12);
myself.ShowQuestMark(talker, 82);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7373, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 82, 10);
myself.ShowPage(talker, "dark_pilgrim1_q0082_0128.htm");
myself.SetFlagJournal(talker, 82, 13);
myself.ShowQuestMark(talker, 82);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 83) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 83) {
if (reply == 5) {
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 8) {
myself.ShowPage(talker, "dark_pilgrim1_q0083_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 8) {
myself.SetMemoState(talker, 83, 9);
myself.ShowPage(talker, "dark_pilgrim1_q0083_0122.htm");
myself.SetFlagJournal(talker, 83, 11);
myself.ShowQuestMark(talker, 83);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 8) {
myself.SetMemoState(talker, 83, 9);
myself.ShowPage(talker, "dark_pilgrim1_q0083_0123.htm");
myself.SetFlagJournal(talker, 83, 12);
myself.ShowQuestMark(talker, 83);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7374, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 83, 10);
myself.ShowPage(talker, "dark_pilgrim1_q0083_0128.htm");
myself.SetFlagJournal(talker, 83, 13);
myself.ShowQuestMark(talker, 83);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 84) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 84) {
if (reply == 5) {
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 8) {
myself.ShowPage(talker, "dark_pilgrim1_q0084_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 8) {
myself.SetMemoState(talker, 84, 9);
myself.ShowPage(talker, "dark_pilgrim1_q0084_0122.htm");
myself.SetFlagJournal(talker, 84, 11);
myself.ShowQuestMark(talker, 84);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 8) {
myself.SetMemoState(talker, 84, 9);
myself.ShowPage(talker, "dark_pilgrim1_q0084_0123.htm");
myself.SetFlagJournal(talker, 84, 12);
myself.ShowQuestMark(talker, 84);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7375, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 84, 10);
myself.ShowPage(talker, "dark_pilgrim1_q0084_0128.htm");
myself.SetFlagJournal(talker, 84, 13);
myself.ShowQuestMark(talker, 84);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}