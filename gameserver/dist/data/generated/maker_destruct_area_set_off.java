package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_destruct_area_set_off extends inzone_maker {
	protected String AreaName1 = "default";
	protected String AreaName2 = "default";

	protected void ON_NPC_CREATED() {
super;
gg.Area_SetOnOffEx(AreaName1, 1, myself.GetInZoneID());
gg.Area_SetOnOffEx(AreaName2, 1, myself.GetInZoneID());
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam deleted_npc, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (AreaName1 != "default") {
gg.Area_SetOnOffEx(AreaName1, 0, myself.GetInZoneID());

}
if (AreaName2 != "default") {
gg.Area_SetOnOffEx(AreaName2, 0, myself.GetInZoneID());

}
	}


}