package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class __delf_rescures extends instant_teleporter {
	protected void TALKED(HandlerParam talker) {
if (gg.Rand(100) < 50) {
myself.InstantTeleport(talker, 12131, 17359, -4570);

} else {
myself.InstantTeleport(talker, 11541, 17855, -4585);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.z < -7000) {
if (gg.Rand(100) < 50) {
myself.InstantTeleport(creature, 12131, 17359, -4570);

} else {
myself.InstantTeleport(creature, 11541, 17855, -4585);

}

}
	}


}