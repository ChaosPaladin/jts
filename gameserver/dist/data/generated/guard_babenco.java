package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_babenco extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 407) == 1 && gg.GetMemoState(talker, 407) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Elven Scout (In Progress)");

}
if (talker.level >= 20 && gg.HaveMemo(talker, 39) == 0 && myself.GetOneTimeQuestFlag(talker, 39) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Red-eyed Invaders");

}
if (talker.level < 20 && gg.HaveMemo(talker, 39) == 0 && myself.GetOneTimeQuestFlag(talker, 39) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Red-eyed Invaders");

}
if (gg.HaveMemo(talker, 39) == 0 && myself.GetOneTimeQuestFlag(talker, 39) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Red-eyed Invaders (Done)");

}
if (gg.HaveMemo(talker, 39) == 1 && myself.GetOneTimeQuestFlag(talker, 39) == 0 && gg.GetMemoState(talker, 39) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Red-eyed Invaders (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 407) == 1 && gg.GetMemoState(talker, 407) == 1) {
myself.SetCurrentQuestID(407);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_babenco_q0407_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level >= 20 && gg.HaveMemo(talker, 39) == 0 && myself.GetOneTimeQuestFlag(talker, 39) == 0) {
myself.SetCurrentQuestID(39);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "guard_babenco_q0039_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 39);
myself.ShowQuestFHTML(talker, fhtml0, 39);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || talker.level < 20 && gg.HaveMemo(talker, 39) == 0 && myself.GetOneTimeQuestFlag(talker, 39) == 0) {
myself.SetCurrentQuestID(39);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_babenco_q0039_0103.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 39) == 0 && myself.GetOneTimeQuestFlag(talker, 39) == 1) {
myself.SetCurrentQuestID(39);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 39) == 1 && myself.GetOneTimeQuestFlag(talker, 39) == 0 && gg.GetMemoState(talker, 39) == 1 * 10 + 1) {
myself.SetCurrentQuestID(39);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_babenco_q0039_0105.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 39) {
myself.SetCurrentQuestID(39);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 39);
myself.ShowQuestMark(talker, 39);
myself.SetMemoState(talker, 39, 1 * 10 + 1);
gg.AddLog(1, talker, 39);
myself.SetFlagJournal(talker, 39, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "guard_babenco_q0039_0104.htm", 39);

}
return;

}
super;
	}


}