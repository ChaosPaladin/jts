package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class immo_sboss_maker extends immo_basic_maker {
	protected int FieldCycle = 3;
	protected int FieldCycle_Quantity = -2000;

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam reply, HandlerParam i0, HandlerParam def0) {
myself.enabled = reply;
	}

	protected void ON_NPC_CREATED(HandlerParam created_def, HandlerParam created_npc, HandlerParam maker0) {
if (created_def == myself.GetSpawnDefine(0) && zone == 2 && tide == 1) {
if (babble_mode == 1) {
gg.Announce("재생의 씨앗 생성");

}

} else if (created_def == myself.GetSpawnDefine(0) && zone == 2 && tide == 0) {
if (babble_mode == 1) {
gg.Announce("코헤메네스 수호물 생성");

}
myself.i_ai0 = 0;

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam died, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam def0, HandlerParam maker0, HandlerParam reply) {
if (deleted_def == myself.GetSpawnDefine(0) && died == 1 && zone == 2 && tide == 1) {
if (babble_mode == 1) {
gg.Announce("재생의 씨앗 사망");

}
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_dispatcher_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010054, 0, room);

}

} else if (deleted_def == myself.GetSpawnDefine(0) && died == 1 && zone == 2 && tide == 0) {
if (babble_mode == 1) {
gg.Announce("코헤메네스 수호물 파괴");

}
myself.i_ai0 = 1;
if (deleted_def.respawn_time != 0) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
if (script_event_arg1 == 78010067 && zone == 2 && myself.enabled == 1) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

} else if (script_event_arg1 == 78010068 && zone == 2 && myself.enabled == 1) {
if (babble_mode == 1) {
gg.Announce("코흐메네스/미다스나하트 스폰!");

}
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

} else if (script_event_arg1 == 78010070 && zone == 2 && myself.enabled == 1) {
if (babble_mode == 1) {
gg.Announce("코흐메네스/미다스나하트 디스폰!");

}
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(78010070, script_event_arg2, script_event_arg3);

}

} else if (script_event_arg1 == 78010061 && myself.i_ai0 == 0) {
c0 = gg.GetCreatureFromID(script_event_arg2);
if (gg.IsNull(c0) == 0) {
gg.SendScriptEvent(c0, 78010062, room);

}

} else if (script_event_arg1 == 1000 && zone == 2) {
if (babble_mode == 1) {
gg.Announce("중간보스 정리");

}
myself.enabled = 0;
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0 && def0.npc_count > 0) {
def0.Despawn();

}

}
	}


}