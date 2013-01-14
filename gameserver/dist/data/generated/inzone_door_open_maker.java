package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_door_open_maker extends inzone_maker {
	protected String DoorName = "inzone_door_open_maker_default";
	protected int on_start_spawn = 0;

	protected void ON_START() {
myself.RegisterInstantZoneEventEx(inzone_type_param, inzone_cluster_id, despawn_event_id, 0);
myself.RegisterDoorEvent(DoorName, inzone_type_param);
	}

	protected void ON_DOOR_EVENT(HandlerParam enabled, HandlerParam i0, HandlerParam i1, HandlerParam def0) {
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
for (i1 = 0; i1 < myself.def_count; i1 = i1 + 1) {
def0 = myself.GetSpawnDefine(i1);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}

}
	}


}