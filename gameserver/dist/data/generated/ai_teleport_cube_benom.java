package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_teleport_cube_benom extends instant_teleporter {
	protected int Pos_x1 = 0;
	protected int Pos_y1 = 0;
	protected int Pos_z1 = 0;
	protected int Pos_x2 = 0;
	protected int Pos_y2 = 0;
	protected int Pos_z2 = 0;
	protected String fnHi = "";

	protected void CREATED() {
myself.AddTimerEx(2002, 1200000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2002) {
myself.Despawn();

}
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
if (gg.Rand(100) < 50) {
myself.InstantTeleport(talker, Pos_x1, Pos_y1, Pos_z1);

} else {
myself.InstantTeleport(talker, Pos_x2, Pos_y2, Pos_z2);

}
	}


}