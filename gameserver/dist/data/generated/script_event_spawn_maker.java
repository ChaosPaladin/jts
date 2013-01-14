package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class script_event_spawn_maker extends default_maker {
	protected int on_start_spawn = 0;
	protected int script_event_enable = 1;

	protected void ON_START() {
myself.i_ai0 = 0;
super;
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
break;

}
case 1001: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
i1 = def0.total - def0.npc_count;
if (i1 > 0) {
if (myself.AtomicIncreaseTotal(def0, i1, 1)) {
def0.Spawn(i1, script_event_arg2);

}

}

}

}
break;

}
case 5: {
myself.i_ai0 = script_event_arg2;
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.maximum_npc >= myself.npc_count + def0.total) {
i1 = def0.total - def0.npc_count;
if (myself.AtomicIncreaseTotal(def0, script_event_arg3, 1)) {
def0.Spawn(script_event_arg3, 0);

}
myself.AddTimerEx(9989, 3 * 1000);

}

}
break;

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam def0) {
if (timer_id == 9989) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(8, myself.i_ai0, 0);

}

}
	}


}