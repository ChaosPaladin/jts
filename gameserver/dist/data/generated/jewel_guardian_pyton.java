package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class jewel_guardian_pyton extends warrior_aggressive_immediate {
	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(337);
if (timer_id == 233704) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(337);
myself.AddTimerEx(233704, 1000 * 3 * 60);
super;
	}


}