package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class minx extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 303) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Collect Arrowheads");

}
if (gg.HaveMemo(talker, 303) != 0 && gg.OwnItemCount(talker, 963) < 10) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Collect Arrowheads (In Progress)");

}
if (gg.HaveMemo(talker, 303) != 0 && gg.OwnItemCount(talker, 963) >= 10) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Collect Arrowheads (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 303) == 0) {
myself.SetCurrentQuestID(303);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 10) {
myself.FHTML_SetFileName(fhtml0, "minx_q0303_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 303);
myself.ShowQuestFHTML(talker, fhtml0, 303);

} else {
myself.ShowQuestPage(talker, "minx_q0303_02.htm", 303);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 303) != 0 && gg.OwnItemCount(talker, 963) < 10) {
myself.SetCurrentQuestID(303);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "minx_q0303_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 303) != 0 && gg.OwnItemCount(talker, 963) >= 10) {
myself.SetCurrentQuestID(303);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 963, gg.OwnItemCount(talker, 963));
myself.RemoveMemo(talker, 303);
gg.AddLog(2, talker, 303);
gg.AddLog(3, talker, 303);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.GiveItem1(talker, 57, 1000);
myself.IncrementParam(talker, 0, 2000);
myself.ShowPage(talker, "minx_q0303_06.htm");

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
if (quest_id == 303) {
myself.SetCurrentQuestID(303);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 303);
gg.AddLog(1, talker, 303);
myself.SetFlagJournal(talker, 303, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "minx_q0303_04.htm", 303);

}
return;

}
super;
	}


}