package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_teleport_tolless_2nd extends default_npc {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "b_tower_2st_tel_npc001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -1006) {
if (reply == 1) {
myself.InstantTeleport(talker, -13361, 272107, -11936);

}

}
	}


}