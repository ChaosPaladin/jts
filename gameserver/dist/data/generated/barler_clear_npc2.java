package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class barler_clear_npc2 extends default_npc {
	protected void CREATED() {
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 13006) {
myself.BroadcastScriptEvent(13010, 0, 3000);
myself.AddTimerEx(3001, 2000);
myself.AddTimerEx(3004, 1000);

} else if (script_event_arg1 == 13025) {
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3001) {
myself.AddTimerEx(3002, 30000);

} else if (timer_id == 3002) {
myself.AddTimerEx(3003, 6 * 1000 - 500);

} else if (timer_id == 3003) {

} else if (timer_id == 3004) {
myself.BroadcastScriptEvent(13010, 0, 3000);
myself.Despawn();

}
	}


}