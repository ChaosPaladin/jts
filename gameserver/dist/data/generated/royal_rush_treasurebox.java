package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_treasurebox extends royal_rush_default_npc {
	protected void CREATED() {
myself.AddTimerEx(3001, 1000 * 60 * 5);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
myself.AddFleeDesire(attacker, 200);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3001) {
myself.Despawn();

}
super;
	}


}