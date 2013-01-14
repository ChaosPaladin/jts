package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class elder_filaur extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 293) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "The Hidden Veins");

}
if (gg.HaveMemo(talker, 293) == 1 && gg.OwnItemCount(talker, 1488) < 1 && gg.OwnItemCount(talker, 1490) < 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "The Hidden Veins (In Progress)");

}
if (gg.HaveMemo(talker, 293) == 1 && gg.OwnItemCount(talker, 1488) < 1 && gg.OwnItemCount(talker, 1490) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "The Hidden Veins (In Progress)");

}
if (gg.HaveMemo(talker, 293) == 1 && gg.OwnItemCount(talker, 1488) >= 1 && gg.OwnItemCount(talker, 1490) < 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "The Hidden Veins (In Progress)");

}
if (gg.HaveMemo(talker, 293) == 1 && gg.OwnItemCount(talker, 1488) >= 1 && gg.OwnItemCount(talker, 1490) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "The Hidden Veins (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 1 && gg.OwnItemCount(talker, 2865) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 4 && gg.OwnItemCount(talker, 2873) && gg.OwnItemCount(talker, 2874) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 4 && gg.OwnItemCount(talker, 2873) == 0 && gg.OwnItemCount(talker, 2874)) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2865)) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3250) >= 1 && gg.OwnItemCount(talker, 3261) == 0 && gg.OwnItemCount(talker, 3257) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3261) == 0 && gg.OwnItemCount(talker, 3257) == 0 && gg.OwnItemCount(talker, 3250) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3257) >= 1 && gg.OwnItemCount(talker, 3261) == 0 && gg.OwnItemCount(talker, 3250) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3261) >= 1 && gg.OwnItemCount(talker, 3257) == 0 && gg.OwnItemCount(talker, 3250) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Testimony of Prosperity (In Progress)");

}
if (talker.level >= 30 && gg.HaveMemo(talker, 116) == 0 && myself.GetOneTimeQuestFlag(talker, 116) == 0) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Beyond the Hills of Winter");

}
if (talker.level < 30 && gg.HaveMemo(talker, 116) == 0 && myself.GetOneTimeQuestFlag(talker, 116) == 0) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Beyond the Hills of Winter");

}
if (gg.HaveMemo(talker, 116) == 0 && myself.GetOneTimeQuestFlag(talker, 116) == 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Beyond the Hills of Winter (Done)");

}
if (gg.HaveMemo(talker, 116) == 1 && myself.GetOneTimeQuestFlag(talker, 116) == 0 && gg.GetMemoState(talker, 116) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Beyond the Hills of Winter (In Progress)");

}
if (gg.HaveMemo(talker, 116) == 1 && gg.GetMemoState(talker, 116) == 2 * 10 + 1 && myself.GetOneTimeQuestFlag(talker, 116) == 0) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Beyond the Hills of Winter (In Progress)");

}
if (gg.HaveMemo(talker, 312) == 0 && talker.level >= 80) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Take Advantage of the Crisis!");

}
if (gg.HaveMemo(talker, 312) == 0 && talker.level < 80) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Take Advantage of the Crisis!");

}
if (gg.HaveMemo(talker, 312) == 1 && gg.GetMemoState(talker, 312) == 1 && gg.OwnItemCount(talker, 14875) < 1) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Take Advantage of the Crisis! (In progress)");

}
if (gg.HaveMemo(talker, 312) == 1 && gg.GetMemoState(talker, 312) == 1 && gg.OwnItemCount(talker, 14875) >= 1) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Take Advantage of the Crisis! (In progress)");

}
if (gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 7) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Trial of the Challenger (In Progress)");

}
if (gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 8) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Trial of the Challenger (In Progress)");

}
if (gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 9) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Trial of the Challenger (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 293) == 0) {
myself.SetCurrentQuestID(293);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 4) {
myself.ShowQuestPage(talker, "elder_filaur_q0293_00.htm", 293);

} else if (talker.level >= 6) {
myself.FHTML_SetFileName(fhtml0, "elder_filaur_q0293_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 293);
myself.ShowQuestFHTML(talker, fhtml0, 293);

} else {
myself.ShowQuestPage(talker, "elder_filaur_q0293_01.htm", 293);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 293) == 1 && gg.OwnItemCount(talker, 1488) < 1 && gg.OwnItemCount(talker, 1490) < 1) {
myself.SetCurrentQuestID(293);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_filaur_q0293_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 293) == 1 && gg.OwnItemCount(talker, 1488) < 1 && gg.OwnItemCount(talker, 1490) >= 1) {
myself.SetCurrentQuestID(293);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_filaur_q0293_08.htm");
if (gg.OwnItemCount(talker, 1490) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1490) * 500 + 2000);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1490) * 500);

}
myself.DeleteItem1(talker, 1490, gg.OwnItemCount(talker, 1490));
if (talker.level < 25 && myself.IsInCategory(0, talker.occupation) && myself.GetOneTimeQuestFlag(talker, 57) == 0) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 6000);
myself.SetOneTimeQuestFlag(talker, 57, 1);
myself.ShowQuestionMark(talker, 26);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 1000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4152, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 10000 / 1000 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 1000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4152, "", "", "", "", ""));

}
gg.AddLog(3, talker, 293);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 293) == 1 && gg.OwnItemCount(talker, 1488) >= 1 && gg.OwnItemCount(talker, 1490) < 1) {
myself.SetCurrentQuestID(293);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_filaur_q0293_05.htm");
if (gg.OwnItemCount(talker, 1488) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1488) * 5 + 2000);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1488) * 5);

}
myself.DeleteItem1(talker, 1488, gg.OwnItemCount(talker, 1488));
if (talker.level < 25 && myself.IsInCategory(0, talker.occupation) && myself.GetOneTimeQuestFlag(talker, 57) == 0) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 6000);
myself.SetOneTimeQuestFlag(talker, 57, 1);
myself.ShowQuestionMark(talker, 26);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 1000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4152, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 10000 / 1000 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 1000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4152, "", "", "", "", ""));

}
gg.AddLog(3, talker, 293);

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 293) == 1 && gg.OwnItemCount(talker, 1488) >= 1 && gg.OwnItemCount(talker, 1490) >= 1) {
myself.SetCurrentQuestID(293);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_filaur_q0293_09.htm");
if (gg.OwnItemCount(talker, 1488) + gg.OwnItemCount(talker, 1490) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1488) * 5 + gg.OwnItemCount(talker, 1490) * 500 + 2000);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1488) * 5 + gg.OwnItemCount(talker, 1490) * 500);

}
myself.DeleteItem1(talker, 1490, gg.OwnItemCount(talker, 1490));
myself.DeleteItem1(talker, 1488, gg.OwnItemCount(talker, 1488));
if (talker.level < 25 && myself.IsInCategory(0, talker.occupation) && myself.GetOneTimeQuestFlag(talker, 57) == 0) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 6000);
myself.SetOneTimeQuestFlag(talker, 57, 1);
myself.ShowQuestionMark(talker, 26);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 1000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4152, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 10000 / 1000 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 1000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4152, "", "", "", "", ""));

}
gg.AddLog(3, talker, 293);

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 1 && gg.OwnItemCount(talker, 2865) == 0) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_filaur_q0231_01.htm");
myself.GiveItem1(talker, 2873, 1);
myself.SetMemoState(talker, 231, 4);

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 4 && gg.OwnItemCount(talker, 2873) && gg.OwnItemCount(talker, 2874) == 0) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_filaur_q0231_02.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 4 && gg.OwnItemCount(talker, 2873) == 0 && gg.OwnItemCount(talker, 2874)) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_filaur_q0231_03.htm");
myself.GiveItem1(talker, 2865, 1);
myself.DeleteItem1(talker, 2874, 1);
myself.SetMemoState(talker, 231, 1);
if (gg.OwnItemCount(talker, 2864) >= 1 && gg.OwnItemCount(talker, 2866) >= 1) {
myself.SetFlagJournal(talker, 231, 2);
myself.ShowQuestMark(talker, 231);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2865)) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_filaur_q0231_04.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3250) >= 1 && gg.OwnItemCount(talker, 3261) == 0 && gg.OwnItemCount(talker, 3257) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_filaur_q0221_01.htm");
myself.DeleteItem1(talker, 3250, gg.OwnItemCount(talker, 3250));

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3261) == 0 && gg.OwnItemCount(talker, 3257) == 0 && gg.OwnItemCount(talker, 3250) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_filaur_q0221_02.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3257) >= 1 && gg.OwnItemCount(talker, 3261) == 0 && gg.OwnItemCount(talker, 3250) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_filaur_q0221_03.htm");
myself.DeleteItem1(talker, 3257, 1);
myself.GiveItem1(talker, 3261, 1);

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3261) >= 1 && gg.OwnItemCount(talker, 3257) == 0 && gg.OwnItemCount(talker, 3250) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_filaur_q0221_04.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || talker.level >= 30 && gg.HaveMemo(talker, 116) == 0 && myself.GetOneTimeQuestFlag(talker, 116) == 0) {
myself.SetCurrentQuestID(116);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "elder_filaur_q0116_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 116);
myself.ShowQuestFHTML(talker, fhtml0, 116);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 14: {
if (_from_choice == 0 || talker.level < 30 && gg.HaveMemo(talker, 116) == 0 && myself.GetOneTimeQuestFlag(talker, 116) == 0) {
myself.SetCurrentQuestID(116);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "elder_filaur_q0116_0103.htm", 116);

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 116) == 0 && myself.GetOneTimeQuestFlag(talker, 116) == 1) {
myself.SetCurrentQuestID(116);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 116) == 1 && myself.GetOneTimeQuestFlag(talker, 116) == 0 && gg.GetMemoState(talker, 116) == 1 * 10 + 1) {
myself.SetCurrentQuestID(116);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1833) >= 20 && gg.OwnItemCount(talker, 5589) >= 5 && gg.OwnItemCount(talker, 1661) >= 10) {
myself.SetHTMLCookie(talker, 116, 1);
myself.ShowPage(talker, "elder_filaur_q0116_0105.htm");

} else {
myself.ShowPage(talker, "elder_filaur_q0116_0106.htm");

}

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 116) == 1 && gg.GetMemoState(talker, 116) == 2 * 10 + 1 && myself.GetOneTimeQuestFlag(talker, 116) == 0) {
myself.SetCurrentQuestID(116);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_filaur_q0116_0203.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 312) == 0 && talker.level >= 80) {
myself.SetCurrentQuestID(312);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "elder_filaur_q0312_01.htm", 312);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 312) == 0 && talker.level < 80) {
myself.SetCurrentQuestID(312);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "elder_filaur_q0312_02.htm", 312);

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 312) == 1 && gg.GetMemoState(talker, 312) == 1 && gg.OwnItemCount(talker, 14875) < 1) {
myself.SetCurrentQuestID(312);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_filaur_q0312_05.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 312) == 1 && gg.GetMemoState(talker, 312) == 1 && gg.OwnItemCount(talker, 14875) >= 1) {
myself.SetCurrentQuestID(312);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_filaur_q0312_06.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 7) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 0) {
myself.ShowPage(talker, "elder_filaur_q0211_01.htm");
myself.SetMemoState(talker, 211, 8);
myself.SetFlagJournal(talker, 211, 9);
myself.ShowQuestMark(talker, 211);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowPage(talker, "elder_filaur_q0211_03.htm");

}

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 8) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_filaur_q0211_02.htm");
myself.ShowRadar(talker, 151589, -174823, -1776, 2);

}
break;

}
case 24: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 9) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_filaur_q0211_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 293) {
myself.SetCurrentQuestID(293);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 293);
myself.ShowQuestMark(talker, 293);
gg.AddLog(1, talker, 293);
myself.SetFlagJournal(talker, 293, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "elder_filaur_q0293_03.htm", 293);

}
return;

}
if (quest_id == 116) {
myself.SetCurrentQuestID(116);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && talker.level >= 30 && myself.GetOneTimeQuestFlag(talker, 116) == 0) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 116);
myself.SetMemoState(talker, 116, 1 * 10 + 1);
gg.AddLog(1, talker, 116);
myself.SetFlagJournal(talker, 116, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "elder_filaur_q0116_0104.htm", 116);
myself.ShowQuestMark(talker, 116);

}
return;

}
if (quest_id == 312) {
myself.SetCurrentQuestID(312);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 312) == 0 && talker.level >= 80) {
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 312);
myself.SetMemoState(talker, 312, 1);
myself.ShowQuestPage(talker, "elder_filaur_q0312_04.htm", 312);
myself.SetFlagJournal(talker, 312, 1);
myself.ShowQuestMark(talker, 312);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 293) {
myself.SetCurrentQuestID(293);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 293) {
if (reply == 1) {
myself.ShowPage(talker, "elder_filaur_q0293_06.htm");
myself.DeleteItem1(talker, 1489, gg.OwnItemCount(talker, 1489));
myself.RemoveMemo(talker, 293);
gg.AddLog(2, talker, 293);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (reply == 2) {
myself.ShowPage(talker, "elder_filaur_q0293_07.htm");

}

}
if (ask == 116) {
myself.SetCurrentQuestID(116);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 116) {
i0 = myself.GetHTMLCookie(talker, 116, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 116) == 1 && myself.GetOneTimeQuestFlag(talker, 116) == 0) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_filaur_q0116_0201.htm");
myself.SetMemoState(talker, 116, 2 * 10 + 1);
myself.SetFlagJournal(talker, 116, 2);
myself.ShowQuestMark(talker, 116);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 8098, 1);

}

}

}
if (ask == 312) {
myself.SetCurrentQuestID(312);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 312) {
if (reply == 1) {
if (gg.HaveMemo(talker, 312) == 0 && talker.level >= 80) {
myself.FHTML_SetFileName(fhtml0, "elder_filaur_q0312_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 312);
myself.ShowQuestFHTML(talker, fhtml0, 312);

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 312) == 1 && gg.GetMemoState(talker, 312) == 1) {
myself.ShowPage(talker, "elder_filaur_q0312_08.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 312) == 1 && gg.GetMemoState(talker, 312) == 1 && gg.OwnItemCount(talker, 14875) >= 1) {
myself.RemoveMemo(talker, 312);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 312);
myself.ShowPage(talker, "elder_filaur_q0312_09.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 312) == 1 && gg.GetMemoState(talker, 312) == 1) {
myself.RemoveMemo(talker, 312);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 312);
myself.ShowPage(talker, "elder_filaur_q0312_10.htm");

}

}
if (reply == 6) {
myself.ShowPage(talker, "elder_filaur_q0312_01a.htm");

}
if (reply == 7) {
myself.ShowPage(talker, "elder_filaur_q0312_01b.htm");

}
if (reply == 8) {
myself.ShowPage(talker, "elder_filaur_q0312_01c.htm");

}
if (reply == 100) {
if (gg.HaveMemo(talker, 312) == 1 && gg.GetMemoState(talker, 312) == 1 && gg.OwnItemCount(talker, 14875) >= 1) {
myself.ShowPage(talker, "elder_filaur_q0312_06a.htm");

}

}
if (reply == 101) {
if (gg.HaveMemo(talker, 312) == 1 && gg.GetMemoState(talker, 312) == 1 && gg.OwnItemCount(talker, 14875) >= 1) {
myself.ShowPage(talker, "elder_filaur_q0312_06b.htm");

}

}
if (reply == 102) {
if (gg.HaveMemo(talker, 312) == 1 && gg.GetMemoState(talker, 312) == 1 && gg.OwnItemCount(talker, 14875) >= 1) {
myself.ShowPage(talker, "elder_filaur_q0312_06c.htm");

}

}
if (reply == 103) {
if (gg.HaveMemo(talker, 312) == 1 && gg.GetMemoState(talker, 312) == 1 && gg.OwnItemCount(talker, 14875) >= 1) {
myself.ShowPage(talker, "elder_filaur_q0312_06d.htm");

}

}
if (reply >= 11 && reply <= 31 && gg.HaveMemo(talker, 312) == 1 && gg.GetMemoState(talker, 312) == 1) {
if (reply == 16 && gg.HaveMemo(talker, 312) == 1) {
if (gg.OwnItemCount(talker, 14875) >= 244) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 9487, 1);
myself.DeleteItem1(talker, 14875, 244);
gg.AddLog(3, talker, 312);
myself.ShowPage(talker, "elder_filaur_q0312_07.htm");

}

} else {
myself.ShowPage(talker, "elder_filaur_q0312_07a.htm");

}

}
if (reply == 17 && gg.HaveMemo(talker, 312) == 1) {
if (gg.OwnItemCount(talker, 14875) >= 153) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 9488, 1);
myself.DeleteItem1(talker, 14875, 153);
gg.AddLog(3, talker, 312);
myself.ShowPage(talker, "elder_filaur_q0312_07.htm");

}

} else {
myself.ShowPage(talker, "elder_filaur_q0312_07a.htm");

}

}
if (reply == 18 && gg.HaveMemo(talker, 312) == 1) {
if (gg.OwnItemCount(talker, 14875) >= 122) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 9489, 1);
myself.DeleteItem1(talker, 14875, 122);
gg.AddLog(3, talker, 312);
myself.ShowPage(talker, "elder_filaur_q0312_07.htm");

}

} else {
myself.ShowPage(talker, "elder_filaur_q0312_07a.htm");

}

}
if (reply == 19 && gg.HaveMemo(talker, 312) == 1) {
if (gg.OwnItemCount(talker, 14875) >= 82) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 9490, 1);
myself.DeleteItem1(talker, 14875, 82);
gg.AddLog(3, talker, 312);
myself.ShowPage(talker, "elder_filaur_q0312_07.htm");

}

} else {
myself.ShowPage(talker, "elder_filaur_q0312_07a.htm");

}

}
if (reply == 20 && gg.HaveMemo(talker, 312) == 1) {
if (gg.OwnItemCount(talker, 14875) >= 82) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 9491, 1);
myself.DeleteItem1(talker, 14875, 82);
gg.AddLog(3, talker, 312);
myself.ShowPage(talker, "elder_filaur_q0312_07.htm");

}

} else {
myself.ShowPage(talker, "elder_filaur_q0312_07a.htm");

}

}
if (reply == 26 && gg.HaveMemo(talker, 312) == 1) {
if (gg.OwnItemCount(talker, 14875) >= 86) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 9497, 1);
myself.DeleteItem1(talker, 14875, 86);
gg.AddLog(3, talker, 312);
myself.ShowPage(talker, "elder_filaur_q0312_07.htm");

}

} else {
myself.ShowPage(talker, "elder_filaur_q0312_07a.htm");

}

}
if (reply == 27 && gg.HaveMemo(talker, 312) == 1) {
if (gg.OwnItemCount(talker, 14875) >= 24) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 9628, 1);
myself.DeleteItem1(talker, 14875, 24);
gg.AddLog(3, talker, 312);
myself.ShowPage(talker, "elder_filaur_q0312_07.htm");

}

} else {
myself.ShowPage(talker, "elder_filaur_q0312_07a.htm");

}

}
if (reply == 28 && gg.HaveMemo(talker, 312) == 1) {
if (gg.OwnItemCount(talker, 14875) >= 43) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 9629, 1);
myself.DeleteItem1(talker, 14875, 43);
gg.AddLog(3, talker, 312);
myself.ShowPage(talker, "elder_filaur_q0312_07.htm");

}

} else {
myself.ShowPage(talker, "elder_filaur_q0312_07a.htm");

}

}
if (reply == 29 && gg.HaveMemo(talker, 312) == 1) {
if (gg.OwnItemCount(talker, 14875) >= 36) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 9630, 1);
myself.DeleteItem1(talker, 14875, 36);
gg.AddLog(3, talker, 312);
myself.ShowPage(talker, "elder_filaur_q0312_07.htm");

}

} else {
myself.ShowPage(talker, "elder_filaur_q0312_07a.htm");

}

}
if (reply == 30 && gg.HaveMemo(talker, 312) == 1) {
if (gg.OwnItemCount(talker, 14875) >= 667) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 9625, 1);
myself.DeleteItem1(talker, 14875, 667);
gg.AddLog(3, talker, 312);
myself.ShowPage(talker, "elder_filaur_q0312_07.htm");

}

} else {
myself.ShowPage(talker, "elder_filaur_q0312_07a.htm");

}

}
if (reply == 31 && gg.HaveMemo(talker, 312) == 1) {
if (gg.OwnItemCount(talker, 14875) >= 1000) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 9626, 1);
myself.DeleteItem1(talker, 14875, 1000);
gg.AddLog(3, talker, 312);
myself.ShowPage(talker, "elder_filaur_q0312_07.htm");

}

} else {
myself.ShowPage(talker, "elder_filaur_q0312_07a.htm");

}

}

}

}
super;
	}


}