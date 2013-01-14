package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class instant_teleporter extends citizen {
	protected String fnHi = "thi.htm";
	protected int PosX = 0;
	protected int PosY = 0;
	protected int PosZ = 0;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
myself.InstantTeleport(talker, PosX, PosY, PosZ);
	}


}