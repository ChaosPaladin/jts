package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_bak extends citizen {
	protected void TALKED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 10000) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Letters of Love");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 0);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10000) == 0) {
myself.SetCurrentQuestID(997);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "event_heart001bak.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 997) {
myself.SetCurrentQuestID(997);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 997) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 6391) >= 1) {
myself.ShowPage(talker, "event_heart004bak.htm");
myself.GiveItem1(talker, 6389, 1);
myself.DeleteItem1(talker, 6391, 1);

} else {
myself.ShowPage(talker, "event_heart003bak.htm");

}

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 6391) >= 50) {
myself.ShowPage(talker, "event_heart004bak.htm");
myself.GiveItem1(talker, 6390, 1);
myself.DeleteItem1(talker, 6391, 50);

} else {
myself.ShowPage(talker, "event_heart003bak.htm");

}

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 6391) >= 10) {
myself.ShowPage(talker, "event_heart005bak.htm");
myself.GiveItem1(talker, 7058, 1);
myself.DeleteItem1(talker, 6391, 10);

} else {
myself.ShowPage(talker, "event_heart003bak.htm");

}

}

}
super;
	}


}