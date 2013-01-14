package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_aggressive_use_power_shot extends warrior_aggressive_physicalspecial {
	protected void CREATED() {
myself.i_ai2 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai2 == 0 && myself.DistFromMe(attacker) < 100) {
myself.AddTimerEx(100002, 2000);
myself.i_ai2 = 1;
myself.c_ai1 = attacker;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 100002) {
myself.AddFleeDesire(myself.c_ai1, 10000);
myself.i_ai2 = 0;

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0) {
if (script_event_arg2 == 10033) {
c0 = gg.GetCreatureFromIndex(script_event_arg3);
if (myself.IsNullCreature(c0) == 0) {
myself.RemoveAllAttackDesire();
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
myself.AddAttackDesire(c0, 1, 1 * 200);

}

}

}
	}


}