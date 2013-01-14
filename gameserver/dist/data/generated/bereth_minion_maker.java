package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class bereth_minion_maker extends abstract_maker {
	protected void ON_START() {
myself.i_ai0 = 0;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam i3, HandlerParam i4, HandlerParam c0) {
if (myself.i_ai0 == 1) {
i4 = 60;
myself.RegisterRespawn(i4, 1, deleted_def);

}
	}

	protected void ON_ALL_NPC_DELETED() {
	}

	protected void ON_NPC_CREATED(HandlerParam created_def, HandlerParam created_npc, HandlerParam maker0) {
if (myself.i_ai0 == 0) {
if (gg.IsNull(created_npc) == 0) {
created_npc.Despawn();

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id) {
if (timer_id == 5001) {
if (myself.i_ai0 == 1) {
myself.DoRespawn();
myself.AddTimerEx(5001, 1000);

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
switch (script_event_arg1) {
case 1109238: {
myself.i_ai0 = 0;
break;

}
case 1000: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
myself.i_ai0 = 0;
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
myself.AddTimerEx(5001, 1000);
myself.i_ai0 = 1;
break;

}
case 1109241: {
def0 = myself.GetSpawnDefine(script_event_arg2);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, 0, 0);

}
break;

}

}
	}


}