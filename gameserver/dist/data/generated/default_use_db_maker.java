package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class default_use_db_maker extends default_maker {
	protected int on_start_spawn = 1;
	protected int on_start_spawn_child = 0;
	protected String maker_name = "default_use_db_maker_default";

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
if (on_start_spawn == 0) {
return;

}
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0 && def0.has_dbname) {
def0.LoadDBNpcInfo(1010);

}

}
	}

	protected void ON_DB_NPC_INFO(HandlerParam loaded_def, HandlerParam record0, HandlerParam i0, HandlerParam maker0) {
if (record0.is_alive) {
if (loaded_def.respawn_time != 0 && myself.AtomicIncreaseTotal(loaded_def, 1, 1)) {
loaded_def.SetDBLoaded(1);
loaded_def.SpawnEx(1, 0, record0.x, record0.y, record0.z, 0, record0.hp, record0.mp, record0.db_value);

}

} else if (loaded_def.respawn_time != 0 && myself.AtomicIncreaseTotal(loaded_def, 1, 1)) {
if (record0.death_time == 0) {
loaded_def.Spawn2(loaded_def.total, 0, 0);

} else {
i0 = record0.death_time + loaded_def.respawn_time;
loaded_def.RegToRespawnTimer(i0);
if (on_start_spawn_child == 1) {
maker0 = gg.GetNpcMaker(maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
deleted_def.SetDBLoaded(0);
if (deleted_def.respawn_time != 0 && myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}
	}

	protected void ON_ALL_NPC_DELETED(HandlerParam maker0) {
maker0 = gg.GetNpcMaker(maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
	}


}