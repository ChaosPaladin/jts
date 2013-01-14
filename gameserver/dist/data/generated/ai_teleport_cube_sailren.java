package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_teleport_cube_sailren extends instant_teleporter {
	protected void CREATED() {
myself.AddTimerEx(2002, 10 * 60 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2002) {
if (gg.Rand(100) < 50) {
myself.InstantTeleportInMyTerritory(23575, -7727, -1272, 100);

} else {
myself.InstantTeleportInMyTerritory(23421, -8167, -1326, 100);

}
myself.Despawn();

}
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
if (gg.Rand(100) < 40) {
myself.InstantTeleport(talker, 10610, -24035, -3676);

} else if (gg.Rand(100) < 70) {
myself.InstantTeleport(talker, 10703, -24041, -3673);

} else {
myself.InstantTeleport(talker, 10769, -24107, -3672);

}
	}


}