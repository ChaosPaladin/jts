package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class neer_bodyguard extends warrior_aggressive_immediate {
	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(225);
if (timer_id == 22501) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(225);
myself.AddTimerEx(22501, 1000 * 200);
super;
	}


}