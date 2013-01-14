package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class a_seed_raid_boss_maker extends default_maker {
	protected int FieldCycle_ID = -1;
	protected int on_start_spawn = 0;
	protected int boss_respawn_time = 600;
	protected String maker_name = "";
	protected String maker_name1 = "";
	protected String maker_name2 = "";

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam def0) {
myself.RegisterFieldCycleEventEx(FieldCycle_ID);
i0 = gg.GetStep_FieldCycle(FieldCycle_ID);
if (i0 == 2) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}

}
	}

	protected void ON_FIELD_CYCLE_CHANGED_EVENT(HandlerParam event_id, HandlerParam state, HandlerParam i0, HandlerParam i1) {
if (event_id == FieldCycle_ID) {
i1 = gg.GetStep_FieldCycle(FieldCycle_ID);
if (i1 == 2) {
gg.SendMakerScriptEvent(myself, 1001, 0, 0);

} else if (i1 == 1) {
gg.SendMakerScriptEvent(myself, 1000, 0, 0);

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam def0) {
if (deleted_def.respawn_time != 0) {
i0 = gg.GetStep_FieldCycle(FieldCycle_ID);
if (i0 == 2) {
if (myself.i_ai0 == 0) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
switch (script_event_arg1) {
case 1000: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
break;

}
case 1001: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
i1 = def0.total - def0.npc_count;
if (i1 > 0) {
if (myself.AtomicIncreaseTotal(def0, i1, 1)) {
def0.Spawn2(i1, script_event_arg2, 0);

}

}

}

}
break;

}
case 20091019: {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;

}
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
i0 = gg.GetStep_FieldCycle(FieldCycle_ID);
if (i0 == 2) {
def0.Spawn2(def0.total, boss_respawn_time, 0);
if (myself.i_quest9) {
gg.Announce(" 디스폰 된 경우이므로 " + boss_respawn_time + "초 후 리스폰됩니다.");

}

}
break;

}

}
	}


}