package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ancient_teleporter extends citizen {
	protected String fnHi2 = "ancient_teleporter002.htm";
	protected String fnHi3 = "ancient_teleporter003.htm";
	protected String fnHi4 = "ancient_teleporter004.htm";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0, HandlerParam s0, HandlerParam i1, HandlerParam i2) {
if (ask == -505 && reply == 2) {
if (gg.OwnItemCount(talker, 57) >= 50000) {
myself.DeleteItem1(talker, 57, 50000);
myself.InstantTeleport(talker, 43835, -47749, -792);

} else {
myself.ShowPage(talker, fnHi3);

}

}
super;
	}


}