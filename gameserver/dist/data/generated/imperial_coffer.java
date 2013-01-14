package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class imperial_coffer extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) >= 8500 && gg.GetMemoState(talker, 503) < 8700 && gg.OwnItemCount(talker, 3847) >= 6 && talker.is_pledge_master == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) >= 8500 && gg.GetMemoState(talker, 503) < 8700 && gg.OwnItemCount(talker, 3847) >= 6 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) >= 8700) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Pursuit of Clan Ambition! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) >= 8500 && gg.GetMemoState(talker, 503) < 8700 && gg.OwnItemCount(talker, 3847) >= 6 && talker.is_pledge_master == 0) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "imperial_coffer_q0503_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) >= 8500 && gg.GetMemoState(talker, 503) < 8700 && gg.OwnItemCount(talker, 3847) >= 6 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "imperial_coffer_q0503_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) >= 8700) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "imperial_coffer_q0503_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(503);
if (timer_id == 250301) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(503);
myself.Say(gg.MakeFString(50339, "", "", "", "", ""));
myself.AddTimerEx(250301, 1000 * 60 * 3);
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 503) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 503) {
if (reply == 1) {
myself.ShowPage(talker, "imperial_coffer_q0503_02.htm");

}
if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3869, 1);
myself.DeleteItem1(talker, 3847, gg.OwnItemCount(talker, 3847));
myself.SetMemoState(talker, 503, 8700);
myself.ShowPage(talker, "imperial_coffer_q0503_04.htm");

}

}

}
super;
	}


}