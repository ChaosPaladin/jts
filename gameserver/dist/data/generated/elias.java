package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class elias extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 151) == 0 && myself.GetOneTimeQuestFlag(talker, 151) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Cure for Fever");

}
if (gg.HaveMemo(talker, 151) == 0 && myself.GetOneTimeQuestFlag(talker, 151) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Cure for Fever (Done)");

}
if (gg.HaveMemo(talker, 151) == 1 && gg.OwnItemCount(talker, 704) == 1 && myself.GetOneTimeQuestFlag(talker, 151) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Cure for Fever (In Progress)");

}
if (gg.HaveMemo(talker, 151) == 1 && gg.OwnItemCount(talker, 703) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Cure for Fever (In Progress)");

}
if (gg.HaveMemo(talker, 151) == 1 && gg.OwnItemCount(talker, 703) == 0 && gg.OwnItemCount(talker, 704) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Cure for Fever (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 151) == 0 && myself.GetOneTimeQuestFlag(talker, 151) == 0) {
myself.SetCurrentQuestID(151);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 15) {
myself.FHTML_SetFileName(fhtml0, "elias_q0259_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 151);
myself.ShowQuestFHTML(talker, fhtml0, 151);

} else {
myself.ShowQuestPage(talker, "elias_q0259_01.htm", 151);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 151) == 0 && myself.GetOneTimeQuestFlag(talker, 151) == 1) {
myself.SetCurrentQuestID(151);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 151) == 1 && gg.OwnItemCount(talker, 704) == 1 && myself.GetOneTimeQuestFlag(talker, 151) == 0) {
myself.SetCurrentQuestID(151);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elias_q0259_06.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 102, 1);
myself.IncrementParam(talker, 0, 13106);
myself.IncrementParam(talker, 1, 613);
myself.DeleteItem1(talker, 704, 1);
myself.RemoveMemo(talker, 151);
gg.AddLog(2, talker, 151);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 151, 1);
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 100000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4155, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 100000000 / 10000000 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 10000000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4155, "", "", "", "", ""));

}

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 151) == 1 && gg.OwnItemCount(talker, 703) == 1) {
myself.SetCurrentQuestID(151);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elias_q0259_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 151) == 1 && gg.OwnItemCount(talker, 703) == 0 && gg.OwnItemCount(talker, 704) == 0) {
myself.SetCurrentQuestID(151);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elias_q0259_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 151) {
myself.SetCurrentQuestID(151);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 151);
gg.AddLog(1, talker, 151);
myself.SetFlagJournal(talker, 151, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}
myself.ShowQuestPage(talker, "elias_q0259_03.htm", 151);
return;

}
super;
	}


}