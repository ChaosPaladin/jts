package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_giant_d_dwarf extends citizen {
	protected String fnHi = "";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam c0, HandlerParam i0, HandlerParam i1) {
if (ask == -2519002) {
if (reply == 1) {
myself.InstantTeleport(talker, 191754, 56760, -7624);

}

}
	}


}