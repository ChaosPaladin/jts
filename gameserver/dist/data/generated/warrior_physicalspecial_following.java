package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_physicalspecial_following extends warrior_physicalspecial {
	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam f0, HandlerParam f1) {
if (script_event_arg1 == 10019) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
f0 = c0.x - 50 + gg.Rand(100);
f1 = c0.y - 50 + gg.Rand(100);
myself.AddMoveToDesire(gg.FloatToInt(f0), gg.FloatToInt(f1), gg.FloatToInt(c0.z), 15);

}

}
super;
	}


}