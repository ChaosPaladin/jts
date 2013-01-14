package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sir_aron_tanford extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1271) > 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.OwnItemCount(talker, 2635) == 0 && gg.GetMemoState(talker, 212) == 2) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.OwnItemCount(talker, 2635) && gg.GetMemoState(talker, 212) == 3) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 4) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 2 && gg.OwnItemCount(talker, 3295)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 3) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of Sagittarius (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1271) > 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_aron_tanford_q0402_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 1) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sir_aron_tanford_q0212_01.htm");
if (gg.OwnItemCount(talker, 3027) == 0) {
myself.GiveItem1(talker, 3027, 1);

}
myself.SetMemoState(talker, 212, 2);
myself.SetFlagJournal(talker, 212, 2);
myself.ShowQuestMark(talker, 212);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.OwnItemCount(talker, 2635) == 0 && gg.GetMemoState(talker, 212) == 2) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_aron_tanford_q0212_02.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.OwnItemCount(talker, 2635) && gg.GetMemoState(talker, 212) == 3) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_aron_tanford_q0212_03.htm");
myself.DeleteItem1(talker, 2635, 1);
myself.DeleteItem1(talker, 3027, gg.OwnItemCount(talker, 3027));
myself.SetMemoState(talker, 212, 4);
myself.SetFlagJournal(talker, 212, 4);
myself.ShowQuestMark(talker, 212);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 4) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_aron_tanford_q0212_04.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 2 && gg.OwnItemCount(talker, 3295)) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_aron_tanford_q0224_01.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 3) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_aron_tanford_q0224_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 224) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 224) {
if (reply == 1 && gg.OwnItemCount(talker, 3295) > 0) {
myself.ShowPage(talker, "sir_aron_tanford_q0224_02.htm");
myself.DeleteItem1(talker, 3295, 1);
myself.SetMemoState(talker, 224, 3);
myself.SetFlagJournal(talker, 224, 3);
myself.ShowQuestMark(talker, 224);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
super;
	}


}