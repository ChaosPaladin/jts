package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_exit_cube extends instant_teleporter {
	protected int Exit_X = 0;
	protected int Exit_Y = 0;
	protected int Exit_Z = 0;

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
myself.InstantTeleport(talker, Exit_X, Exit_Y, Exit_Z);
	}


}