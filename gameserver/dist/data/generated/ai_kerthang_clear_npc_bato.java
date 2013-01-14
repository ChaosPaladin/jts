package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_kerthang_clear_npc_bato extends default_npc {
	protected int nType = 8;
	protected String areaname_40_1 = "17_16_kerthang_021";
	protected String areaname_40_2 = "17_16_kerthang_022";
	protected String areaname_40_3 = "17_16_kerthang_023";
	protected String areaname_40_4 = "17_16_kerthang_024";
	protected String areaname_40_5 = "17_16_kerthang_025";

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
gg.SetAsNull(myself.c_ai0);
gg.SetAsNull(myself.c_ai1);
gg.SetAsNull(myself.c_ai2);
gg.SetAsNull(myself.c_ai3);
gg.SetAsNull(myself.c_ai4);
gg.SetAsNull(myself.c_quest0);
gg.SetAsNull(myself.c_quest1);
gg.SetAsNull(myself.c_quest2);
gg.SetAsNull(myself.c_quest3);
gg.SetAsNull(myself.c_quest4);
myself.AddTimerEx(2001, 30 * 1000);
myself.AddTimerEx(2004, 1 * 60 * 1000 + 30);
myself.AddTimerEx(2005, 3 * 60 * 1000);
if (nType == 8) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, -45360, -10688, 500);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam party1) {
if (script_event_arg1 == 13101) {
if (nType == 8) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, -45360, -10688, 500);

}
myself.AddTimerEx(2005, 1000);
myself.BroadcastScriptEvent(13102, 0, 4000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam party1, HandlerParam maker0, HandlerParam private, HandlerParam s0, HandlerParam s1, HandlerParam i0) {
if (timer_id == 2001) {
if (nType == 8) {
gg.Castle_GateOpenClose2("kerthang_door_025", 0);
gg.Castle_GateOpenClose2("kerthang_door_026", 0);
gg.Castle_GateOpenClose2("kerthang_door_027", 0);
gg.Castle_GateOpenClose2("kerthang_door_028", 0);
gg.Castle_GateOpenClose2("kerthang_door_029", 0);
gg.Castle_GateOpenClose2("kerthang_door_030", 0);
gg.Castle_GateOpenClose2("kerthang_door_031", 0);
gg.Castle_GateOpenClose2("kerthang_door_032", 0);

}

} else if (timer_id == 2004) {
if (nType == 8) {
i0 = gg.Rand(5);
if (i0 == 0) {
s1 = areaname_40_1;

} else if (i0 == 1) {
s1 = areaname_40_2;

} else if (i0 == 2) {
s1 = areaname_40_3;

} else if (i0 == 3) {
s1 = areaname_40_4;

} else if (i0 == 4) {
s1 = areaname_40_5;

}
gg.Area_SetOnOff(s1, 1);

}
myself.AddTimerEx(2004, 30 * 1000);

} else if (timer_id == 2005) {
if (nType == 8) {
gg.Area_SetOnOff(areaname_40_1, 0);
gg.Area_SetOnOff(areaname_40_2, 0);
gg.Area_SetOnOff(areaname_40_3, 0);
gg.Area_SetOnOff(areaname_40_4, 0);
gg.Area_SetOnOff(areaname_40_5, 0);

}
myself.AddTimerEx(2005, 60 * 1000);

}
	}


}