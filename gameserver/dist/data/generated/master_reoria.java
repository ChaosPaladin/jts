package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_reoria extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 407) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Elven Scout");

}
if (gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1207) > 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Elven Scout (In Progress)");

}
if (gg.HaveMemo(talker, 407) == 1 && gg.GetMemoState(talker, 407) == 1 && gg.OwnItemCount(talker, 1207) == 0 && gg.OwnItemCount(talker, 1216) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Elven Scout (In Progress)");

}
if (gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1216) > 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Elven Scout (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 407) == 0) {
myself.SetCurrentQuestID(407);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "master_reoria_q0407_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 407);
myself.ShowQuestFHTML(talker, fhtml0, 407);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1207) > 0) {
myself.SetCurrentQuestID(407);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_reoria_q0407_06.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 407) == 1 && gg.GetMemoState(talker, 407) == 1 && gg.OwnItemCount(talker, 1207) == 0 && gg.OwnItemCount(talker, 1216) == 0) {
myself.SetCurrentQuestID(407);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_reoria_q0407_08.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1216) > 0) {
myself.SetCurrentQuestID(407);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_reoria_q0407_07.htm");
myself.DeleteItem1(talker, 1216, 1);
myself.GiveItem1(talker, 1217, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 19932);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 26630);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 33328);

}
myself.GiveItem1(talker, 57, 163800);

}
myself.RemoveMemo(talker, 407);
gg.AddLog(2, talker, 407);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

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
if (quest_id == 407) {
myself.SetCurrentQuestID(407);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.occupation == 18) {
if (talker.level >= 18) {
if (gg.OwnItemCount(talker, 1217) > 0) {
myself.ShowQuestPage(talker, "master_reoria_q0407_04.htm", 407);

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "master_reoria_q0407_05.htm", 407);
myself.GiveItem1(talker, 1207, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 407);
gg.AddLog(1, talker, 407);
myself.SetMemoState(talker, 407, 0);
myself.SetFlagJournal(talker, 407, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}

} else {
myself.ShowQuestPage(talker, "master_reoria_q0407_03.htm", 407);

}

} else if (talker.occupation == 22) {
myself.ShowQuestPage(talker, "master_reoria_q0407_02a.htm", 407);

} else {
myself.ShowQuestPage(talker, "master_reoria_q0407_02.htm", 407);

}
return;

}
super;
	}


}