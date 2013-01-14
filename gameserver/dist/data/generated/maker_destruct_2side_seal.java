package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_destruct_2side_seal extends maker_destruct_default {
	protected String DoorName = "door_of_throne";

	protected void ON_ALL_NPC_DELETED(HandlerParam i0, HandlerParam def0, HandlerParam maker0) {
gg.Castle_GateOpenCloseEx(DoorName, 0, myself.GetInZoneID());
	}


}