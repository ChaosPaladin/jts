package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_mine_crystal_teleport extends default_npc {
	protected int Pos_X1 = -1;
	protected int Pos_Y1 = -1;
	protected int Pos_Z1 = -1;
	protected int Pos_X2 = -1;
	protected int Pos_Y2 = -1;
	protected int Pos_Z2 = -1;
	protected int my_position = -1;
	protected String fnHi = "teleport_crystal_mine001.htm";
	protected String fnHi2 = "teleport_crystal_mine002.htm";

	protected void TALKED(HandlerParam talker) {
if (my_position == 1 || my_position == 2) {
myself.ShowPage(talker, fnHi);

} else if (my_position == 3) {
myself.ShowPage(talker, fnHi2);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == -2512) {
if (reply == 1) {
myself.InstantTeleport(talker, Pos_X1, Pos_Y1, Pos_Z1);

} else if (reply == 2) {
myself.InstantTeleport(talker, Pos_X2, Pos_Y2, Pos_Z2);

}

}
	}


}