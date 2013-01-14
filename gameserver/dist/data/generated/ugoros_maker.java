package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ugoros_maker extends default_use_db_maker {
	protected int GM_UGOROS = 37;
	protected String maker_ugoros_herb = "oren21_mb2220_ugozg02m1";

	protected void ON_START(HandlerParam def0) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0 && def0.has_dbname) {
def0.LoadDBNpcInfo(1010);

}
	}

	protected void ON_DB_NPC_INFO(HandlerParam loaded_def, HandlerParam record0, HandlerParam i0, HandlerParam maker0, HandlerParam def0) {
def0 = myself.GetSpawnDefine(0);
if (record0.is_alive) {
loaded_def.SetDBLoaded(1);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

} else if (loaded_def.respawn_time != 0) {
if (record0.death_time == 0) {
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

} else {
i0 = record0.death_time + loaded_def.respawn_time + loaded_def.respawn_rand;
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.RegToRespawnTimer(i0);

}

}

}

}
	}

	protected void ON_NPC_CREATED(HandlerParam created_def, HandlerParam maker0) {
if (created_def == myself.GetSpawnDefine(0)) {
maker0 = gg.GetNpcMaker(maker_ugoros_herb);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010083, 0, 0);

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam maker0) {
deleted_def.SetDBLoaded(0);
if (deleted_def.respawn_time != 0 && myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}
if (deleted_def == myself.GetSpawnDefine(0)) {
maker0 = gg.GetNpcMaker(maker_ugoros_herb);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010083, 1, 0);

}

}
	}


}