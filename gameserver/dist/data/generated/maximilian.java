package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maximilian extends master_lv3_hec {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 45 && gg.HaveMemo(talker, 32) == 0 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "An Obvious Lie");

}
if (talker.level < 45 && gg.HaveMemo(talker, 32) == 0 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "An Obvious Lie");

}
if (gg.HaveMemo(talker, 32) == 0 && myself.GetOneTimeQuestFlag(talker, 32) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "An Obvious Lie (Done)");

}
if (gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0 && gg.GetMemoState(talker, 32) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "An Obvious Lie (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 45 && gg.HaveMemo(talker, 32) == 0 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "maximilian_q0032_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 32);
myself.ShowQuestFHTML(talker, fhtml0, 32);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 45 && gg.HaveMemo(talker, 32) == 0 && myself.GetOneTimeQuestFlag(talker, 32) == 0) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maximilian_q0032_0103.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 32) == 0 && myself.GetOneTimeQuestFlag(talker, 32) == 1) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 32) == 1 && myself.GetOneTimeQuestFlag(talker, 32) == 0 && gg.GetMemoState(talker, 32) == 1 * 10 + 1) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maximilian_q0032_0105.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 32) {
myself.SetCurrentQuestID(32);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 32);
myself.ShowQuestMark(talker, 32);
myself.SetMemoState(talker, 32, 1 * 10 + 1);
gg.AddLog(1, talker, 32);
myself.SetFlagJournal(talker, 32, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "maximilian_q0032_0104.htm", 32);

}
return;

}
super;
	}


}