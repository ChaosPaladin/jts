package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_heretic_bomb2 extends royal_rush_heretic_bomb {
	protected void NO_DESIRE() {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);
	}


}