package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_npc_dungeon_teleporter extends instant_teleporter {
	protected int PosX = 0;
	protected int PosY = 0;
	protected int PosZ = 0;

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
myself.InstantTeleport(talker, PosX, PosY, PosZ);
	}


}