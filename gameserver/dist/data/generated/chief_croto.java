package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class chief_croto extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 2 && gg.OwnItemCount(talker, 2869) == 0 && gg.OwnItemCount(talker, 2870) == 0 && gg.OwnItemCount(talker, 2868) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2869) && gg.OwnItemCount(talker, 2870) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2870)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2868)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Maestro (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 2 && gg.OwnItemCount(talker, 2869) == 0 && gg.OwnItemCount(talker, 2870) == 0 && gg.OwnItemCount(talker, 2868) == 0) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "chief_croto_q0231_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2869) && gg.OwnItemCount(talker, 2870) == 0) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "chief_croto_q0231_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2870)) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "chief_croto_q0231_04.htm");
myself.GiveItem1(talker, 2868, 1);
myself.DeleteItem1(talker, 2870, 1);
myself.DeleteItem1(talker, 2869, gg.OwnItemCount(talker, 2869));

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2868)) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "chief_croto_q0231_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 231) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 231) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "chief_croto_q0231_02.htm");
myself.GiveItem1(talker, 2869, 1);

}

}

}
super;
	}


}