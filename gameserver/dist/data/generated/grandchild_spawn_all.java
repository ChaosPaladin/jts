package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class grandchild_spawn_all extends default_maker {
	protected int on_start_spawn = 0;

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
super;
myself.i_ai0 = 0;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam deleted_npc, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (myself.i_ai0 == 1) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}
	}

	protected void ON_NPC_CREATED(HandlerParam created_def, HandlerParam created_npc, HandlerParam maker0, HandlerParam i0) {
if (myself.i_ai0 == 0) {
created_npc.Despawn();

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
switch (script_event_arg1) {
case 1000: {
myself.i_ai0 = 0;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
break;

}
case 1001: {
myself.i_ai0 = 1;
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