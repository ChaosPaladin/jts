package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_maker_special2 extends abstract_maker {
	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam def0, HandlerParam i0) {
if (script_event_arg1 == 88008) {
myself.i_ai0 = script_event_arg2;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}
myself.AddTimerEx(1004, 25 * 1000);

}

}
if (script_event_arg1 == 1000) {
myself.i_ai4 = 1;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam def0) {
if (timer_id == 1004) {
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}
myself.AddTimerEx(1005, 50 * 1000);

}

}
if (timer_id == 1005) {
def0 = myself.GetSpawnDefine(2);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
def0 = myself.GetSpawnDefine(3);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}
myself.AddTimerEx(1006, 75 * 1000);

}

}
if (timer_id == 1006) {
def0 = myself.GetSpawnDefine(4);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);
myself.i_ai3 = 1;

}

}

}
	}

	protected void ON_ALL_NPC_DELETED(HandlerParam c0) {
c0 = gg.GetCreatureFromIndex(myself.i_ai0);
if (gg.IsNull(c0) == 0 && myself.i_ai3 == 1 && myself.i_ai4 == 0) {
gg.SendScriptEvent(c0, 88009, 0);

}
	}


}