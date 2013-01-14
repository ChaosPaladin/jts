package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_fire_box extends default_npc {
	protected void CREATED() {
myself.AddEffectActionDesire(myself.sm, 1, 16700, 1000000);
myself.AddTimerEx(5001, 17200);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 5001) {
myself.Despawn();

}
	}


}