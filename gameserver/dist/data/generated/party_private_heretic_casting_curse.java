package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_heretic_casting_curse extends party_private_casting_curse {
	protected void CREATED() {
myself.i_ai4 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0) {
if (myself.p_state != 3 && myself.p_state != 10) {
if (myself.i_ai4 == 0) {
myself.i_ai4 = 1;

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam i0) {
if (myself.p_state != 3 && myself.p_state != 10) {
if (myself.i_ai4 == 0) {
myself.i_ai4 = 1;

}

}
super;
	}

	protected void OUT_OF_TERRITORY() {
if (myself.i_ai4 == 0) {
myself.RemoveAllAttackDesire();
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 100);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0) {
if (script_event_arg3 == gg.GetIndexFromCreature(myself.boss)) {
if (script_event_arg1 == 10033) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.i_ai4 = 1;
myself.RemoveAllAttackDesire();
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
myself.AddAttackDesire(c0, 1, 1 * 200);

}

}

} else if (script_event_arg1 == 10035) {
myself.i_ai4 = 0;
myself.RemoveAllAttackDesire();
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 100);

} else if (script_event_arg1 == 10002) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.RemoveAllAttackDesire();
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
myself.AddAttackDesire(c0, 1, 1 * 200);

}

}

}

}
	}


}