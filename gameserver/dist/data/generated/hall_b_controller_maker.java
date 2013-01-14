package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hall_b_controller_maker extends inzone_maker {
	protected String TDoorName1 = "frintessa_new_door_151";
	protected String TDoorName2 = "frintessa_new_door_251";
	protected String TDoorName3 = "frintessa_new_door_252";
	protected String TDoorName4 = "frintessa_new_door_351";
	protected String WallDoorName1 = "frintessa_new_door_201";
	protected String WallDoorName2 = "frintessa_new_door_202";
	protected String WallDoorName3 = "frintessa_new_door_203";
	protected String WallDoorName4 = "frintessa_new_door_204";
	protected String WallDoorName5 = "frintessa_new_door_205";
	protected String WallDoorName6 = "frintessa_new_door_206";
	protected String WallDoorName7 = "frintessa_new_door_207";
	protected String WallDoorName8 = "frintessa_new_door_208";
	protected String WallDoorName9 = "frintessa_new_door_209";
	protected String WallDoorName10 = "frintessa_new_door_210";
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
if (script_event_arg1 == 10001002) {
gg.Castle_GateOpenCloseEx(TDoorName1, 1, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(TDoorName2, 1, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(TDoorName3, 1, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(TDoorName4, 1, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(WallDoorName1, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(WallDoorName2, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(WallDoorName3, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(WallDoorName4, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(WallDoorName5, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(WallDoorName6, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(WallDoorName7, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(WallDoorName8, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(WallDoorName9, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(WallDoorName10, 0, myself.GetInZoneID());

} else if (script_event_arg1 == 10001003) {
gg.Castle_GateOpenCloseEx(TDoorName2, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(TDoorName4, 0, myself.GetInZoneID());

}
super;
	}


}