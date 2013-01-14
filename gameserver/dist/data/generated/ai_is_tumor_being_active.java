package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_is_tumor_being_active extends default_npc {
	protected int type = 0;
	protected int start_hp_rate = 80;
	protected int regen_value = 20;
	protected int Vein_Convergency = 9;
	protected int Vein_Size = 50;
	protected int FieldCycle = 3;
	protected int FieldCycle_Quantity = -500;
	protected String active_tumor_maker = "";
	protected String my_maker = "";

	protected void CREATED(HandlerParam i0, HandlerParam maker0, HandlerParam f0, HandlerParam i1) {
myself.i_ai2 = 0;
myself.i_ai0 = 0;
myself.BroadcastScriptEvent(989806, 0, 6000);
gg.SetNpcParam(myself.sm, 9, myself.sm.max_hp / 100 * start_hp_rate);
for (i1 = 0; i1 < 3; i1 = i1 + 1) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), my_maker);
i0 = maker0.npc_count;
if (i0 < maker0.maximum_npc) {
switch (gg.Rand(3)) {
case 0: {
myself.CreateOnePrivateEx(1018706, "ai_is_vein", 0, 0, gg.FloatToInt(myself.sm.x) + gg.Rand(Vein_Convergency + 1) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.y) + gg.Rand(Vein_Convergency + 1) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.z), gg.Rand(61440), 0, 0, 0);
break;

}
case 1: {
myself.CreateOnePrivateEx(1018706, "ai_is_vein", 0, 0, gg.FloatToInt(myself.sm.x) + gg.Rand(Vein_Convergency + 2) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.y) + gg.Rand(Vein_Convergency + 2) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.z), gg.Rand(61440), 0, 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(1018706, "ai_is_vein", 0, 0, gg.FloatToInt(myself.sm.x) + gg.Rand(Vein_Convergency + 3) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.y) + gg.Rand(Vein_Convergency + 3) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.z), gg.Rand(61440), 0, 0, 0);
break;

}

}

}

}
myself.i_ai1 = 3;
myself.AddTimerEx(1002, 10 + gg.Rand(5) * 1000);
myself.AddTimerEx(1003, 1 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (timer_id == 1002) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), my_maker);
i0 = maker0.npc_count;
if (i0 < maker0.maximum_npc) {
switch (gg.Rand(3)) {
case 0: {
myself.CreateOnePrivateEx(1018706, "ai_is_vein", 0, 0, gg.FloatToInt(myself.sm.x) + gg.Rand(Vein_Convergency + 1) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.y) + gg.Rand(Vein_Convergency + 1) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.z), gg.Rand(61440), 0, 0, 0);
break;

}
case 1: {
myself.CreateOnePrivateEx(1018706, "ai_is_vein", 0, 0, gg.FloatToInt(myself.sm.x) + gg.Rand(Vein_Convergency + 2) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.y) + gg.Rand(Vein_Convergency + 2) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.z), gg.Rand(61440), 0, 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(1018706, "ai_is_vein", 0, 0, gg.FloatToInt(myself.sm.x) + gg.Rand(Vein_Convergency + 3) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.y) + gg.Rand(Vein_Convergency + 3) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.z), gg.Rand(61440), 0, 0, 0);
break;

}

}
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 98) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, active_tumor_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
myself.BroadcastScriptEvent(989812, 0, 3000);
myself.Despawn();

}

}

}
myself.AddTimerEx(1002, 10 + gg.Rand(5) * 1000);
gg.SetNpcParam(myself.sm, 35, myself.sm.hp_regen);

} else if (timer_id == 1003) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) != myself.i_ai2) {
myself.i_ai2 = gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100);
if (myself.i_ai2 == 85) {
gg.BroadcastOnScreenMsgStr(myself.sm, 6000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800264, "", "", "", "", ""));

} else if (myself.i_ai2 == 95) {
gg.BroadcastOnScreenMsgStr(myself.sm, 6000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800265, "", "", "", "", ""));

}

}
myself.AddTimerEx(1003, 1 * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0, HandlerParam f0, HandlerParam f1, HandlerParam maker0) {
if (script_event_arg1 == 98914) {
c0 = gg.GetCreatureFromIndex(script_event_arg3);
gg.SetNpcParam(myself.sm, 35, myself.sm.hp_regen + regen_value);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 998915, 0);

}

} else if (script_event_arg1 == 9898903) {
myself.i_ai1 = myself.i_ai1 - 1;
gg.SetNpcParam(myself.sm, 35, myself.sm.hp_regen - i0 * regen_value);

} else if (script_event_arg1 == 998916) {
myself.BroadcastScriptEvent(998916, 0, 6000);
myself.Despawn();

} else if (script_event_arg1 == 998917) {
myself.Despawn();

}
	}


}