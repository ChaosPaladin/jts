package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_basic_first extends wizard_basic {
	protected void ATTACKED(HandlerParam attacker, HandlerParam i0, HandlerParam i1) {
i0 = gg.FloatToInt(attacker.z);
i1 = gg.FloatToInt(myself.sm.z);
if (i0 - i1 > 150 || i1 - i0 > 150) {
myself.RemoveAllDesire();
myself.InstantTeleport(attacker, gg.FloatToInt(myself.sm.x) + 50, gg.FloatToInt(myself.sm.y) - 50, gg.FloatToInt(myself.sm.z));

}
super;
	}


}