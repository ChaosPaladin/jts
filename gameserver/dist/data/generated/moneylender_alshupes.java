package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class moneylender_alshupes extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 261) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Collector's Dream");

}
if (gg.HaveMemo(talker, 261) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Collector's Dream (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 261) == 0) {
myself.SetCurrentQuestID(261);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 15) {
myself.FHTML_SetFileName(fhtml0, "moneylender_alshupes_q0261_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 261);
myself.ShowQuestFHTML(talker, fhtml0, 261);

} else {
myself.ShowQuestPage(talker, "moneylender_alshupes_q0261_01.htm", 261);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 261) == 1) {
myself.SetCurrentQuestID(261);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1087) >= 8) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 1000);
myself.IncrementParam(talker, 0, 2000);
myself.DeleteItem1(talker, 1087, gg.OwnItemCount(talker, 1087));
myself.ShowPage(talker, "moneylender_alshupes_q0261_05.htm");
myself.RemoveMemo(talker, 261);
gg.AddLog(2, talker, 261);
gg.AddLog(3, talker, 261);
myself.SoundEffect(talker, "ItemSound.quest_finish");
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 100000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4155, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 100000000 / 10000000 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 10000000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4155, "", "", "", "", ""));

}

}

} else {
myself.ShowPage(talker, "moneylender_alshupes_q0261_04.htm");

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
if (quest_id == 261) {
myself.SetCurrentQuestID(261);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 261);
gg.AddLog(1, talker, 261);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 261, 1);
myself.ShowQuestPage(talker, "moneylender_alshupes_q0261_03.htm", 261);

}
return;

}
super;
	}


}