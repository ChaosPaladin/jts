package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_chief_natools extends master_lv3_ware {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 141) == 0 && myself.GetOneTimeQuestFlag(talker, 141) == 0 && myself.GetOneTimeQuestFlag(talker, 140) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Shadow Fox - 3");

}
if (myself.GetOneTimeQuestFlag(talker, 141) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Shadow Fox - 3 (Done)");

}
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 1 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Shadow Fox - 3 (In Progress)");

}
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 2 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Shadow Fox - 3 (In Progress)");

}
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 3 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Shadow Fox - 3 (In Progress)");

}
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 4 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Shadow Fox - 3 (In Progress)");

}
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 5 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Shadow Fox - 3 (In Progress)");

}
if (myself.GetOneTimeQuestFlag(talker, 141) == 1 && gg.HaveMemo(talker, 142) == 0 && myself.GetOneTimeQuestFlag(talker, 142) == 0 && gg.HaveMemo(talker, 143) == 0 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Fallen Angel - Select");

}
if (myself.GetOneTimeQuestFlag(talker, 142) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Fallen Angel - Request of Dawn (Done)");

}
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 1 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Fallen Angel - Request of Dawn (In Progress)");

}
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) >= 2 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Fallen Angel - Request of Dawn (In Progress)");

}
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 1 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Fallen Angel - Request of Dusk (In Progress)");

}
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) >= 2 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Fallen Angel - Request of Dusk (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 141) == 0 && myself.GetOneTimeQuestFlag(talker, 141) == 0 && myself.GetOneTimeQuestFlag(talker, 140) == 1) {
myself.SetCurrentQuestID(141);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 37) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_natools_q0141_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 141);
myself.ShowQuestFHTML(talker, fhtml0, 141);

} else {
myself.ShowQuestPage(talker, "warehouse_chief_natools_q0141_02.htm", 141);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 141) == 1) {
myself.SetCurrentQuestID(141);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 1 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.SetCurrentQuestID(141);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_natools_q0141_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 2 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.SetCurrentQuestID(141);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 10350) >= 30) {
myself.DeleteItem1(talker, 10350, gg.OwnItemCount(talker, 10350));
myself.SetMemoState(talker, 141, 3);
myself.ShowPage(talker, "warehouse_chief_natools_q0141_08.htm");

} else {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_07.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 3 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.SetCurrentQuestID(141);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_natools_q0141_09.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 4 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.SetCurrentQuestID(141);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_natools_q0141_16.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 5 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.SetCurrentQuestID(141);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_natools_q0141_20.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 141) == 1 && gg.HaveMemo(talker, 142) == 0 && myself.GetOneTimeQuestFlag(talker, 142) == 0 && gg.HaveMemo(talker, 143) == 0 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 38) {
myself.ShowPage(talker, "warehouse_chief_natools_q0142_01.htm");

} else {
myself.ShowPage(talker, "warehouse_chief_natools_q0142_05.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 142) == 1) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 1 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_natools_q0142_08.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) >= 2 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_natools_q0142_11.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 1 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_natools_q0143_02.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) >= 2 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_natools_q0143_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 141) {
myself.SetCurrentQuestID(141);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 141) == 0 && talker.level >= 37 && myself.GetOneTimeQuestFlag(talker, 141) == 0 && myself.GetOneTimeQuestFlag(talker, 140) == 1) {
myself.SetMemoState(talker, 141, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "warehouse_chief_natools_q0141_03.htm", 141);
gg.AddLog(1, talker, quest_id);
myself.SetFlagJournal(talker, 141, 1);
myself.ShowQuestMark(talker, 141);

}

}
return;

}
if (quest_id == 142) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (myself.GetOneTimeQuestFlag(talker, 141) == 1 && gg.HaveMemo(talker, 142) == 0 && myself.GetOneTimeQuestFlag(talker, 142) == 0 && gg.HaveMemo(talker, 143) == 0 && myself.GetOneTimeQuestFlag(talker, 143) == 0 && talker.level >= 38) {
myself.SetMemoState(talker, 142, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowPage(talker, "warehouse_chief_natools_q0142_07.htm");
gg.AddLog(1, talker, quest_id);
myself.SetFlagJournal(talker, 142, 1);
myself.ShowQuestMark(talker, 142);

}

}
return;

}
if (quest_id == 143) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (myself.GetOneTimeQuestFlag(talker, 141) == 1 && gg.HaveMemo(talker, 142) == 0 && myself.GetOneTimeQuestFlag(talker, 142) == 0 && gg.HaveMemo(talker, 143) == 0 && myself.GetOneTimeQuestFlag(talker, 143) == 0 && talker.level >= 38) {
myself.SetMemoState(talker, 143, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowPage(talker, "warehouse_chief_natools_q0143_01.htm");
gg.AddLog(1, talker, quest_id);
myself.SetFlagJournal(talker, 143, 1);
myself.ShowQuestMark(talker, 143);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 141) {
myself.SetCurrentQuestID(141);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 141) {
if (reply == 1) {
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 1 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_05.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 1 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.SetMemoState(talker, 141, 2);
myself.ShowPage(talker, "warehouse_chief_natools_q0141_06.htm");
myself.SetFlagJournal(talker, 141, 2);
myself.ShowQuestMark(talker, 141);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 3 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_10.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 3 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_11.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 3 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_12.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 3 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_13.htm");

}

}
if (reply == 7) {
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 3 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_14.htm");

}

}
if (reply == 8) {
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 3 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.SetMemoState(talker, 141, 4);
myself.ShowPage(talker, "warehouse_chief_natools_q0141_15.htm");

}

}
if (reply == 9) {
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 4 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_17.htm");

}

}
if (reply == 10) {
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 4 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_18.htm");

}

}
if (reply == 11) {
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 4 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.SetMemoState(talker, 141, 5);
myself.ShowPage(talker, "warehouse_chief_natools_q0141_19.htm");
myself.SetFlagJournal(talker, 141, 4);
myself.ShowQuestMark(talker, 141);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 12) {
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 5 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_21.htm");

}

}
if (reply == 13) {
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 5 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_22.htm");

}

}
if (reply == 14) {
if (gg.HaveMemo(talker, 141) == 1 && gg.GetMemoState(talker, 141) == 5 && myself.GetOneTimeQuestFlag(talker, 141) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_23.htm");
myself.RemoveMemo(talker, 141);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 141, 1);
gg.AddLog(2, talker, 141);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 43) {
myself.GiveItem1(talker, 57, 88888);
myself.IncrementParam(talker, 0, 278005);
myself.IncrementParam(talker, 1, 17058);

} else {
myself.GiveItem1(talker, 57, 88888);

}
gg.AddLog(3, talker, 141);

}

}

}
if (reply == 15) {
if (myself.GetOneTimeQuestFlag(talker, 141) == 1 && gg.HaveMemo(talker, 142) == 0 && myself.GetOneTimeQuestFlag(talker, 142) == 0 && gg.HaveMemo(talker, 143) == 0 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
if (talker.level >= 38) {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_25.htm");

} else {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_24.htm");

}

}

}
if (reply == 16) {
if (myself.GetOneTimeQuestFlag(talker, 141) == 1 && gg.HaveMemo(talker, 142) == 0 && myself.GetOneTimeQuestFlag(talker, 142) == 0 && gg.HaveMemo(talker, 143) == 0 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_26.htm");

}

}
if (reply == 17) {
if (myself.GetOneTimeQuestFlag(talker, 141) == 1 && gg.HaveMemo(talker, 142) == 0 && myself.GetOneTimeQuestFlag(talker, 142) == 0 && gg.HaveMemo(talker, 143) == 0 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0141_27.htm");

}

}

}
if (ask == 142) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 142) {
if (reply == 1) {
if (myself.GetOneTimeQuestFlag(talker, 141) == 1 && gg.HaveMemo(talker, 142) == 0 && myself.GetOneTimeQuestFlag(talker, 142) == 0 && gg.HaveMemo(talker, 143) == 0 && myself.GetOneTimeQuestFlag(talker, 143) == 0 && talker.level >= 38) {
myself.ShowPage(talker, "warehouse_chief_natools_q0142_02.htm");

}

}
if (reply == 2) {
if (myself.GetOneTimeQuestFlag(talker, 141) == 1 && gg.HaveMemo(talker, 142) == 0 && myself.GetOneTimeQuestFlag(talker, 142) == 0 && gg.HaveMemo(talker, 143) == 0 && myself.GetOneTimeQuestFlag(talker, 143) == 0 && talker.level >= 38) {
myself.ShowPage(talker, "warehouse_chief_natools_q0142_03.htm");

}

}
if (reply == 3) {
if (myself.GetOneTimeQuestFlag(talker, 141) == 1 && gg.HaveMemo(talker, 142) == 0 && myself.GetOneTimeQuestFlag(talker, 142) == 0 && gg.HaveMemo(talker, 143) == 0 && myself.GetOneTimeQuestFlag(talker, 143) == 0 && talker.level >= 38) {
myself.ShowPage(talker, "warehouse_chief_natools_q0142_04.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 1 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0142_09.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 1 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.GiveItem1(talker, 10351, 1);
myself.SetMemoState(talker, 142, 2);
myself.ShowPage(talker, "warehouse_chief_natools_q0142_10.htm");
myself.SetFlagJournal(talker, 142, 2);
myself.ShowQuestMark(talker, 142);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 143) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 143) {
if (reply == 4) {
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 1 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.ShowPage(talker, "warehouse_chief_natools_q0143_03.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 1 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.GiveItem1(talker, 10354, 1);
myself.SetMemoState(talker, 143, 2);
myself.ShowPage(talker, "warehouse_chief_natools_q0143_04.htm");
myself.SetFlagJournal(talker, 143, 2);
myself.ShowQuestMark(talker, 143);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}