package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gatekeeper_havarti extends instant_teleporter {
	protected void TELEPORT_REQUESTED(HandlerParam talker, HandlerParam i6) {
i6 = gg.Rand(100);
if (i6 > 90) {
myself.InstantTeleport(talker, 17616, 115436, -6582);

} else if (i6 > 80) {
myself.InstantTeleport(talker, 17824, 115426, -6582);

} else if (i6 > 70) {
myself.InstantTeleport(talker, 17720, 115312, -6582);

} else if (i6 > 60) {
myself.InstantTeleport(talker, 17720, 115536, -6582);

} else if (i6 > 50) {
myself.InstantTeleport(talker, 17678, 115431, -6582);

} else if (i6 > 40) {
myself.InstantTeleport(talker, 17767, 115427, -6582);

} else if (i6 > 20) {
myself.InstantTeleport(talker, 17718, 115374, -6582);

} else {
myself.InstantTeleport(talker, 17720, 115472, -6582);

}
	}


}