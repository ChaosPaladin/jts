package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trap_2skill_control_door extends default_trap {
	protected int IsDetected = 1;
	protected int IsDefused = 1;
	protected int trap_skill = 355401738;
	protected int trap_skill1 = 355401737;
	protected int trap_skill2 = 355467273;
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
myself.i_ai0 = 0;
myself.i_ai1 = 0;
	}

	protected void TRAP_DETECTED(HandlerParam i0, HandlerParam i1) {
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, 1);
	}

	protected void TRAP_ACTIVATED(HandlerParam i0) {
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, 0);
	}

	protected void TRAP_STEP_IN(HandlerParam i0, HandlerParam i1, HandlerParam c0) {
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
if (c0.is_pc == 1 && myself.i_ai0 != 0 && myself.i_ai1 == 0) {
if (myself.i_ai0 == 1) {
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, 1);
myself.AddUseSkillDesire(myself.sm, trap_skill1, 1, 1, 1000000);
myself.i_ai0 = 0;

}
if (myself.i_ai0 == 2) {
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, 1);
myself.AddUseSkillDesire(myself.sm, trap_skill2, 1, 1, 1000000);
myself.i_ai0 = 0;

}

}
if (myself.i_ai1 == 1 && myself.IsInCategory(1, c0.occupation) || myself.IsInCategory(3, c0.occupation) || myself.IsInCategory(70, c0.occupation)) {
if (myself.i_ai0 == 1) {
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, 1);
myself.AddUseSkillDesire(myself.sm, trap_skill1, 1, 1, 1000000);
myself.i_ai0 = 0;

} else if (myself.i_ai0 == 2) {
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, 1);
myself.AddUseSkillDesire(myself.sm, trap_skill2, 1, 1, 1000000);
myself.i_ai0 = 0;

}
myself.i_ai1 = 0;

}

}
	}

	protected void TRAP_DEFUSED(HandlerParam i0) {
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, 0);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 12521) {
if (gg.Rand(100) < 50) {
myself.i_ai1 = 0;
myself.i_ai0 = 2;
myself.ActivateWorldTrapByClassId(myself.sm.id, myself.sm.class_id);

}

} else if (script_event_arg1 == 12520) {
if (gg.Rand(100) < 50) {
myself.i_ai1 = 0;
myself.i_ai0 = 1;
myself.ActivateWorldTrapByClassId(myself.sm.id, myself.sm.class_id);

}

} else if (script_event_arg1 == 12522) {
myself.DefuseWorldTrapByClassId(myself.sm.id, myself.sm.class_id);

} else if (script_event_arg1 == 12523) {
myself.i_ai1 = 1;
myself.ActivateWorldTrapByClassId(myself.sm.id, myself.sm.class_id);
if (gg.Rand(100) < 50) {
myself.i_ai0 = 2;

} else {
myself.i_ai0 = 1;

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == trap_skill1) {
myself.DefuseWorldTrapByClassId(myself.sm.id, myself.sm.class_id);

}
if (skill_name_id == trap_skill2) {
myself.DefuseWorldTrapByClassId(myself.sm.id, myself.sm.class_id);

}
super;
	}


}