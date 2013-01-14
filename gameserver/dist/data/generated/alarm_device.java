package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class alarm_device extends default_npc {
	protected String TDoorName1 = "frintessa_new_door_151";
	protected String TDoorName2 = "frintessa_new_door_251";
	protected String WallDoorName1 = "frintessa_new_door_101";
	protected String WallDoorName2 = "frintessa_new_door_102";
	protected String WallDoorName3 = "frintessa_new_door_103";
	protected String WallDoorName4 = "frintessa_new_door_104";
	protected String WallDoorName5 = "frintessa_new_door_105";
	protected String WallDoorName6 = "frintessa_new_door_106";
	protected String WallDoorName7 = "frintessa_new_door_107";
	protected String WallDoorName8 = "frintessa_new_door_108";
	protected String dmgzone = "alarm_device_area_default";
	protected String alarm1_makername = "godard32_1713_011m1";
	protected String alarm2_makername = "godard32_1713_012m1";
	protected String alarm3_makername = "godard32_1713_013m1";
	protected String alarm4_makername = "godard32_1713_014m1";
	protected String alarm5_makername = "godard32_1713_015m1";
	protected String alarm6_makername = "godard32_1713_016m1";
	protected String alarm7_makername = "godard32_1713_017m1";
	protected String alarm8_makername = "godard32_1713_018m1";

	protected void CREATED() {
myself.i_ai0 = 0;
gg.Area_SetOnOff(dmgzone, 1);
myself.Shout(gg.MakeFString(1010630, "", "", "", "", ""));
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 10025) {
myself.i_ai0 = script_event_arg2;

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam maker0, HandlerParam i2) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(WallDoorName1, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName2, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName3, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName4, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName5, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName6, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName7, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName8, 0, i2);
myself.Shout(gg.MakeFString(1801085, "", "", "", "", ""));
gg.Area_SetOnOff(dmgzone, 0);
	}


}