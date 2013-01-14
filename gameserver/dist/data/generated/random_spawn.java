package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class random_spawn extends default_maker {
	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam def0) {
if (on_start_spawn == 0) {
return;

}
i1 = gg.Rand(myself.def_count);
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0 && i0 == i1) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam def0, HandlerParam reply) {
i1 = gg.Rand(myself.def_count);
def0 = myself.GetSpawnDefine(i1);
if (gg.IsNull(def0) == 0) {
i2 = def0.total - def0.npc_count;
if (i2 > 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, def0.respawn_time, def0.respawn_rand);

}

}

}
	}


}