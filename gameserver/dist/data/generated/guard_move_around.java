package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_move_around extends guard {
	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(5, 5);
	}


}