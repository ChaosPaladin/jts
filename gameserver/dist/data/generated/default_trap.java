package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class default_trap extends default_npc {
	protected int show_created = 0;
	protected int show_detected = 0;
	protected int show_activated = 0;
	protected int show_step_in = 0;
	protected int show_step_out = 0;
	protected int show_defused = 0;
	protected int IsDetected = 1;
	protected int IsDefused = 1;
	protected int timer = 0;

	protected void CREATED() {
myself.AddTimerEx(1002, 10 * 1000);
	}

	protected void TRAP_DETECTED(HandlerParam i0, HandlerParam i1) {
if (IsDetected == 1) {
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, show_detected);

}
	}

	protected void TRAP_ACTIVATED(HandlerParam i0) {
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, show_activated);
	}

	protected void TRAP_STEP_IN(HandlerParam i0, HandlerParam i1, HandlerParam c0) {
c0 = gg.GetCreatureFromID(i0);
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, show_step_in);
if (timer > 0) {
myself.AddTimerEx(1001, timer * 1000);

}
	}

	protected void TRAP_STEP_OUT(HandlerParam i0, HandlerParam i1, HandlerParam c0) {
c0 = gg.GetCreatureFromID(i0);
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, show_step_out);
	}

	protected void TRAP_DEFUSED(HandlerParam i0) {
if (IsDefused == 1) {
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, show_defused);

}
myself.DefuseWorldTrapByClassId(myself.sm.id, myself.sm.class_id);
if (timer > 0) {
myself.AddTimerEx(1001, timer * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
if (myself.m_WorldTrapState == 0) {
myself.ActivateWorldTrapByClassId(myself.sm.id, myself.sm.class_id);

}

} else if (timer_id == 1002) {
myself.ActivateWorldTrapByClassId(myself.sm.id, myself.sm.class_id);

}
	}


}