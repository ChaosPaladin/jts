package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class barler_clear_npc3 extends default_npc {
	protected void CREATED() {
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 13007) {
myself.SpecialCamera3(myself.sm, 45, 237, 0, 0, 3000, 5000, 0, 27, 1, 0, 1);
myself.BroadcastScriptEvent(13005, 0, 1000);
myself.AddTimerEx(4001, 1500);

} else if (script_event_arg1 == 13025) {
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 4001) {
myself.BroadcastScriptEvent(13012, 0, 1000);
myself.AddTimerEx(4002, 3000);

} else if (timer_id == 4002) {
myself.Despawn();

}
	}


}