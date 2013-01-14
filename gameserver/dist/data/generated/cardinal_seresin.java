package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cardinal_seresin extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 8 && gg.OwnItemCount(talker, 2739)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 9) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 18) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Oath (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 8 && gg.OwnItemCount(talker, 2739)) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cardinal_seresin_q0217_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 9) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cardinal_seresin_q0217_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 18) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cardinal_seresin_q0217_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 1) {
myself.SetCurrentQuestID(464);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cardinal_seresin_q0464_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 217) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 217) {
if (reply == 1) {
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 8 && gg.OwnItemCount(talker, 2739)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "cardinal_seresin_q0217_03.htm");
myself.GiveItem1(talker, 2738, 1);
myself.GiveItem1(talker, 2737, 1);
myself.DeleteItem1(talker, 2739, 1);
myself.SetMemoState(talker, 217, 9);
myself.SetFlagJournal(talker, 217, 12);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 464) {
myself.SetCurrentQuestID(464);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 464) {
if (reply == 1) {
if (gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 1) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 57, 42910);
myself.IncrementParam(talker, 0, 15449);
myself.IncrementParam(talker, 1, 17696);
myself.DeleteItem1(talker, 15539, gg.OwnItemCount(talker, 15539));
myself.RemoveMemo(talker, 464);
gg.SetDailyQuestFlag(talker, 464);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 464);
gg.AddLog(3, talker, 464);
myself.ShowPage(talker, "cardinal_seresin_q0464_02.htm");

}

}

}

}
super;
	}


}