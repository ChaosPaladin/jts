package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class highpriest_innocentin extends master_lv3_hec {
	protected void TALK_SELECTED(HandlerParam c0, HandlerParam c1, HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 10 && gg.OwnItemCount(talker, 7140) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 0 && myself.GetOneTimeQuestFlag(talker, 21) == 1 && gg.HaveMemo(talker, 22) == 0 && myself.GetOneTimeQuestFlag(talker, 22) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Hidden Truth (Done)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) < 5 && gg.OwnItemCount(talker, 7141) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) < 5 && gg.OwnItemCount(talker, 7141) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 5) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 6) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 7) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 12 && gg.OwnItemCount(talker, 7147) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 13) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 14 && talker.level >= 64) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 14 && talker.level < 64) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 0 && myself.GetOneTimeQuestFlag(talker, 23) == 0 && myself.GetOneTimeQuestFlag(talker, 22) == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Lidia's Heart");

}
if (gg.HaveMemo(talker, 23) == 0 && myself.GetOneTimeQuestFlag(talker, 23) == 0 && myself.GetOneTimeQuestFlag(talker, 22) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Lidia's Heart");

}
if (gg.HaveMemo(talker, 23) == 0 && myself.GetOneTimeQuestFlag(talker, 23) == 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Lidia's Heart (Done)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 2) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 5) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 6) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 7) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 8) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 638) == 0 && talker.level >= 73) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Seekers of the Holy Grail");

}
if (gg.HaveMemo(talker, 638) == 0 && talker.level < 73) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Seekers of the Holy Grail");

}
if (gg.HaveMemo(talker, 638) == 1 && gg.OwnItemCount(talker, 8068) >= 2000) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Seekers of the Holy Grail (In Progress)");

}
if (gg.HaveMemo(talker, 638) == 1 && gg.OwnItemCount(talker, 8068) < 2000) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Seekers of the Holy Grail (In Progress)");

}
if (myself.IsMyLord(talker) == 0) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Path to Becoming a Lord - Rune (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 10 && gg.OwnItemCount(talker, 7140) >= 1) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0021_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 0 && myself.GetOneTimeQuestFlag(talker, 21) == 1 && gg.HaveMemo(talker, 22) == 0 && myself.GetOneTimeQuestFlag(talker, 22) == 0) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0021_06.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) < 5 && gg.OwnItemCount(talker, 7141) == 0) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7141, 1);
myself.ShowPage(talker, "highpriest_innocentin_q0022_01.htm");
myself.SetFlagJournal(talker, 22, 3);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) < 5 && gg.OwnItemCount(talker, 7141) >= 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0022_01b.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 5) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0022_02.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 6) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0022_04.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 7) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0022_09a.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 12 && gg.OwnItemCount(talker, 7147) >= 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0022_10.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 13) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0022_12.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 14 && talker.level >= 64) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0022_20.htm");
myself.IncrementParam(talker, 0, 345966);
myself.IncrementParam(talker, 1, 31578);
myself.RemoveMemo(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 22, 1);
gg.AddLog(2, talker, 22);

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 14 && talker.level < 64) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0022_21.htm");
myself.IncrementParam(talker, 0, 345966);
myself.IncrementParam(talker, 1, 31578);
myself.RemoveMemo(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 22, 1);
gg.AddLog(2, talker, 22);

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 0 && myself.GetOneTimeQuestFlag(talker, 23) == 0 && myself.GetOneTimeQuestFlag(talker, 22) == 1) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "highpriest_innocentin_q0023_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 23);
myself.ShowQuestFHTML(talker, fhtml0, 23);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 0 && myself.GetOneTimeQuestFlag(talker, 23) == 0 && myself.GetOneTimeQuestFlag(talker, 22) == 0) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0023_01a.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 0 && myself.GetOneTimeQuestFlag(talker, 23) == 1) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 1) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0023_04.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 2) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0023_08.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 5) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0023_09.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 6) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0023_14.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 7) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0023_15.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 8) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0023_22.htm");
myself.SetFlagJournal(talker, 23, 6);
myself.ShowQuestMark(talker, 23);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 638) == 0 && talker.level >= 73) {
myself.SetCurrentQuestID(638);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "highpriest_innocentin_q0638_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 638);
myself.ShowQuestFHTML(talker, fhtml0, 638);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 638) == 0 && talker.level < 73) {
myself.SetCurrentQuestID(638);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "highpriest_innocentin_q0638_02.htm", 638);

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 638) == 1 && gg.OwnItemCount(talker, 8068) >= 2000) {
myself.SetCurrentQuestID(638);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0638_04.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 638) == 1 && gg.OwnItemCount(talker, 8068) < 2000) {
myself.SetCurrentQuestID(638);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_innocentin_q0638_05.htm");

}
break;

}
case 24: {
if (_from_choice == 0 || myself.IsMyLord(talker) == 0) {
myself.SetCurrentQuestID(716);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 716) == 1 && gg.GetMemoState(c0, 716) == 5) {
i0 = gg.GetMemoStateEx(c0, 716, 1);
if (talker.dbid == i0) {
myself.ShowPage(talker, "highpriest_innocentin_q0716_03.htm");

} else {
myself.ShowPage(talker, "highpriest_innocentin_q0716_03a.htm");

}

} else if (gg.HaveMemo(c0, 716) == 1 && gg.GetMemoState(c0, 716) < 5) {
myself.ShowPage(talker, "highpriest_innocentin_q0716_02.htm");

} else if (gg.HaveMemo(c0, 716) == 1 && gg.GetMemoState(c0, 716) % 10 == 6) {
myself.ShowPage(talker, "highpriest_innocentin_q0716_06.htm");

}

} else {
myself.ShowPage(talker, "highpriest_innocentin_q0716_01.htm");

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
if (quest_id == 23) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 23) == 0 && myself.GetOneTimeQuestFlag(talker, 23) == 0 && talker.level < 64 || myself.GetOneTimeQuestFlag(talker, 22) == 0) {
myself.ShowQuestPage(talker, "highpriest_innocentin_q0023_02.htm", 23);

}
if (gg.HaveMemo(talker, 23) == 0 && myself.GetOneTimeQuestFlag(talker, 23) == 0 && talker.level >= 64 && myself.GetOneTimeQuestFlag(talker, 22) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7063, 1);
myself.GiveItem1(talker, 7149, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 23);
myself.SetMemoState(talker, 23, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "highpriest_innocentin_q0023_03.htm", 23);
myself.SetFlagJournal(talker, 23, 1);
gg.AddLog(1, talker, quest_id);

}

}
return;

}
if (quest_id == 638) {
myself.SetCurrentQuestID(638);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 638) == 0 && talker.level >= 73) {
myself.SetMemo(talker, quest_id);
myself.SetFlagJournal(talker, 638, 1);
myself.ShowQuestMark(talker, 638);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "highpriest_innocentin_q0638_03.htm", 638);
gg.AddLog(1, talker, quest_id);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam c0, HandlerParam reply, HandlerParam talker) {
if (ask == 21) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 21) {
if (reply == 11) {
myself.ShowPage(talker, "highpriest_innocentin_q0021_02.htm");

}
if (reply == 12) {
myself.ShowPage(talker, "highpriest_innocentin_q0021_03.htm");

}
if (reply == 13) {
myself.ShowPage(talker, "highpriest_innocentin_q0021_04.htm");

}
if (reply == 14) {
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 10 && gg.OwnItemCount(talker, 7140) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7141, 1);
myself.IncrementParam(talker, 0, 131228);
myself.IncrementParam(talker, 1, 11978);
myself.DeleteItem1(talker, 7140, 1);
myself.RemoveMemo(talker, 21);
gg.AddLog(2, talker, 21);
myself.SetOneTimeQuestFlag(talker, 21, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "highpriest_innocentin_q0021_05.htm");

}

}

}

}
if (ask == 22) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 22) {
if (reply == 8) {
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 5) {
myself.DeleteItem1(talker, 7141, gg.OwnItemCount(talker, 7141));
myself.SetMemoState(talker, 22, 6);
myself.ShowPage(talker, "highpriest_innocentin_q0022_03.htm");

}

}
if (reply == 10) {
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 6) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7143, 1);
myself.SetMemoState(talker, 22, 7);
myself.ShowPage(talker, "highpriest_innocentin_q0022_09.htm");
myself.SetFlagJournal(talker, 22, 9);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 22) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 22) {
if (reply == 17) {
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 12 && gg.OwnItemCount(talker, 7147) >= 1) {
myself.DeleteItem1(talker, 7147, gg.OwnItemCount(talker, 7147));
myself.SetMemoState(talker, 22, 13);
myself.ShowPage(talker, "highpriest_innocentin_q0022_11.htm");
myself.SetFlagJournal(talker, 22, 15);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 18) {
myself.ShowPage(talker, "highpriest_innocentin_q0022_13.htm");

}
if (reply == 19) {
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 13) {
myself.SetMemoState(talker, 22, 14);
myself.ShowPage(talker, "highpriest_innocentin_q0022_19.htm");
myself.SetFlagJournal(talker, 22, 16);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 23) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 23) {
if (reply == 1) {
myself.ShowPage(talker, "highpriest_innocentin_q0023_05.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "highpriest_innocentin_q0023_06.htm");

}
if (reply == 3) {
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 1) {
myself.SetMemoState(talker, 23, 2);
myself.ShowPage(talker, "highpriest_innocentin_q0023_07.htm");
myself.SetFlagJournal(talker, 23, 2);
myself.ShowQuestMark(talker, 23);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 23) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 23) {
if (reply == 13) {
myself.ShowPage(talker, "highpriest_innocentin_q0023_11.htm");

}
if (reply == 15) {
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 5 || gg.GetMemoState(talker, 23) == 6) {
myself.SetMemoState(talker, 23, 6);
myself.ShowPage(talker, "highpriest_innocentin_q0023_12.htm");
myself.SetFlagJournal(talker, 23, 5);
myself.ShowQuestMark(talker, 23);

}

}
if (reply == 14) {
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 5 || gg.GetMemoState(talker, 23) == 6) {
myself.SetMemoState(talker, 23, 7);
myself.ShowPage(talker, "highpriest_innocentin_q0023_13.htm");

}

}
if (reply == 17) {
myself.ShowPage(talker, "highpriest_innocentin_q0023_16.htm");

}
if (reply == 18) {
myself.ShowPage(talker, "highpriest_innocentin_q0023_17.htm");

}
if (reply == 19) {
myself.ShowPage(talker, "highpriest_innocentin_q0023_18.htm");

}
if (reply == 20) {
myself.ShowPage(talker, "highpriest_innocentin_q0023_19.htm");
myself.SoundEffect(talker, "AmbSound.mt_creak01");

}
if (reply == 21) {
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 7) {
myself.SetMemoState(talker, 23, 8);
myself.ShowPage(talker, "highpriest_innocentin_q0023_20.htm");
myself.SetFlagJournal(talker, 23, 6);
myself.ShowQuestMark(talker, 23);

}

}
if (reply == 16) {
myself.ShowPage(talker, "highpriest_innocentin_q0023_21.htm");
myself.SetFlagJournal(talker, 23, 5);
myself.ShowQuestMark(talker, 23);

}

}
if (ask == 638) {
myself.SetCurrentQuestID(638);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 638) {
if (reply == 1) {
myself.ShowPage(talker, "highpriest_innocentin_q0638_06.htm");

}
if (reply == 2) {
if (gg.HaveMemo(talker, 638) == 1 && gg.OwnItemCount(talker, 8068) >= 2000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.Rand(100) < 80) {
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 960, 1);

} else {
myself.GiveItem1(talker, 959, 1);

}
myself.DeleteItem1(talker, 8068, 2000);
myself.ShowPage(talker, "highpriest_innocentin_q0638_07.htm");

} else {
myself.GiveItem1(talker, 57, 3576000);
myself.DeleteItem1(talker, 8068, 2000);
myself.ShowPage(talker, "highpriest_innocentin_q0638_08.htm");

}
gg.AddLog(3, talker, 638);

}

}

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 1700 * gg.OwnItemCount(talker, 8068));
myself.DeleteItem1(talker, 8068, gg.OwnItemCount(talker, 8068));
myself.RemoveMemo(talker, 638);
gg.AddLog(2, talker, 638);
gg.AddLog(3, talker, 638);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "highpriest_innocentin_q0638_09.htm");

}

}

}
if (ask == 716) {
myself.SetCurrentQuestID(716);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 716) {
if (reply == 1) {
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 716) == 1 && gg.GetMemoState(c0, 716) == 5) {
myself.ShowPage(talker, "highpriest_innocentin_q0716_04.htm");

}

}

}
if (reply == 2) {
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 716) == 1 && gg.GetMemoState(c0, 716) == 5) {
myself.SetMemoState(c0, 716, 6);
myself.SetMemoStateEx(c0, 716, 1, 0);
myself.SetFlagJournal(c0, 716, 6);
myself.ShowQuestMark(c0, 716);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.ShowPage(talker, "highpriest_innocentin_q0716_05.htm");

}

}

}

}
super;
	}


}