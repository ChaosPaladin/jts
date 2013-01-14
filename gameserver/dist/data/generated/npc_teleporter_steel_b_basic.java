package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_teleporter_steel_b_basic extends citizen {
	protected int Up_x = 0;
	protected int Up_y = 0;
	protected int Up_z = 0;
	protected int Down_x = 0;
	protected int Down_y = 0;
	protected int Down_z = 0;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam c1) {
if (ask == -7801) {
if (reply == 1) {
party0 = gg.GetParty(talker);
if (gg.IsNull(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) < 4000) {
myself.TeleportParty(party0.id, Up_x, Up_y, Up_z, 4000, 0);

}

}

}

} else if (reply == 2) {
party0 = gg.GetParty(talker);
if (gg.IsNull(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) < 4000) {
myself.TeleportParty(party0.id, Down_x, Down_y, Down_z, 4000, 0);

}

}

}

}

}
	}


}