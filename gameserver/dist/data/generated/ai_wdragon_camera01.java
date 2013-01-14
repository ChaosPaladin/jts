package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_wdragon_camera01 extends default_npc {
	protected void CREATED(HandlerParam reply, HandlerParam i0, HandlerParam c0) {
myself.AddTimerEx(3000, 10);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 2316004) {
if (script_event_arg2 == 1) {
myself.AddTimerEx(1000, 10);

}
if (script_event_arg2 == 2) {
myself.AddTimerEx(2000, 10);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3000) {
myself.LookNeighbor(2000);
myself.AddTimerEx(3000, 10 * 1000);

}
if (timer_id == 1000) {
myself.SpecialCamera3(myself.sm, 600, 200, 5, 0, 15000, 10000, -10, 8, 1, 1, 1);
myself.AddTimerEx(1001, 2000);

}
if (timer_id == 1001) {
myself.SpecialCamera3(myself.sm, 400, 200, 5, 4000, 15000, 10000, -10, 8, 1, 1, 0);
myself.AddTimerEx(1002, 4000);

}
if (timer_id == 1002) {
myself.SpecialCamera3(myself.sm, 300, 195, 4, 1500, 15000, 10000, -5, 10, 1, 1, 0);
myself.AddTimerEx(1003, 1700);

}
if (timer_id == 1003) {
myself.SpecialCamera3(myself.sm, 130, 2, 5, 0, 15000, 10000, 0, 0, 1, 0, 1);
myself.AddTimerEx(1004, 2000);

}
if (timer_id == 1004) {
myself.SpecialCamera3(myself.sm, 220, 0, 4, 800, 15000, 10000, 5, 10, 1, 0, 0);
myself.AddTimerEx(1005, 2000);

}
if (timer_id == 1005) {
myself.SpecialCamera3(myself.sm, 250, 185, 5, 4000, 15000, 10000, -5, 10, 1, 1, 0);
myself.AddTimerEx(1006, 4000);

}
if (timer_id == 1006) {
myself.SpecialCamera3(myself.sm, 200, 0, 5, 2000, 15000, 10000, 0, 25, 1, 0, 0);
myself.AddTimerEx(1007, 4530);

}
if (timer_id == 1007) {
myself.SpecialCamera3(myself.sm, 300, -3, 5, 3500, 15000, 6000, 0, 6, 1, 0, 0);
myself.AddTimerEx(9999, 10000);

}
if (timer_id == 2000) {
myself.SpecialCamera3(myself.sm, 250, 0, 6, 0, 15000, 10000, 2, 0, 1, 0, 1);
myself.AddTimerEx(2001, 2000);

}
if (timer_id == 2001) {
myself.SpecialCamera3(myself.sm, 230, 0, 5, 2000, 15000, 10000, 0, 0, 1, 0, 0);
myself.AddTimerEx(2002, 2500);

}
if (timer_id == 2002) {
myself.SpecialCamera3(myself.sm, 180, 175, 2, 1500, 15000, 10000, 0, 10, 1, 1, 0);
myself.AddTimerEx(2003, 1500);

}
if (timer_id == 2003) {
myself.SpecialCamera3(myself.sm, 300, 180, 5, 1500, 15000, 3000, 0, 6, 1, 1, 0);
myself.AddTimerEx(9999, 3000);

}
if (timer_id == 9999) {
myself.Suicide();

}
	}


}