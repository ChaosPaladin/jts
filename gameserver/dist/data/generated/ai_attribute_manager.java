package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_attribute_manager extends citizen {
	protected String fnHi = "attribute_manager1001.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (ask == -550) {
if (reply == 611) {
myself.ShowBaseAttributeCancelWindow(talker);

}

}
super;
	}


}