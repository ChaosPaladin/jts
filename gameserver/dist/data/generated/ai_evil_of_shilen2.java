package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_evil_of_shilen2 extends warrior_basic {
	protected void CREATED() {
myself.AddTimerEx(9989, 5 * 1000);
myself.AddTimerEx(9969, 2 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 9989) {
if (myself.IsNullCreature(myself.boss) == 1) {
myself.Despawn();

}
myself.AddTimerEx(9989, 5 * 1000);

} else if (timer_id == 9969) {
myself.AddAttackDesire(gg.GetCreatureFromIndex(myself.sm.param3), 1, 2000);

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
if (private == myself.boss) {
myself.Despawn();

}

}
super;
	}


}