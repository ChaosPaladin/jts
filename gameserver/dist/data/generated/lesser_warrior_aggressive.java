package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lesser_warrior_aggressive extends warrior_aggressive {
	protected void NO_DESIRE() {
myself.AddMoveAroundLimitedDesire(5, 5, 200);
	}


}