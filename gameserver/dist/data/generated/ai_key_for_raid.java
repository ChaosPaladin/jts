package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_key_for_raid extends warrior_use_skill {
	protected String a_raid_doorname1 = "cyratal_cave_a_f";
	protected String a_raid_doorname2 = "cyratal_cave_a_g";
	protected String maker_name1 = "innadril22_2422_017m2";
	protected String maker_name2 = "innadril22_2422_018m2";
	protected String maker_name3 = "innadril22_2422_019m2";

	protected void CREATED(HandlerParam i0, HandlerParam maker0) {
myself.i_ai0 = 0;
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 12551) {
myself.i_ai0 = 1;

}
super;
	}

	protected void MY_DYING() {
if (myself.i_ai0 == 1) {
gg.Castle_GateOpenCloseEx(a_raid_doorname1, 0, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(a_raid_doorname2, 0, myself.InstantZone_GetId());

}
super;
	}


}