package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class barler_clear_npc4 extends default_npc {
	protected void CREATED() {
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 13012) {
myself.SpecialCamera3(myself.sm, 500, 212, 0, 1500, 3000, 3000, 357, 15, 1, 0, 1);
myself.AddTimerEx(5001, 1500);

} else if (script_event_arg1 == 13025) {
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5001) {
myself.SpecialCamera3(myself.sm, 500, 212, 0, 1000, 3000, 3000, 357, 40, 1, 0, 0);
myself.AddTimerEx(5002, 1000);

} else if (timer_id == 5002) {
myself.SpecialCamera3(myself.sm, 900, 212, 0, 1000, 3000, 3000, 357, 10, 1, 0, 0);
myself.AddTimerEx(5003, 2000);

} else if (timer_id == 5003) {
myself.SpecialCamera3(myself.sm, 500, 212, 0, 3000, 3000, 15000, 357, 20, 1, 0, 0);
myself.AddTimerEx(5004, 7000);

} else if (timer_id == 5004) {
myself.SpecialCamera3(myself.sm, 700, 212, 30, 1000, 3000, 2500, 357, 0, 1, 0, 0);

} else if (timer_id == 5005) {
myself.Despawn();

}
	}


}