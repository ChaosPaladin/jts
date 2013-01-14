package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_remnant_machine extends default_npc {
	protected void CREATED() {
gg.Castle_GateOpenCloseEx("gate_of_destruction001", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("gate_of_destruction002", 1, myself.InstantZone_GetId());
	}

	protected void MY_DYING() {
myself.InstantZone_MarkRestriction();
myself.InstantZone_Finish(5);
	}


}