package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_maker_normal extends abstract_maker {
	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam def0) {
if (script_event_arg1 == 88008) {
myself.i_ai0 = script_event_arg2;
myself.i_ai4 = 0;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

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

	protected void ON_ALL_NPC_DELETED(HandlerParam c0) {
c0 = gg.GetCreatureFromIndex(myself.i_ai0);
if (gg.IsNull(c0) == 0 && myself.i_ai4 == 0) {
gg.SendScriptEvent(c0, 88009, 0);

}
	}


}