package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_destruct_1die_to_help extends maker_destruct_default {
	protected String gate_maker_name = "rumwarsha1224_331m1";

	protected void ON_START() {
super;
myself.i_ai0 = 0;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, gate_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
	}


}