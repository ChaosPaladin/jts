package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class elder_arin extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 295) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Dreaming of the Skies");

}
if (gg.HaveMemo(talker, 295) == 1 && gg.OwnItemCount(talker, 1492) < 50) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Dreaming of the Skies (In Progress)");

}
if (gg.HaveMemo(talker, 295) == 1 && gg.OwnItemCount(talker, 1492) >= 50) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Dreaming of the Skies (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 1 && gg.OwnItemCount(talker, 2866) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 3 && gg.OwnItemCount(talker, 2871) && gg.OwnItemCount(talker, 2872) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 3 && gg.OwnItemCount(talker, 2872) >= 5) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2866)) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3251) >= 1 && gg.OwnItemCount(talker, 3262) == 0 && gg.OwnItemCount(talker, 3256) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3262) == 0 && gg.OwnItemCount(talker, 3256) == 0 && gg.OwnItemCount(talker, 3251) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3256) >= 1 && gg.OwnItemCount(talker, 3262) == 0 && gg.OwnItemCount(talker, 3251) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3262) >= 1 && gg.OwnItemCount(talker, 3256) == 0 && gg.OwnItemCount(talker, 3251) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Testimony of Prosperity (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 295) == 0) {
myself.SetCurrentQuestID(295);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 11) {
myself.FHTML_SetFileName(fhtml0, "elder_arin_q0295_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 295);
myself.ShowQuestFHTML(talker, fhtml0, 295);

} else {
myself.ShowQuestPage(talker, "elder_arin_q0295_01.htm", 295);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 295) == 1 && gg.OwnItemCount(talker, 1492) < 50) {
myself.SetCurrentQuestID(295);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_arin_q0295_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 295) == 1 && gg.OwnItemCount(talker, 1492) >= 50) {
myself.SetCurrentQuestID(295);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1509) < 1) {
myself.ShowPage(talker, "elder_arin_q0295_05.htm");
myself.GiveItem1(talker, 1509, 1);
myself.IncrementParam(talker, 1, 500);
myself.DeleteItem1(talker, 1492, gg.OwnItemCount(talker, 1492));
myself.RemoveMemo(talker, 295);
gg.AddLog(2, talker, 295);
gg.AddLog(3, talker, 295);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (gg.OwnItemCount(talker, 1509) >= 1) {
myself.ShowPage(talker, "elder_arin_q0295_06.htm");
myself.GiveItem1(talker, 57, 2400);
myself.IncrementParam(talker, 1, 500);
myself.DeleteItem1(talker, 1492, gg.OwnItemCount(talker, 1492));
myself.RemoveMemo(talker, 295);
gg.AddLog(2, talker, 295);
gg.AddLog(3, talker, 295);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 1 && gg.OwnItemCount(talker, 2866) == 0) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_arin_q0231_01.htm");
myself.GiveItem1(talker, 2871, 1);
myself.SetMemoState(talker, 231, 3);

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 3 && gg.OwnItemCount(talker, 2871) && gg.OwnItemCount(talker, 2872) == 0) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_arin_q0231_02.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 3 && gg.OwnItemCount(talker, 2872) >= 5) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_arin_q0231_03.htm");
myself.GiveItem1(talker, 2866, 1);
myself.DeleteItem1(talker, 2872, gg.OwnItemCount(talker, 2872));
myself.SetMemoState(talker, 231, 1);
if (gg.OwnItemCount(talker, 2864) >= 1 && gg.OwnItemCount(talker, 2865) >= 1) {
myself.SetFlagJournal(talker, 231, 2);
myself.ShowQuestMark(talker, 231);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2866)) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_arin_q0231_04.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3251) >= 1 && gg.OwnItemCount(talker, 3262) == 0 && gg.OwnItemCount(talker, 3256) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_arin_q0221_01.htm");
myself.DeleteItem1(talker, 3251, gg.OwnItemCount(talker, 3251));

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3262) == 0 && gg.OwnItemCount(talker, 3256) == 0 && gg.OwnItemCount(talker, 3251) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_arin_q0221_02.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3256) >= 1 && gg.OwnItemCount(talker, 3262) == 0 && gg.OwnItemCount(talker, 3251) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_arin_q0221_03.htm");
myself.DeleteItem1(talker, 3256, 1);
myself.GiveItem1(talker, 3262, 1);

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3262) >= 1 && gg.OwnItemCount(talker, 3256) == 0 && gg.OwnItemCount(talker, 3251) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_arin_q0221_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 295) {
myself.SetCurrentQuestID(295);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 295);
myself.ShowQuestMark(talker, 295);
gg.AddLog(1, talker, 295);
myself.SetFlagJournal(talker, 295, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "elder_arin_q0295_03.htm", 295);

}
return;

}
super;
	}


}