package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class garden_of_coral2_maker extends garden_of_coral1_maker {
	protected String maker_name1 = "innadril22_2422_042m1";
	protected String maker_name2 = "innadril22_2422_043m1";
	protected String maker_name3 = "innadril22_2422_044m1";
	protected String golem_maker_name1 = "innadril22_2422_042m2";
	protected String golem_maker_name2 = "innadril22_2422_042m3";
	protected String DoorName = "cyratal_cave_a";

	protected void ON_ALL_NPC_DELETED(HandlerParam i0, HandlerParam def0, HandlerParam maker0) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12559, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12559, 0, 0);

}
if (myself.i_ai0 == 2) {
maker0 = gg.InstantZone_GetNpcMaker(i0, golem_maker_name1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, golem_maker_name2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
	}


}