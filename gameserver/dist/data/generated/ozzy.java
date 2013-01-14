package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ozzy extends elf_lv1_master {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 159) == 0 && myself.GetOneTimeQuestFlag(talker, 159) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Protect the Water Source");

}
if (gg.HaveMemo(talker, 159) == 0 && myself.GetOneTimeQuestFlag(talker, 159) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Protect the Water Source (Done)");

}
if (gg.HaveMemo(talker, 159) != 0 && gg.OwnItemCount(talker, 1071) != 0 && gg.OwnItemCount(talker, 1035) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Protect the Water Source (In Progress)");

}
if (gg.HaveMemo(talker, 159) != 0 && gg.OwnItemCount(talker, 1071) != 0 && gg.OwnItemCount(talker, 1035) != 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Protect the Water Source (In Progress)");

}
if (gg.HaveMemo(talker, 159) != 0 && gg.OwnItemCount(talker, 1072) != 0 && gg.OwnItemCount(talker, 1035) < 5) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Protect the Water Source (In Progress)");

}
if (gg.HaveMemo(talker, 159) != 0 && gg.OwnItemCount(talker, 1072) != 0 && gg.OwnItemCount(talker, 1035) >= 5 && myself.GetOneTimeQuestFlag(talker, 159) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Protect the Water Source (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 1 && gg.OwnItemCount(talker, 2735)) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 2 && gg.OwnItemCount(talker, 2745)) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 3 && gg.OwnItemCount(talker, 2746) && gg.OwnItemCount(talker, 2747)) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 4) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3141) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) == 1 && gg.OwnItemCount(talker, 3160) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3160) >= 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3142) == 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 7) == 1 && gg.OwnItemCount(talker, 7572) >= 1 && gg.GetMemoState(talker, 7) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "A Trip Begins (In Progress)");

}
if (gg.HaveMemo(talker, 7) == 1 && gg.GetMemoState(talker, 7) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "A Trip Begins (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 159) == 0 && myself.GetOneTimeQuestFlag(talker, 159) == 0) {
myself.SetCurrentQuestID(159);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 1) {
myself.ShowQuestPage(talker, "ozzy_q0310_00.htm", 159);

} else if (talker.level >= 12) {
myself.FHTML_SetFileName(fhtml0, "ozzy_q0310_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 159);
myself.ShowQuestFHTML(talker, fhtml0, 159);

} else {
myself.ShowQuestPage(talker, "ozzy_q0310_02.htm", 159);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 159) == 0 && myself.GetOneTimeQuestFlag(talker, 159) == 1) {
myself.SetCurrentQuestID(159);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 159) != 0 && gg.OwnItemCount(talker, 1071) != 0 && gg.OwnItemCount(talker, 1035) == 0) {
myself.SetCurrentQuestID(159);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ozzy_q0310_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 159) != 0 && gg.OwnItemCount(talker, 1071) != 0 && gg.OwnItemCount(talker, 1035) != 0) {
myself.SetCurrentQuestID(159);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1035, gg.OwnItemCount(talker, 1035));
myself.DeleteItem1(talker, 1071, gg.OwnItemCount(talker, 1071));
if (gg.OwnItemCount(talker, 1072) == 0) {
myself.GiveItem1(talker, 1072, 1);

}
myself.ShowPage(talker, "ozzy_q0310_06.htm");
myself.SetFlagJournal(talker, 159, 3);
myself.ShowQuestMark(talker, 159);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 159) != 0 && gg.OwnItemCount(talker, 1072) != 0 && gg.OwnItemCount(talker, 1035) < 5) {
myself.SetCurrentQuestID(159);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ozzy_q0310_07.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 159) != 0 && gg.OwnItemCount(talker, 1072) != 0 && gg.OwnItemCount(talker, 1035) >= 5 && myself.GetOneTimeQuestFlag(talker, 159) == 0) {
myself.SetCurrentQuestID(159);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1035, gg.OwnItemCount(talker, 1035));
myself.DeleteItem1(talker, 1072, gg.OwnItemCount(talker, 1072));
myself.GiveItem1(talker, 57, 18250);
myself.ShowPage(talker, "ozzy_q0310_08.htm");
myself.RemoveMemo(talker, 159);
gg.AddLog(2, talker, 159);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 159, 1);

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 1 && gg.OwnItemCount(talker, 2735)) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ozzy_q0217_01.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 2 && gg.OwnItemCount(talker, 2745)) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ozzy_q0217_04.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 3 && gg.OwnItemCount(talker, 2746) && gg.OwnItemCount(talker, 2747)) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "ozzy_q0217_05.htm");
myself.GiveItem1(talker, 2741, 1);
myself.DeleteItem1(talker, 2746, 1);
myself.DeleteItem1(talker, 2747, 1);
myself.DeleteItem1(talker, 2745, gg.OwnItemCount(talker, 2745));
myself.SetMemoState(talker, 217, 4);
myself.SetFlagJournal(talker, 217, 4);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 4) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ozzy_q0217_06.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3141) == 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ozzy_q0218_01.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) == 1 && gg.OwnItemCount(talker, 3160) == 0) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ozzy_q0218_08.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3160) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "ozzy_q0218_09.htm");
myself.DeleteItem1(talker, 3160, gg.OwnItemCount(talker, 3160));
myself.DeleteItem1(talker, 3144, 1);
myself.GiveItem1(talker, 3142, 1);
myself.SetFlagJournal(talker, 218, 21);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3142) == 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ozzy_q0218_10.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 7) == 1 && gg.OwnItemCount(talker, 7572) >= 1 && gg.GetMemoState(talker, 7) == 2 * 10 + 1) {
myself.SetCurrentQuestID(7);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 7, 2);
myself.ShowPage(talker, "ozzy_q0007_0201.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 7) == 1 && gg.GetMemoState(talker, 7) == 3 * 10 + 1) {
myself.SetCurrentQuestID(7);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ozzy_q0007_0303.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 159) {
myself.SetCurrentQuestID(159);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 159);
gg.AddLog(1, talker, 159);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 1071) == 0) {
myself.GiveItem1(talker, 1071, 1);

}
myself.ShowQuestPage(talker, "ozzy_q0310_04.htm", 159);
myself.SetFlagJournal(talker, 159, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 217) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 217) {
if (reply == 1) {
myself.ShowPage(talker, "ozzy_q0217_02.htm");

} else if (reply == 2 && gg.OwnItemCount(talker, 2735) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "ozzy_q0217_03.htm");
myself.GiveItem1(talker, 2745, 1);
myself.DeleteItem1(talker, 2735, 1);
myself.SetMemoState(talker, 217, 2);
myself.SetFlagJournal(talker, 217, 2);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 218) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 218) {
if (reply == 1) {
myself.ShowPage(talker, "ozzy_q0218_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "ozzy_q0218_03.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "ozzy_q0218_04.htm");

}
if (reply == 4) {
myself.ShowPage(talker, "ozzy_q0218_05.htm");

}
if (reply == 5) {
myself.ShowPage(talker, "ozzy_q0218_06.htm");

}
if (reply == 6) {
if (gg.OwnItemCount(talker, 3141) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "ozzy_q0218_07.htm");
myself.DeleteItem1(talker, 3141, 1);
myself.GiveItem1(talker, 3144, 1);
myself.GiveItem1(talker, 3143, 1);
myself.SetFlagJournal(talker, 218, 2);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 7) {
myself.SetCurrentQuestID(7);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 7) {
i0 = myself.GetHTMLCookie(talker, 7, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 7) == 1) {
if (gg.OwnItemCount(talker, 7572) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7572, 1);
myself.ShowPage(talker, "ozzy_q0007_0301.htm");
myself.SetMemoState(talker, 7, 3 * 10 + 1);
myself.SetFlagJournal(talker, 7, 3);
myself.ShowQuestMark(talker, 7);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "ozzy_q0007_0302.htm");

}

}

}

}
super;
	}


}