package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_xel_trainer_wiz extends warrior_basic {
	protected int trainer_id = 0;
	protected int trainning_range = 1000;
	protected int direction = 0;

	protected void CREATED() {
myself.AddTimerEx(2219001, 1000);
	}

	protected void NO_DESIRE(HandlerParam i0) {
myself.i_ai0 = 0;
if (myself.i_ai5 == 1) {
return;

}
if (gg.FloatToInt(myself.sm.x) == myself.start_x && myself.start_y == gg.FloatToInt(myself.sm.y)) {
myself.ChangeDir(myself.sm, 0, direction);

} else {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.i_ai0 == 0) {
myself.c_ai0 = attacker;
myself.BroadcastScriptEvent(BroadcastScriptEvent + trainer_id, gg.GetIndexFromCreature(attacker), trainning_range);
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
myself.i_ai0 = 1;
myself.i_ai1 = 1;
myself.AddTimerEx(2219002, 60 * 1000);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2219002) {
myself.i_ai1 = 0;

}
	}

	protected void MY_DYING(HandlerParam last_attacker) {
if (myself.i_ai1 == 1) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.BroadcastScriptEvent(BroadcastScriptEvent + trainer_id, gg.GetIndexFromCreature(myself.c_ai0), trainning_range);

}

}
myself.i_ai5 = 1;
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 10016 + trainer_id) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (gg.Rand(10) < 1) {
if (gg.Rand(2) < 1) {
myself.Say(gg.MakeFString(1801112, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1801113, "", "", "", "", ""));

}

}
if (myself.i_ai0 == 0) {
myself.AddAttackDesire(c0, 1, 5000);

}

}

}
	}


}