package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class varsak extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 325) == 1 && gg.OwnItemCount(talker, 1349) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Grim Collector (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 325) == 1 && gg.OwnItemCount(talker, 1349) == 1) {
myself.SetCurrentQuestID(325);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "varsak_q0325_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 325) {
myself.SetCurrentQuestID(325);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 325) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 1355) && gg.OwnItemCount(talker, 1356) && gg.OwnItemCount(talker, 1353) && gg.OwnItemCount(talker, 1354) && gg.OwnItemCount(talker, 1357)) {
if (gg.Rand(5) < 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "varsak_q0325_03.htm");
myself.DeleteItem1(talker, 1355, 1);
myself.DeleteItem1(talker, 1353, 1);
myself.DeleteItem1(talker, 1356, 1);
myself.DeleteItem1(talker, 1354, 1);
myself.DeleteItem1(talker, 1357, 1);
myself.GiveItem1(talker, 1358, 1);

}

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1355, 1);
myself.DeleteItem1(talker, 1353, 1);
myself.DeleteItem1(talker, 1356, 1);
myself.DeleteItem1(talker, 1354, 1);
myself.DeleteItem1(talker, 1357, 1);
myself.ShowPage(talker, "varsak_q0325_04.htm");

}

} else {
myself.ShowPage(talker, "varsak_q0325_02.htm");

}

}

}
super;
	}


}