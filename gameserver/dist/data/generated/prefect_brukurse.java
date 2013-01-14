package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class prefect_brukurse extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 274) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Skirmish with the Werewolves");

}
if (gg.HaveMemo(talker, 274)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Skirmish with the Werewolves (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 274) == 0) {
myself.SetCurrentQuestID(274);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 3) {
myself.ShowQuestPage(talker, "prefect_brukurse_q0274_00.htm", 274);

} else if (talker.level < 9) {
myself.ShowQuestPage(talker, "prefect_brukurse_q0274_01.htm", 274);

} else if (gg.OwnItemCount(talker, 1507) || gg.OwnItemCount(talker, 1506)) {
myself.FHTML_SetFileName(fhtml0, "prefect_brukurse_q0274_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 274);
myself.ShowQuestFHTML(talker, fhtml0, 274);

} else {
myself.ShowQuestPage(talker, "prefect_brukurse_q0274_07.htm", 274);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 274)) {
myself.SetCurrentQuestID(274);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1477) < 40) {
myself.ShowPage(talker, "prefect_brukurse_q0274_04.htm");

} else if (gg.OwnItemCount(talker, 1501) < 1) {
myself.ShowPage(talker, "prefect_brukurse_q0274_05.htm");
myself.RemoveMemo(talker, 274);
gg.AddLog(2, talker, 274);
gg.AddLog(3, talker, 274);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1477) * 30 + 2300);
myself.DeleteItem1(talker, 1477, gg.OwnItemCount(talker, 1477));

} else {
myself.ShowPage(talker, "prefect_brukurse_q0274_06.htm");
myself.RemoveMemo(talker, 274);
gg.AddLog(2, talker, 274);
gg.AddLog(3, talker, 274);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1477) * 30 + gg.OwnItemCount(talker, 1501) * 600 + 2300);
myself.DeleteItem1(talker, 1477, gg.OwnItemCount(talker, 1477));
myself.DeleteItem1(talker, 1501, gg.OwnItemCount(talker, 1501));

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
if (quest_id == 274) {
myself.SetCurrentQuestID(274);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 274);
myself.ShowQuestMark(talker, 274);
gg.AddLog(1, talker, 274);
myself.SetFlagJournal(talker, 274, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "prefect_brukurse_q0274_03.htm", 274);

}
return;

}
super;
	}


}