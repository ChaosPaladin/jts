package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mist extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 2) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 4) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 2) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 3) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 4) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 2) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 3) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 4) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 2) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Mystic Muse (In Progress)");

}
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 3) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Mystic Muse (In Progress)");

}
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 4) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Mystic Muse (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 2) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 3) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 4) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 37) == 1 && gg.OwnItemCount(talker, 7160) >= 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Make Formal Wear (In Progress)");

}
if (gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Make Formal Wear (In Progress)");

}
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 2) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of the Doombringer (In Progress)");

}
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 3) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of the Doombringer (In Progress)");

}
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 4) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Saga of the Doombringer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 2) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mist_q0082_0111.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 3) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "mist_q0082_0113.htm");

} else {
myself.ShowPage(talker, "mist_q0082_0112.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 4) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mist_q0082_0114.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 2) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mist_q0083_0111.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 3) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "mist_q0083_0113.htm");

} else {
myself.ShowPage(talker, "mist_q0083_0112.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 4) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mist_q0083_0114.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 2) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mist_q0088_0111.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 3) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "mist_q0088_0113.htm");

} else {
myself.ShowPage(talker, "mist_q0088_0112.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 4) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mist_q0088_0114.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 2) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mist_q0089_0111.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 3) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "mist_q0089_0113.htm");

} else {
myself.ShowPage(talker, "mist_q0089_0112.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 4) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mist_q0089_0114.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 2) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mist_q0090_0111.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 3) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "mist_q0090_0113.htm");

} else {
myself.ShowPage(talker, "mist_q0090_0112.htm");

}

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 4) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mist_q0090_0114.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 37) == 1 && gg.OwnItemCount(talker, 7160) >= 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 3 * 10 + 1) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 37, 3);
myself.ShowPage(talker, "mist_q0037_0301.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 4 * 10 + 1) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mist_q0037_0403.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 2) {
myself.SetCurrentQuestID(67);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mist_q0067_0111.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 3) {
myself.SetCurrentQuestID(67);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "mist_q0067_0113.htm");

} else {
myself.ShowPage(talker, "mist_q0067_0112.htm");

}

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 4) {
myself.SetCurrentQuestID(67);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mist_q0067_0114.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 82) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 82) {
if (reply == 3) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 2) {
myself.SetMemoState(talker, 82, 3);
myself.ShowPage(talker, "mist_q0082_0115.htm");
myself.SetFlagJournal(talker, 82, 3);
myself.ShowQuestMark(talker, 82);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7519, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 82, 4);
myself.ShowPage(talker, "mist_q0082_0116.htm");
myself.SetFlagJournal(talker, 82, 4);
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
if (reply == 3) {
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 2) {
myself.SetMemoState(talker, 83, 3);
myself.ShowPage(talker, "mist_q0083_0115.htm");
myself.SetFlagJournal(talker, 83, 3);
myself.ShowQuestMark(talker, 83);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7520, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 83, 4);
myself.ShowPage(talker, "mist_q0083_0116.htm");
myself.SetFlagJournal(talker, 83, 4);
myself.ShowQuestMark(talker, 83);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 88) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 88) {
if (reply == 3) {
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 2) {
myself.SetMemoState(talker, 88, 3);
myself.ShowPage(talker, "mist_q0088_0115.htm");
myself.SetFlagJournal(talker, 88, 3);
myself.ShowQuestMark(talker, 88);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7529, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 88, 4);
myself.ShowPage(talker, "mist_q0088_0116.htm");
myself.SetFlagJournal(talker, 88, 4);
myself.ShowQuestMark(talker, 88);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 89) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 89) {
if (reply == 3) {
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 2) {
myself.SetMemoState(talker, 89, 3);
myself.ShowPage(talker, "mist_q0089_0115.htm");
myself.SetFlagJournal(talker, 89, 3);
myself.ShowQuestMark(talker, 89);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7530, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 89, 4);
myself.ShowPage(talker, "mist_q0089_0116.htm");
myself.SetFlagJournal(talker, 89, 4);
myself.ShowQuestMark(talker, 89);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 90) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 90) {
if (reply == 3) {
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 2) {
myself.SetMemoState(talker, 90, 3);
myself.ShowPage(talker, "mist_q0090_0115.htm");
myself.SetFlagJournal(talker, 90, 3);
myself.ShowQuestMark(talker, 90);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7531, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 90, 4);
myself.ShowPage(talker, "mist_q0090_0116.htm");
myself.SetFlagJournal(talker, 90, 4);
myself.ShowQuestMark(talker, 90);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 37) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 37) {
i0 = myself.GetHTMLCookie(talker, 37, 4 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0) {
if (gg.OwnItemCount(talker, 7160) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7160, 1);
myself.ShowPage(talker, "mist_q0037_0401.htm");
myself.SetMemoState(talker, 37, 4 * 10 + 1);
myself.SetFlagJournal(talker, 37, 4);
myself.ShowQuestMark(talker, 37);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "mist_q0037_0402.htm");

}

}

}

}
if (ask == 67) {
myself.SetCurrentQuestID(67);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 67) {
if (reply == 3) {
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 2) {
myself.SetMemoState(talker, 67, 3);
myself.ShowPage(talker, "mist_q0067_0115.htm");
myself.SetFlagJournal(talker, 67, 3);
myself.ShowQuestMark(talker, 67);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 9721, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 67, 4);
myself.ShowPage(talker, "mist_q0067_0116.htm");
myself.SetFlagJournal(talker, 67, 4);
myself.ShowQuestMark(talker, 67);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}