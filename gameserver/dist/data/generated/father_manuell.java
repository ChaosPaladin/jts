package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class father_manuell extends cleric_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 409) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Elven Oracle");

}
if (gg.HaveMemo(talker, 409) == 1 && gg.OwnItemCount(talker, 1231)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Elven Oracle (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 409) == 0) {
myself.SetCurrentQuestID(409);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 1235) == 0) {
myself.FHTML_SetFileName(fhtml0, "father_manuell_q0409_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 409);
myself.ShowQuestFHTML(talker, fhtml0, 409);

} else {
myself.ShowQuestPage(talker, "father_manuell_q0409_04.htm", 409);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 409) == 1 && gg.OwnItemCount(talker, 1231)) {
myself.SetCurrentQuestID(409);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1232) == 0 && gg.OwnItemCount(talker, 1233) == 0 && gg.OwnItemCount(talker, 1234) == 0 && gg.OwnItemCount(talker, 1236) == 0) {
if (gg.GetMemoState(talker, 409) == 2) {
myself.SetMemoState(talker, 409, 1);
myself.ShowPage(talker, "father_manuell_q0409_09.htm");
myself.SetFlagJournal(talker, 409, 8);
myself.ShowQuestMark(talker, 409);

} else {
myself.SetMemoState(talker, 409, 1);
myself.ShowPage(talker, "father_manuell_q0409_06.htm");

}

} else if (gg.OwnItemCount(talker, 1232) == 1 && gg.OwnItemCount(talker, 1233) == 1 && gg.OwnItemCount(talker, 1234) == 1 && gg.OwnItemCount(talker, 1236) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "father_manuell_q0409_08.htm");
myself.DeleteItem1(talker, 1232, 1);
myself.DeleteItem1(talker, 1233, 1);
myself.DeleteItem1(talker, 1234, 1);
myself.DeleteItem1(talker, 1231, 1);
myself.GiveItem1(talker, 1235, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 20392);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 27090);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 33788);

}
myself.GiveItem1(talker, 57, 163800);

}
myself.RemoveMemo(talker, 409);
gg.AddLog(2, talker, 409);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

} else {
myself.ShowPage(talker, "father_manuell_q0409_07.htm");

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
if (quest_id == 409) {
myself.SetCurrentQuestID(409);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 18 && talker.occupation == 25 && gg.OwnItemCount(talker, 1235) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 409);
myself.ShowQuestMark(talker, 409);
gg.AddLog(1, talker, 409);
myself.SetMemoState(talker, 409, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 1231, 1);
myself.SetFlagJournal(talker, 409, 1);
myself.ShowQuestPage(talker, "father_manuell_q0409_05.htm", 409);

}

} else if (talker.occupation != 25) {
if (talker.occupation == 29) {
myself.ShowQuestPage(talker, "father_manuell_q0409_02a.htm", 409);

} else {
myself.ShowQuestPage(talker, "father_manuell_q0409_02.htm", 409);

}

} else if (talker.level < 18 && talker.occupation == 25) {
myself.ShowQuestPage(talker, "father_manuell_q0409_03.htm", 409);

} else if (talker.level >= 18 && talker.occupation == 25 && gg.OwnItemCount(talker, 1235) == 1) {
myself.ShowQuestPage(talker, "father_manuell_q0409_04.htm", 409);

}
return;

}
super;
	}


}