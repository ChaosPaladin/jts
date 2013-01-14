package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class miner_bolter extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 5) == 0 && myself.GetOneTimeQuestFlag(talker, 5) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Miner's Favor");

}
if (gg.HaveMemo(talker, 5) == 0 && myself.GetOneTimeQuestFlag(talker, 5) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Miner's Favor (Done)");

}
if (gg.HaveMemo(talker, 5) == 1 && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1548) + gg.OwnItemCount(talker, 1549) + gg.OwnItemCount(talker, 1550) + gg.OwnItemCount(talker, 1551) < 4) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Miner's Favor (In Progress)");

}
if (gg.HaveMemo(talker, 5) == 1 && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1548) + gg.OwnItemCount(talker, 1549) + gg.OwnItemCount(talker, 1550) + gg.OwnItemCount(talker, 1551) >= 4 && myself.GetOneTimeQuestFlag(talker, 5) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Miner's Favor (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3261) == 0 && gg.OwnItemCount(talker, 3257) == 0 && gg.OwnItemCount(talker, 3250) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3257) >= 1 && gg.OwnItemCount(talker, 3261) == 0 && gg.OwnItemCount(talker, 3250) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Prosperity (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 5) == 0 && myself.GetOneTimeQuestFlag(talker, 5) == 0) {
myself.SetCurrentQuestID(5);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 2) {
myself.FHTML_SetFileName(fhtml0, "miner_bolter_q0005_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 5);
myself.ShowQuestFHTML(talker, fhtml0, 5);

} else {
myself.ShowPage(talker, "miner_bolter_q0005_01.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 5) == 0 && myself.GetOneTimeQuestFlag(talker, 5) == 1) {
myself.SetCurrentQuestID(5);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 5) == 1 && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1548) + gg.OwnItemCount(talker, 1549) + gg.OwnItemCount(talker, 1550) + gg.OwnItemCount(talker, 1551) < 4) {
myself.SetCurrentQuestID(5);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "miner_bolter_q0005_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 5) == 1 && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1548) + gg.OwnItemCount(talker, 1549) + gg.OwnItemCount(talker, 1550) + gg.OwnItemCount(talker, 1551) >= 4 && myself.GetOneTimeQuestFlag(talker, 5) == 0) {
myself.SetCurrentQuestID(5);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "miner_bolter_q0005_06.htm");
myself.DeleteItem1(talker, 1548, gg.OwnItemCount(talker, 1548));
myself.DeleteItem1(talker, 1549, gg.OwnItemCount(talker, 1549));
myself.DeleteItem1(talker, 1550, gg.OwnItemCount(talker, 1550));
myself.DeleteItem1(talker, 1551, gg.OwnItemCount(talker, 1551));
myself.DeleteItem1(talker, 1547, gg.OwnItemCount(talker, 1547));
myself.GiveItem1(talker, 906, 1);
myself.IncrementParam(talker, 0, 5672);
myself.IncrementParam(talker, 1, 446);
myself.GiveItem1(talker, 57, 2466);
myself.RemoveMemo(talker, 5);
gg.AddLog(2, talker, 5);
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 1);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4151, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 10 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 1);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4151, "", "", "", "", ""));

}
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 5, 1);

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3261) == 0 && gg.OwnItemCount(talker, 3257) == 0 && gg.OwnItemCount(talker, 3250) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "miner_bolter_q0221_01.htm");
myself.GiveItem1(talker, 3257, 1);

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3257) >= 1 && gg.OwnItemCount(talker, 3261) == 0 && gg.OwnItemCount(talker, 3250) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "miner_bolter_q0221_02.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 5) {
myself.SetCurrentQuestID(5);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "miner_bolter_q0005_03.htm", 5);
myself.SetMemo(talker, 5);
myself.ShowQuestMark(talker, 5);
gg.AddLog(1, talker, 5);
myself.GiveItem1(talker, 1547, 1);
myself.GiveItem1(talker, 1552, 1);
myself.SetFlagJournal(talker, 5, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}
return;

}
super;
	}


}