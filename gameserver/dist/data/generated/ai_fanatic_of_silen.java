package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_fanatic_of_silen extends default_npc {
	protected void CREATED() {
myself.BroadcastScriptEvent(1000, gg.GetIndexFromCreature(myself.sm), 1200);
	}

	protected void ATTACKED(HandlerParam attacker) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddDoNothingDesire(5, 2000);

} else {
myself.AddAttackDesire(attacker, 1, 3000);

}
super;
	}


}