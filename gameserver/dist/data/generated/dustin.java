package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dustin extends cleric_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 10 && gg.OwnItemCount(talker, 2640)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 11 && gg.OwnItemCount(talker, 2643) == 0 || gg.OwnItemCount(talker, 2644) == 0 || gg.OwnItemCount(talker, 2645) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 11 && gg.OwnItemCount(talker, 2643) && gg.OwnItemCount(talker, 2644) && gg.OwnItemCount(talker, 2645)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 13 && gg.OwnItemCount(talker, 2646)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 12) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 14) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 45) == 1 && gg.OwnItemCount(talker, 7565) >= 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "To Talking Island (In Progress)");

}
if (gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "To Talking Island (In Progress)");

}
if (gg.HaveMemo(talker, 46) == 1 && gg.OwnItemCount(talker, 7565) >= 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Once More In the Arms of the Mother Tree (In Progress)");

}
if (gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Once More In the Arms of the Mother Tree (In Progress)");

}
if (gg.HaveMemo(talker, 47) == 1 && gg.OwnItemCount(talker, 7565) >= 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Into the Dark Elven Forest (In Progress)");

}
if (gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Into the Dark Elven Forest (In Progress)");

}
if (gg.HaveMemo(talker, 48) == 1 && gg.OwnItemCount(talker, 7565) >= 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "To the Immortal Plateau (In Progress)");

}
if (gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "To the Immortal Plateau (In Progress)");

}
if (gg.HaveMemo(talker, 49) == 1 && gg.OwnItemCount(talker, 7565) >= 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "The Road Home (In Progress)");

}
if (gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "The Road Home (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 10 && gg.OwnItemCount(talker, 2640)) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dustin_q0212_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 11 && gg.OwnItemCount(talker, 2643) == 0 || gg.OwnItemCount(talker, 2644) == 0 || gg.OwnItemCount(talker, 2645) == 0) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dustin_q0212_06.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 11 && gg.OwnItemCount(talker, 2643) && gg.OwnItemCount(talker, 2644) && gg.OwnItemCount(talker, 2645)) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "dustin_q0212_07.htm");
myself.DeleteItem1(talker, 2643, 1);
myself.DeleteItem1(talker, 2644, 1);
myself.DeleteItem1(talker, 2645, 1);
myself.GiveItem1(talker, 2642, 1);
myself.SetMemoState(talker, 212, 12);
myself.SetFlagJournal(talker, 212, 16);
myself.ShowQuestMark(talker, 212);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 13 && gg.OwnItemCount(talker, 2646)) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "dustin_q0212_08.htm");
myself.DeleteItem1(talker, 2646, 1);
myself.GiveItem1(talker, 2634, 1);
myself.SetMemoState(talker, 212, 14);
myself.SetFlagJournal(talker, 212, 18);
myself.ShowQuestMark(talker, 212);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 12) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dustin_q0212_09.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 14) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dustin_q0212_10.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 45) == 1 && gg.OwnItemCount(talker, 7565) >= 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 5 * 10 + 1) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 45, 5);
myself.ShowPage(talker, "dustin_q0045_0501.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 6 * 10 + 1) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dustin_q0045_0603.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 46) == 1 && gg.OwnItemCount(talker, 7565) >= 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 5 * 10 + 1) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 46, 5);
myself.ShowPage(talker, "dustin_q0046_0501.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 6 * 10 + 1) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dustin_q0046_0603.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 47) == 1 && gg.OwnItemCount(talker, 7565) >= 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 5 * 10 + 1) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 47, 5);
myself.ShowPage(talker, "dustin_q0047_0501.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 6 * 10 + 1) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dustin_q0047_0603.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 48) == 1 && gg.OwnItemCount(talker, 7565) >= 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 5 * 10 + 1) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 48, 5);
myself.ShowPage(talker, "dustin_q0048_0501.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 6 * 10 + 1) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dustin_q0048_0603.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 49) == 1 && gg.OwnItemCount(talker, 7565) >= 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 5 * 10 + 1) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 49, 5);
myself.ShowPage(talker, "dustin_q0049_0501.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 6 * 10 + 1) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dustin_q0049_0603.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 212) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 211) {
if (reply == 1) {
myself.ShowPage(talker, "dustin_q0212_02.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "dustin_q0212_03.htm");

} else if (reply == 3) {
myself.ShowPage(talker, "dustin_q0212_04.htm");

} else if (reply == 4 && gg.OwnItemCount(talker, 2640) > 0) {
myself.ShowPage(talker, "dustin_q0212_05.htm");
myself.DeleteItem1(talker, 2640, 1);
myself.SetMemoState(talker, 212, 11);
myself.SetFlagJournal(talker, 212, 14);
myself.ShowQuestMark(talker, 212);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 45) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 45) {
i0 = myself.GetHTMLCookie(talker, 45, 6 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0) {
if (gg.OwnItemCount(talker, 7565) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7565, 1);
myself.GiveItem1(talker, 7566, 1);
myself.ShowPage(talker, "dustin_q0045_0601.htm");
myself.SetMemoState(talker, 45, 6 * 10 + 1);
myself.SetFlagJournal(talker, 45, 6);
myself.ShowQuestMark(talker, 45);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "dustin_q0045_0602.htm");

}

}

}

}
if (ask == 46) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 46) {
i0 = myself.GetHTMLCookie(talker, 46, 6 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0) {
if (gg.OwnItemCount(talker, 7565) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7565, 1);
myself.GiveItem1(talker, 7566, 1);
myself.ShowPage(talker, "dustin_q0046_0601.htm");
myself.SetMemoState(talker, 46, 6 * 10 + 1);
myself.SetFlagJournal(talker, 46, 6);
myself.ShowQuestMark(talker, 46);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "dustin_q0046_0602.htm");

}

}

}

}
if (ask == 47) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 47) {
i0 = myself.GetHTMLCookie(talker, 47, 6 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0) {
if (gg.OwnItemCount(talker, 7565) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7565, 1);
myself.GiveItem1(talker, 7566, 1);
myself.ShowPage(talker, "dustin_q0047_0601.htm");
myself.SetMemoState(talker, 47, 6 * 10 + 1);
myself.SetFlagJournal(talker, 47, 6);
myself.ShowQuestMark(talker, 47);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "dustin_q0047_0602.htm");

}

}

}

}
if (ask == 48) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 48) {
i0 = myself.GetHTMLCookie(talker, 48, 6 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0) {
if (gg.OwnItemCount(talker, 7565) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7565, 1);
myself.GiveItem1(talker, 7566, 1);
myself.ShowPage(talker, "dustin_q0048_0601.htm");
myself.SetMemoState(talker, 48, 6 * 10 + 1);
myself.SetFlagJournal(talker, 48, 6);
myself.ShowQuestMark(talker, 48);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "dustin_q0048_0602.htm");

}

}

}

}
if (ask == 49) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 49) {
i0 = myself.GetHTMLCookie(talker, 49, 6 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0) {
if (gg.OwnItemCount(talker, 7565) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7565, 1);
myself.GiveItem1(talker, 7566, 1);
myself.ShowPage(talker, "dustin_q0049_0601.htm");
myself.SetMemoState(talker, 49, 6 * 10 + 1);
myself.SetFlagJournal(talker, 49, 6);
myself.ShowQuestMark(talker, 49);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "dustin_q0049_0602.htm");

}

}

}

}
super;
	}


}