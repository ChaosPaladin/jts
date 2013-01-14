package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_destruct_obelisk extends inzone_maker {
	protected String Door_NextStep = "secret_door_007";
	protected String DoorName11 = "secret_door_001";
	protected String DoorName12 = "secret_door_002";
	protected String DoorName21 = "secret_door_003";
	protected String DoorName22 = "secret_door_004";
	protected String DoorName31 = "secret_door_005";
	protected String DoorName32 = "secret_door_006";
	protected String Near_Obelisk_Maker_1 = "rumwarsha1224_021m1";
	protected String Near_Obelisk_Maker_2 = "rumwarsha1224_022m1";
	protected String Near_Obelisk_Maker_3 = "rumwarsha1224_023m1";
	protected String Near_Obelisk_Maker_4 = "rumwarsha1224_024m1";
	protected String Near_Obelisk_Maker_5 = "rumwarsha1224_025m1";
	protected String Near_Obelisk_Maker_6 = "rumwarsha1224_026m1";
	protected String Near_Obelisk_Maker_7 = "rumwarsha1224_027m1";
	protected String Near_Obelisk_Maker_8 = "rumwarsha1224_028m1";

	protected void ON_NPC_CREATED() {
gg.Castle_GateOpenCloseEx(DoorName11, 1, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(DoorName12, 1, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(DoorName21, 1, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(DoorName22, 1, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(DoorName31, 1, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(DoorName32, 1, myself.GetInZoneID());
myself.i_ai0 = 0;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 1224004) {
myself.i_ai0 = myself.i_ai0 + 1;
i0 = 4 - myself.i_ai0;
myself.AddTimerEx(1400, 1);

}
super;
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam maker0) {
if (timer_id == 1400) {
if (myself.i_ai0 == 4) {
gg.Castle_GateOpenCloseEx(Door_NextStep, 0, myself.GetInZoneID());
myself.AddTimerEx(1401, 1000);

}

} else if (timer_id == 1401) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, Near_Obelisk_Maker_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, Near_Obelisk_Maker_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, Near_Obelisk_Maker_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, Near_Obelisk_Maker_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, Near_Obelisk_Maker_5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, Near_Obelisk_Maker_6);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, Near_Obelisk_Maker_7);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, Near_Obelisk_Maker_8);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
super;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam deleted_npc, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
gg.Castle_GateOpenCloseEx(DoorName11, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(DoorName12, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(DoorName21, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(DoorName22, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(DoorName31, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(DoorName32, 0, myself.GetInZoneID());
myself.i_ai0 = myself.i_ai0 + 1;
i0 = 4 - myself.i_ai0;
	}


}