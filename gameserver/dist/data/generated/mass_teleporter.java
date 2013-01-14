package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mass_teleporter extends delayed_teleporter {
	protected String fnBrokenCtrlTower = "thi.htm";
	protected String fnTeleportDelayed = "CastleTeleportDelayed.htm";
	protected int pos_x1 = 1;
	protected int pos_y1 = 1;
	protected int pos_z1 = 1;

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void TALKED(HandlerParam talker) {
if (myself.i_ai0 == 0) {
if (myself.Castle_IsUnderSiege() && myself.Castle_GetLifeControlLevel() == 0) {
myself.ShowPage(talker, fnBrokenCtrlTower);

} else {
myself.ShowPage(talker, fnHi);

}

} else {
myself.ShowPage(talker, fnTeleportDelayed);

}
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
if (myself.i_ai0 == 0) {
if (myself.Castle_IsUnderSiege() && myself.Castle_GetLifeControlLevel() == 0) {
myself.AddTimerEx(1001, 480000);

} else {
myself.AddTimerEx(1001, 30000);

}
myself.i_ai0 = 1;

}
myself.ShowPage(talker, fnTeleportDelayed);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.i_ai0 = 0;
myself.InstantTeleportInMyTerritory(pos_x1, pos_y1, pos_z1, 200);
myself.Shout(gg.MakeFString(1000443, gg.MakeFString(MakeFString + myself.sm.residence_id, "", "", "", "", ""), "", "", "", ""));

}
	}


}