package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class random_spawn_treasurebox extends default_maker {
	protected int maximum_npc = 0;

	protected void ON_START(HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (on_start_spawn == 0) {
return;

}
for (i0 = 0; i0 < myself.maximum_npc; i0 = i0 + 1) {
i1 = gg.Rand(myself.def_count);
def0 = myself.GetSpawnDefine(i1);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0) {
i2 = gg.Rand(myself.def_count);
def0 = myself.GetSpawnDefine(i2);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, def0.respawn_time, def0.respawn_rand);

}

}
	}


}