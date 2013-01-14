package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ugoros_herb_maker extends default_maker {
	protected int on_start_spawn = 0;

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 78010083 && script_event_arg2 == 0) {
for (i0 = 0; i0 < gg.FloatToInt(myself.maximum_npc / 2); i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(gg.Rand(myself.def_count));
if (gg.IsNull(def0) == 0 && myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

} else if (script_event_arg1 == 78010083 && script_event_arg2 == 1) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam died, HandlerParam def0) {
if (deleted_def == myself.GetSpawnDefine(0) && died == 1) {
if (gg.Rand(100) <= 30 && myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

} else {
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0 && myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}

} else if (deleted_def == myself.GetSpawnDefine(1) && died == 1) {
if (gg.Rand(100) <= 30 && myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

} else {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0 && myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}

}
	}


}