package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_open_outcastle_door extends default_npc {
	protected void CREATED(HandlerParam c0) {
c0 = gg.GetCreatureFromIndex(myself.sm.param2);
if (myself.IsNullCreature(c0) == 0) {
myself.c_ai4 = c0;

}
myself.AddTimerEx(1001, 3000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 1001) {
i0 = gg.GetStep_FieldCycle(1);
if (i0 >= 8) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
gg.Castle_GateOpenClose2("iron_tower_out_door", 0);
gg.SetStepWithoutActor_FieldCycle(1, 9, 5);

} else {
gg.Castle_GateOpenClose2("iron_tower_out_door", 0);
gg.SetStepWithoutActor_FieldCycle(1, 9, 5);

}

}
myself.Despawn();

}
	}


}