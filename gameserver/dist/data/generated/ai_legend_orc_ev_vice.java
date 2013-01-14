package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_legend_orc_ev_vice extends warrior_basic {
	protected void CREATED(HandlerParam c0) {
myself.Shout(gg.MakeFString(1800848, "", "", "", "", ""));
myself.AddTimerEx(2114003, 5000);
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 1000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2114003) {
myself.Shout(gg.MakeFString(1800849, "", "", "", "", ""));
myself.BroadcastScriptEvent(2114002, gg.GetIndexFromCreature(myself.sm), 2000);

}
	}

	protected void MY_DYING() {
myself.Shout(gg.MakeFString(1800862, "", "", "", "", ""));
	}


}