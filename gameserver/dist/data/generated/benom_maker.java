package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class benom_maker extends default_maker {
	protected int CastleID = 0;
	protected int dominion_id = 88;

	protected void ON_START(HandlerParam def0) {
myself.RegisterSiegeEventEx(CastleID);
myself.RegisterSiegeEventEx(dominion_id);
def0 = myself.GetSpawnDefine(0);
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0 && def0.has_dbname) {
def0.LoadDBNpcInfo(1010);

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
	}

	protected void ON_PROCLAIM_SIEGE_EVENT(HandlerParam def0) {
def0 = myself.GetSpawnDefine(1);
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}
	}

	protected void ON_DB_NPC_INFO(HandlerParam loaded_def, HandlerParam record0, HandlerParam i0) {
if (record0.is_alive) {
if (myself.AtomicIncreaseTotal(loaded_def, 1, 1)) {
loaded_def.SetDBLoaded(1);
loaded_def.SpawnEx(1, 0, record0.x, record0.y, record0.z, 0, record0.hp, record0.mp, record0.db_value);

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 1000) {
def0 = myself.GetSpawnDefine(1);
def0.SendScriptEvent(10100, 1, 0);

}
	}

	protected void ON_DESTRUCT_CTRL_TOWER_EVENT(HandlerParam def0) {
def0 = myself.GetSpawnDefine(1);
if (gg.GetDominionWarState(dominion_id) != 5) {
if (def0.npc_count == 1) {
def0.SendScriptEvent(10100, 1, 0);
def0 = myself.GetSpawnDefine(0);
def0.SendScriptEvent(10101, 1, 0);

} else if (gg.IsNull(def0) == 0 && def0.has_dbname) {
def0.LoadDBNpcInfo(10);

}

}
	}

	protected void ON_CANCEL_SIEGE_EVENT(HandlerParam def0) {
def0 = myself.GetSpawnDefine(1);
def0.Despawn();
	}

	protected void ON_END_SIEGE_EVENT(HandlerParam def0) {
def0 = myself.GetSpawnDefine(1);
def0.Despawn();
	}


}