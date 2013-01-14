package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_remnant_exit extends default_npc {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "remnant_exit001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -1101) {
if (reply == 1) {
myself.InstantZone_Leave(talker);

}

}
	}


}