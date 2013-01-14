package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class defender_nathan extends guard_stand {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 296) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Tarantula's Spider Silk (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 296) == 1) {
myself.SetCurrentQuestID(296);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "defender_nathan_q0296_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 296) {
myself.SetCurrentQuestID(296);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 296) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 1494) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "defender_nathan_q0296_03.htm");
myself.GiveItem1(talker, 1493, 15 + gg.Rand(9) * gg.OwnItemCount(talker, 1494));
myself.DeleteItem1(talker, 1494, gg.OwnItemCount(talker, 1494));

}

} else {
myself.ShowPage(talker, "defender_nathan_q0296_02.htm");

}

}

}
super;
	}


}