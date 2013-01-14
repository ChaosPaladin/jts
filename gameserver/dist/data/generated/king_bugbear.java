package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class king_bugbear extends warrior_aggressive {
	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(226);
if (timer_id == 22602) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam c0, HandlerParam i0) {
myself.SetCurrentQuestID(231);
i0 = myself.sm.param1;
if (i0 > 0) {
c0 = gg.GetCreatureFromIndex(i0);
if (c0) {
myself.AddAttackDesire(c0, 1, 2000);

}

}
myself.SetCurrentQuestID(226);
myself.AddTimerEx(22602, 1000 * 200);
super;
	}


}