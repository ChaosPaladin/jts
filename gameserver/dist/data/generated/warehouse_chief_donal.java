package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_chief_donal extends master_lv3_ware {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 66 && gg.HaveMemo(talker, 18) == 0 && myself.GetOneTimeQuestFlag(talker, 18) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Meeting with the Golden Ram");

}
if (talker.level < 66 && gg.HaveMemo(talker, 18) == 0 && myself.GetOneTimeQuestFlag(talker, 18) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Meeting with the Golden Ram");

}
if (gg.HaveMemo(talker, 18) == 0 && myself.GetOneTimeQuestFlag(talker, 18) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Meeting with the Golden Ram (Done)");

}
if (gg.HaveMemo(talker, 18) == 1 && myself.GetOneTimeQuestFlag(talker, 18) == 0 && gg.GetMemoState(talker, 18) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Meeting with the Golden Ram (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 66 && gg.HaveMemo(talker, 18) == 0 && myself.GetOneTimeQuestFlag(talker, 18) == 0) {
myself.SetCurrentQuestID(18);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_donal_q0018_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 18);
myself.ShowQuestFHTML(talker, fhtml0, 18);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 66 && gg.HaveMemo(talker, 18) == 0 && myself.GetOneTimeQuestFlag(talker, 18) == 0) {
myself.SetCurrentQuestID(18);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_donal_q0018_0103.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 18) == 0 && myself.GetOneTimeQuestFlag(talker, 18) == 1) {
myself.SetCurrentQuestID(18);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 18) == 1 && myself.GetOneTimeQuestFlag(talker, 18) == 0 && gg.GetMemoState(talker, 18) == 1 * 10 + 1) {
myself.SetCurrentQuestID(18);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_donal_q0018_0105.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 18) {
myself.SetCurrentQuestID(18);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 66 && gg.HaveMemo(talker, 18) == 0 && myself.GetOneTimeQuestFlag(talker, 18) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 18);
myself.ShowQuestMark(talker, 18);
myself.SetMemoState(talker, 18, 1 * 10 + 1);
gg.AddLog(1, talker, 18);
myself.SetFlagJournal(talker, 18, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "warehouse_chief_donal_q0018_0104.htm", 18);

}

}
return;

}
super;
	}


}