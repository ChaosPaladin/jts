package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_revival_helper extends citizen {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -8014) {
if (reply == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 15351) >= 1) {
myself.ShowPage(talker, "resurrection_priest005.htm");
return;

}

} else if (reply == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 15353) >= 100) {
myself.DeleteItem1(talker, 15353, 100);
myself.GiveItem1(talker, 15354, 1);

} else {
myself.ShowPage(talker, "resurrection_priest006.htm");
return;

}

} else if (reply == 3) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 15354) >= 10 && gg.OwnItemCount(talker, 15352) >= 50) {
myself.DeleteItem1(talker, 15354, 10);
myself.GiveItem1(talker, 15355, 1);

} else {
myself.ShowPage(talker, "resurrection_priest007.htm");
return;

}

} else if (reply == 4) {
myself.ShowMultisell(708, talker);

}

}
super;
	}


}