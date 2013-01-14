package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class immo_trap_maker extends immo_basic_maker {
	protected int TM_trap_delay = 780001;
	protected int TIME_trap_delay = 30;

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam died, HandlerParam i0, HandlerParam i1, HandlerParam def0, HandlerParam maker0, HandlerParam reply) {
if (myself.enabled == 1) {
def0 = myself.GetSpawnDefine(gg.Rand(3));
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, def0.respawn_time, def0.respawn_rand);

}

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0) {
if (timer_id == TM_trap_delay && myself.enabled == 1) {
i0 = gg.Rand(3);
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 78010067 && myself.enabled == 1) {
myself.AddTimerEx(TM_trap_delay, TIME_trap_delay * 1000);

} else if (script_event_arg1 == 1000) {
myself.enabled = 0;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0 && def0.npc_count > 0) {
def0.Despawn();

}

}

}
	}


}