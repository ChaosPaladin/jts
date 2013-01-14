package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_npc_depravity_priest extends citizen {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "marketeer_of_mammon001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
if (ask == 506) {
if (reply == 3) {
myself.ShowPage(talker, "marketeer_of_mammon_q0506_04.htm");

} else if (reply == 4) {
myself.ShowPage(talker, "marketeer_of_mammon_q0506_04.htm");

} else if (reply == 5) {
myself.ShowPage(talker, "marketeer_of_mammon_q0506_04.htm");

}

} else if (ask == -240) {
if (gg.OwnItemCount(talker, 5575) < reply) {
myself.ShowPage(talker, "marketeer_of_mammon_q0506_12.htm");

} else if (reply <= 0) {
myself.ShowPage(talker, "marketeer_of_mammon_q0506_14.htm");

} else {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 5575, reply);
myself.GiveItem1(talker, 57, reply);
myself.ShowPage(talker, "marketeer_of_mammon_q0506_13.htm");

}

}
super;
	}


}