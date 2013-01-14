package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_bomb_spawn extends party_leader {
	protected int PhysicalSpecial = 264241153;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.sm.weight_point = 10;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
super;
return;

}
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.CreatePrivates(Privates);
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (SeeCreatureAttackerTime == -1) {
if (SetAggressiveTime == -1) {
if (myself.GetLifeTime() >= gg.Rand(5) + 3 && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (SetAggressiveTime == 0) {
if (myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SetAggressiveTime + gg.Rand(4) && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (myself.sm.alive == 0) {
return;

}
if (script_event_arg1 == 10000 && myself.p_state != 3) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.CreatePrivates(Privates);

}
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (gg.IsNull(c0) == 0) {
myself.AddAttackDesire(c0, 1, 1000);

}

}
super;
	}


}