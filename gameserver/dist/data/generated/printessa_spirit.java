package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class printessa_spirit extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 620) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Four Goblets");

}
if (gg.HaveMemo(talker, 620) == 1 && gg.OwnItemCount(talker, 7262) == 0 && gg.OwnItemCount(talker, 7256) == 0 || gg.OwnItemCount(talker, 7257) == 0 || gg.OwnItemCount(talker, 7258) == 0 || gg.OwnItemCount(talker, 7259) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Four Goblets (In Progress)");

}
if (gg.HaveMemo(talker, 620) == 1 && gg.OwnItemCount(talker, 7262) == 0 && gg.OwnItemCount(talker, 7256) >= 1 && gg.OwnItemCount(talker, 7257) >= 1 && gg.OwnItemCount(talker, 7258) >= 1 && gg.OwnItemCount(talker, 7259) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Four Goblets (In Progress)");

}
if (gg.HaveMemo(talker, 620) == 1 && gg.OwnItemCount(talker, 7262) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Four Goblets (In Progress)");

}
if (gg.HaveMemo(talker, 119) == 0 && talker.level >= 74 && gg.OwnItemCount(talker, 7262) >= 1 && myself.GetOneTimeQuestFlag(talker, 119) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Last Imperial Prince");

}
if (gg.HaveMemo(talker, 119) == 0 && talker.level < 74 || gg.OwnItemCount(talker, 7262) == 0 && myself.GetOneTimeQuestFlag(talker, 119) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Last Imperial Prince");

}
if (gg.HaveMemo(talker, 119) == 0 && myself.GetOneTimeQuestFlag(talker, 119) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Last Imperial Prince (Done)");

}
if (gg.HaveMemo(talker, 119) == 1 && gg.GetMemoState(talker, 119) == 1 && gg.OwnItemCount(talker, 7262) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Last Imperial Prince (In Progress)");

}
if (gg.HaveMemo(talker, 119) == 1 && gg.GetMemoState(talker, 119) == 1 && gg.OwnItemCount(talker, 7262) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Last Imperial Prince (In Progress)");

}
if (gg.HaveMemo(talker, 119) == 1 && gg.GetMemoState(talker, 119) == 2) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Last Imperial Prince (In Progress)");

}
if (gg.HaveMemo(talker, 654) == 0 && talker.level >= 74 && myself.GetOneTimeQuestFlag(talker, 119) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Journey to a Settlement");

}
if (gg.HaveMemo(talker, 654) == 0 && talker.level < 74 || myself.GetOneTimeQuestFlag(talker, 119) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Journey to a Settlement");

}
if (gg.HaveMemo(talker, 654) == 1 && gg.GetMemoState(talker, 654) == 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Journey to a Settlement (In Progress)");

}
if (gg.HaveMemo(talker, 654) == 1 && gg.GetMemoState(talker, 654) == 2 && gg.OwnItemCount(talker, 8072) == 0) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Journey to a Settlement (In Progress)");

}
if (gg.HaveMemo(talker, 654) == 1 && gg.GetMemoState(talker, 654) == 2 && gg.OwnItemCount(talker, 8072) >= 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Journey to a Settlement (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 620) == 0) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 74) {
myself.ShowQuestPage(talker, "printessa_spirit_q0620_01.htm", 620);

} else {
myself.ShowQuestPage(talker, "printessa_spirit_q0620_12.htm", 620);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 620) == 1 && gg.OwnItemCount(talker, 7262) == 0 && gg.OwnItemCount(talker, 7256) == 0 || gg.OwnItemCount(talker, 7257) == 0 || gg.OwnItemCount(talker, 7258) == 0 || gg.OwnItemCount(talker, 7259) == 0) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "printessa_spirit_q0620_14.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 620) == 1 && gg.OwnItemCount(talker, 7262) == 0 && gg.OwnItemCount(talker, 7256) >= 1 && gg.OwnItemCount(talker, 7257) >= 1 && gg.OwnItemCount(talker, 7258) >= 1 && gg.OwnItemCount(talker, 7259) >= 1) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "printessa_spirit_q0620_15.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 620) == 1 && gg.OwnItemCount(talker, 7262) >= 1) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "printessa_spirit_q0620_17.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 119) == 0 && talker.level >= 74 && gg.OwnItemCount(talker, 7262) >= 1 && myself.GetOneTimeQuestFlag(talker, 119) == 0) {
myself.SetCurrentQuestID(119);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "printessa_spirit_q0119_01.htm", 119);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 119) == 0 && talker.level < 74 || gg.OwnItemCount(talker, 7262) == 0 && myself.GetOneTimeQuestFlag(talker, 119) == 0) {
myself.SetCurrentQuestID(119);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "printessa_spirit_q0119_02.htm", 119);

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 119) == 0 && myself.GetOneTimeQuestFlag(talker, 119) == 1) {
myself.SetCurrentQuestID(119);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "printessa_spirit_q0119_03.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 119) == 1 && gg.GetMemoState(talker, 119) == 1 && gg.OwnItemCount(talker, 7262) >= 1) {
myself.SetCurrentQuestID(119);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "printessa_spirit_q0119_07.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 119) == 1 && gg.GetMemoState(talker, 119) == 1 && gg.OwnItemCount(talker, 7262) == 0) {
myself.SetCurrentQuestID(119);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "printessa_spirit_q0119_07a.htm");
myself.RemoveMemo(talker, 119);

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 119) == 1 && gg.GetMemoState(talker, 119) == 2) {
myself.SetCurrentQuestID(119);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "printessa_spirit_q0119_08.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 654) == 0 && talker.level >= 74 && myself.GetOneTimeQuestFlag(talker, 119) == 1) {
myself.SetCurrentQuestID(654);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "printessa_spirit_q0654_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 654);
myself.ShowQuestFHTML(talker, fhtml0, 654);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 654) == 0 && talker.level < 74 || myself.GetOneTimeQuestFlag(talker, 119) == 0) {
myself.SetCurrentQuestID(654);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "printessa_spirit_q0654_02.htm", 654);

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 654) == 1 && gg.GetMemoState(talker, 654) == 1) {
myself.SetCurrentQuestID(654);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 654, 2);
myself.SetFlagJournal(talker, 654, 2);
myself.ShowQuestMark(talker, 654);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "printessa_spirit_q0654_04.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 654) == 1 && gg.GetMemoState(talker, 654) == 2 && gg.OwnItemCount(talker, 8072) == 0) {
myself.SetCurrentQuestID(654);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "printessa_spirit_q0654_05.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 654) == 1 && gg.GetMemoState(talker, 654) == 2 && gg.OwnItemCount(talker, 8072) >= 1) {
myself.SetCurrentQuestID(654);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "printessa_spirit_q0654_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 620) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SetMemoState(talker, 620, 0);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 7262) >= 1) {
myself.SetFlagJournal(talker, 620, 2);

}
myself.ShowQuestPage(talker, "printessa_spirit_q0620_13.htm", 620);
gg.AddLog(1, talker, quest_id);

}
return;

}
if (quest_id == 119) {
myself.SetCurrentQuestID(119);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 119) == 0 && talker.level >= 74 && gg.OwnItemCount(talker, 7262) >= 1 && myself.GetOneTimeQuestFlag(talker, 119) == 0) {
myself.SetMemo(talker, quest_id);
myself.SetMemoState(talker, 119, 1);
myself.SetFlagJournal(talker, 119, 1);
myself.ShowQuestMark(talker, 119);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "printessa_spirit_q0119_06.htm", 119);
gg.AddLog(1, talker, quest_id);

}

}
return;

}
if (quest_id == 654) {
myself.SetCurrentQuestID(654);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 654) == 0 && talker.level >= 74 && myself.GetOneTimeQuestFlag(talker, 119) == 1) {
myself.SetMemo(talker, quest_id);
myself.SetMemoState(talker, 654, 1);
myself.SetFlagJournal(talker, 654, 1);
myself.ShowQuestMark(talker, 654);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "printessa_spirit_q0654_03.htm", 654);
gg.AddLog(1, talker, quest_id);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 620) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 620) {
if (reply == 5) {
myself.ShowQuestPage(talker, "printessa_spirit_q0620_02.htm", 620);

}
if (reply == 6) {
myself.ShowQuestPage(talker, "printessa_spirit_q0620_03.htm", 620);

}
if (reply == 7) {
myself.ShowQuestPage(talker, "printessa_spirit_q0620_04.htm", 620);

}
if (reply == 8) {
myself.ShowQuestPage(talker, "printessa_spirit_q0620_05.htm", 620);

}
if (reply == 9) {
myself.ShowQuestPage(talker, "printessa_spirit_q0620_06.htm", 620);

}
if (reply == 10) {
myself.ShowQuestPage(talker, "printessa_spirit_q0620_07.htm", 620);

}
if (reply == 11) {
myself.ShowQuestPage(talker, "printessa_spirit_q0620_08.htm", 620);

}
if (reply == 12) {
myself.ShowQuestPage(talker, "printessa_spirit_q0620_09.htm", 620);

}
if (reply == 13) {
myself.ShowQuestPage(talker, "printessa_spirit_q0620_10.htm", 620);

}
if (reply == 14) {
myself.FHTML_SetFileName(fhtml0, "printessa_spirit_q0620_11.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 620);
myself.ShowQuestFHTML(talker, fhtml0, 620);

}
if (reply == 4) {
if (gg.HaveMemo(talker, 620) && gg.OwnItemCount(talker, 7262) == 0 && gg.OwnItemCount(talker, 7256) >= 1 && gg.OwnItemCount(talker, 7257) >= 1 && gg.OwnItemCount(talker, 7258) >= 1 && gg.OwnItemCount(talker, 7259) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7262, 1);
myself.SetFlagJournal(talker, 620, 2);
myself.ShowQuestMark(talker, 620);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7256, 1);
myself.DeleteItem1(talker, 7257, 1);
myself.DeleteItem1(talker, 7258, 1);
myself.DeleteItem1(talker, 7259, 1);
gg.AddLog(3, talker, 620);
myself.ShowPage(talker, "printessa_spirit_q0620_16.htm");

}

}

}
if (reply == 1) {
myself.DeleteItem1(talker, 7260, gg.OwnItemCount(talker, 7260));
myself.DeleteItem1(talker, 7261, gg.OwnItemCount(talker, 7261));
myself.RemoveMemo(talker, 620);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "printessa_spirit_q0620_18.htm");
gg.AddLog(2, talker, 620);

}
if (reply == 2) {
myself.ShowPage(talker, "printessa_spirit_q0620_19.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "printessa_spirit_q0620_20.htm");

}

}
if (ask == 119) {
myself.SetCurrentQuestID(119);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 119) {
if (reply == 1) {
myself.ShowQuestPage(talker, "printessa_spirit_q0119_04.htm", 119);

}
if (reply == 2) {
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "printessa_spirit_q0119_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 119);
myself.ShowQuestFHTML(talker, fhtml0, 119);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}

}
if (ask == 119) {
myself.SetCurrentQuestID(119);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 119) {
if (reply == 3) {
myself.ShowPage(talker, "printessa_spirit_q0119_09.htm");

}
if (reply == 4) {
if (gg.HaveMemo(talker, 119) == 1 && gg.GetMemoState(talker, 119) == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 150292);
myself.IncrementParam(talker, 0, 902439);
myself.IncrementParam(talker, 1, 90067);
myself.RemoveMemo(talker, 119);
gg.AddLog(2, talker, 119);
myself.SetOneTimeQuestFlag(talker, 119, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "printessa_spirit_q0119_10.htm");

}

}

}

}
if (ask == 654) {
myself.SetCurrentQuestID(654);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 654) {
if (reply == 1) {
if (gg.HaveMemo(talker, 654) == 1 && gg.GetMemoState(talker, 654) == 1) {
myself.SetMemoState(talker, 654, 2);
myself.SetFlagJournal(talker, 654, 2);
myself.ShowQuestMark(talker, 654);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "printessa_spirit_q0654_04.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 654) == 1 && gg.GetMemoState(talker, 654) == 2 && gg.OwnItemCount(talker, 8072) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 8073, 1);
myself.DeleteItem1(talker, 8072, gg.OwnItemCount(talker, 8072));
myself.RemoveMemo(talker, 654);
gg.AddLog(2, talker, 654);
gg.AddLog(3, talker, 654);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "printessa_spirit_q0654_07.htm");

}

}

}

}
super;
	}


}