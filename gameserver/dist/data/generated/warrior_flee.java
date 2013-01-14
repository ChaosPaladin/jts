package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_flee extends warrior {
	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(40, 20);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.AddFleeDesire(attacker, 30);
	}


}