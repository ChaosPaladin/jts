package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_gauen extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 9 && gg.OwnItemCount(talker, 3297)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 10) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 12) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 11 && gg.OwnItemCount(talker, 3303) && gg.OwnItemCount(talker, 3302) && gg.OwnItemCount(talker, 3304) && gg.OwnItemCount(talker, 3305)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 356) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Dig Up the Sea of Spores!");

}
if (gg.HaveMemo(talker, 356) == 1 && gg.OwnItemCount(talker, 5866) < 50 && gg.OwnItemCount(talker, 5865) < 50) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Dig Up the Sea of Spores! (In Progress)");

}
if (gg.HaveMemo(talker, 356) == 1 && gg.OwnItemCount(talker, 5866) >= 50 && gg.OwnItemCount(talker, 5865) < 50) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Dig Up the Sea of Spores! (In Progress)");

}
if (gg.HaveMemo(talker, 356) == 1 && gg.OwnItemCount(talker, 5866) < 50 && gg.OwnItemCount(talker, 5865) >= 50) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Dig Up the Sea of Spores! (In Progress)");

}
if (gg.HaveMemo(talker, 356) == 1 && gg.OwnItemCount(talker, 5866) >= 50 && gg.OwnItemCount(talker, 5865) >= 50) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Dig Up the Sea of Spores! (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) < 27) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 27) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 28) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) >= 29) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Certified Arbalester (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 9 && gg.OwnItemCount(talker, 3297)) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_gauen_q0224_01.htm");
myself.DeleteItem1(talker, 3297, 1);
myself.SetMemoState(talker, 224, 10);
myself.SetFlagJournal(talker, 224, 10);
myself.ShowQuestMark(talker, 224);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 10) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_gauen_q0224_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 12) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_gauen_q0224_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 11 && gg.OwnItemCount(talker, 3303) && gg.OwnItemCount(talker, 3302) && gg.OwnItemCount(talker, 3304) && gg.OwnItemCount(talker, 3305)) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "magister_gauen_q0224_02.htm");
myself.DeleteItem1(talker, 3302, 1);
myself.DeleteItem1(talker, 3303, 1);
myself.DeleteItem1(talker, 3304, 1);
myself.DeleteItem1(talker, 3305, 1);
myself.GiveItem1(talker, 3028, 1);
myself.GiveItem1(talker, 17, 10);
myself.SetMemoState(talker, 224, 12);
myself.SetFlagJournal(talker, 224, 12);
myself.ShowQuestMark(talker, 224);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 356) == 0) {
myself.SetCurrentQuestID(356);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 43) {
myself.ShowPage(talker, "magister_gauen_q0356_01.htm");

} else if (talker.level >= 43) {
myself.ShowQuestPage(talker, "magister_gauen_q0356_02.htm", 356);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 356) == 1 && gg.OwnItemCount(talker, 5866) < 50 && gg.OwnItemCount(talker, 5865) < 50) {
myself.SetCurrentQuestID(356);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_gauen_q0356_07.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 356) == 1 && gg.OwnItemCount(talker, 5866) >= 50 && gg.OwnItemCount(talker, 5865) < 50) {
myself.SetCurrentQuestID(356);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_gauen_q0356_08.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 356) == 1 && gg.OwnItemCount(talker, 5866) < 50 && gg.OwnItemCount(talker, 5865) >= 50) {
myself.SetCurrentQuestID(356);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_gauen_q0356_09.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 356) == 1 && gg.OwnItemCount(talker, 5866) >= 50 && gg.OwnItemCount(talker, 5865) >= 50) {
myself.SetCurrentQuestID(356);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_gauen_q0356_10.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) < 27) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_gauen_q0066_01.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 27) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 9780, gg.OwnItemCount(talker, 9780));
myself.SetMemoState(talker, 66, 28);
myself.ShowPage(talker, "magister_gauen_q0066_02.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 28) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_gauen_q0066_04.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) >= 29) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_gauen_q0066_10.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 356) {
myself.SetCurrentQuestID(356);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 356);
myself.SetFlagJournal(talker, 356, 1);
gg.AddLog(1, talker, 356);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "magister_gauen_q0356_06.htm", 356);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 356) {
myself.SetCurrentQuestID(356);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 356) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "magister_gauen_q0356_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 356);
myself.ShowQuestFHTML(talker, fhtml0, 356);

} else if (reply == 2) {
myself.SetFlagJournal(talker, 356, 1);
myself.ShowPage(talker, "magister_gauen_q0356_11.htm");

} else if (reply == 3 && gg.OwnItemCount(talker, 5866) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 31850);
myself.DeleteItem1(talker, 5866, gg.OwnItemCount(talker, 5866));
gg.AddLog(3, talker, 356);
myself.ShowPage(talker, "magister_gauen_q0356_12.htm");

}

} else if (reply == 4 && gg.OwnItemCount(talker, 5865) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 1, 1820);
myself.DeleteItem1(talker, 5865, gg.OwnItemCount(talker, 5865));
gg.AddLog(3, talker, 356);
myself.ShowPage(talker, "magister_gauen_q0356_13.htm");

}

} else if (reply == 5 && gg.OwnItemCount(talker, 5865) >= 50 && gg.OwnItemCount(talker, 5866) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 45500);
myself.IncrementParam(talker, 1, 2600);
myself.DeleteItem1(talker, 5866, gg.OwnItemCount(talker, 5866));
myself.DeleteItem1(talker, 5865, gg.OwnItemCount(talker, 5865));
myself.RemoveMemo(talker, 356);
gg.AddLog(2, talker, 356);
gg.AddLog(3, talker, 356);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "magister_gauen_q0356_14.htm");

}

} else if (reply == 6) {
myself.ShowPage(talker, "magister_gauen_q0356_15.htm");

} else if (reply == 7 && gg.OwnItemCount(talker, 5865) >= 50 && gg.OwnItemCount(talker, 5866) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
myself.DeleteItem1(talker, 5866, gg.OwnItemCount(talker, 5866));
myself.DeleteItem1(talker, 5865, gg.OwnItemCount(talker, 5865));
if (i0 < 20) {
myself.GiveItem1(talker, 57, 44000);
myself.RemoveMemo(talker, 356);
gg.AddLog(2, talker, 356);
gg.AddLog(3, talker, 356);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "magister_gauen_q0356_16.htm");

} else if (i0 < 70) {
myself.GiveItem1(talker, 57, 20950);
myself.RemoveMemo(talker, 356);
gg.AddLog(2, talker, 356);
gg.AddLog(3, talker, 356);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "magister_gauen_q0356_17.htm");

} else if (i0 >= 70) {
myself.GiveItem1(talker, 57, 10400);
myself.RemoveMemo(talker, 356);
gg.AddLog(2, talker, 356);
gg.AddLog(3, talker, 356);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "magister_gauen_q0356_18.htm");

}

}

} else if (reply == 8) {
myself.RemoveMemo(talker, 356);
myself.DeleteItem1(talker, 5866, gg.OwnItemCount(talker, 5866));
myself.DeleteItem1(talker, 5865, gg.OwnItemCount(talker, 5865));
gg.AddLog(2, talker, 356);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "magister_gauen_q0356_19.htm");

}

}
if (ask == 66) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 66) {
if (reply == 1) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 28) {
myself.ShowPage(talker, "magister_gauen_q0066_03.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 28) {
myself.ShowPage(talker, "magister_gauen_q0066_05.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 28) {
myself.ShowPage(talker, "magister_gauen_q0066_06.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 28) {
myself.ShowPage(talker, "magister_gauen_q0066_07.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 28) {
myself.ShowPage(talker, "magister_gauen_q0066_08.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 28) {
myself.SetMemoState(talker, 66, 29);
myself.ShowPage(talker, "magister_gauen_q0066_09.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 66, 17);
myself.ShowQuestMark(talker, 66);

}

}

}
super;
	}


}