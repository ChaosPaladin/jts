package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_use_bow extends warrior {
	protected void CREATED() {
myself.i_ai2 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai2 == 0 && myself.DistFromMe(attacker) < 100) {
myself.AddTimerEx(100002, 2000);
myself.i_ai2 = 1;
myself.c_ai1 = attacker;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 100002) {
myself.AddFleeDesire(myself.c_ai1, 100000);
myself.i_ai2 = 0;

}
super;
	}


}