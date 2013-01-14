package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_block_guide extends citizen {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == -18161) {
switch (reply) {
case 1: {
myself.InstantTeleport(talker, -59157, -56906, -2032);
break;

}

}

}
	}


}