package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_chief_moke extends lv2_warehouse_chief {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 40000 || gg.GetMemoState(talker, 337) == 40001 && gg.OwnItemCount(talker, 3859) == 0 || gg.OwnItemCount(talker, 3862) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 40000 || gg.GetMemoState(talker, 337) == 40001 && gg.OwnItemCount(talker, 3859) >= 1 && gg.OwnItemCount(talker, 3862) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 40010) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) >= 50000) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Audience with the Land Dragon  (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 40000 || gg.GetMemoState(talker, 337) == 40001 && gg.OwnItemCount(talker, 3859) == 0 || gg.OwnItemCount(talker, 3862) == 0) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_moke_q0337_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 40000 || gg.GetMemoState(talker, 337) == 40001 && gg.OwnItemCount(talker, 3859) >= 1 && gg.OwnItemCount(talker, 3862) >= 1) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3864, 1);
myself.DeleteItem1(talker, 3859, gg.OwnItemCount(talker, 3859));
myself.DeleteItem1(talker, 3862, gg.OwnItemCount(talker, 3862));
myself.ShowPage(talker, "warehouse_chief_moke_q0337_03.htm");
if (gg.GetMemoState(talker, 337) == 40001) {
myself.SetMemoState(talker, 337, 50000);

} else {
myself.SetMemoState(talker, 337, 40010);

}

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 40010) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_moke_q0337_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) >= 50000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_moke_q0337_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 337) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 337) {
if (reply == 1) {
myself.ShowPage(talker, "warehouse_chief_moke_q0337_02.htm");

}

}
super;
	}


}