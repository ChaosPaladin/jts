package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ol_mahum_support_troop extends warrior_aggressive_physicalspecial {
	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(171);
if (timer_id == 17101) {
myself.Say(gg.MakeFString(17151, "", "", "", "", ""));
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam c0, HandlerParam i0) {
myself.SetCurrentQuestID(171);
myself.AddTimerEx(17101, 1000 * 200);
i0 = myself.sm.param1;
if (i0 > 0) {
c0 = gg.GetCreatureFromIndex(i0);
if (c0) {
myself.AddAttackDesire(c0, 1, 2000);

}

}
super;
	}


}