package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class elder_balanki extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 292) == 1 && gg.OwnItemCount(talker, 1487) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Brigands Sweep (In Progress)");

}
if (gg.HaveMemo(talker, 292) == 1 && gg.OwnItemCount(talker, 1487) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Brigands Sweep (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 1 && gg.OwnItemCount(talker, 2864) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 2 && gg.OwnItemCount(talker, 2868) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 2 && gg.OwnItemCount(talker, 2868)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2864)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3248) >= 1 && gg.OwnItemCount(talker, 3248) == 1 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3253) + gg.OwnItemCount(talker, 3254) < 2) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3248) == 0 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3253) + gg.OwnItemCount(talker, 3254) < 2) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3248) == 0 && gg.OwnItemCount(talker, 3253) && gg.OwnItemCount(talker, 3254)) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3248) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3259) >= 1 && gg.OwnItemCount(talker, 3253) == 0 || gg.OwnItemCount(talker, 3254) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 100 || gg.GetMemoState(talker, 347) == 300) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Go Get the Calculator. (In Progress)");

}
if (gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 200 || gg.GetMemoState(talker, 347) == 400 || gg.GetMemoState(talker, 347) == 500 || gg.GetMemoState(talker, 347) == 600 || gg.GetMemoState(talker, 347) == 700) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Go Get the Calculator. (In Progress)");

}
if (talker.level >= 3 && gg.HaveMemo(talker, 10) == 0 && myself.GetOneTimeQuestFlag(talker, 10) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Into the World");

}
if (talker.level < 3 && gg.HaveMemo(talker, 10) == 0 && myself.GetOneTimeQuestFlag(talker, 10) == 0) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Into the World");

}
if (gg.HaveMemo(talker, 10) == 0 && myself.GetOneTimeQuestFlag(talker, 10) == 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Into the World (Done)");

}
if (gg.HaveMemo(talker, 10) == 1 && myself.GetOneTimeQuestFlag(talker, 10) == 0 && gg.GetMemoState(talker, 10) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Into the World (In Progress)");

}
if (gg.HaveMemo(talker, 10) == 1 && gg.GetMemoState(talker, 10) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Into the World (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 292) == 1 && gg.OwnItemCount(talker, 1487) == 0) {
myself.SetCurrentQuestID(292);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "balanki_q0292_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 292) == 1 && gg.OwnItemCount(talker, 1487) == 1) {
myself.SetCurrentQuestID(292);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "balanki_q0292_02.htm");
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1487) * 120 + 500);
myself.DeleteItem1(talker, 1487, gg.OwnItemCount(talker, 1487));
gg.AddLog(3, talker, 292);

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 1 && gg.OwnItemCount(talker, 2864) == 0) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_balanki_q0231_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 2 && gg.OwnItemCount(talker, 2868) == 0) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_balanki_q0231_03.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 2 && gg.OwnItemCount(talker, 2868)) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_balanki_q0231_04.htm");
myself.GiveItem1(talker, 2864, 1);
myself.DeleteItem1(talker, 2868, 1);
myself.SetMemoState(talker, 231, 1);
if (gg.OwnItemCount(talker, 2866) >= 1 && gg.OwnItemCount(talker, 2865) >= 1) {
myself.SetFlagJournal(talker, 231, 2);
myself.ShowQuestMark(talker, 231);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2864)) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_balanki_q0231_05.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3248) >= 1 && gg.OwnItemCount(talker, 3248) == 1 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3253) + gg.OwnItemCount(talker, 3254) < 2) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_balanki_q0221_01.htm");
myself.DeleteItem1(talker, 3248, gg.OwnItemCount(talker, 3248));

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3248) == 0 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3253) + gg.OwnItemCount(talker, 3254) < 2) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_balanki_q0221_02.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3248) == 0 && gg.OwnItemCount(talker, 3253) && gg.OwnItemCount(talker, 3254)) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_balanki_q0221_03.htm");
myself.DeleteItem1(talker, 3254, gg.OwnItemCount(talker, 3254));
myself.DeleteItem1(talker, 3253, 1);
myself.GiveItem1(talker, 3259, 1);

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3248) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3259) >= 1 && gg.OwnItemCount(talker, 3253) == 0 || gg.OwnItemCount(talker, 3254) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_balanki_q0221_04.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 100 || gg.GetMemoState(talker, 347) == 300) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_balanki_q0347_01.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 200 || gg.GetMemoState(talker, 347) == 400 || gg.GetMemoState(talker, 347) == 500 || gg.GetMemoState(talker, 347) == 600 || gg.GetMemoState(talker, 347) == 700) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_balanki_q0347_04.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || talker.level >= 3 && gg.HaveMemo(talker, 10) == 0 && myself.GetOneTimeQuestFlag(talker, 10) == 0) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race == 4) {
myself.FHTML_SetFileName(fhtml0, "elder_balanki_q0010_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 10);
myself.ShowQuestFHTML(talker, fhtml0, 10);

} else {
myself.ShowPage(talker, "elder_balanki_q0010_0102.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 13: {
if (_from_choice == 0 || talker.level < 3 && gg.HaveMemo(talker, 10) == 0 && myself.GetOneTimeQuestFlag(talker, 10) == 0) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_balanki_q0010_0103.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10) == 0 && myself.GetOneTimeQuestFlag(talker, 10) == 1) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10) == 1 && myself.GetOneTimeQuestFlag(talker, 10) == 0 && gg.GetMemoState(talker, 10) == 1 * 10 + 1) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_balanki_q0010_0105.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10) == 1 && gg.GetMemoState(talker, 10) == 4 * 10 + 1) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 10, 4);
myself.ShowPage(talker, "elder_balanki_q0010_0401.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 10) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 10);
myself.ShowQuestMark(talker, 10);
myself.SetMemoState(talker, 10, 1 * 10 + 1);
gg.AddLog(1, talker, 10);
myself.SetFlagJournal(talker, 10, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "elder_balanki_q0010_0104.htm", 10);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 231) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 231) {
if (reply == 1) {
myself.ShowPage(talker, "elder_balanki_q0231_02.htm");
myself.SetMemoState(talker, 231, 2);

}

}
if (ask == 347) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 347) {
if (reply == 2) {
if (gg.OwnItemCount(talker, 57) >= 100) {
myself.DeleteItem1(talker, 57, 100);
myself.SetMemoState(talker, 347, 100 + gg.GetMemoState(talker, 347));
if (gg.GetMemoState(talker, 347) == 100) {
myself.SetFlagJournal(talker, 347, 2);
myself.ShowQuestMark(talker, 347);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.GetMemoState(talker, 347) == 300) {
myself.SetFlagJournal(talker, 347, 4);
myself.ShowQuestMark(talker, 347);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
myself.ShowPage(talker, "elder_balanki_q0347_02.htm");

} else {
myself.ShowPage(talker, "elder_balanki_q0347_03.htm");

}

}

}
if (ask == 10) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10 && myself.GetOneTimeQuestFlag(talker, 10) == 0) {
i0 = myself.GetHTMLCookie(talker, 10, 5 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 10) == 1 && myself.GetOneTimeQuestFlag(talker, 10) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7559, 1);
myself.GiveItem1(talker, 7570, 1);

}
gg.AddLog(2, talker, 10);
myself.RemoveMemo(talker, 10);
myself.SetOneTimeQuestFlag(talker, 10, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "elder_balanki_q0010_0501.htm");

}

}

}
super;
	}


}