package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_cat_fire extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 995) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Letters of Love");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 995) == 0) {
myself.SetCurrentQuestID(995);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "event_cat_fire001.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 995) {
myself.SetCurrentQuestID(995);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 995) {
if (reply == 1) {
myself.ShowPage(talker, "event_cat_fire003.htm");

}
if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 6403) >= 2 && gg.OwnItemCount(talker, 6404) >= 2) {
myself.DeleteItem1(talker, 6403, 2);
myself.DeleteItem1(talker, 6404, 2);
myself.GiveItem1(talker, 6406, 1);
myself.ShowPage(talker, "event_cat_fire004.htm");

} else {
myself.ShowPage(talker, "event_cat_fire006.htm");

}

}

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 6403) >= 4 && gg.OwnItemCount(talker, 6404) >= 4 && gg.OwnItemCount(talker, 6405) >= 1) {
myself.DeleteItem1(talker, 6403, 4);
myself.DeleteItem1(talker, 6404, 4);
myself.DeleteItem1(talker, 6405, 1);
myself.GiveItem1(talker, 6407, 1);
myself.ShowPage(talker, "event_cat_fire005.htm");

} else {
myself.ShowPage(talker, "event_cat_fire006.htm");

}

}

}

}
super;
	}


}