package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_sobling extends citizen {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam c0, HandlerParam i0, HandlerParam i1) {
if (ask == -2124001) {
if (reply == 1) {
myself.InstantTeleport(talker, 183985, 61424, -3992);

}
if (reply == 2) {
myself.InstantTeleport(talker, 191754, 56760, -7624);

}

}
super;
	}


}