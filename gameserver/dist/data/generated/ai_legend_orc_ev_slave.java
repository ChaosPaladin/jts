package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_legend_orc_ev_slave extends warrior_basic {
	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (script_event_arg1 == 2114002) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
i0 = gg.FloatToInt(myself.sm.x + gg.Rand(50));
i1 = gg.FloatToInt(myself.sm.y + gg.Rand(50));
i2 = gg.FloatToInt(myself.sm.z);
myself.AddFollowDesire(c0, 5);

}

}
	}


}