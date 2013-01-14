package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_kerthang_clear_npc extends default_npc {
	protected int nType = 0;
	protected String messenger_maker1 = "etc09_1716_026m1";
	protected String messenger_maker2 = "etc09_1716_002m1";
	protected String messenger_maker3 = "etc09_1716_008m1";
	protected String messenger_maker4 = "etc09_1716_014m1";
	protected String messenger_maker5 = "etc09_1716_020m1";
	protected String treasure_maker_name1_40 = "etc09_1716_026m3";
	protected String treasure_maker_name2_40 = "etc09_1716_027m1";
	protected String treasure_maker_name3_40 = "etc09_1716_028m1";
	protected String treasure_maker_name4_40 = "etc09_1716_029m1";
	protected String treasure_maker_name5_40 = "etc09_1716_030m1";
	protected String treasure_maker_name1_50 = "etc09_1716_002m3";
	protected String treasure_maker_name2_50 = "etc09_1716_003m1";
	protected String treasure_maker_name3_50 = "etc09_1716_004m1";
	protected String treasure_maker_name4_50 = "etc09_1716_005m1";
	protected String treasure_maker_name5_50 = "etc09_1716_006m1";
	protected String treasure_maker_name1_60 = "etc09_1716_008m3";
	protected String treasure_maker_name2_60 = "etc09_1716_009m1";
	protected String treasure_maker_name3_60 = "etc09_1716_010m1";
	protected String treasure_maker_name4_60 = "etc09_1716_011m1";
	protected String treasure_maker_name5_60 = "etc09_1716_012m1";
	protected String treasure_maker_name1_70 = "etc09_1716_014m3";
	protected String treasure_maker_name2_70 = "etc09_1716_015m1";
	protected String treasure_maker_name3_70 = "etc09_1716_016m1";
	protected String treasure_maker_name4_70 = "etc09_1716_017m1";
	protected String treasure_maker_name5_70 = "etc09_1716_018m1";
	protected String treasure_maker_name1_80 = "etc09_1716_020m3";
	protected String treasure_maker_name2_80 = "etc09_1716_021m1";
	protected String treasure_maker_name3_80 = "etc09_1716_022m1";
	protected String treasure_maker_name4_80 = "etc09_1716_023m1";
	protected String treasure_maker_name5_80 = "etc09_1716_024m1";
	protected String areaname_40_1 = "17_16_kerthang_021";
	protected String areaname_40_2 = "17_16_kerthang_022";
	protected String areaname_40_3 = "17_16_kerthang_023";
	protected String areaname_40_4 = "17_16_kerthang_024";
	protected String areaname_40_5 = "17_16_kerthang_025";
	protected String areaname_50_1 = "17_16_kerthang_001";
	protected String areaname_50_2 = "17_16_kerthang_002";
	protected String areaname_50_3 = "17_16_kerthang_003";
	protected String areaname_50_4 = "17_16_kerthang_004";
	protected String areaname_50_5 = "17_16_kerthang_005";
	protected String areaname_60_1 = "17_16_kerthang_006";
	protected String areaname_60_2 = "17_16_kerthang_007";
	protected String areaname_60_3 = "17_16_kerthang_008";
	protected String areaname_60_4 = "17_16_kerthang_009";
	protected String areaname_60_5 = "17_16_kerthang_010";
	protected String areaname_70_1 = "17_16_kerthang_011";
	protected String areaname_70_2 = "17_16_kerthang_012";
	protected String areaname_70_3 = "17_16_kerthang_013";
	protected String areaname_70_4 = "17_16_kerthang_014";
	protected String areaname_70_5 = "17_16_kerthang_015";
	protected String areaname_80_1 = "17_16_kerthang_016";
	protected String areaname_80_2 = "17_16_kerthang_017";
	protected String areaname_80_3 = "17_16_kerthang_018";
	protected String areaname_80_4 = "17_16_kerthang_019";
	protected String areaname_80_5 = "17_16_kerthang_020";

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
myself.AddTimerEx(2002, 3 * 60 * 1000);
myself.AddTimerEx(2003, 1 * 60 * 1000);
myself.AddTimerEx(2004, 1 * 60 * 1000 + 30);
myself.AddTimerEx(2005, 3 * 60 * 1000);
if (nType == 0) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, -45360, -10688, 500);

} else if (nType == 1) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, -50593, -10684, 500);

} else if (nType == 2) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, -53904, -10688, 500);

} else if (nType == 3) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, -50656, -10688, 500);

} else if (nType == 4) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, -45440, -10688, 500);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam party1) {
if (script_event_arg1 == 13101) {
if (nType == 0) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, -45360, -10688, 500);

} else if (nType == 1) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, -50593, -10684, 500);

} else if (nType == 2) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, -53904, -10688, 500);

} else if (nType == 3) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, -50656, -10688, 500);

} else if (nType == 4) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, -45440, -10688, 500);

}
myself.AddTimerEx(2005, 1000);
myself.BroadcastScriptEvent(13102, 0, 4000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam party1, HandlerParam maker0, HandlerParam private, HandlerParam s0, HandlerParam s1, HandlerParam i0) {
if (timer_id == 2001) {
if (nType == 0) {
gg.Castle_GateOpenClose2("kerthang_door_025", 0);
gg.Castle_GateOpenClose2("kerthang_door_026", 0);
gg.Castle_GateOpenClose2("kerthang_door_027", 0);
gg.Castle_GateOpenClose2("kerthang_door_028", 0);
gg.Castle_GateOpenClose2("kerthang_door_029", 0);
gg.Castle_GateOpenClose2("kerthang_door_030", 0);
gg.Castle_GateOpenClose2("kerthang_door_031", 0);
gg.Castle_GateOpenClose2("kerthang_door_032", 0);

} else if (nType == 1) {
gg.Castle_GateOpenClose2("kerthang_door_033", 0);
gg.Castle_GateOpenClose2("kerthang_door_034", 0);
gg.Castle_GateOpenClose2("kerthang_door_035", 0);
gg.Castle_GateOpenClose2("kerthang_door_036", 0);
gg.Castle_GateOpenClose2("kerthang_door_037", 0);
gg.Castle_GateOpenClose2("kerthang_door_038", 0);
gg.Castle_GateOpenClose2("kerthang_door_039", 0);
gg.Castle_GateOpenClose2("kerthang_door_040", 0);

} else if (nType == 2) {
gg.Castle_GateOpenClose2("kerthang_door_001", 0);
gg.Castle_GateOpenClose2("kerthang_door_002", 0);
gg.Castle_GateOpenClose2("kerthang_door_003", 0);
gg.Castle_GateOpenClose2("kerthang_door_004", 0);
gg.Castle_GateOpenClose2("kerthang_door_005", 0);
gg.Castle_GateOpenClose2("kerthang_door_006", 0);
gg.Castle_GateOpenClose2("kerthang_door_007", 0);
gg.Castle_GateOpenClose2("kerthang_door_008", 0);

} else if (nType == 3) {
gg.Castle_GateOpenClose2("kerthang_door_009", 0);
gg.Castle_GateOpenClose2("kerthang_door_010", 0);
gg.Castle_GateOpenClose2("kerthang_door_011", 0);
gg.Castle_GateOpenClose2("kerthang_door_012", 0);
gg.Castle_GateOpenClose2("kerthang_door_013", 0);
gg.Castle_GateOpenClose2("kerthang_door_014", 0);
gg.Castle_GateOpenClose2("kerthang_door_015", 0);
gg.Castle_GateOpenClose2("kerthang_door_016", 0);

} else if (nType == 4) {
gg.Castle_GateOpenClose2("kerthang_door_017", 0);
gg.Castle_GateOpenClose2("kerthang_door_018", 0);
gg.Castle_GateOpenClose2("kerthang_door_019", 0);
gg.Castle_GateOpenClose2("kerthang_door_020", 0);
gg.Castle_GateOpenClose2("kerthang_door_021", 0);
gg.Castle_GateOpenClose2("kerthang_door_022", 0);
gg.Castle_GateOpenClose2("kerthang_door_023", 0);
gg.Castle_GateOpenClose2("kerthang_door_024", 0);

}

} else if (timer_id == 2002) {
if (nType == 0) {
maker0 = gg.GetNpcMaker(messenger_maker1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (nType == 1) {
maker0 = gg.GetNpcMaker(messenger_maker2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (nType == 2) {
maker0 = gg.GetNpcMaker(messenger_maker3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (nType == 3) {
maker0 = gg.GetNpcMaker(messenger_maker4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}

} else if (timer_id == 2003) {
if (nType == 0) {
i0 = gg.Rand(5);
if (i0 == 0) {
s0 = treasure_maker_name1_40;

} else if (i0 == 1) {
s0 = treasure_maker_name2_40;

} else if (i0 == 2) {
s0 = treasure_maker_name3_40;

} else if (i0 == 3) {
s0 = treasure_maker_name4_40;

} else if (i0 == 4) {
s0 = treasure_maker_name5_40;

}
maker0 = gg.GetNpcMaker(s0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (nType == 1) {
i0 = gg.Rand(5);
if (i0 == 0) {
s0 = treasure_maker_name1_50;

} else if (i0 == 1) {
s0 = treasure_maker_name2_50;

} else if (i0 == 2) {
s0 = treasure_maker_name3_50;

} else if (i0 == 3) {
s0 = treasure_maker_name4_50;

} else if (i0 == 4) {
s0 = treasure_maker_name5_50;

}
maker0 = gg.GetNpcMaker(s0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (nType == 2) {
i0 = gg.Rand(5);
if (i0 == 0) {
s0 = treasure_maker_name1_60;

} else if (i0 == 1) {
s0 = treasure_maker_name2_60;

} else if (i0 == 2) {
s0 = treasure_maker_name3_60;

} else if (i0 == 3) {
s0 = treasure_maker_name4_60;

} else if (i0 == 4) {
s0 = treasure_maker_name5_60;

}
maker0 = gg.GetNpcMaker(s0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (nType == 3) {
i0 = gg.Rand(5);
if (i0 == 0) {
s0 = treasure_maker_name1_70;

} else if (i0 == 1) {
s0 = treasure_maker_name2_70;

} else if (i0 == 2) {
s0 = treasure_maker_name3_70;

} else if (i0 == 3) {
s0 = treasure_maker_name4_70;

} else if (i0 == 4) {
s0 = treasure_maker_name5_70;

}
maker0 = gg.GetNpcMaker(s0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (nType == 4) {
i0 = gg.Rand(5);
if (i0 == 0) {
s0 = treasure_maker_name1_80;

} else if (i0 == 1) {
s0 = treasure_maker_name2_80;

} else if (i0 == 2) {
s0 = treasure_maker_name3_80;

} else if (i0 == 3) {
s0 = treasure_maker_name4_80;

} else if (i0 == 4) {
s0 = treasure_maker_name5_80;

}
maker0 = gg.GetNpcMaker(s0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
myself.AddTimerEx(2003, 30 * 1000);

} else if (timer_id == 2004) {
if (nType == 0) {
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

} else if (nType == 1) {
i0 = gg.Rand(5);
if (i0 == 0) {
s1 = areaname_50_1;

} else if (i0 == 1) {
s1 = areaname_50_2;

} else if (i0 == 2) {
s1 = areaname_50_3;

} else if (i0 == 3) {
s1 = areaname_50_4;

} else if (i0 == 4) {
s1 = areaname_50_5;

}
gg.Area_SetOnOff(s1, 1);

} else if (nType == 2) {
i0 = gg.Rand(5);
if (i0 == 0) {
s1 = areaname_60_1;

} else if (i0 == 1) {
s1 = areaname_60_2;

} else if (i0 == 2) {
s1 = areaname_60_3;

} else if (i0 == 3) {
s1 = areaname_60_4;

} else if (i0 == 4) {
s1 = areaname_60_5;

}
gg.Area_SetOnOff(s1, 1);

} else if (nType == 3) {
i0 = gg.Rand(5);
if (i0 == 0) {
s1 = areaname_70_1;

} else if (i0 == 1) {
s1 = areaname_70_2;

} else if (i0 == 2) {
s1 = areaname_70_3;

} else if (i0 == 3) {
s1 = areaname_70_4;

} else if (i0 == 4) {
s1 = areaname_70_5;

}
gg.Area_SetOnOff(s1, 1);

} else if (nType == 4) {
i0 = gg.Rand(5);
if (i0 == 0) {
s1 = areaname_80_1;

} else if (i0 == 1) {
s1 = areaname_80_2;

} else if (i0 == 2) {
s1 = areaname_80_3;

} else if (i0 == 3) {
s1 = areaname_80_4;

} else if (i0 == 4) {
s1 = areaname_80_5;

}
gg.Area_SetOnOff(s1, 1);

}
myself.AddTimerEx(2004, 30 * 1000);

} else if (timer_id == 2005) {
if (nType == 0) {
gg.Area_SetOnOff(areaname_40_1, 0);
gg.Area_SetOnOff(areaname_40_2, 0);
gg.Area_SetOnOff(areaname_40_3, 0);
gg.Area_SetOnOff(areaname_40_4, 0);
gg.Area_SetOnOff(areaname_40_5, 0);

} else if (nType == 1) {
gg.Area_SetOnOff(areaname_50_1, 0);
gg.Area_SetOnOff(areaname_50_2, 0);
gg.Area_SetOnOff(areaname_50_3, 0);
gg.Area_SetOnOff(areaname_50_4, 0);
gg.Area_SetOnOff(areaname_50_5, 0);

} else if (nType == 2) {
gg.Area_SetOnOff(areaname_60_1, 0);
gg.Area_SetOnOff(areaname_60_2, 0);
gg.Area_SetOnOff(areaname_60_3, 0);
gg.Area_SetOnOff(areaname_60_4, 0);
gg.Area_SetOnOff(areaname_60_5, 0);

} else if (nType == 3) {
gg.Area_SetOnOff(areaname_70_1, 0);
gg.Area_SetOnOff(areaname_70_2, 0);
gg.Area_SetOnOff(areaname_70_3, 0);
gg.Area_SetOnOff(areaname_70_4, 0);
gg.Area_SetOnOff(areaname_70_5, 0);

} else if (nType == 4) {
gg.Area_SetOnOff(areaname_80_1, 0);
gg.Area_SetOnOff(areaname_80_2, 0);
gg.Area_SetOnOff(areaname_80_3, 0);
gg.Area_SetOnOff(areaname_80_4, 0);
gg.Area_SetOnOff(areaname_80_5, 0);

}
myself.AddTimerEx(2005, 60 * 1000);

}
	}


}