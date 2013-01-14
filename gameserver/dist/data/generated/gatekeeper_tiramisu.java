package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gatekeeper_tiramisu extends instant_teleporter {
	protected void TELEPORT_REQUESTED(HandlerParam talker) {
if (gg.Rand(100) < 50) {
myself.InstantTeleport(talker, -112899, 234942, -3693);

} else {
myself.InstantTeleport(talker, -112817, 235183, -3690);

}
	}


}