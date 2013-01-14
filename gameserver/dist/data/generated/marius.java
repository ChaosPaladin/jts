package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class marius extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 259) == 1 && gg.OwnItemCount(talker, 1495) < 10) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Request from the Farm Owner (In Progress)");

}
if (gg.HaveMemo(talker, 259) == 1 && gg.OwnItemCount(talker, 1495) >= 10) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Request from the Farm Owner (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 259) == 1 && gg.OwnItemCount(talker, 1495) < 10) {
myself.SetCurrentQuestID(259);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marius_q0259_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 259) == 1 && gg.OwnItemCount(talker, 1495) >= 10) {
myself.SetCurrentQuestID(259);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marius_q0259_02.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 259) {
myself.SetCurrentQuestID(259);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 259) {
if (reply == 1) {
myself.ShowPage(talker, "marius_q0259_03.htm");

} else if (reply == 2 && gg.OwnItemCount(talker, 1495) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "marius_q0259_04.htm");
myself.GiveItem1(talker, 1061, 2);
myself.DeleteItem1(talker, 1495, 10);

}

} else if (reply == 3 && gg.OwnItemCount(talker, 1495) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "marius_q0259_05.htm");
myself.GiveItem1(talker, 17, 250);
myself.DeleteItem1(talker, 1495, 10);

}

} else if (reply == 4) {
if (gg.OwnItemCount(talker, 1495) >= 10) {
myself.ShowPage(talker, "marius_q0259_06.htm");

} else if (gg.OwnItemCount(talker, 1495) < 10) {
myself.ShowPage(talker, "marius_q0259_07.htm");

}

} else if (reply == 5 && gg.OwnItemCount(talker, 1495) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "marius_q0259_05a.htm");
myself.GiveItem1(talker, 1835, 60);
myself.DeleteItem1(talker, 1495, 10);

}

} else if (reply == 6 && gg.OwnItemCount(talker, 1495) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "marius_q0259_05c.htm");
myself.GiveItem1(talker, 2509, 30);
myself.DeleteItem1(talker, 1495, 10);

}

}

}
super;
	}


}