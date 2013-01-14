package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_ai_for_assassin_str extends warrior_use_skill {
	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (myself.sm.alive == 0) {
return;

}
if (script_event_arg1 == 88001 && myself.p_state != 3) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 1000000);

}

}
	}


}