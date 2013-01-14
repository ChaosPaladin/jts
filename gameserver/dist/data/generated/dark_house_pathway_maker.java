package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dark_house_pathway_maker extends inzone_door_open_maker {
	protected String a_doorname = "island_of_oracle_b";
	protected String b_doorname = "island_of_oracle_c";
	protected String a_pathway_doorname = "island_of_oracle_d";
	protected String DoorName = "island_of_oracle_a";

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
super;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (reply == 0 && myself.i_ai0 == 0) {
gg.Castle_GateOpenCloseEx(a_doorname, 0, myself.GetInZoneID());

} else if (reply == 0 && myself.i_ai0 == 1) {
gg.Castle_GateOpenCloseEx(b_doorname, 0, myself.GetInZoneID());

} else if (reply == 0 && myself.i_ai0 == 2) {
gg.Castle_GateOpenCloseEx(a_pathway_doorname, 0, myself.GetInZoneID());

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
switch (script_event_arg1) {
case 1001: {
myself.i_ai0 = script_event_arg3;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
i1 = def0.total - def0.npc_count;
if (i1 > 0) {
if (myself.AtomicIncreaseTotal(def0, i1, 1)) {
def0.Spawn2(i1, script_event_arg2, 0);

}

}

}

}
break;

}

}
	}


}