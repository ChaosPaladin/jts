package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_bridge_controller extends default_npc {
	protected String second_door1 = "darion_raid_b_001";
	protected String second_door2 = "darion_raid_b_002";
	protected String third_door1 = "darion_raid_c_001";
	protected String third_door2 = "darion_raid_c_002";
	protected String bridge_a = "darion_raid_c_003";
	protected String bridge_b = "darion_raid_b_003";
	protected String secret_a = "darion_raid_b_004";
	protected String secret_b = "darion_raid_c_004";

	protected void CREATED(HandlerParam i0) {
myself.i_ai0 = 0;
i0 = myself.GetGlobalMap(12);
if (i0 == -1) {
if (myself.i_ai0 == 0) {
gg.Castle_GateOpenClose2(second_door1, 0);
gg.Castle_GateOpenClose2(second_door2, 0);
myself.AddTimerEx(2000, 1000);
myself.i_ai0 = 1;

}

} else if (myself.i_ai0 == 0) {

} else {
gg.Castle_GateOpenClose2(secret_a, 1);
gg.Castle_GateOpenClose2(secret_b, 1);
myself.AddTimerEx(3001, 2000);
myself.i_ai0 = 0;

}
	}

	protected void DEBUG_AI(HandlerParam reply) {
if (reply == 1) {
gg.SendScriptEvent(myself.sm, 0, 0);

} else if (reply == 2) {
gg.SendScriptEvent(myself.sm, 1, 0);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 2000) {
gg.Castle_GateOpenClose2(third_door1, 0);
gg.Castle_GateOpenClose2(third_door2, 0);
myself.AddTimerEx(2001, 1000);

}
if (timer_id == 2001) {
gg.Castle_GateOpenClose2(bridge_a, 1);
myself.AddTimerEx(2002, 3000);

}
if (timer_id == 2002) {
gg.Castle_GateOpenClose2(bridge_b, 1);
myself.AddTimerEx(2003, 5000);

}
if (timer_id == 2003) {
gg.Castle_GateOpenClose2(secret_a, 0);
gg.Castle_GateOpenClose2(secret_b, 0);

}
if (timer_id == 3001) {
myself.InstantTeleportInMyTerritory(17259, 244334, 11616, 100);
myself.AddTimerEx(3002, 50);

}
if (timer_id == 3002) {
gg.Castle_GateOpenClose2(bridge_a, 0);
gg.Castle_GateOpenClose2(bridge_b, 0);
myself.AddTimerEx(3003, 3000);

}
if (timer_id == 3003) {
gg.Castle_GateOpenClose2(second_door1, 1);
gg.Castle_GateOpenClose2(second_door2, 1);
gg.Castle_GateOpenClose2(third_door1, 1);
gg.Castle_GateOpenClose2(third_door2, 1);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 0) {
gg.Castle_GateOpenClose2(secret_a, 1);
gg.Castle_GateOpenClose2(secret_b, 1);
myself.AddTimerEx(3001, 1000);

} else if (script_event_arg1 == 1) {
gg.Castle_GateOpenClose2(second_door1, 0);
gg.Castle_GateOpenClose2(second_door2, 0);
myself.AddTimerEx(2000, 2000);

}
super;
	}


}