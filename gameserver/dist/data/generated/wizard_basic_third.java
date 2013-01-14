package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_basic_third extends wizard_basic {
	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 19261000) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
myself.c_ai0 = c0;
if (myself.IsNullCreature(c0) == 0) {
if (myself.sm.alive == 0) {
return;

}
if (myself.p_state != 3) {
myself.AddAttackDesire(myself.c_ai0, 1, 1000000);
myself.AddTimerEx(30001, 1000);

}

}

}
if (script_event_arg1 == 19261002) {
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 30001) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.sm.alive == 0) {
return;

}
if (myself.p_state != 3) {
myself.AddAttackDesire(myself.c_ai0, 1, 1000000);

}

}
myself.AddTimerEx(30001, 1000);

}
	}


}