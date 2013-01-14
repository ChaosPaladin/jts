package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_emperor_seal_maker extends inzone_maker {
	protected int door_open_method = 0;
	protected String monster_name = "";
	protected String door_name = "";
	protected String next_maker = "";
	protected String systemmsg = "";

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (door_open_method == 1) {
if (deleted_def.name == monster_name) {
gg.Castle_GateOpenCloseEx(door_name, 0, myself.GetInZoneID());

}

}
	}

	protected void ON_ALL_NPC_DELETED(HandlerParam maker0, HandlerParam i0) {
if (door_open_method == 0) {
i0 = myself.GetInZoneID();
gg.Castle_GateOpenCloseEx(door_name, 0, i0);
maker0 = gg.InstantZone_GetNpcMaker(i0, next_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
	}


}