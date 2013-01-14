package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fieldcycle_use_db_maker extends fieldcycle_maker {
	protected int on_start_spawn = 1;
	protected String maker_name = "default_use_db_maker_default";

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam def0) {
if (FieldCycle != -1) {
myself.RegisterFieldCycleEventEx(FieldCycle);
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = gg.GetPoint_FieldCycle(FieldCycle);
if (i0 >= Threshold_Min && i0 <= Threshold_Max && i1 >= Point_Min && i1 <= Point_Max) {
myself.i_ai0 = 1;
if (on_start_spawn == 0) {
return;

}
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0 && def0.has_dbname) {
def0.LoadDBNpcInfo(1010);

}

}

} else {
myself.i_ai0 = 0;

}

}
	}

	protected void ON_FIELD_CYCLE_CHANGED_EVENT(HandlerParam event_id, HandlerParam state, HandlerParam i1, HandlerParam def0) {
if (event_id == FieldCycle) {
i1 = gg.GetPoint_FieldCycle(FieldCycle);
if (state >= Threshold_Min && state <= Threshold_Max && i1 >= Point_Min && i1 <= Point_Max) {
if (myself.i_ai0 == 0) {
def0.LoadDBNpcInfo(1010);
myself.i_ai0 = 1;

}

} else {
gg.SendMakerScriptEvent(myself, 1000, 0, 0);
myself.i_ai0 = 0;

}

}
	}

	protected void ON_DB_NPC_INFO(HandlerParam loaded_def, HandlerParam record0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i1 = gg.GetStep_FieldCycle(FieldCycle);
i2 = gg.GetPoint_FieldCycle(FieldCycle);
if (i1 >= Threshold_Min && i1 <= Threshold_Max && i2 >= Point_Min && i2 <= Point_Max) {
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