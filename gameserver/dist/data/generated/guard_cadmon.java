package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_cadmon extends guard_stand {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 74 && gg.HaveMemo(talker, 11) == 0 && myself.GetOneTimeQuestFlag(talker, 11) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Secret Meeting with Ketra Orcs");

}
if (talker.level < 74 && gg.HaveMemo(talker, 11) == 0 && myself.GetOneTimeQuestFlag(talker, 11) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Secret Meeting with Ketra Orcs");

}
if (gg.HaveMemo(talker, 11) == 0 && myself.GetOneTimeQuestFlag(talker, 11) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Secret Meeting with Ketra Orcs (Done)");

}
if (gg.HaveMemo(talker, 11) == 1 && myself.GetOneTimeQuestFlag(talker, 11) == 0 && gg.GetMemoState(talker, 11) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Secret Meeting with Ketra Orcs (In Progress)");

}
if (talker.level >= 74 && gg.HaveMemo(talker, 12) == 0 && myself.GetOneTimeQuestFlag(talker, 12) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Secret Meeting with Varka Silenos");

}
if (talker.level < 74 && gg.HaveMemo(talker, 12) == 0 && myself.GetOneTimeQuestFlag(talker, 12) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Secret Meeting with Varka Silenos");

}
if (gg.HaveMemo(talker, 12) == 0 && myself.GetOneTimeQuestFlag(talker, 12) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Secret Meeting with Varka Silenos (Done)");

}
if (gg.HaveMemo(talker, 12) == 1 && myself.GetOneTimeQuestFlag(talker, 12) == 0 && gg.GetMemoState(talker, 12) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Secret Meeting with Varka Silenos (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 74 && gg.HaveMemo(talker, 11) == 0 && myself.GetOneTimeQuestFlag(talker, 11) == 0) {
myself.SetCurrentQuestID(11);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "guard_cadmon_q0011_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 11);
myself.ShowQuestFHTML(talker, fhtml0, 11);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 74 && gg.HaveMemo(talker, 11) == 0 && myself.GetOneTimeQuestFlag(talker, 11) == 0) {
myself.SetCurrentQuestID(11);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_cadmon_q0011_0103.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 11) == 0 && myself.GetOneTimeQuestFlag(talker, 11) == 1) {
myself.SetCurrentQuestID(11);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 11) == 1 && myself.GetOneTimeQuestFlag(talker, 11) == 0 && gg.GetMemoState(talker, 11) == 1 * 10 + 1) {
myself.SetCurrentQuestID(11);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_cadmon_q0011_0105.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || talker.level >= 74 && gg.HaveMemo(talker, 12) == 0 && myself.GetOneTimeQuestFlag(talker, 12) == 0) {
myself.SetCurrentQuestID(12);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "guard_cadmon_q0012_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 12);
myself.ShowQuestFHTML(talker, fhtml0, 12);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || talker.level < 74 && gg.HaveMemo(talker, 12) == 0 && myself.GetOneTimeQuestFlag(talker, 12) == 0) {
myself.SetCurrentQuestID(12);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_cadmon_q0012_0103.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 12) == 0 && myself.GetOneTimeQuestFlag(talker, 12) == 1) {
myself.SetCurrentQuestID(12);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 12) == 1 && myself.GetOneTimeQuestFlag(talker, 12) == 0 && gg.GetMemoState(talker, 12) == 1 * 10 + 1) {
myself.SetCurrentQuestID(12);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_cadmon_q0012_0105.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 11) {
myself.SetCurrentQuestID(11);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 74 && gg.HaveMemo(talker, 11) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 11);
myself.ShowQuestMark(talker, 11);
myself.SetMemoState(talker, 11, 1 * 10 + 1);
gg.AddLog(1, talker, 11);
myself.SetFlagJournal(talker, 11, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "guard_cadmon_q0011_0104.htm", 11);

}

}
return;

}
if (quest_id == 12) {
myself.SetCurrentQuestID(12);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 12);
myself.ShowQuestMark(talker, 12);
myself.SetMemoState(talker, 12, 1 * 10 + 1);
gg.AddLog(1, talker, 12);
myself.SetFlagJournal(talker, 12, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "guard_cadmon_q0012_0104.htm", 12);

}
return;

}
super;
	}


}