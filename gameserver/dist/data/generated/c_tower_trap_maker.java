package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_trap_maker extends abstract_maker {
	protected String AreaName1 = "keep_damage_trap_default";
	protected String AreaName2 = "keep_damage_trap_default";
	protected String AreaName3 = "keep_damage_trap_default";
	protected String AreaName4 = "keep_damage_trap_default";
	protected String AreaName5 = "keep_damage_trap_default";
	protected String AreaName6 = "keep_damage_trap_default";
	protected String AreaName7 = "keep_damage_trap_default";
	protected String AreaName8 = "keep_damage_trap_default";
	protected String AreaName9 = "keep_damage_trap_default";
	protected int on_start_spawn = 1;

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
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
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (deleted_def.respawn_time != 0) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}
	}

	protected void ON_ALL_NPC_DELETED() {
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
switch (script_event_arg1) {
case 1000: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
gg.Area_SetOnOff(AreaName1, 0);
gg.Area_SetOnOff(AreaName2, 0);
gg.Area_SetOnOff(AreaName3, 0);
gg.Area_SetOnOff(AreaName4, 0);
gg.Area_SetOnOff(AreaName5, 0);
gg.Area_SetOnOff(AreaName6, 0);
gg.Area_SetOnOff(AreaName7, 0);
gg.Area_SetOnOff(AreaName8, 0);
gg.Area_SetOnOff(AreaName9, 0);
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
	}


}