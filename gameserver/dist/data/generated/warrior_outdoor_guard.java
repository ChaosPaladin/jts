package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_outdoor_guard extends warrior_basic {
	protected int CallPCRate = 10000;
	protected int MovingAttack = 0;

	protected void CREATED() {
gg.Castle_GateOpenClose2("iron_tower_out_door", 1);
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.CanAttack(attacker) == 0) {
if (myself.IsNullCreature(attacker) == 0) {
if (gg.Rand(10000) < CallPCRate) {
myself.InstantTeleport(attacker, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z));

}

}

}
super;
	}

	protected void MY_DYING(HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(1);
if (i0 == 8) {
myself.CreateOnePrivateEx(1032351, "npc_open_outcastle_door", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
super;
	}


}