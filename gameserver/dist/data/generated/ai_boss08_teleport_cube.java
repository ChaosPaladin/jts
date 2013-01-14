package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_teleport_cube extends instant_teleporter {
	protected void TELEPORT_REQUESTED(HandlerParam talker, HandlerParam i1, HandlerParam i2) {
i1 = -87760 + gg.Rand(50);
i2 = -151833 + gg.Rand(50);
myself.InstantTeleport(talker, i1, i2, -9152);
	}


}