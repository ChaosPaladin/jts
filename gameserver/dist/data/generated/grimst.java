package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class grimst extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) >= 2 && gg.GetMemoState(talker, 82) <= 4 && gg.OwnItemCount(talker, 7519) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) >= 2 && gg.GetMemoState(talker, 82) <= 4 && gg.OwnItemCount(talker, 7519) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 5) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) >= 2 && gg.GetMemoState(talker, 83) <= 4 && gg.OwnItemCount(talker, 7520) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) >= 2 && gg.GetMemoState(talker, 83) <= 4 && gg.OwnItemCount(talker, 7520) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 5) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) >= 2 && gg.GetMemoState(talker, 84) <= 4 && gg.OwnItemCount(talker, 7521) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) >= 2 && gg.GetMemoState(talker, 84) <= 4 && gg.OwnItemCount(talker, 7521) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 5) {
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
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 1) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grimst_q0082_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) >= 2 && gg.GetMemoState(talker, 82) <= 4 && gg.OwnItemCount(talker, 7519) == 0) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grimst_q0082_0102.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) >= 2 && gg.GetMemoState(talker, 82) <= 4 && gg.OwnItemCount(talker, 7519) >= 1) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grimst_q0082_0103.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 5) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grimst_q0082_0104.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 1) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grimst_q0083_0101.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) >= 2 && gg.GetMemoState(talker, 83) <= 4 && gg.OwnItemCount(talker, 7520) == 0) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grimst_q0083_0102.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) >= 2 && gg.GetMemoState(talker, 83) <= 4 && gg.OwnItemCount(talker, 7520) >= 1) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grimst_q0083_0103.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 5) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grimst_q0083_0104.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 1) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grimst_q0084_0101.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) >= 2 && gg.GetMemoState(talker, 84) <= 4 && gg.OwnItemCount(talker, 7521) == 0) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grimst_q0084_0102.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) >= 2 && gg.GetMemoState(talker, 84) <= 4 && gg.OwnItemCount(talker, 7521) >= 1) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grimst_q0084_0103.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 5) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grimst_q0084_0104.htm");

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
if (reply == 1) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 1) {
myself.SetMemoState(talker, 82, 2);
myself.ShowPage(talker, "grimst_q0082_0105.htm");
myself.SetFlagJournal(talker, 82, 2);
myself.ShowQuestMark(talker, 82);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) >= 2 && gg.GetMemoState(talker, 82) <= 4 && gg.OwnItemCount(talker, 7519) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7280, 1);
myself.DeleteItem1(talker, 7519, gg.OwnItemCount(talker, 7519));
myself.SetMemoState(talker, 82, 5);
myself.ShowPage(talker, "grimst_q0082_0106.htm");
myself.SetFlagJournal(talker, 82, 5);
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
if (reply == 1) {
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 1) {
myself.SetMemoState(talker, 83, 2);
myself.ShowPage(talker, "grimst_q0083_0105.htm");
myself.SetFlagJournal(talker, 83, 2);
myself.ShowQuestMark(talker, 83);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) >= 2 && gg.GetMemoState(talker, 83) <= 4 && gg.OwnItemCount(talker, 7520) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7281, 1);
myself.DeleteItem1(talker, 7520, gg.OwnItemCount(talker, 7520));
myself.SetMemoState(talker, 83, 5);
myself.ShowPage(talker, "grimst_q0083_0106.htm");
myself.SetFlagJournal(talker, 83, 5);
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
if (reply == 1) {
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 1) {
myself.SetMemoState(talker, 84, 2);
myself.ShowPage(talker, "grimst_q0084_0105.htm");
myself.SetFlagJournal(talker, 84, 2);
myself.ShowQuestMark(talker, 84);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) >= 2 && gg.GetMemoState(talker, 84) <= 4 && gg.OwnItemCount(talker, 7521) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7282, 1);
myself.DeleteItem1(talker, 7521, gg.OwnItemCount(talker, 7521));
myself.SetMemoState(talker, 84, 5);
myself.ShowPage(talker, "grimst_q0084_0106.htm");
myself.SetFlagJournal(talker, 84, 5);
myself.ShowQuestMark(talker, 84);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}