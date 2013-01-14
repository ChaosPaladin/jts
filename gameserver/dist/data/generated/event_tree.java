package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_tree extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(5001, 1000 * 60 * 20);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5001) {
myself.Despawn();

}
super;
	}


}