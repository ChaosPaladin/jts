package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class head_blacksmith_kusto extends master_lv3_black {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 183) == 0 && myself.GetOneTimeQuestFlag(talker, 183) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Relics Exploration");

}
if (myself.GetOneTimeQuestFlag(talker, 183) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Relics Exploration (Done)");

}
if (gg.HaveMemo(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 183) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Relics Exploration (In Progress)");

}
if (gg.HaveMemo(talker, 187) == 1 && gg.GetMemoState(talker, 187) == 2 && myself.GetOneTimeQuestFlag(talker, 187) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Nikola's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 4 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Contract Completion (In Progress)");

}
if (gg.HaveMemo(talker, 190) == 0 && myself.GetOneTimeQuestFlag(talker, 190) == 0 && myself.GetOneTimeQuestFlag(talker, 187) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Lost Dream");

}
if (myself.GetOneTimeQuestFlag(talker, 190) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Lost Dream (Done)");

}
if (gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 1 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Lost Dream (In Progress)");

}
if (gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 2 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Lost Dream (In Progress)");

}
if (gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) >= 3 && gg.GetMemoState(talker, 190) <= 4 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Lost Dream (In Progress)");

}
if (gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 5 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Lost Dream (In Progress)");

}
if (gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 4 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Vain Conclusion (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && talker.is_pledge_master == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(talker, 503) == 1 && gg.OwnItemCount(talker, 3843) == 0 && gg.OwnItemCount(talker, 3871) == 0) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(talker, 503) == 1 && gg.OwnItemCount(talker, 3843) == 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.OwnItemCount(talker, 3871) == 1 && gg.OwnItemCount(talker, 3843) == 0) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Pursuit of Clan Ambition! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 183) == 0 && myself.GetOneTimeQuestFlag(talker, 183) == 0) {
myself.SetCurrentQuestID(183);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 40) {
myself.ShowQuestPage(talker, "head_blacksmith_kusto_q0183_01.htm", 183);

} else {
myself.ShowQuestPage(talker, "head_blacksmith_kusto_q0183_03.htm", 183);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 183) == 1) {
myself.SetCurrentQuestID(183);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 183) == 0) {
myself.SetCurrentQuestID(183);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_kusto_q0183_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 187) == 1 && gg.GetMemoState(talker, 187) == 2 && myself.GetOneTimeQuestFlag(talker, 187) == 0) {
myself.SetCurrentQuestID(187);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_kusto_q0187_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 4 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
myself.SetCurrentQuestID(189);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_kusto_q0189_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 190) == 0 && myself.GetOneTimeQuestFlag(talker, 190) == 0 && myself.GetOneTimeQuestFlag(talker, 187) == 1) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 42) {
myself.FHTML_SetFileName(fhtml0, "head_blacksmith_kusto_q0190_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 190);
myself.ShowQuestFHTML(talker, fhtml0, 190);

} else {
myself.ShowQuestPage(talker, "head_blacksmith_kusto_q0190_02.htm", 190);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 190) == 1) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 1 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_kusto_q0190_04.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 2 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_kusto_q0190_05.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) >= 3 && gg.GetMemoState(talker, 190) <= 4 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_kusto_q0190_07.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 5 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.RemoveMemo(talker, 190);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "head_blacksmith_kusto_q0190_08.htm");
myself.SetOneTimeQuestFlag(talker, 190, 1);
gg.AddLog(2, talker, 190);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 48) {
myself.GiveItem1(talker, 57, 109427);
myself.IncrementParam(talker, 0, 309467);
myself.IncrementParam(talker, 1, 20614);

} else {
myself.GiveItem1(talker, 57, 109427);

}
gg.AddLog(3, talker, 190);

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 4 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_kusto_q0191_01.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && talker.is_pledge_master == 0) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_kusto_q0503_01a.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 503) == 1 && gg.OwnItemCount(talker, 3843) == 0 && gg.OwnItemCount(talker, 3871) == 0) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_kusto_q0503_01.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 503) == 1 && gg.OwnItemCount(talker, 3843) == 1) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_kusto_q0503_02.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.OwnItemCount(talker, 3871) == 1 && gg.OwnItemCount(talker, 3843) == 0) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_kusto_q0503_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 183) {
myself.SetCurrentQuestID(183);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 183) == 0 && talker.level >= 40 && myself.GetOneTimeQuestFlag(talker, 183) == 0) {
myself.SetMemoState(talker, 183, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "head_blacksmith_kusto_q0183_04.htm", 183);
myself.SetFlagJournal(talker, 183, 1);
myself.ShowQuestMark(talker, 183);
gg.AddLog(1, talker, quest_id);

}

}
return;

}
if (quest_id == 190) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 190) == 0 && talker.level >= 42 && myself.GetOneTimeQuestFlag(talker, 190) == 0 && myself.GetOneTimeQuestFlag(talker, 187) == 1) {
myself.SetMemoState(talker, 190, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "head_blacksmith_kusto_q0190_03.htm", 190);
gg.AddLog(1, talker, quest_id);
myself.SetFlagJournal(talker, 190, 1);
myself.ShowQuestMark(talker, 190);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 183) {
myself.SetCurrentQuestID(183);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 183) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "head_blacksmith_kusto_q0183_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 183);
myself.ShowQuestFHTML(talker, fhtml0, 183);

}

}
if (ask == 187) {
myself.SetCurrentQuestID(187);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 187) {
if (reply == 1) {
if (gg.HaveMemo(talker, 187) == 1 && gg.GetMemoState(talker, 187) == 2 && myself.GetOneTimeQuestFlag(talker, 187) == 0) {
myself.ShowPage(talker, "head_blacksmith_kusto_q0187_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 187) == 1 && gg.GetMemoState(talker, 187) == 2 && myself.GetOneTimeQuestFlag(talker, 187) == 0) {
myself.DeleteItem1(talker, 10368, gg.OwnItemCount(talker, 10368));
myself.ShowPage(talker, "head_blacksmith_kusto_q0187_03.htm");
gg.AddLog(2, talker, 187);
myself.RemoveMemo(talker, 187);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 187, 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 47) {
myself.GiveItem1(talker, 57, 93383);
myself.IncrementParam(talker, 0, 285935);
myself.IncrementParam(talker, 1, 18711);

} else {
myself.GiveItem1(talker, 57, 93383);

}
gg.AddLog(3, talker, 187);

}

}

}

}
if (ask == 189) {
myself.SetCurrentQuestID(189);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 189) {
if (reply == 1) {
if (gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 4 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
myself.ShowPage(talker, "head_blacksmith_kusto_q0189_02.htm");
myself.RemoveMemo(talker, 189);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 189);
myself.SetOneTimeQuestFlag(talker, 189, 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 48) {
myself.GiveItem1(talker, 57, 121527);
myself.IncrementParam(talker, 0, 309467);
myself.IncrementParam(talker, 1, 20614);

} else {
myself.GiveItem1(talker, 57, 121527);

}
gg.AddLog(3, talker, 189);

}

}

}

}
if (ask == 190) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 190) {
if (reply == 1) {
if (gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 2 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
myself.SetMemoState(talker, 190, 3);
myself.ShowPage(talker, "head_blacksmith_kusto_q0190_06.htm");
myself.SetFlagJournal(talker, 190, 3);
myself.ShowQuestMark(talker, 190);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 191) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 191) {
if (reply == 1) {
if (gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 4 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
myself.RemoveMemo(talker, 191);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "head_blacksmith_kusto_q0191_02.htm");
myself.SetOneTimeQuestFlag(talker, 191, 1);
gg.AddLog(2, talker, 191);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 48) {
myself.GiveItem1(talker, 57, 117327);
myself.IncrementParam(talker, 0, 309467);
myself.IncrementParam(talker, 1, 20614);

} else {
myself.GiveItem1(talker, 57, 117327);

}
gg.AddLog(3, talker, 191);

}

}

}

}
if (ask == 503) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 503) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3871, 1);
myself.DeleteItem1(talker, 3843, gg.OwnItemCount(talker, 3843));
myself.ShowPage(talker, "head_blacksmith_kusto_q0503_03.htm");

}

}

}
super;
	}


}