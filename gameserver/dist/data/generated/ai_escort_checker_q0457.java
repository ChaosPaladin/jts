package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_escort_checker_q0457 extends citizen {
	protected int escort_checker_q0457_TIMER = 1111;

	protected void CREATED() {
myself.AddTimerEx(escort_checker_q0457_TIMER, 10 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == escort_checker_q0457_TIMER) {
myself.BroadcastScriptEvent(45705, gg.GetIndexFromCreature(myself.sm), 500);
myself.AddTimerEx(escort_checker_q0457_TIMER, 2 * 1000);

}
super;
	}


}