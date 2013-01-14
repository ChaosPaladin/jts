package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cleft_maker extends default_maker {
	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0, HandlerParam s0) {
if (timer_id == 1000) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0 && myself.i_ai0 == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.enabled = 1;

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (myself.enabled == 0) {
return;

}
if (deleted_def.respawn_time != 0) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (script_event_arg1 == 10025) {
myself.enabled = 0;
for (i0 = 1; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
myself.AddTimerEx(1000, 3 * 60 * 1000);

}
if (script_event_arg1 == 1325001) {
myself.enabled = 0;
myself.i_ai0 = 1;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}

}
if (script_event_arg1 == 1001) {
myself.i_ai0 = 0;

}
super;
	}


}