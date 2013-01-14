package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class daring extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 1) == 0 && myself.GetOneTimeQuestFlag(talker, 1) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Letters of Love");

}
if (gg.HaveMemo(talker, 1) == 0 && myself.GetOneTimeQuestFlag(talker, 1) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Letters of Love (Done)");

}
if (gg.HaveMemo(talker, 1) && gg.OwnItemCount(talker, 688) && myself.GetOneTimeQuestFlag(talker, 1) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Letters of Love (In Progress)");

}
if (gg.HaveMemo(talker, 1) && gg.OwnItemCount(talker, 688) == 0 && myself.GetOneTimeQuestFlag(talker, 1) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Letters of Love (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 1) == 0 && myself.GetOneTimeQuestFlag(talker, 1) == 0) {
myself.SetCurrentQuestID(1);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level > 1) {
myself.FHTML_SetFileName(fhtml0, "daring_q0001_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 1);
myself.ShowQuestFHTML(talker, fhtml0, 1);

} else {
myself.ShowPage(talker, "daring_q0001_01.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 1) == 0 && myself.GetOneTimeQuestFlag(talker, 1) == 1) {
myself.SetCurrentQuestID(1);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 1) && gg.OwnItemCount(talker, 688) && myself.GetOneTimeQuestFlag(talker, 1) == 0) {
myself.SetCurrentQuestID(1);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "daring_q0001_08.htm");
myself.SetFlagJournal(talker, 1, 3);
myself.ShowQuestMark(talker, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1079, 1);
myself.DeleteItem1(talker, 688, 1);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 1) && gg.OwnItemCount(talker, 688) == 0 && myself.GetOneTimeQuestFlag(talker, 1) == 0) {
myself.SetCurrentQuestID(1);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1079) > 0) {
myself.ShowPage(talker, "daring_q0001_09.htm");

} else if (gg.OwnItemCount(talker, 1080) > 0) {
myself.ShowPage(talker, "daring_q0001_10.htm");
myself.DeleteItem1(talker, 1080, 1);
myself.RemoveMemo(talker, 1);
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 1);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4151, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 10 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 1);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4151, "", "", "", "", ""));

}
gg.AddLog(2, talker, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.GiveItem1(talker, 906, 1);
myself.IncrementParam(talker, 0, 5672);
myself.IncrementParam(talker, 1, 446);
myself.GiveItem1(talker, 57, 2466);
myself.SetOneTimeQuestFlag(talker, 1, 1);

} else {
myself.ShowPage(talker, "daring_q0001_07.htm");

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
if (quest_id == 1) {
myself.SetCurrentQuestID(1);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "daring_q0001_06.htm", 1);
myself.SetFlagJournal(talker, 1, 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
gg.AddLog(1, talker, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 687) == 0) {
myself.GiveItem1(talker, 687, 1);

}

}
return;

}
super;
	}


}