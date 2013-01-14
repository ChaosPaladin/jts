package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_immo_guide_undeath extends default_npc {
	protected int FieldCycle = 3;
	protected int deathroom_x = -183296;
	protected int deathroom_y = 206038;
	protected int deathroom_z = -12896;
	protected String fnHi = "";
	protected int babble_mode = 0;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
return;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -7801) {
if (reply == 1) {
if (talker.transformID != 260 && talker.transformID != 8 && talker.transformID != 9) {
myself.InstantTeleport(talker, deathroom_x + gg.Rand(100) - gg.Rand(100), deathroom_y + gg.Rand(100) - gg.Rand(100), deathroom_z);

} else {
myself.ShowSystemMessage(talker, 2924);

}

}

}
	}


}