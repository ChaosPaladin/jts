package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_col_agent1 extends citizen {
	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 996) {
myself.SetCurrentQuestID(996);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 996) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 6402)) {
myself.ShowPage(talker, "event_col_agent1_q0996_05.htm");

} else if (gg.OwnItemCount(talker, 6401)) {
myself.ShowPage(talker, "event_col_agent1_q0996_04.htm");

} else if (gg.OwnItemCount(talker, 6400)) {
myself.ShowPage(talker, "event_col_agent1_q0996_03.htm");

} else if (gg.OwnItemCount(talker, 6399)) {
myself.ShowPage(talker, "event_col_agent1_q0996_02.htm");

} else {
myself.ShowPage(talker, "event_col_agent1_q0996_01.htm");

}

}

}
super;
	}


}