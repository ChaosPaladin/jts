package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class teleport_trap extends default_trap {
	protected int IsDetected = 0;
	protected int IsDefused = 0;
	protected int tel_x = 0;
	protected int tel_y = 0;
	protected int tel_z = 0;

	protected void TRAP_STEP_IN(HandlerParam i0, HandlerParam i1, HandlerParam c0) {
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
myself.InstantTeleport(c0, tel_x, tel_y, tel_z);

}
	}


}