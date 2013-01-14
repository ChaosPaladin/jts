package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class immo_tumor_maker extends immo_basic_maker {
	protected int TM_sboss_spawn_delay = 78079;
	protected int TIME_sboss_spawn_delay = 180;
	protected int FieldCycle = 3;
	protected int FieldCycle_Quantity1 = 1500;
	protected int FieldCycle_Quantity2 = -1000;
	protected int FieldCycle_Quantity3 = 100;

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam reply, HandlerParam i0, HandlerParam def0) {
myself.enabled = reply;
if (reply == 1) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
if (zone == 3 && tide == 0 && room == 304) {
def0 = myself.GetSpawnDefine(2);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 78010067) {
def0 = myself.GetSpawnDefine(tide);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
if (zone == 3 && script_event_arg2 != 0 && gg.Rand(100) <= 33) {
if (babble_mode == 1) {
gg.Announce("3분 후 중간 보스 스폰!");

}
if (room == 304) {
myself.i_ai0 = script_event_arg2;

} else {
myself.i_ai0 = script_event_arg2 + 1;

}
myself.AddTimerEx(TM_sboss_spawn_delay, TIME_sboss_spawn_delay * 1000);

}

} else if (script_event_arg1 == 78010063 || script_event_arg1 == 78010062) {
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, script_event_arg2, script_event_arg3);

}

} else if (script_event_arg1 == 78010056 && script_event_arg2 != 99) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, script_event_arg2, script_event_arg3);

}

} else if (script_event_arg1 == 1000 && zone == 3) {
if (babble_mode == 1) {
gg.Announce("중간보스 정리");

}
myself.enabled = 0;
def0 = myself.GetSpawnDefine(myself.i_ai0);
if (gg.IsNull(def0) == 0 && def0.npc_count > 0) {
def0.Despawn();

}

}
	}

	protected void ON_NPC_CREATED(HandlerParam created_def) {
if (created_def == myself.GetSpawnDefine(0) && myself.i_ai1 == 1 && myself.enabled == 1) {
if (gg.IsNull(created_def) == 0) {
if (babble_mode == 1) {
gg.Announce("리스폰 HP감소 신호 보냄!");

}
created_def.SendScriptEvent(989804, 99, 0);

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam died, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam def0, HandlerParam maker0, HandlerParam reply) {
if (deleted_def == myself.GetSpawnDefine(0) && myself.enabled == 1) {
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
myself.i_ai1 = 0;
if (inzone_type_param == 119) {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_dispatcher_maker);

} else if (inzone_type_param == 120) {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_dispatcher_maker);

} else if (inzone_type_param == 121) {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_dispatcher_maker);

} else if (inzone_type_param == 122) {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_dispatcher_maker);

}
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010053, 1, room);

}

} else if (deleted_def == myself.GetSpawnDefine(1) && myself.enabled == 1) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
myself.i_ai1 = 1;
if (inzone_type_param == 119) {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_dispatcher_maker);

} else if (inzone_type_param == 120) {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_dispatcher_maker);

} else if (inzone_type_param == 121) {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_dispatcher_maker);

} else if (inzone_type_param == 122) {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_dispatcher_maker);

}
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010053, 0, room);

}

} else if (deleted_def == myself.GetSpawnDefine(2) && room == 304 && myself.enabled == 1) {
myself.i_ai1 = 1;

} else if (died == 1 && myself.enabled == 1) {

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam def0) {
if (timer_id == TM_sboss_spawn_delay && myself.enabled == 1) {
if (babble_mode == 1) {
gg.Announce("중간 보스 스폰!");

}
def0 = myself.GetSpawnDefine(myself.i_ai0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}
	}


}