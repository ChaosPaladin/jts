package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class collector_masha extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 343) == 1 && gg.GetMemoStateEx(talker, 343, 1) == 0 && myself.IsInCategory(2, talker.occupation)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Under the Shadow of the Ivory Tower (In Progress)");

}
if (gg.HaveMemo(talker, 343) == 1 && gg.GetMemoStateEx(talker, 343, 1) >= 1 && myself.IsInCategory(2, talker.occupation)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Under the Shadow of the Ivory Tower (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 343) == 1 && gg.GetMemoStateEx(talker, 343, 1) == 0 && myself.IsInCategory(2, talker.occupation)) {
myself.SetCurrentQuestID(343);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoStateEx(talker, 343, 1, 1);
myself.ShowPage(talker, "collector_masha_q0343_03.htm");
myself.SetHTMLCookie(talker, 343, 1);

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 343) == 1 && gg.GetMemoStateEx(talker, 343, 1) >= 1 && myself.IsInCategory(2, talker.occupation)) {
myself.SetCurrentQuestID(343);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "collector_masha_q0343_04.htm");
myself.SetMemoState(talker, 343, 1);
myself.SetHTMLCookie(talker, 343, 1);

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam reply, HandlerParam talker) {
if (ask == 343) {
myself.SetCurrentQuestID(343);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (myself.sm.class_id == 1030934) {
if (myself.GetHTMLCookie(talker, 343, 1) != -1) {
if (ask == 343 && gg.HaveMemo(talker, 343) == 1 && myself.IsInCategory(2, talker.occupation)) {
if (reply == 1) {
if (gg.HaveMemo(talker, 343) == 1 && gg.GetMemoState(talker, 343) == 1) {
if (gg.GetMemoStateEx(talker, 343, 1) >= 25) {
myself.ShowPage(talker, "collector_masha_q0343_05.htm");

} else if (gg.GetMemoStateEx(talker, 343, 1) >= 1 && gg.GetMemoStateEx(talker, 343, 1) < 25 && gg.OwnItemCount(talker, 4364) < 10) {
myself.ShowPage(talker, "collector_masha_q0343_06.htm");

} else if (gg.GetMemoStateEx(talker, 343, 1) >= 1 && gg.GetMemoStateEx(talker, 343, 1) < 25 && gg.OwnItemCount(talker, 4364) >= 10) {
myself.ShowPage(talker, "collector_masha_q0343_07.htm");
myself.DeleteItem1(talker, 4364, 10);
myself.SetMemoState(talker, 343, 2);

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 343) == 1 && gg.GetMemoState(talker, 343) == 2) {
i0 = gg.Rand(100);
i1 = gg.Rand(3);
if (i0 < 20 && i1 == 0) {
myself.SetMemoStateEx(talker, 343, 1, gg.GetMemoStateEx(talker, 343, 1) + 4);
talker.param1 = 0;
myself.ShowPage(talker, "collector_masha_q0343_08a.htm");

} else if (i0 < 20 && i1 == 1) {
myself.SetMemoStateEx(talker, 343, 1, gg.GetMemoStateEx(talker, 343, 1) + 4);
talker.param1 = 1;
myself.ShowPage(talker, "collector_masha_q0343_08b.htm");

} else if (i0 < 20 && i1 == 2) {
myself.SetMemoStateEx(talker, 343, 1, gg.GetMemoStateEx(talker, 343, 1) + 4);
talker.param1 = 2;
myself.ShowPage(talker, "collector_masha_q0343_08c.htm");

} else if (i0 >= 20 && i0 < 50 && i1 == 0) {
myself.SetMemoStateEx(talker, 343, 1, gg.GetMemoStateEx(talker, 343, 1) + 4);
if (gg.Rand(2) == 0) {
talker.param1 = 0;

} else {
talker.param1 = 1;

}
myself.ShowPage(talker, "collector_masha_q0343_09a.htm");

} else if (i0 >= 20 && i0 < 50 && i1 == 1) {
myself.SetMemoStateEx(talker, 343, 1, gg.GetMemoStateEx(talker, 343, 1) + 4);
if (gg.Rand(2) == 0) {
talker.param1 = 1;

} else {
talker.param1 = 2;

}
myself.ShowPage(talker, "collector_masha_q0343_09b.htm");

} else if (i0 >= 20 && i0 < 50 && i1 == 2) {
myself.SetMemoStateEx(talker, 343, 1, gg.GetMemoStateEx(talker, 343, 1) + 4);
if (gg.Rand(2) == 0) {
talker.param1 = 2;

} else {
talker.param1 = 0;

}
myself.ShowPage(talker, "collector_masha_q0343_09c.htm");

} else {
talker.param1 = gg.Rand(3);
myself.ShowPage(talker, "collector_masha_q0343_10.htm");

}

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 343) == 1 && gg.GetMemoState(talker, 343) == 2) {
if (talker.param1 == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4364, 10);
myself.ShowPage(talker, "collector_masha_q0343_11a.htm");
talker.param1 = 4;

}

} else if (talker.param1 == 1) {
myself.ShowPage(talker, "collector_masha_q0343_11b.htm");

} else if (talker.param1 == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4364, 20);
myself.ShowPage(talker, "collector_masha_q0343_11c.htm");
talker.param1 = 4;

}

}
myself.SetMemoState(talker, 343, 1);

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 343) == 1 && gg.GetMemoState(talker, 343) == 2) {
if (talker.param1 == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4364, 20);
myself.ShowPage(talker, "collector_masha_q0343_12a.htm");
talker.param1 = 4;

}

} else if (talker.param1 == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4364, 10);
myself.ShowPage(talker, "collector_masha_q0343_12b.htm");
talker.param1 = 4;

}

} else if (talker.param1 == 2) {
myself.ShowPage(talker, "collector_masha_q0343_12c.htm");

}
myself.SetMemoState(talker, 343, 1);

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 343) == 1 && gg.GetMemoState(talker, 343) == 2) {
if (talker.param1 == 0) {
myself.ShowPage(talker, "collector_masha_q0343_13a.htm");

} else if (talker.param1 == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4364, 20);
myself.ShowPage(talker, "collector_masha_q0343_13b.htm");
talker.param1 = 4;

}

} else if (talker.param1 == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4364, 10);
myself.ShowPage(talker, "collector_masha_q0343_13c.htm");
talker.param1 = 4;

}

}
myself.SetMemoState(talker, 343, 1);

}

}

}

}

}
super;
	}


}