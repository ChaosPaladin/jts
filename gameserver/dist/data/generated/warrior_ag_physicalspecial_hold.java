package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_ag_physicalspecial_hold extends warrior_physicalspecial_hold {
	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
myself.AddAttackDesire(creature, 0, 1 * 50);

}
	}


}