package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hall_a_controller_maker extends inzone_maker {
	protected String TDoorName1 = "frintessa_new_door_151";
	protected String TDoorName2 = "frintessa_new_door_251";
	protected String TDoorName3 = "frintessa_new_door_252";
	protected int inzone_type_param = 136;
	protected int spawn_event_id = -2;
	protected int despawn_event_id = -1;
	protected int on_start_spawn = 0;
	protected int script_event_enable = 1;

	protected void ON_START() {
myself.i_ai0 = 0;
super;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (script_event_arg1 == 10001001) {
myself.i_ai0 = myself.i_ai0 + 1;
if (myself.i_ai0 == 8) {
gg.Castle_GateOpenCloseEx(TDoorName1, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(TDoorName2, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(TDoorName3, 0, myself.GetInZoneID());

}

}
super;
	}


}