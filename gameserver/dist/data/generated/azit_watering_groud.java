package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class azit_watering_groud extends default_npc {
	protected int NumberOfCircle = 0;

	protected void CREATED() {
myself.sm.residence_id = 62;
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam i0) {
if (myself.IsNullCreature(last_attacker) == 0) {
if (last_attacker.is_pc == 1) {
i0 = gg.GetIndexFromCreature(last_attacker);

} else {
i0 = 0;

}
myself.sm.residence_id = 62;
myself.BroadcastScriptEventEx(5, 40000, i0, 500);

}
	}


}