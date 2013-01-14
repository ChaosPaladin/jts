package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_sender_zaken extends citizen {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam c0, HandlerParam i0, HandlerParam i1) {
if (ask == -2124002) {
if (reply == 1) {
myself.InstantTeleport(talker, 52241, 218775, -3232);

}

}
super;
	}


}