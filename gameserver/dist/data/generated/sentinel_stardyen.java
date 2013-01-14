package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sentinel_stardyen extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 163) == 0 && myself.GetOneTimeQuestFlag(talker, 163) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Legacy of the Poet");

}
if (gg.HaveMemo(talker, 163) == 0 && myself.GetOneTimeQuestFlag(talker, 163) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Legacy of the Poet (Done)");

}
if (gg.HaveMemo(talker, 163)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Legacy of the Poet (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 163) == 0 && myself.GetOneTimeQuestFlag(talker, 163) == 0) {
myself.SetCurrentQuestID(163);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 1 && talker.race != 3 && talker.race != 4 && talker.race != 0 && talker.race != 5) {
myself.ShowQuestPage(talker, "sentinel_stardyen_q0315_00.htm", 163);

} else if (talker.level >= 11) {
myself.FHTML_SetFileName(fhtml0, "sentinel_stardyen_q0315_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 163);
myself.ShowQuestFHTML(talker, fhtml0, 163);

} else {
myself.ShowPage(talker, "sentinel_stardyen_q0315_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 163) == 0 && myself.GetOneTimeQuestFlag(talker, 163) == 1) {
myself.SetCurrentQuestID(163);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "finishedquest.htm", 163);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 163)) {
myself.SetCurrentQuestID(163);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1038) == 1 && gg.OwnItemCount(talker, 1039) == 1 && gg.OwnItemCount(talker, 1040) == 1 && gg.OwnItemCount(talker, 1041) == 1 && myself.GetOneTimeQuestFlag(talker, 163) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sentinel_stardyen_q0315_09.htm");
myself.GiveItem1(talker, 57, 13890);
myself.IncrementParam(talker, 0, 21643);
myself.IncrementParam(talker, 1, 943);
myself.DeleteItem1(talker, 1038, 1);
myself.DeleteItem1(talker, 1039, 1);
myself.DeleteItem1(talker, 1040, 1);
myself.DeleteItem1(talker, 1041, 1);
myself.RemoveMemo(talker, 163);
gg.AddLog(2, talker, 163);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 163, 1);

}

} else {
myself.ShowPage(talker, "sentinel_stardyen_q0315_08.htm");

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
if (quest_id == 163) {
myself.SetCurrentQuestID(163);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 163);
myself.ShowQuestMark(talker, 163);
gg.AddLog(1, talker, 163);
myself.ShowQuestPage(talker, "sentinel_stardyen_q0315_07.htm", 163);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 163, 1);

}
return;

}
super;
	}


}