package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class annsery extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 412) == 1 && gg.OwnItemCount(talker, 1255) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Dark Wizard (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 412) == 1 && gg.OwnItemCount(talker, 1255) == 0) {
myself.SetCurrentQuestID(412);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1254) == 1 && gg.OwnItemCount(talker, 1278) == 0 && gg.OwnItemCount(talker, 1259) == 0) {
myself.ShowPage(talker, "annsery_q0412_01.htm");

} else if (gg.OwnItemCount(talker, 1254) == 1 && gg.OwnItemCount(talker, 1278) == 1 && gg.OwnItemCount(talker, 1259) < 2) {
myself.ShowPage(talker, "annsery_q0412_03.htm");

} else if (gg.OwnItemCount(talker, 1254) == 1 && gg.OwnItemCount(talker, 1278) == 1 && gg.OwnItemCount(talker, 1259) >= 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "annsery_q0412_04.htm");
myself.GiveItem1(talker, 1255, 1);
myself.DeleteItem1(talker, 1278, 1);
myself.DeleteItem1(talker, 1259, 2);

}

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 412) {
myself.SetCurrentQuestID(412);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 412) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "annsery_q0412_02.htm");
myself.GiveItem1(talker, 1278, 1);

}

}

}
super;
	}


}