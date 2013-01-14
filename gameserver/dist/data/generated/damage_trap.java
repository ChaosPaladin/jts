package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class damage_trap extends default_trap {
	protected int show_created = 1;
	protected int show_detected = 0;
	protected int show_activated = 0;
	protected int show_step_in = 0;
	protected int show_step_out = 0;
	protected int show_defused = 1;
	protected int trap_skill = 458752001;
	protected int trap_skill_type = 0;

	protected void TRAP_STEP_IN(HandlerParam i0, HandlerParam i1, HandlerParam c0) {
c0 = gg.GetCreatureFromID(i0);
if (myself.m_WorldTrapState == 1) {
if (myself.DistFromMe(c0) < 300) {
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, 1);
if (trap_skill_type == 0) {
if (myself.Skill_GetConsumeMP(trap_skill) < myself.sm.mp && myself.Skill_GetConsumeHP(trap_skill) < myself.sm.hp && myself.Skill_InReuseDelay(trap_skill) == 0) {
myself.AddUseSkillDesire(myself.sm, trap_skill, 0, 1, 1000000);

}

} else if (myself.IsNullCreature(c0) == 0) {
if (myself.Skill_GetConsumeMP(trap_skill) < myself.sm.mp && myself.Skill_GetConsumeHP(trap_skill) < myself.sm.hp && myself.Skill_InReuseDelay(trap_skill) == 0) {
myself.AddUseSkillDesire(c0, trap_skill, 0, 0, 1000000);

}

}

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == trap_skill) {
myself.DefuseWorldTrapByClassId(myself.sm.id, myself.sm.class_id);

}
	}


}