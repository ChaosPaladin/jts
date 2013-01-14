package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class barler_private_demonic_d extends default_npc {
	protected int d_skill1 = 458752001;
	protected int d_skill2 = 458752001;

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam f0, HandlerParam i0) {
if (script_event_arg1 == 13005) {
i0 = gg.Rand(100);
if (i0 >= 20) {
myself.AddEffectActionDesire(myself.sm, 2, 4000, 100000);

} else if (i0 >= 40) {
myself.AddTimerEx(1001, 250);

} else if (i0 >= 60) {
myself.AddTimerEx(1001, 500);

} else if (i0 >= 80) {
myself.AddTimerEx(1001, 700);

} else {
myself.AddTimerEx(1001, 800);

}

} else if (script_event_arg1 == 13019) {
myself.Suicide();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.AddEffectActionDesire(myself.sm, 2, 4000, 100000);

}
	}


}