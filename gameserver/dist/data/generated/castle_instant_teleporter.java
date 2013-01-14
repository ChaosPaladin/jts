package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class castle_instant_teleporter extends citizen {
	protected String fnHi = "thi.htm";
	protected String fnNotMyPledge = "";
	protected int pos_x1 = 1;
	protected int pos_y1 = 1;
	protected int pos_z1 = 1;
	protected int pos_x2 = 1;
	protected int pos_y2 = 1;
	protected int pos_z2 = 1;

	protected void TALKED(HandlerParam talker) {
if (myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnNotMyPledge);

}
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
if (gg.Rand(100) < 50) {
myself.InstantTeleport(talker, pos_x1, pos_y1, pos_z1);

} else {
myself.InstantTeleport(talker, pos_x2, pos_y2, pos_z2);

}
	}


}