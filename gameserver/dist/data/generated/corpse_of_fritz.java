package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class corpse_of_fritz extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.GetMemoState(talker, 503) < 3000 && gg.GetMemoState(talker, 503) >= 2000) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Pursuit of Clan Ambition! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.GetMemoState(talker, 503) < 3000 && gg.GetMemoState(talker, 503) >= 2000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "corpse_of_fritz_q0503_01.htm");

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
if (timer_id == 250310) {
myself.Despawn();

}
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
if (gg.GetMemoState(talker, 503) == 2000 || gg.GetMemoState(talker, 503) == 2011 || gg.GetMemoState(talker, 503) == 2010 || gg.GetMemoState(talker, 503) == 2001) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3840, 3);
myself.SetMemoState(talker, 503, gg.GetMemoState(talker, 503) + 100);
myself.ShowPage(talker, "corpse_of_fritz_q0503_02.htm");
myself.CreateOnePrivate(1027178, "blitz_wyrm", 0, 1);
myself.CreateOnePrivate(1027178, "blitz_wyrm", 0, 1);
myself.AddTimerEx(250310, 1000 * 10);

}

} else if (gg.GetMemoState(talker, 503) == 2100 || gg.GetMemoState(talker, 503) == 2111 || gg.GetMemoState(talker, 503) == 2110 || gg.GetMemoState(talker, 503) == 2101) {
myself.ShowPage(talker, "corpse_of_fritz_q0503_03.htm");
myself.CreateOnePrivate(1027178, "blitz_wyrm", 0, 1);
myself.CreateOnePrivate(1027178, "blitz_wyrm", 0, 1);
myself.AddTimerEx(250310, 1000 * 10);

}

}

}
super;
	}


}