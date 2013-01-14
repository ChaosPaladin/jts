package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fieldcycle_maker extends default_maker {
	protected int FieldCycle = -1;
	protected int Threshold_Min = -1;
	protected int Threshold_Max = 100;
	protected int Point_Min = -1;
	protected int Point_Max = 2147483647;

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam def0) {
if (FieldCycle != -1) {
myself.RegisterFieldCycleEventEx(FieldCycle);
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = gg.GetPoint_FieldCycle(FieldCycle);
if (i0 >= Threshold_Min && i0 <= Threshold_Max && i1 >= Point_Min && i1 <= Point_Max) {
myself.i_ai0 = 1;
if (on_start_spawn == 0) {
return;

}
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}

} else {
myself.i_ai0 = 0;

}

}
	}

	protected void ON_FIELD_CYCLE_CHANGED_EVENT(HandlerParam event_id, HandlerParam state, HandlerParam i1) {
if (event_id == FieldCycle) {
i1 = gg.GetPoint_FieldCycle(FieldCycle);
if (state >= Threshold_Min && state <= Threshold_Max && i1 >= Point_Min && i1 <= Point_Max) {
if (myself.i_ai0 == 0) {
gg.SendMakerScriptEvent(myself, 1001, 0, 0);
myself.i_ai0 = 1;

}

} else {
gg.SendMakerScriptEvent(myself, 1000, 0, 0);
myself.i_ai0 = 0;

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam i3, HandlerParam i4) {
if (deleted_def.respawn_time != 0) {
i3 = gg.GetStep_FieldCycle(FieldCycle);
i4 = gg.GetPoint_FieldCycle(FieldCycle);
if (i3 >= Threshold_Min && i3 <= Threshold_Max && i4 >= Point_Min && i4 <= Point_Max) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
i2 = gg.GetStep_FieldCycle(FieldCycle);
i3 = gg.GetPoint_FieldCycle(FieldCycle);
if (i2 >= Threshold_Min && i2 <= Threshold_Max && i3 >= Point_Min && i3 <= Point_Max) {
switch (script_event_arg1) {
case 1000: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
break;

}
case 1001: {
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

} else {
switch (script_event_arg1) {
case 1000: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
break;

}

}

}
	}

	protected void ON_NPC_CREATED(HandlerParam created_npc, HandlerParam i0, HandlerParam i1) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = gg.GetPoint_FieldCycle(FieldCycle);
if (i0 < Threshold_Min || i0 > Threshold_Max || i1 < Point_Min || i1 > Point_Max) {
created_npc.Despawn();

}
	}


}