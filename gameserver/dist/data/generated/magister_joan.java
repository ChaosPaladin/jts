package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_joan extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 4) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Repent Your Sins (In Progress)");

}
if (gg.GetMemoState(talker, 422) == 8 && gg.OwnItemCount(talker, 4329) < 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Repent Your Sins (In Progress)");

}
if (gg.GetMemoState(talker, 422) == 8 && gg.OwnItemCount(talker, 4329) >= 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Repent Your Sins (In Progress)");

}
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 12) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Repent Your Sins (In Progress)");

}
if (gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 2) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Mimir's Elixir (In Progress)");

}
if (gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 3) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Mimir's Elixir (In Progress)");

}
if (gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 4) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Mimir's Elixir (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 4) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 422, 8);
myself.ShowPage(talker, "magister_joan_q0422_01.htm");
myself.SetFlagJournal(talker, 422, 9);
myself.ShowQuestMark(talker, 422);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.GetMemoState(talker, 422) == 8 && gg.OwnItemCount(talker, 4329) < 3) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_joan_q0422_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.GetMemoState(talker, 422) == 8 && gg.OwnItemCount(talker, 4329) >= 3) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 422, 12);
myself.SetFlagJournal(talker, 422, 13);
myself.ShowQuestMark(talker, 422);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "magister_joan_q0422_03.htm");
myself.DeleteItem1(talker, 4329, gg.OwnItemCount(talker, 4329));

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 12) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_joan_q0422_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 2) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_joan_q0235_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 3) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_joan_q0235_04.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 4) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_joan_q0235_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 235) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 235) {
if (reply == 1) {
myself.ShowPage(talker, "magister_joan_q0235_02.htm");

}
if (reply == 2 && gg.HaveMemo(talker, 235) == 1) {
myself.SetMemoState(talker, 235, 3);
myself.SetFlagJournal(talker, 235, 3);
myself.ShowQuestMark(talker, 235);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "magister_joan_q0235_03.htm");

}
if (reply == 3 && gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 4 && gg.OwnItemCount(talker, 6322) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6321, 1);
myself.DeleteItem1(talker, 6322, 1);
myself.SetMemoState(talker, 235, 5);
myself.SetFlagJournal(talker, 235, 5);
myself.ShowQuestMark(talker, 235);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "magister_joan_q0235_06.htm");

}

}

}
super;
	}


}