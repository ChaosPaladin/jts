package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class b_time_course4_maker extends inzone_maker {
	protected String maker_name = "innadril22_2422_002m1";
	protected String DoorName1 = "cyratal_cave_b_b";
	protected String DoorName2 = "cyratal_cave_b_c";
	protected int on_start_spawn = 0;

	protected void ON_ALL_NPC_DELETED(HandlerParam i0, HandlerParam i2, HandlerParam def0, HandlerParam maker0) {
gg.Castle_GateOpenCloseEx(DoorName1, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(DoorName2, 0, myself.GetInZoneID());
	}


}