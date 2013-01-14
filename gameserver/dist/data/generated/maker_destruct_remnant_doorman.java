package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_destruct_remnant_doorman extends inzone_maker {
	protected String DoorName1 = "gate_of_destruction001";
	protected String DoorName2 = "gate_of_destruction002";

	protected void ON_START() {
super;
gg.Castle_GateOpenCloseEx(DoorName1, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(DoorName2, 0, myself.GetInZoneID());
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam deleted_npc, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
	}


}