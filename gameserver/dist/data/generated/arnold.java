package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class arnold extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 104)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Spirit of Mirrors (In Progress)");

}
if (gg.HaveMemo(talker, 153) == 0 && myself.GetOneTimeQuestFlag(talker, 153) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Deliver Goods");

}
if (gg.HaveMemo(talker, 153) == 0 && myself.GetOneTimeQuestFlag(talker, 153) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Deliver Goods (Done)");

}
if (gg.HaveMemo(talker, 153) != 0 && gg.OwnItemCount(talker, 1016) != 0 && gg.OwnItemCount(talker, 1017) != 0 && gg.OwnItemCount(talker, 1018) != 0 == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Deliver Goods (In Progress)");

}
if (gg.HaveMemo(talker, 153) != 0 && gg.OwnItemCount(talker, 1016) != 0 && gg.OwnItemCount(talker, 1017) != 0 && gg.OwnItemCount(talker, 1018) != 0 != 0 && myself.GetOneTimeQuestFlag(talker, 153) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Deliver Goods (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 104)) {
myself.SetCurrentQuestID(104);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "arnold_q0104_01.htm");
i0 = gg.GetMemoStateEx(talker, 104, 1);
myself.SetMemoStateEx(talker, 104, 1, i0 + 100);
if (gg.GetMemoStateEx(talker, 104, 1) == 11) {
myself.SetFlagJournal(talker, 104, 2);
myself.ShowQuestMark(talker, 104);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 153) == 0 && myself.GetOneTimeQuestFlag(talker, 153) == 0) {
myself.SetCurrentQuestID(153);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 2) {
myself.FHTML_SetFileName(fhtml0, "arnold_q0302_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 153);
myself.ShowQuestFHTML(talker, fhtml0, 153);

} else {
myself.ShowQuestPage(talker, "arnold_q0302_02.htm", 153);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 153) == 0 && myself.GetOneTimeQuestFlag(talker, 153) == 1) {
myself.SetCurrentQuestID(153);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 153) != 0 && gg.OwnItemCount(talker, 1016) != 0 && gg.OwnItemCount(talker, 1017) != 0 && gg.OwnItemCount(talker, 1018) != 0 == 0) {
myself.SetCurrentQuestID(153);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "arnold_q0302_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 153) != 0 && gg.OwnItemCount(talker, 1016) != 0 && gg.OwnItemCount(talker, 1017) != 0 && gg.OwnItemCount(talker, 1018) != 0 != 0 && myself.GetOneTimeQuestFlag(talker, 153) == 0) {
myself.SetCurrentQuestID(153);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1012, gg.OwnItemCount(talker, 1012));
myself.DeleteItem1(talker, 1016, gg.OwnItemCount(talker, 1016));
myself.DeleteItem1(talker, 1017, gg.OwnItemCount(talker, 1017));
myself.DeleteItem1(talker, 1018, gg.OwnItemCount(talker, 1018));
myself.RemoveMemo(talker, 153);
gg.AddLog(2, talker, 153);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 153, 1);
myself.GiveItem1(talker, 875, 2);
myself.IncrementParam(talker, 0, 600);
myself.ShowPage(talker, "arnold_q0302_06.htm");

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
if (quest_id == 153) {
myself.SetCurrentQuestID(153);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 153);
gg.AddLog(1, talker, 153);
myself.SetFlagJournal(talker, 153, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 1012) == 0) {
myself.GiveItem1(talker, 1012, 1);

}
if (gg.OwnItemCount(talker, 1013) == 0) {
myself.GiveItem1(talker, 1013, 1);

}
if (gg.OwnItemCount(talker, 1014) == 0) {
myself.GiveItem1(talker, 1014, 1);

}
if (gg.OwnItemCount(talker, 1015) == 0) {
myself.GiveItem1(talker, 1015, 1);

}
myself.ShowPage(talker, "arnold_q0302_04.htm");

}
return;

}
super;
	}


}