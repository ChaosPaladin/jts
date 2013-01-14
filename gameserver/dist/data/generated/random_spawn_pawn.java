package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class random_spawn_pawn extends default_maker {
	protected int maximum_npc = 0;

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
if (on_start_spawn == 0) {
return;

}
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam reply) {
i2 = gg.Rand(maximum_npc);
def0 = myself.GetSpawnDefine(i2);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, def0.respawn_time, def0.respawn_rand);

}

}
	}


}