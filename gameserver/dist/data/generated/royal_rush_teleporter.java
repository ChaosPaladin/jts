package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_teleporter extends citizen {
	protected String fnNoItem = "";
	protected int TelPos_X1 = 0;
	protected int TelPos_Y1 = 0;
	protected int TelPos_Z1 = 0;
	protected int TelPos_X2 = 0;
	protected int TelPos_Y2 = 0;
	protected int TelPos_Z2 = 0;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 620) {
switch (reply) {
case 101: {
if (gg.OwnItemCount(talker, 7261) != 0) {
myself.DeleteItem1(talker, 7261, 1);
myself.InstantTeleport(talker, TelPos_X1, TelPos_Y1, TelPos_Z1);

} else if (gg.OwnItemCount(talker, 7262) != 0) {
myself.InstantTeleport(talker, TelPos_X1, TelPos_Y1, TelPos_Z1);

} else {
myself.ShowPage(talker, fnNoItem);

}
break;

}
case 102: {
if (gg.OwnItemCount(talker, 7261) != 0) {
myself.DeleteItem1(talker, 7261, 1);
myself.InstantTeleport(talker, TelPos_X2, TelPos_Y2, TelPos_Z2);

} else if (gg.OwnItemCount(talker, 7262) != 0) {
myself.InstantTeleport(talker, TelPos_X2, TelPos_Y2, TelPos_Z2);

} else {
myself.ShowPage(talker, fnNoItem);

}
break;

}

}

}
	}


}