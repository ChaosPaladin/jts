package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_heretic extends party_leader_physicalspecial2 {
	protected int HelpCastRange = 500;
	protected int DistNoDesire = 500;

	protected void CREATED() {
myself.i_ai3 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.BroadcastScriptEventEx(10033, gg.GetIndexFromCreature(attacker), gg.GetIndexFromCreature(myself.sm), HelpCastRange);

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0, HandlerParam i0) {
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam f0) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success) {
	}

	protected void OUT_OF_TERRITORY() {
myself.RemoveAllAttackDesire();
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 100);
myself.BroadcastScriptEventEx(10035, 0, gg.GetIndexFromCreature(myself.sm), DistNoDesire);
	}

	protected void MY_DYING() {
myself.BroadcastScriptEventEx(2, 0, gg.GetIndexFromCreature(myself.sm), 4000);
	}


}