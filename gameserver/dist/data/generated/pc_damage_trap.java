package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pc_damage_trap extends default_npc {
	protected int trap_skill = 458752001;
	protected int trap_skill_type = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.AddTimerEx(2001, 60 * 1000);
	}

	protected void TRAP_DETECTED(HandlerParam i0, HandlerParam i1) {
myself.SetVisible(1);
	}

	protected void TRAP_STEP_IN(HandlerParam i0, HandlerParam i1, HandlerParam c0) {
c0 = gg.GetCreatureFromID(i0);
myself.c_ai0 = c0;
myself.SetVisible(1);
myself.AddTimerEx(2002, 500);
	}

	protected void TRAP_DEFUSED(HandlerParam i0) {
myself.Suicide();
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
myself.Suicide();

} else if (timer_id == 2002) {
if (trap_skill_type == 0) {
myself.AddUseSkillDesire(myself.sm, trap_skill, 1, 0, 1000000);

} else if (trap_skill_type == 1) {
myself.AddUseSkillDesire(myself.c_ai0, trap_skill, 1, 0, 1000000);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam success, HandlerParam skill_name_id) {
if (skill_name_id == trap_skill) {
myself.Suicide();

}
	}


}