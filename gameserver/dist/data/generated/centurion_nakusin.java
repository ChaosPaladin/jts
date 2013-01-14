package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class centurion_nakusin extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 4) == 0 && myself.GetOneTimeQuestFlag(talker, 4) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Long Live the Pa'agrio Lord");

}
if (gg.HaveMemo(talker, 4) == 0 && myself.GetOneTimeQuestFlag(talker, 4) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Long Live the Pa'agrio Lord (Done)");

}
if (gg.HaveMemo(talker, 4) == 1 && gg.OwnItemCount(talker, 1541) + gg.OwnItemCount(talker, 1542) + gg.OwnItemCount(talker, 1543) + gg.OwnItemCount(talker, 1544) + gg.OwnItemCount(talker, 1545) + gg.OwnItemCount(talker, 1546) < 6) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Long Live the Pa'agrio Lord (In Progress)");

}
if (gg.HaveMemo(talker, 4) == 1 && gg.OwnItemCount(talker, 1541) + gg.OwnItemCount(talker, 1542) + gg.OwnItemCount(talker, 1543) + gg.OwnItemCount(talker, 1544) + gg.OwnItemCount(talker, 1545) + gg.OwnItemCount(talker, 1546) >= 6 && myself.GetOneTimeQuestFlag(talker, 4) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Long Live the Pa'agrio Lord (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 4) == 0 && myself.GetOneTimeQuestFlag(talker, 4) == 0) {
myself.SetCurrentQuestID(4);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 3) {
myself.ShowQuestPage(talker, "centurion_nakusin_q0004_00.htm", 4);

} else if (talker.level >= 2) {
myself.FHTML_SetFileName(fhtml0, "centurion_nakusin_q0004_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 4);
myself.ShowQuestFHTML(talker, fhtml0, 4);

} else {
myself.ShowQuestPage(talker, "centurion_nakusin_q0004_01.htm", 4);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 4) == 0 && myself.GetOneTimeQuestFlag(talker, 4) == 1) {
myself.SetCurrentQuestID(4);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 4) == 1 && gg.OwnItemCount(talker, 1541) + gg.OwnItemCount(talker, 1542) + gg.OwnItemCount(talker, 1543) + gg.OwnItemCount(talker, 1544) + gg.OwnItemCount(talker, 1545) + gg.OwnItemCount(talker, 1546) < 6) {
myself.SetCurrentQuestID(4);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "centurion_nakusin_q0004_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 4) == 1 && gg.OwnItemCount(talker, 1541) + gg.OwnItemCount(talker, 1542) + gg.OwnItemCount(talker, 1543) + gg.OwnItemCount(talker, 1544) + gg.OwnItemCount(talker, 1545) + gg.OwnItemCount(talker, 1546) >= 6 && myself.GetOneTimeQuestFlag(talker, 4) == 0) {
myself.SetCurrentQuestID(4);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "centurion_nakusin_q0004_06.htm");
myself.GiveItem1(talker, 4, 1);
myself.IncrementParam(talker, 0, 4254);
myself.IncrementParam(talker, 1, 335);
myself.GiveItem1(talker, 57, 1850);
myself.DeleteItem1(talker, 1541, gg.OwnItemCount(talker, 1541));
myself.DeleteItem1(talker, 1542, gg.OwnItemCount(talker, 1542));
myself.DeleteItem1(talker, 1543, gg.OwnItemCount(talker, 1543));
myself.DeleteItem1(talker, 1544, gg.OwnItemCount(talker, 1544));
myself.DeleteItem1(talker, 1545, gg.OwnItemCount(talker, 1545));
myself.DeleteItem1(talker, 1546, gg.OwnItemCount(talker, 1546));
myself.SetOneTimeQuestFlag(talker, 4, 1);
myself.RemoveMemo(talker, 4);
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 1);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4151, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 10 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 1);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4151, "", "", "", "", ""));

}
gg.AddLog(2, talker, 4);
myself.SoundEffect(talker, "ItemSound.quest_finish");

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
if (quest_id == 4) {
myself.SetCurrentQuestID(4);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 4);
myself.ShowQuestMark(talker, 4);
gg.AddLog(1, talker, 4);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "centurion_nakusin_q0004_03.htm", 4);
myself.SetFlagJournal(talker, 4, 1);

}
return;

}
super;
	}


}