package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_arrived_detect extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(1000, 1000);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.class_id == 1018633) {

} else if (myself.i_ai0 == 0) {
myself.BroadcastScriptEvent(2211002, gg.GetIndexFromCreature(myself.sm), 4000);
myself.i_ai0 = 1;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.LookNeighbor(2000);
myself.AddTimerEx(1000, 1000);

}
	}


}