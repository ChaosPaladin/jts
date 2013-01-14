package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_room_henge extends citizen {
	protected String b_doorname = "island_of_oracle_c";

	protected void CREATED() {
super;
	}

	protected void TALKED(HandlerParam talker) {
gg.Castle_GateOpenCloseEx(b_doorname, 0, myself.InstantZone_GetId());
super;
	}


}