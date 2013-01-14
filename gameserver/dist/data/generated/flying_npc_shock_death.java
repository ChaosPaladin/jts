package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class flying_npc_shock_death extends default_npc {
	protected void CREATED(HandlerParam reply) {
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id) {
if (skill_name_id == 339673089) {
myself.Suicide();

}
if (skill_name_id == 339738625) {
myself.Suicide();

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 10005) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 2000);

}

}
	}


}