package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_cleft_town_teleporter extends citizen {
	protected int tel_x0 = -1;
	protected int tel_y0 = -1;
	protected int tel_z0 = -1;
	protected int tel_x1 = -1;
	protected int tel_y1 = -1;
	protected int tel_z1 = -1;
	protected String fnHi = "cleft_gate_red001.htm";
	protected String fnNotEnoughLevel = "cleft_gate_red002.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
if (talker.level >= 75) {
myself.InstantTeleport(talker, tel_x1, tel_y1, tel_z1);

} else {
myself.ShowPage(talker, fnNotEnoughLevel);

}
	}


}