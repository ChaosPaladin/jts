package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_defence_controller extends default_npc {
	protected void CREATED() {
super;
myself.i_ai0 = 0;
myself.AddTimerEx(2931, 5 * 1000);
myself.Shout(gg.MakeFString(1800750, "", "", "", "", ""));
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2931) {
if (myself.i_ai0 == 0) {
myself.BroadcastScriptEvent(1224006, gg.GetIndexFromCreature(myself.sm), 2000);
myself.AddTimerEx(2931, 5 * 1000);

}

} else if (timer_id == 2932) {
myself.BroadcastScriptEvent(1224006, gg.GetIndexFromCreature(myself.sm), 4000);
myself.AddTimerEx(2932, 5 * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
super;
if (script_event_arg1 == 1224007) {
myself.i_ai0 = 1;
myself.AddTimerEx(2932, 5 * 1000);

}
if (script_event_arg1 == 1224009) {
myself.Despawn();

}
if (script_event_arg1 == 1224014 || script_event_arg1 == 1224013) {
myself.Despawn();

}
	}

	protected void MY_DYING() {
myself.BroadcastScriptEvent(1224007, 0, 4000);
	}


}