package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class collector_pipi extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 417) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Scavenger");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1643) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1643) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Scavenger (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 0) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "collector_pipi_q0417_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 417);
myself.ShowQuestFHTML(talker, fhtml0, 417);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1643) == 1) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "collector_pipi_q0417_06.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1643) == 0) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "collector_pipi_q0417_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 417) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 18 && talker.occupation == 53 && gg.OwnItemCount(talker, 1642) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 417);
myself.SetMemoStateEx(talker, 417, 1, 0);
gg.AddLog(1, talker, 417);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 1643, 1);
myself.SetFlagJournal(talker, 417, 1);
myself.ShowQuestPage(talker, "collector_pipi_q0417_05.htm", 417);

}

} else if (talker.occupation != 53) {
if (talker.occupation == 54) {
myself.ShowQuestPage(talker, "collector_pipi_q0417_02a.htm", 417);

} else {
myself.ShowQuestPage(talker, "collector_pipi_q0417_08.htm", 417);

}

} else if (talker.level < 18 && talker.occupation == 53) {
myself.ShowQuestPage(talker, "collector_pipi_q0417_02.htm", 417);

} else if (talker.level >= 18 && talker.occupation == 53 && gg.OwnItemCount(talker, 1642) == 1) {
myself.ShowQuestPage(talker, "collector_pipi_q0417_04.htm", 417);

}
return;

}
super;
	}


}