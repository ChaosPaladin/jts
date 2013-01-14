package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class Close_Door_maker extends default_maker {
	protected String DoorName = "none";

	protected void ON_START() {
myself.enabled = 0;
myself.RegisterDoorEvent(DoorName, 0);
	}

	protected void ON_DOOR_EVENT(HandlerParam enabled, HandlerParam i0, HandlerParam i1, HandlerParam def0) {
if (enabled == 0) {
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
for (i1 = 0; i1 < myself.def_count; i1 = i1 + 1) {
def0 = myself.GetSpawnDefine(i1);
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
	}


}