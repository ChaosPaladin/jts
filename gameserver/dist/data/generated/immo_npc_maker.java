package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class immo_npc_maker extends fieldcycle_maker {
	protected int seq = 0;
	protected int FieldCycle = 3;
	protected int Threshold_Min = 0;
	protected int Threshold_Max = 5;
	protected int Point_Min = 0;
	protected int Point_Max = 5000000;
	protected String type = "";
	protected int zone = 0;
	protected int TM_check_point = 78001;
	protected int TIME_check_point = 60;
	protected int TID_SEED_SPAWN_CHECK = 78002;
	protected int TID_NPC_SPAWN_CHECK = 78003;
	protected int babble_mode = 0;

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam def0) {
if (FieldCycle != -1) {
myself.RegisterFieldCycleEventEx(FieldCycle);
myself.AddTimerEx(TM_check_point, TIME_check_point * 1000);
myself.AddTimerEx(TID_NPC_SPAWN_CHECK, 1 * 1000);

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam def0) {
if (FieldCycle != -1) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = gg.GetPoint_FieldCycle(FieldCycle);
if (timer_id == TID_NPC_SPAWN_CHECK) {
if (i0 >= Threshold_Min && i0 <= Threshold_Max && i1 >= Point_Min && i1 <= Point_Max) {
if (gg.IsSameString(type, "seed_energy") == 1) {
for (i0 = myself.npc_count; i0 < myself.maximum_npc; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(gg.Rand(myself.def_count));
if (gg.IsNull(def0) == 0) {
if (myself.maximum_npc > myself.npc_count) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

}

}

} else {
gg.SendMakerScriptEvent(myself, 1001, 0, 0);

}

} else if (myself.npc_count > 0) {
gg.SendMakerScriptEvent(myself, 1000, 0, 0);

}

} else if (timer_id == TM_check_point) {
if (i0 <= 0 || i0 > 5 || i1 >= 5000000) {
if (babble_mode == 1) {
gg.Announce("***단계가 한계에 도달 했으므로 1로 초기화!***");

}
gg.SetStepWithoutActor_FieldCycle(FieldCycle, 1, 1);

}
myself.AddTimerEx(TM_check_point, TIME_check_point * 1000);

}

}
	}

	protected void ON_FIELD_CYCLE_CHANGED_EVENT(HandlerParam event_id, HandlerParam state, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam def0) {
if (event_id == FieldCycle && event_id != -1) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = gg.GetPoint_FieldCycle(FieldCycle);
if (i0 <= 0 || i0 > 5 || i1 >= 5000000) {
if (babble_mode == 1) {
gg.Announce("***단계가 한계에 도달 했으므로 1로 초기화!***");

}
gg.SetStepWithoutActor_FieldCycle(FieldCycle, 1, 1);

} else {
myself.AddTimerEx(TID_NPC_SPAWN_CHECK, 1 * 1000);

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (deleted_def.respawn_time != 0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = gg.GetPoint_FieldCycle(FieldCycle);
if (i0 >= Threshold_Min && i0 <= Threshold_Max && i1 >= Point_Min && i1 <= Point_Max) {
if (gg.IsSameString(type, "seed_energy") == 0) {
if (myself.maximum_npc > myself.npc_count) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}

} else {
gg.AddPointWithoutActor_FieldCycle(3, 100, 5);
if (myself.maximum_npc > myself.npc_count) {
def0 = myself.GetSpawnDefine(gg.Rand(myself.def_count));
if (gg.IsNull(def0) == 0 && myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}

}

}

}
	}


}