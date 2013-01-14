package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_cleft_converter extends citizen {
	protected int tel_x = -1;
	protected int tel_y = -1;
	protected int tel_z = -1;
	protected String fnHi = "cleft_converter001.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == 23030) {
myself.ShowMultisell(reply, talker);

} else if (ask == 23031) {
myself.InstantTeleport(talker, tel_x, tel_y, tel_z);

}
	}


}