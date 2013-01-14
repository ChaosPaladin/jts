package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_kerthang_treasurebox extends default_npc {
	protected void CREATED() {
myself.i_ai0 = 0;
myself.AddTimerEx(1001, 40 * 1000);
	}

	protected void ATTACKED(HandlerParam damage, HandlerParam attacker) {
myself.i_ai0 = 1;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 13102) {
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam party1) {
if (timer_id == 1001) {
if (myself.i_ai0 == 0) {
myself.Despawn();

}

}
	}


}