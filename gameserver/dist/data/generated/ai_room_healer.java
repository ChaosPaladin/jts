package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_room_healer extends citizen {
	protected String a_doorname = "island_of_oracle_b";
	protected String maker_name = "innadril19_2423_003m1";

	protected void CREATED(HandlerParam maker0, HandlerParam i0) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 1);

}
super;
	}

	protected void TALKED(HandlerParam talker) {
gg.Castle_GateOpenCloseEx(a_doorname, 0, myself.InstantZone_GetId());
super;
	}


}