package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sailren_maker extends default_use_db_maker {
	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
switch (script_event_arg1) {
case 11042: {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(11042, 1, 0);

}
break;

}

}
super;
	}

	protected void ON_DB_NPC_INFO(HandlerParam loaded_def, HandlerParam record0, HandlerParam i0, HandlerParam maker0) {
if (record0.is_alive) {
if (myself.AtomicIncreaseTotal(loaded_def, 1, 1)) {
if (record0.x != -113091) {
maker0 = gg.GetNpcMaker("rune16_npc2017_01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11047, 0, 0);

}

}
if (record0.x == -113091) {
maker0 = gg.GetNpcMaker("rune16_npc2017_13m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11047, 0, 0);

}

}
loaded_def.SetDBLoaded(1);
loaded_def.SpawnEx(1, 0, record0.x, record0.y, record0.z, 0, record0.hp, record0.mp, record0.db_value);

}

} else if (myself.AtomicIncreaseTotal(loaded_def, 1, 1)) {
if (record0.death_time == 0) {
loaded_def.Spawn2(loaded_def.total, 0, 0);

} else {
i0 = record0.death_time + loaded_def.respawn_time;
loaded_def.RegToRespawnTimer(i0);

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
deleted_def.SetDBLoaded(0);
maker0 = gg.GetNpcMaker("rune16_npc2017_01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11045, 0, 0);

}
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}
	}


}