package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_fixed extends guard_stand {
	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.AddAttackDesire(attacker, 0, 2000);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.karma > 0) {
myself.AddAttackDesire(creature, 0, 1500);

}
	}


}