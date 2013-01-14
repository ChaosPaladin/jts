package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_ice_knight extends inzone_maker {
	protected int debug_mode = 0;
	protected String MAKER_knight_leader = "schuttgart29_2314_102m2";
	protected String MAKER_controller = "schuttgart29_2314_01m1";
	protected int FLAG_SPAWN = 231400;
	protected int FLAG_NO_SPAWN = 231401;

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
super;
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
	}

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam inzone_type_id, HandlerParam inzone_id, HandlerParam event_id, HandlerParam reply, HandlerParam i0, HandlerParam def0) {
super;
myself.enabled = 1;
for (i0 = 0; i0 < 16; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.maximum_npc >= myself.npc_count + 1) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam def0, HandlerParam maker0) {
if (script_event_arg1 == 1000) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}

}
if (script_event_arg1 == 1001) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

}

}
if (script_event_arg1 == 23140013) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);

}
if (script_event_arg1 == 23140015) {
if (script_event_arg2 == 1) {
if (myself.i_ai0 == 1 || myself.i_ai0 == 4) {
i0 = gg.Rand(8);
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.c_ai0.alive == 1) {
def0.SendScriptEvent(23140045, gg.GetIndexFromCreature(myself.c_ai0), 0);

} else {
def0.SendScriptEvent(23140045, 0, 0);

}

}

} else if (myself.i_ai0 == 2 || myself.i_ai0 == 3) {
i0 = gg.Rand(16);
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.c_ai0.alive == 1) {
def0.SendScriptEvent(23140045, gg.GetIndexFromCreature(myself.c_ai0), 0);

} else {
def0.SendScriptEvent(23140045, 0, 0);

}

}

}

} else if (script_event_arg2 == 2) {
if (myself.i_ai0 == 1 || myself.i_ai0 == 4) {
i0 = gg.Rand(4);
i1 = gg.Rand(4) + 4;
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.c_ai0.alive == 1) {
def0.SendScriptEvent(23140045, gg.GetIndexFromCreature(myself.c_ai0), 0);

} else {
def0.SendScriptEvent(23140045, 0, 0);

}

}
def0 = myself.GetSpawnDefine(i1);
if (gg.IsNull(def0) == 0) {
if (myself.c_ai0.alive == 1) {
def0.SendScriptEvent(23140045, gg.GetIndexFromCreature(myself.c_ai0), 0);

} else {
def0.SendScriptEvent(23140045, 0, 0);

}

}

} else if (myself.i_ai0 == 2 || myself.i_ai0 == 3) {
i0 = gg.Rand(8);
i1 = gg.Rand(8) + 8;
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.c_ai0.alive == 1) {
def0.SendScriptEvent(23140045, gg.GetIndexFromCreature(myself.c_ai0), 0);

} else {
def0.SendScriptEvent(23140045, 0, 0);

}

}
def0 = myself.GetSpawnDefine(i1);
if (gg.IsNull(def0) == 0) {
if (myself.c_ai0.alive == 1) {
def0.SendScriptEvent(23140045, gg.GetIndexFromCreature(myself.c_ai0), 0);

} else {
def0.SendScriptEvent(23140045, 0, 0);

}

}

}

} else if (script_event_arg2 == 4) {
i0 = gg.Rand(4);
i1 = gg.Rand(4) + 4;
i2 = gg.Rand(4) + 8;
i3 = gg.Rand(4) + 12;
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.c_ai0.alive == 1) {
def0.SendScriptEvent(23140045, gg.GetIndexFromCreature(myself.c_ai0), 0);

} else {
def0.SendScriptEvent(23140045, 0, 0);

}

}
def0 = myself.GetSpawnDefine(i1);
if (gg.IsNull(def0) == 0) {
if (myself.c_ai0.alive == 1) {
def0.SendScriptEvent(23140045, gg.GetIndexFromCreature(myself.c_ai0), 0);

} else {
def0.SendScriptEvent(23140045, 0, 0);

}

}
def0 = myself.GetSpawnDefine(i2);
if (gg.IsNull(def0) == 0) {
if (myself.c_ai0.alive == 1) {
def0.SendScriptEvent(23140045, gg.GetIndexFromCreature(myself.c_ai0), 0);

} else {
def0.SendScriptEvent(23140045, 0, 0);

}

}
def0 = myself.GetSpawnDefine(i3);
if (gg.IsNull(def0) == 0) {
if (myself.c_ai0.alive == 1) {
def0.SendScriptEvent(23140045, gg.GetIndexFromCreature(myself.c_ai0), 0);

} else {
def0.SendScriptEvent(23140045, 0, 0);

}

}

}

}
if (script_event_arg1 == 23140001) {
if (debug_mode) {
gg.Announce("PHASE1");

}
myself.i_ai0 = 1;

} else if (script_event_arg1 == 23140002) {
if (debug_mode) {
gg.Announce("PHASE2");

}
myself.i_ai0 = 2;

} else if (script_event_arg1 == 23140003) {
if (debug_mode) {
gg.Announce("PHASE3");

}
myself.i_ai0 = 3;

} else if (script_event_arg1 == 23140005) {
if (debug_mode) {
gg.Announce("PHASE4");

}
myself.i_ai0 = 4;

} else if (script_event_arg1 == 23140006) {
if (debug_mode) {
gg.Announce("CLEAR.");

}
myself.i_ai0 = 5;

}
if (script_event_arg1 == FLAG_SPAWN) {
myself.i_ai2 = script_event_arg1;

} else if (script_event_arg1 == FLAG_NO_SPAWN) {
myself.i_ai2 = script_event_arg2;

}
if (script_event_arg1 == 23140054) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_knight_leader);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
if (script_event_arg1 == 23140056) {
if (script_event_arg2 == 11) {
i0 = 0;

} else if (script_event_arg2 == 12) {
i0 = 1;

} else if (script_event_arg2 == 13) {
i0 = 2;

} else if (script_event_arg2 == 14) {
i0 = 3;

} else if (script_event_arg2 == 15) {
i0 = 4;

} else if (script_event_arg2 == 16) {
i0 = 5;

} else if (script_event_arg2 == 17) {
i0 = 6;

} else if (script_event_arg2 == 18) {
i0 = 7;

} else if (script_event_arg2 == 21) {
i0 = 8;

} else if (script_event_arg2 == 22) {
i0 = 9;

} else if (script_event_arg2 == 23) {
i0 = 10;

} else if (script_event_arg2 == 24) {
i0 = 11;

} else if (script_event_arg2 == 25) {
i0 = 12;

} else if (script_event_arg2 == 26) {
i0 = 13;

} else if (script_event_arg2 == 27) {
i0 = 14;

} else if (script_event_arg2 == 28) {
i0 = 15;

}
def0 = myself.GetSpawnDefine(i0);
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, script_event_arg3, 0);

}

}
if (script_event_arg1 == 23140063) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;

}
if (script_event_arg1 == 23140069) {
if (myself.i_ai0 != 5) {
if (myself.i_ai0 == 2 && myself.i_ai2 == FLAG_SPAWN) {
myself.i_ai1 = myself.i_ai1 + 1;
if (myself.i_ai1 == 10) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
gg.SendMakerScriptEvent(maker0, 23140053, 0, 0);

} else if (myself.i_ai1 < 10) {
if (debug_mode) {
gg.Announce("[dbg]Phase2, 현재까지 죽은 빙궁기사 : " + myself.i_ai1);

}

}

}

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (myself.i_ai0 != 5) {
if (myself.i_ai0 == 2 && myself.i_ai2 == FLAG_SPAWN) {
myself.i_ai1 = myself.i_ai1 + 1;
if (myself.i_ai1 == 10) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
gg.SendMakerScriptEvent(maker0, 23140053, 0, 0);

} else if (myself.i_ai1 < 10) {
if (debug_mode) {
gg.Announce("[dbg]Phase2, 현재까지 죽은 빙궁기사 : " + myself.i_ai1);

}

}

}
if (myself.i_ai2 == FLAG_SPAWN) {
if (deleted_def.npc_count == 0) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, 3, 0);

}

}

}

}
	}


}