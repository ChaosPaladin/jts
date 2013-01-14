package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_gather_npc extends warrior {
	protected void CREATED() {
if (gg.Rand(100) < 10) {
myself.AddTimerEx(2000, 60000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2000) {
myself.BroadcastScriptEvent(10003, gg.GetIndexFromCreature(myself.sm), 300);
myself.AddTimerEx(2000, 60000);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 10003 && myself.p_state != 3) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0 && c0 != myself.sm) {
myself.AddMoveToDesire(gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z), 1000);

}

}
	}


}