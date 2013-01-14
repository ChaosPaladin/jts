package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_immo_lifeseed_stabilized extends default_npc {
	protected String fnHi = "";
	protected String type = "";
	protected int zone = 0;
	protected int room = 0;
	protected int return_x = -212836;
	protected int return_y = 209824;
	protected int return_z = 4288;
	protected int TM_cooltime = 78001;
	protected int TIME_cooltime1 = 120;
	protected int TIME_cooltime2 = 360;
	protected int TIME_cooltime3 = 720;
	protected int babble_mode = 0;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
return;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam maker0, HandlerParam party0, HandlerParam i0, HandlerParam s0) {
if (ask == -7801) {
if (reply == 1) {
myself.InstantTeleport(talker, return_x, return_y, return_z);

}

}
	}


}