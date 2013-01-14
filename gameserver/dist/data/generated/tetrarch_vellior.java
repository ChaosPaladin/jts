package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tetrarch_vellior extends npc_elder {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 170) == 0 && myself.GetOneTimeQuestFlag(talker, 170) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Dangerous Seduction");

}
if (gg.HaveMemo(talker, 170) == 0 && myself.GetOneTimeQuestFlag(talker, 170) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Dangerous Seduction (Done)");

}
if (gg.HaveMemo(talker, 170)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Dangerous Seduction (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 170) == 0 && myself.GetOneTimeQuestFlag(talker, 170) == 0) {
myself.SetCurrentQuestID(170);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 2) {
myself.ShowQuestPage(talker, "tetrarch_vellior_q0327_00.htm", 170);

} else if (talker.level >= 21) {
myself.FHTML_SetFileName(fhtml0, "tetrarch_vellior_q0327_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 170);
myself.ShowQuestFHTML(talker, fhtml0, 170);

} else {
myself.ShowQuestPage(talker, "tetrarch_vellior_q0327_02.htm", 170);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 170) == 0 && myself.GetOneTimeQuestFlag(talker, 170) == 1) {
myself.SetCurrentQuestID(170);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 170)) {
myself.SetCurrentQuestID(170);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1046) < 1) {
myself.ShowPage(talker, "tetrarch_vellior_q0327_05.htm");

} else if (gg.OwnItemCount(talker, 1046) >= 1 && myself.GetOneTimeQuestFlag(talker, 170) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tetrarch_vellior_q0327_06.htm");
myself.GiveItem1(talker, 57, 102680);
myself.IncrementParam(talker, 0, 38607);
myself.IncrementParam(talker, 1, 4018);
myself.DeleteItem1(talker, 1046, gg.OwnItemCount(talker, 1046));
myself.RemoveMemo(talker, 170);
gg.AddLog(2, talker, 170);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 170, 1);

}

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 170) {
myself.SetCurrentQuestID(170);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tetrarch_vellior_q0327_04.htm");
myself.SetMemo(talker, 170);
myself.ShowQuestMark(talker, 170);
gg.AddLog(1, talker, 170);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 170, 1);

}
return;

}
super;
	}


}