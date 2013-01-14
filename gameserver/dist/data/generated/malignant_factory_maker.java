package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class malignant_factory_maker extends default_maker {
	protected int respawn_default = 60;
	protected int respawn_fastest = 20;
	protected int respawn_slowest = 300;
	protected int respawn_reset_timer = 10;
	protected int FieldCycle = 1;
	protected int Threshold_Min = -1;
	protected int Threshold_Max = 100;
	protected int Point_Min = -1;
	protected int Point_Max = 2147483647;

	protected void ON_START() {
myself.i_ai0 = respawn_default;
myself.i_ai1 = 0;
myself.AddTimerEx(78001, myself.i_ai0 * 1000);
myself.RegisterFieldCycleEventEx(FieldCycle);
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (timer_id == 78001) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = gg.GetPoint_FieldCycle(FieldCycle);
if (i0 >= Threshold_Min && i0 <= Threshold_Max && i1 >= Point_Min && i1 <= Point_Max) {
def0 = myself.GetSpawnDefine(gg.Rand(3));
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);
myself.i_ai0 = myself.i_ai0 + 10;

}

}

}
myself.AddTimerEx(78001, myself.i_ai0 * 1000);

} else if (timer_id == 78002) {
myself.i_ai0 = respawn_default;
myself.i_ai1 = 0;

} else if (timer_id == 78003) {
def0 = myself.GetSpawnDefine(4);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0) {
if (script_event_arg1 == 78010033) {
def0 = myself.GetSpawnDefine(3);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

} else if (script_event_arg1 == 78010032) {
myself.AddTimerEx(78003, myself.i_ai0 * 2 * 1000);

} else if (script_event_arg1 == 78010014) {
if (myself.i_ai0 < respawn_slowest) {
myself.i_ai0 = myself.i_ai0 + 10;

} else if (myself.i_ai0 >= respawn_slowest && myself.i_ai1 == 0) {
myself.i_ai1 = 1;
myself.AddTimerEx(78002, respawn_reset_timer * 60 * 1000);

}

} else if (script_event_arg1 == 78010015) {
if (myself.i_ai0 > respawn_fastest) {
myself.i_ai0 = myself.i_ai0 - 5;

} else if (myself.i_ai0 <= respawn_fastest && myself.i_ai1 == 0) {
myself.i_ai1 = 1;
myself.AddTimerEx(78002, respawn_reset_timer * 60 * 1000);

}

}
	}

	protected void ON_FIELD_CYCLE_CHANGED_EVENT(HandlerParam event_id, HandlerParam state, HandlerParam i0, HandlerParam i1, HandlerParam def0) {
if (event_id == FieldCycle) {
i1 = gg.GetPoint_FieldCycle(FieldCycle);
if (state >= Threshold_Min && state <= Threshold_Max && i1 >= Point_Min && i1 <= Point_Max) {
myself.i_ai0 = respawn_default;

} else {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}

}

}
	}

	protected void ON_NPC_DELETED() {
	}

	protected void ON_ALL_NPC_DELETED() {
	}


}