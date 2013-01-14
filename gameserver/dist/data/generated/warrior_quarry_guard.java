package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_quarry_guard extends warrior_basic {
	protected void CREATED() {
myself.c_ai4 = gg.GetNullCreature();
myself.ChangeMoveType(0);
super;
	}

	protected void NO_DESIRE() {
myself.ChangeMoveType(0);
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1 && Party_Type == 2) {
if (MovingAttack == 1) {
myself.AddAttackDesire(creature, 1, 10000);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(creature, 0, 10000);

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0) {
if (script_event_arg2 == 1000001) {
c0 = gg.GetCreatureFromIndex(script_event_arg1);
if (myself.IsNullCreature(c0) == 0) {
if (myself.IsNullCreature(myself.c_ai4) != 0) {
if (MovingAttack == 1) {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(c0, 1, 1000000);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(c0, 0, 1000000);

}

}

}

}
super;
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam state, HandlerParam success, HandlerParam s0) {
myself.ChangeMoveType(0);
super;
	}


}