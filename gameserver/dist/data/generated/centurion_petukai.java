package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class centurion_petukai extends guard_stand {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 3 && gg.HaveMemo(talker, 9) == 0 && myself.GetOneTimeQuestFlag(talker, 9) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Into the City of Humans");

}
if (talker.level < 3 && gg.HaveMemo(talker, 9) == 0 && myself.GetOneTimeQuestFlag(talker, 9) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Into the City of Humans");

}
if (gg.HaveMemo(talker, 9) == 0 && myself.GetOneTimeQuestFlag(talker, 9) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Into the City of Humans (Done)");

}
if (gg.HaveMemo(talker, 9) == 1 && myself.GetOneTimeQuestFlag(talker, 9) == 0 && gg.GetMemoState(talker, 9) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Into the City of Humans (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 3 && gg.HaveMemo(talker, 9) == 0 && myself.GetOneTimeQuestFlag(talker, 9) == 0) {
myself.SetCurrentQuestID(9);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race == 3) {
myself.FHTML_SetFileName(fhtml0, "centurion_petukai_q0009_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 9);
myself.ShowQuestFHTML(talker, fhtml0, 9);

} else {
myself.ShowPage(talker, "centurion_petukai_q0009_0102.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 3 && gg.HaveMemo(talker, 9) == 0 && myself.GetOneTimeQuestFlag(talker, 9) == 0) {
myself.SetCurrentQuestID(9);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "centurion_petukai_q0009_0103.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 9) == 0 && myself.GetOneTimeQuestFlag(talker, 9) == 1) {
myself.SetCurrentQuestID(9);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 9) == 1 && myself.GetOneTimeQuestFlag(talker, 9) == 0 && gg.GetMemoState(talker, 9) == 1 * 10 + 1) {
myself.SetCurrentQuestID(9);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "centurion_petukai_q0009_0105.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 9) {
myself.SetCurrentQuestID(9);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 9);
myself.ShowQuestMark(talker, 9);
myself.SetMemoState(talker, 9, 1 * 10 + 1);
gg.AddLog(1, talker, 9);
myself.SetFlagJournal(talker, 9, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "centurion_petukai_q0009_0104.htm", 9);

}
return;

}
super;
	}


}