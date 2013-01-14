package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sir_collin_windawood extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 155) == 1 && gg.OwnItemCount(talker, 1019) == 1 && myself.GetOneTimeQuestFlag(talker, 155) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Find Sir Windawood (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1271) > 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 12 && gg.OwnItemCount(talker, 2642)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 13) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 6) == 1 && gg.OwnItemCount(talker, 7571) >= 1 && gg.GetMemoState(talker, 6) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Step Into the Future (In Progress)");

}
if (gg.HaveMemo(talker, 6) == 1 && gg.GetMemoState(talker, 6) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Step Into the Future (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 155) == 1 && gg.OwnItemCount(talker, 1019) == 1 && myself.GetOneTimeQuestFlag(talker, 155) == 0) {
myself.SetCurrentQuestID(155);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1019, gg.OwnItemCount(talker, 1019));
myself.GiveItem1(talker, 734, 1);
myself.RemoveMemo(talker, 155);
gg.AddLog(2, talker, 155);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 155, 1);
myself.ShowPage(talker, "sir_collin_windawood_q0305_01.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1271) > 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_collin_windawood_q0402_01.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 12 && gg.OwnItemCount(talker, 2642)) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sir_collin_windawood_q0212_01.htm");
myself.DeleteItem1(talker, 2642, 1);
myself.GiveItem1(talker, 2646, 1);
myself.SetMemoState(talker, 212, 13);
myself.SetFlagJournal(talker, 212, 17);
myself.ShowQuestMark(talker, 212);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 13) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_collin_windawood_q0212_02.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 6) == 1 && gg.OwnItemCount(talker, 7571) >= 1 && gg.GetMemoState(talker, 6) == 2 * 10 + 1) {
myself.SetCurrentQuestID(6);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 6, 2);
myself.ShowPage(talker, "sir_collin_windawood_q0006_0201.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 6) == 1 && gg.GetMemoState(talker, 6) == 3 * 10 + 1) {
myself.SetCurrentQuestID(6);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_collin_windawood_q0006_0303.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 6) {
myself.SetCurrentQuestID(6);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 6) {
i0 = myself.GetHTMLCookie(talker, 6, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 6) == 1) {
if (gg.OwnItemCount(talker, 7571) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7571, 1);
myself.DeleteItem1(talker, 0, 0);
myself.DeleteItem1(talker, 0, 0);
myself.ShowPage(talker, "sir_collin_windawood_q0006_0301.htm");
myself.SetMemoState(talker, 6, 3 * 10 + 1);
myself.SetFlagJournal(talker, 6, 3);
myself.ShowQuestMark(talker, 6);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "sir_collin_windawood_q0006_0302.htm");

}

}

}

}
super;
	}


}