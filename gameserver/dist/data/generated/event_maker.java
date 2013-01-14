package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_maker extends abstract_maker {
	protected String EventName = "none";

	protected void ON_START() {
myself.enabled = 0;
myself.RegisterNpcPosEvent(EventName);
	}

	protected void ON_NPCPOS_EVENT(HandlerParam enabled, HandlerParam i0, HandlerParam def0) {
if (enabled) {
if (myself.enabled) {
return;

}
myself.enabled = 1;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}

} else {
if (myself.enabled == 0) {
return;

}
myself.enabled = 0;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}

}
	}

	protected void ON_NPC_CREATED(HandlerParam created_npc) {
if (myself.enabled == 0) {
created_npc.Despawn();

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (myself.enabled) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}
	}


}