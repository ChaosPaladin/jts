package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gatekeeper_ciffon extends instant_teleporter {
	protected void TELEPORT_REQUESTED(HandlerParam talker) {
if (gg.Rand(100) < 50) {
myself.InstantTeleport(talker, 48765, 248461, -6190);

} else {
myself.InstantTeleport(talker, 48586, 248459, -6190);

}
	}


}