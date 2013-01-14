package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class manage_teleport_dungeon extends default_maker {
	protected int hunting_level_index = -1;
	protected int room_index = -1;
	protected String manager_npc_name = "KIN";

	protected void ON_START(HandlerParam i0, HandlerParam def0, HandlerParam i2) {
if (manager_npc_name == "KIN") {

}
def0 = myself.GetSpawnDefineByNick(manager_npc_name);
if (gg.IsNull(def0) == 0) {
i2 = def0.total - def0.npc_count;
if (i2 > 0) {
if (myself.AtomicIncreaseTotal(def0, i2, 1)) {
def0.Spawn2(i2, 0, 0);

}

}

}
myself.i_ai0 = 0;
	}

	protected void ON_TIMER(HandlerParam timer_id) {
if (timer_id == 5001) {
if (myself.i_ai0 == 1) {
myself.DoRespawn();
myself.AddTimerEx(5001, 1000);

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
switch (script_event_arg1) {
case 0: {
myself.i_ai0 = 0;
myself.ResetRespawn();
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (gg.IsSameString(def0.name, manager_npc_name) == 0) {
def0.Despawn();

}

}

}
break;

}
case 1: {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.ResetRespawn();
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (gg.IsSameString(def0.name, manager_npc_name) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}

}
myself.AddTimerEx(5001, 1000);

}
break;

}
case 3: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (gg.IsSameString(def0.name, manager_npc_name)) {
def0.SendScriptEvent(script_event_arg1, 0, 0);

} else {
def0.Despawn();

}

}

}
break;

}
case 2: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (gg.IsSameString(def0.name, manager_npc_name)) {
def0.SendScriptEvent(script_event_arg1, 0, 0);

}

}

}
break;

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (myself.i_ai0 == 1 && deleted_def.respawn_time != 0) {
myself.RegisterRespawn(deleted_def.respawn_time, 1, deleted_def);

}
	}

	protected void ON_NPC_CREATED(HandlerParam created_def, HandlerParam created_npc, HandlerParam maker0) {
if (myself.i_ai0 == 0) {
if (gg.IsSameString(created_def.name, manager_npc_name) == 0) {
if (gg.IsNull(created_npc) == 0) {
created_npc.Despawn();

}

}

}
	}


}