package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_maker extends default_maker {
	protected int fortress_id = 0;
	protected int event_id1 = -1;
	protected int event_id2 = -1;
	protected int event_id3 = -1;
	protected int event_id4 = -1;
	protected int is_spawn1 = 0;
	protected int is_spawn2 = 0;
	protected int is_spawn3 = 0;
	protected int is_spawn4 = 0;
	protected int facility_type = -1;
	protected int facility_level = -1;
	protected int is_npc_own = 0;
	protected int on_start_spawn = 0;
	protected int castle_contract = 0;
	protected int combat_maker = 1;
	protected String fortress_outdoor1 = "";
	protected String fortress_outdoor2 = "";

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.enabled = on_start_spawn;
if (event_id1 > -1) {
myself.RegisterFortressEventEx(fortress_id, event_id1, is_spawn1);

}
if (event_id2 > -1) {
myself.RegisterFortressEventEx(fortress_id, event_id2, is_spawn2);

}
if (event_id3 > -1) {
myself.RegisterFortressEventEx(fortress_id, event_id3, is_spawn3);

}
if (event_id4 > -1) {
myself.RegisterFortressEventEx(fortress_id, event_id4, is_spawn4);

}
super;
	}

	protected void ON_FORTRESS_EVENT(HandlerParam residence_id, HandlerParam event_id, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam s0, HandlerParam def0, HandlerParam maker0) {
gg.AddScriptLog(3, "[" + myself.name + "[fortress_event][res_id][" + gg.IntToStr(residence_id) + "] [event_id][" + gg.IntToStr(event_id) + "] [reply][" + gg.IntToStr(reply) + "]");
myself.enabled = reply;
if (event_id <= 2) {
myself.i_ai0 = gg.Fortress_GetOwnerPledgeId(fortress_id);

}
i0 = gg.Fortress_GetOwnerPledgeId(fortress_id);
if (i0 > 0) {
if (is_npc_own == 1 && i0 == myself.i_ai0) {
return;

}

} else if (is_npc_own == -1 && i0 == myself.i_ai0) {
return;

}
if (facility_level > -1 && facility_type > -1) {
i0 = gg.Fortress_GetFacilityLevel(fortress_id, facility_type);
if (i0 < facility_level) {
return;

}

}
if (castle_contract == -1 && reply == 1) {
if (gg.Fortress_GetContractStatus(fortress_id) != 0) {
return;

}

}
if (residence_id == fortress_id) {
if (reply == 1) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
i1 = def0.total - def0.npc_count;
if (i1 > 0) {
if (myself.AtomicIncreaseTotal(def0, i1, 1)) {
def0.Spawn2(i1, 0, 0);

}

}

}

}

} else if (reply == 0) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}

} else if (reply == 3) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (gg.IsSameString(s0, fortress_outdoor1) == 1) {
gg.Castle_GateOpenCloseEx(fortress_outdoor2, 0, myself.GetInZoneID());
def0.SendScriptEvent(event_id, reply, 1);

} else if (gg.IsSameString(s0, fortress_outdoor2) == 1) {
gg.Castle_GateOpenCloseEx(fortress_outdoor1, 0, myself.GetInZoneID());
def0.SendScriptEvent(event_id, reply, 1);

} else {
def0.SendScriptEvent(event_id, reply, 0);

}

}

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 1007) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}

}
	}

	protected void ON_NPC_CREATED(HandlerParam created_npc) {
gg.AddScriptLog(3, "[" + myself.name + "[npc_created][created_npc][" + created_npc.sm.name + "] [myself.enabled][" + gg.IntToStr(myself.enabled) + "]");
if (myself.enabled == 0) {
gg.AddScriptLog(3, "[" + myself.name + "[npc_created][despawn]" + "[created_npc][" + created_npc.sm.name + "] despawned" + "");
created_npc.Despawn();

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
gg.AddScriptLog(3, "[" + myself.name + "[npc_deleted][deleted_def][" + deleted_def.name + "]");
if (combat_maker == 1 && myself.enabled == 0) {
return;

}
if (deleted_def.respawn_time == 0) {
return;

}
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
gg.AddScriptLog(3, "[" + myself.name + "[npc_deleted][deleted_def][" + deleted_def.name + "] [respawn_time][" + gg.IntToStr(deleted_def.respawn_time) + "]");
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}
	}


}