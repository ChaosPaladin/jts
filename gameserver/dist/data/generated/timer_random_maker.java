package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class timer_random_maker extends default_maker {
	protected int spawn_interval = 0;
	protected int script_event_use = 0;

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam def0) {
if (on_start_spawn == 0) {
return;

}
myself.i_ai0 = 0;
i0 = gg.Rand(myself.def_count);
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
i1 = def0.total - def0.npc_count;
if (i1 > 0) {
if (myself.AtomicIncreaseTotal(def0, i1, 1)) {
def0.Spawn2(i1, 0, 0);

}

}

}
	}

	protected void ON_NPC_CREATED(HandlerParam created_def, HandlerParam created_npc, HandlerParam maker0, HandlerParam i0) {
myself.i_ai0 = 1;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
myself.i_ai0 = 0;
myself.AddTimerEx(1879, spawn_interval * 60 * 1000);
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 1879) {
if (myself.i_ai0 == 0) {
i0 = gg.Rand(myself.def_count);
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
i1 = def0.total - def0.npc_count;
if (i1 > 0) {
if (myself.AtomicIncreaseTotal(def0, i1, 1)) {
def0.Spawn2(i1, 0, 0);

}

}

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam i1, HandlerParam def0) {
if (script_event_use == 0) {
return;

}
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
if (myself.i_ai0 == 0) {
i0 = gg.Rand(myself.def_count);
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
i1 = def0.total - def0.npc_count;
if (i1 > 0) {
if (myself.AtomicIncreaseTotal(def0, i1, 1)) {
def0.Spawn2(i1, 0, 0);

}

}

}

}
break;

}

}
	}


}