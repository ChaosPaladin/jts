package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class farm_maker extends default_maker {
	protected int CastleID = 0;
	protected String DoorName1 = "DoorName1_default";
	protected String DoorName2 = "DoorName2_default";
	protected String DoorName3 = "DoorName3_default";
	protected String DoorName4 = "DoorName4_default";
	protected String DoorName5 = "DoorName5_default";

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.RegisterAgitSiegeEventEx(CastleID);
def0 = myself.GetSpawnDefine(0);
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}
for (i0 = 1; i0 < myself.def_count - 1; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0 && def0.has_dbname) {
def0.LoadDBNpcInfo(1010);

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
	}

	protected void ON_DB_NPC_INFO(HandlerParam loaded_def, HandlerParam record0, HandlerParam i0) {
if (record0.is_alive) {
if (myself.AtomicIncreaseTotal(loaded_def, 1, 1)) {
loaded_def.SetDBLoaded(1);
loaded_def.SpawnEx(1, 0, record0.x, record0.y, record0.z, 0, record0.hp, record0.mp, record0.db_value);
myself.AddTimerEx(1000, 3000);

}

}
	}

	protected void ON_START_SIEGE_EVENT(HandlerParam def0, HandlerParam i0) {
for (i0 = 1; i0 < myself.def_count - 1; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
gg.Castle_GateOpenClose2(DoorName1, 1);
gg.Castle_GateOpenClose2(DoorName2, 1);
gg.Castle_GateOpenClose2(DoorName3, 1);
gg.Castle_GateOpenClose2(DoorName4, 1);
gg.Castle_GateOpenClose2(DoorName5, 1);
	}

	protected void ON_START_TEAMBATTLEAGIT_FINAL_EVENT(HandlerParam def0, HandlerParam i0) {
for (i0 = 1; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
gg.Castle_GateOpenClose2(DoorName1, 1);
gg.Castle_GateOpenClose2(DoorName2, 1);
gg.Castle_GateOpenClose2(DoorName3, 1);
gg.Castle_GateOpenClose2(DoorName4, 1);
gg.Castle_GateOpenClose2(DoorName5, 1);
	}

	protected void ON_END_SIEGE_EVENT(HandlerParam def0, HandlerParam i0) {
for (i0 = 1; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
def0.Despawn();

}
gg.Castle_GateOpenClose2(DoorName1, 0);
gg.Castle_GateOpenClose2(DoorName2, 0);
gg.Castle_GateOpenClose2(DoorName3, 0);
gg.Castle_GateOpenClose2(DoorName4, 0);
gg.Castle_GateOpenClose2(DoorName5, 0);
	}


}