package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ratana_skilluse extends abstract_npc {
	protected void CREATED(HandlerParam c0) {
myself.AddTimerEx(1002, 10);
if (myself.sm.param1 != 0) {
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 10000000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1002) {
myself.BroadcastScriptEvent(2316002, gg.GetIndexFromCreature(myself.sm), 2000);
myself.AddTimerEx(2002, 5 * 1000);

}
if (timer_id == 2002) {
myself.Suicide();

}
	}


}