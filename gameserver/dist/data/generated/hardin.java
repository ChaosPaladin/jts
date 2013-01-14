package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hardin extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 94) == 0 && myself.GetOneTimeQuestFlag(talker, 94) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Soultaker");

}
if (gg.HaveMemo(talker, 94) == 0 && myself.GetOneTimeQuestFlag(talker, 94) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Soultaker (Done)");

}
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Soultaker (In Progress)");

}
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 15) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Soultaker (In Progress)");

}
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 16) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Soultaker (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 0 && talker.level >= 50 && myself.GetOneTimeQuestFlag(talker, 136) <= 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "More Than Meets the Eye");

}
if (gg.HaveMemo(talker, 136) == 0 && talker.level < 50 && myself.GetOneTimeQuestFlag(talker, 136) <= 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "More Than Meets the Eye");

}
if (gg.HaveMemo(talker, 136) == 0 && myself.GetOneTimeQuestFlag(talker, 136) > 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "More Than Meets the Eye (Done)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) >= 2 && gg.GetMemoState(talker, 136) <= 4) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 5) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 6) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 7) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) >= 8 && gg.GetMemoState(talker, 136) <= 10) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 11) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 12) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 13) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoStateEx(talker, 348, 0) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 4 < 2) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoStateEx(talker, 348, 0) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 4 >= 2) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "An Arrogant Search (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 0 && myself.GetOneTimeQuestFlag(talker, 94) == 0) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 13) {
myself.ShowQuestPage(talker, "hardin_q0094_0101.htm", 94);

} else {
myself.ShowQuestPage(talker, "hardin_q0094_0102.htm", 94);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 0 && myself.GetOneTimeQuestFlag(talker, 94) == 1) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 1) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hardin_q0094_0104.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 15) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hardin_q0094_0106.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 16) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 95);
myself.SetOneTimeQuestFlag(talker, 94, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 94);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "hardin_q0094_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "hardin_q0094_0110.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 0 && talker.level >= 50 && myself.GetOneTimeQuestFlag(talker, 136) <= 0) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "hardin_q0136_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 136);
myself.ShowQuestFHTML(talker, fhtml0, 136);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 0 && talker.level < 50 && myself.GetOneTimeQuestFlag(talker, 136) <= 0) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "hardin_q0136_02.htm", 136);

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 0 && myself.GetOneTimeQuestFlag(talker, 136) > 0) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 1) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hardin_q0136_05.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) >= 2 && gg.GetMemoState(talker, 136) <= 4) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hardin_q0136_09.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 5) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 9786) >= 1) {
myself.DeleteItem1(talker, 9786, gg.OwnItemCount(talker, 9786));
myself.SetMemoState(talker, 136, 6);
myself.ShowPage(talker, "hardin_q0136_10.htm");

} else {
myself.ShowPage(talker, "hardin_q0136_09.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 6) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hardin_q0136_11.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 7) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hardin_q0136_14.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) >= 8 && gg.GetMemoState(talker, 136) <= 10) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hardin_q0136_17.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 11) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 9790, gg.OwnItemCount(talker, 9790));
myself.SetMemoState(talker, 136, 12);
myself.ShowPage(talker, "hardin_q0136_18.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 12) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 136, 13);
myself.ShowPage(talker, "hardin_q0136_20.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 13) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hardin_q0136_22.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoStateEx(talker, 348, 0) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 4 < 2) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 4295) >= 1) {
myself.DeleteItem1(talker, 4295, 1);
i0 = gg.GetMemoStateEx(talker, 348, 1) + 2;
myself.SetMemoStateEx(talker, 348, 1, i0);
myself.ShowPage(talker, "hardin_q0348_01.htm");

} else if (gg.OwnItemCount(talker, 4295) < 3) {
myself.ShowPage(talker, "hardin_q0348_03.htm");

}

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoStateEx(talker, 348, 0) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 4 >= 2) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hardin_q0348_02.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 94) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 94) == 0 && myself.GetOneTimeQuestFlag(talker, 94) == 0 && talker.level >= 76 && talker.occupation == 13) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7085, 1);
myself.SetMemo(talker, 94);
myself.ShowQuestMark(talker, 94);
myself.SetMemoState(talker, 94, 1);
myself.SetFlagJournal(talker, 94, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "hardin_q0094_0103.htm", 94);
gg.AddLog(1, talker, 94);

}

}
return;

}
if (quest_id == 136) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 136) == 0 && talker.level >= 50 && myself.GetOneTimeQuestFlag(talker, 136) <= 0) {
myself.SetMemoState(talker, 136, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "hardin_q0136_04.htm", 136);
myself.SetFlagJournal(talker, 136, 1);
myself.ShowQuestMark(talker, 136);

}
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 94) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 94) {
if (reply == 1) {
if (gg.HaveMemo(talker, 94) == 0 && talker.occupation == 13 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 94) == 0) {
myself.FHTML_SetFileName(fhtml0, "hardin_q0094_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 94);
myself.ShowQuestFHTML(talker, fhtml0, 94);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7085, gg.OwnItemCount(talker, 7085));
myself.ClassChange(talker, 95);
myself.SetOneTimeQuestFlag(talker, 94, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 94);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "hardin_q0094_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 94, 16);
myself.SetFlagJournal(talker, 94, 20);
myself.ShowQuestMark(talker, 94);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7085, gg.OwnItemCount(talker, 7085));
myself.ShowPage(talker, "hardin_q0094_0108.htm");

}

}

}

}
if (ask == 136) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 136) {
if (reply == 1) {
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 1) {
myself.ShowPage(talker, "hardin_q0136_06.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 1) {
myself.ShowPage(talker, "hardin_q0136_07.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 1) {
myself.SetMemoState(talker, 136, 2);
myself.ShowPage(talker, "hardin_q0136_08.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 136, 2);
myself.ShowQuestMark(talker, 136);

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 6) {
myself.SetMemoState(talker, 136, 7);
myself.ShowPage(talker, "hardin_q0136_12.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 7) {
myself.ShowPage(talker, "hardin_q0136_13.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 7) {
myself.ShowPage(talker, "hardin_q0136_15.htm");

}

}
if (reply == 7) {
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 7) {
myself.GiveItem1(talker, 9788, 1);
myself.SetMemoState(talker, 136, 8);
myself.ShowPage(talker, "hardin_q0136_16.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 136, 6);
myself.ShowQuestMark(talker, 136);

}

}
if (reply == 8) {
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 12) {
myself.SetMemoState(talker, 136, 13);
myself.ShowPage(talker, "hardin_q0136_19.htm");

}

}
if (reply == 9) {
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 13) {
myself.ShowPage(talker, "hardin_q0136_21.htm");

}

}
if (reply == 10) {
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 13) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 9648, 1);
myself.GiveItem1(talker, 57, 67550);
myself.RemoveMemo(talker, 136);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "hardin_q0136_23.htm");
myself.SetOneTimeQuestFlag(talker, 136, 1);
gg.AddLog(2, talker, 136);

}

}

}

}
super;
	}


}