package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_cube_for_dukedevil extends instant_teleporter {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "cube_for_dukedevil001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam i0, HandlerParam c0) {
if (ask == -1006) {
if (reply == 1) {
myself.InstantZone_Leave(talker);

}

}
	}


}