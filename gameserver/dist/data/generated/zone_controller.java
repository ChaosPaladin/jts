package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class zone_controller extends citizen {
	protected int zone_type = 0;
	protected int enter_type = 0;
	protected String fnEnterFailed = "zone_controller_html";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam s0) {
if (ask == -511) {
if (reply == 1) {
if (zone_type > -1 && enter_type > -1) {
myself.InstantZone_Enter(talker, zone_type, enter_type);

}

} else if (reply == 0) {
myself.InstantZone_Leave(talker);

} else if (reply == -1) {
myself.InstantZone_Finish(5);

}

}
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == 0) {
myself.ShowPage(talker, fnEnterFailed);

} else if (reply == 1) {

}
	}


}