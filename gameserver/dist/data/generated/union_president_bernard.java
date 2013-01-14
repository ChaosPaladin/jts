package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class union_president_bernard extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 224) == 0 && myself.GetOneTimeQuestFlag(talker, 224) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of Sagittarius");

}
if (gg.HaveMemo(talker, 224) == 0 && myself.GetOneTimeQuestFlag(talker, 224) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of Sagittarius (Done)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.OwnItemCount(talker, 3294)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of Sagittarius (In Progress)");

}
if (gg.GetMemoState(talker, 336) == 1 && gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3811) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Coins of Magic (In Progress)");

}
if (gg.GetMemoState(talker, 336) >= 3 && gg.HaveMemo(talker, 336) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Coins of Magic (In Progress)");

}
if (gg.GetMemoState(talker, 336) == 2 && gg.HaveMemo(talker, 336) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 0 && myself.GetOneTimeQuestFlag(talker, 82) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Sagittarius");

}
if (gg.HaveMemo(talker, 82) == 0 && myself.GetOneTimeQuestFlag(talker, 82) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Sagittarius (Done)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 15) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 16) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 0 && myself.GetOneTimeQuestFlag(talker, 83) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Moonlight Sentinel");

}
if (gg.HaveMemo(talker, 83) == 0 && myself.GetOneTimeQuestFlag(talker, 83) == 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Moonlight Sentinel (Done)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 15) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 16) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 0 && myself.GetOneTimeQuestFlag(talker, 84) == 0) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Saga of the Ghost Sentinel");

}
if (gg.HaveMemo(talker, 84) == 0 && myself.GetOneTimeQuestFlag(talker, 84) == 1) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of the Ghost Sentinel (Done)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 1) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 15) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 16) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Saga of the Ghost Sentinel (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 0 && myself.GetOneTimeQuestFlag(talker, 224) == 0) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.occupation == 7 || talker.occupation == 22 || talker.occupation == 35 && talker.level >= 39) {
myself.FHTML_SetFileName(fhtml0, "union_president_bernard_q0224_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 224);
myself.ShowQuestFHTML(talker, fhtml0, 224);

} else if (talker.occupation == 7 || talker.occupation == 22 || talker.occupation == 35) {
myself.ShowPage(talker, "union_president_bernard_q0224_01.htm");

} else {
myself.ShowPage(talker, "union_president_bernard_q0224_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 0 && myself.GetOneTimeQuestFlag(talker, 224) == 1) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.OwnItemCount(talker, 3294)) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "union_president_bernard_q0224_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.GetMemoState(talker, 336) == 1 && gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3811) == 1) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "union_president_bernard_q0336_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.GetMemoState(talker, 336) >= 3 && gg.HaveMemo(talker, 336) == 1) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "union_president_bernard_q0336_05.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.GetMemoState(talker, 336) == 2 && gg.HaveMemo(talker, 336) == 1) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "union_president_bernard_q0336_02a.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 0 && myself.GetOneTimeQuestFlag(talker, 82) == 0) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 9) {
myself.ShowQuestPage(talker, "union_president_bernard_q0082_0101.htm", 82);

} else {
myself.ShowQuestPage(talker, "union_president_bernard_q0082_0102.htm", 82);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 0 && myself.GetOneTimeQuestFlag(talker, 82) == 1) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 1) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "union_president_bernard_q0082_0104.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 15) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "union_president_bernard_q0082_0106.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 16) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 92);
myself.SetOneTimeQuestFlag(talker, 82, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 82);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "union_president_bernard_q0082_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "union_president_bernard_q0082_0110.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 0 && myself.GetOneTimeQuestFlag(talker, 83) == 0) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 24) {
myself.ShowQuestPage(talker, "union_president_bernard_q0083_0101.htm", 83);

} else {
myself.ShowQuestPage(talker, "union_president_bernard_q0083_0102.htm", 83);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 0 && myself.GetOneTimeQuestFlag(talker, 83) == 1) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 1) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "union_president_bernard_q0083_0104.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 15) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "union_president_bernard_q0083_0106.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 16) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 102);
myself.SetOneTimeQuestFlag(talker, 83, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 83);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "union_president_bernard_q0083_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "union_president_bernard_q0083_0110.htm");

}

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 0 && myself.GetOneTimeQuestFlag(talker, 84) == 0) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 37) {
myself.ShowQuestPage(talker, "union_president_bernard_q0084_0101.htm", 84);

} else {
myself.ShowQuestPage(talker, "union_president_bernard_q0084_0102.htm", 84);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 0 && myself.GetOneTimeQuestFlag(talker, 84) == 1) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 1) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "union_president_bernard_q0084_0104.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 15) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "union_president_bernard_q0084_0106.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 16) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 109);
myself.SetOneTimeQuestFlag(talker, 84, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 84);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "union_president_bernard_q0084_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "union_president_bernard_q0084_0110.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 224) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 224) == 0 && myself.GetOneTimeQuestFlag(talker, 224) == 0 && myself.GetMemoCount(talker) < 41 && talker.occupation == 7 || talker.occupation == 22 || talker.occupation == 35 && talker.level >= 39) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 224);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 224, 1);
myself.ShowQuestMark(talker, 224);
myself.SoundEffect(talker, "ItemSound.quest_middle");
gg.AddLog(1, talker, 224);
myself.GiveItem1(talker, 3294, 1);
myself.SetMemoState(talker, 224, 1);
talker.flag = 0;
if (myself.GetOneTimeQuestFlag(talker, 56) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 64);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 92);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 82);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 23);

}
myself.SetOneTimeQuestFlag(talker, 56, 1);
myself.ShowQuestPage(talker, "union_president_bernard_q0224_04a.htm", 224);

} else {
myself.ShowQuestPage(talker, "union_president_bernard_q0224_04.htm", 224);

}

}

}
return;

}
if (quest_id == 82) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 82) == 0 && myself.GetOneTimeQuestFlag(talker, 82) == 0 && talker.level >= 76 && talker.occupation == 9) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7105, 1);
myself.SetMemo(talker, 82);
myself.ShowQuestMark(talker, 82);
myself.SetMemoState(talker, 82, 1);
myself.SetFlagJournal(talker, 82, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "union_president_bernard_q0082_0103.htm", 82);
gg.AddLog(1, talker, 82);

}

}
return;

}
if (quest_id == 83) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 83) == 0 && myself.GetOneTimeQuestFlag(talker, 83) == 0 && talker.level >= 76 && talker.occupation == 24) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7106, 1);
myself.SetMemo(talker, 83);
myself.ShowQuestMark(talker, 83);
myself.SetMemoState(talker, 83, 1);
myself.SetFlagJournal(talker, 83, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "union_president_bernard_q0083_0103.htm", 83);
gg.AddLog(1, talker, 83);

}

}
return;

}
if (quest_id == 84) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 84) == 0 && myself.GetOneTimeQuestFlag(talker, 84) == 0 && talker.level >= 76 && talker.occupation == 37) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7107, 1);
myself.SetMemo(talker, 84);
myself.ShowQuestMark(talker, 84);
myself.SetMemoState(talker, 84, 1);
myself.SetFlagJournal(talker, 84, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "union_president_bernard_q0084_0103.htm", 84);
gg.AddLog(1, talker, 84);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 336) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 336) {
if (reply == 1) {
myself.ShowPage(talker, "union_president_bernard_q0336_02.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "union_president_bernard_q0336_03.htm");
myself.SetMemoState(talker, 336, 2);
myself.SetFlagJournal(talker, 336, 2);
myself.ShowQuestMark(talker, 336);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (reply == 3) {
myself.ShowPage(talker, "union_president_bernard_q0336_04.htm");
myself.SetMemoState(talker, 336, 2);
myself.SetFlagJournal(talker, 336, 2);
myself.ShowQuestMark(talker, 336);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (reply == 4) {
myself.ShowPage(talker, "union_president_bernard_q0336_06.htm");
myself.SetFlagJournal(talker, 336, 7);
myself.ShowQuestMark(talker, 336);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 82) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 82) {
if (reply == 1) {
if (gg.HaveMemo(talker, 82) == 0 && talker.occupation == 9 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 82) == 0) {
myself.FHTML_SetFileName(fhtml0, "union_president_bernard_q0082_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 82);
myself.ShowQuestFHTML(talker, fhtml0, 82);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7105, gg.OwnItemCount(talker, 7105));
myself.ClassChange(talker, 92);
myself.SetOneTimeQuestFlag(talker, 82, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 82);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "union_president_bernard_q0082_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 82, 16);
myself.SetFlagJournal(talker, 82, 20);
myself.ShowQuestMark(talker, 82);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7105, gg.OwnItemCount(talker, 7105));
myself.ShowPage(talker, "union_president_bernard_q0082_0108.htm");

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
if (gg.HaveMemo(talker, 83) == 0 && talker.occupation == 24 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 83) == 0) {
myself.FHTML_SetFileName(fhtml0, "union_president_bernard_q0083_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 83);
myself.ShowQuestFHTML(talker, fhtml0, 83);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7106, gg.OwnItemCount(talker, 7106));
myself.ClassChange(talker, 102);
myself.SetOneTimeQuestFlag(talker, 83, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 83);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "union_president_bernard_q0083_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 83, 16);
myself.SetFlagJournal(talker, 83, 20);
myself.ShowQuestMark(talker, 83);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7106, gg.OwnItemCount(talker, 7106));
myself.ShowPage(talker, "union_president_bernard_q0083_0108.htm");

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
if (gg.HaveMemo(talker, 84) == 0 && talker.occupation == 37 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 84) == 0) {
myself.FHTML_SetFileName(fhtml0, "union_president_bernard_q0084_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 84);
myself.ShowQuestFHTML(talker, fhtml0, 84);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7107, gg.OwnItemCount(talker, 7107));
myself.ClassChange(talker, 109);
myself.SetOneTimeQuestFlag(talker, 84, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 84);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "union_president_bernard_q0084_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 84, 16);
myself.SetFlagJournal(talker, 84, 20);
myself.ShowQuestMark(talker, 84);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7107, gg.OwnItemCount(talker, 7107));
myself.ShowPage(talker, "union_president_bernard_q0084_0108.htm");

}

}

}

}
super;
	}


}