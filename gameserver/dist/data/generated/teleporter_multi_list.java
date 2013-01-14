package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class teleporter_multi_list extends teleporter {
protected Object[][] Position1 = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};
protected Object[][] Position2 = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};
protected Object[][] Position3 = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -8) {
if (reply == 1) {
if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, Position1, ShopName, "", "", "", 57, gg.MakeFString(1000308, "", "", "", "", ""));

}

} else if (reply == 2) {
if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, Position2, ShopName, "", "", "", 57, gg.MakeFString(1000308, "", "", "", "", ""));

}

} else if (reply == 3) {
if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, Position3, ShopName, "", "", "", 57, gg.MakeFString(1000308, "", "", "", "", ""));

}

}

}
super;
	}


}