package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_teleport_to_square extends default_npc {
	protected int center_square_x = -1;
	protected int center_square_y = -1;
	protected int center_square_z = -1;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "enter_seed_controller001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1) {
if (ask == -1101 && reply == 1) {
i0 = gg.Rand(100) - 50;
i1 = gg.Rand(100) - 50;
myself.InstantTeleport(talker, center_square_x + i0, center_square_y + i1, center_square_z);

}
	}


}