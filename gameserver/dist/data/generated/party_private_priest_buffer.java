package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_priest_buffer extends party_private {
	protected int Buff1 = 458752001;
	protected int Buff2 = 458752001;
	protected int Buff3 = 458752001;
	protected int Buff4 = 458752001;
	protected int Buff5 = 458752001;
	protected int Buff6 = 458752001;

	protected void CREATED() {
myself.AddTimerEx(5001, 20000);
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc != 1 && myself.IsInCategory(12, creature.npc_class_id) == 0 && creature.boss_id == myself.sm.boss_id || creature == myself.boss) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Buff1)) <= 0 && myself.p_state != 3) {
if (myself.Skill_GetConsumeMP(Buff1) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff1) < myself.sm.hp && myself.Skill_InReuseDelay(Buff1) == 0) {
myself.AddUseSkillDesire(creature, Buff1, 1, 1, 1000000);

}

}
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Buff2)) <= 0 && myself.p_state != 3) {
if (myself.Skill_GetConsumeMP(Buff2) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff2) < myself.sm.hp && myself.Skill_InReuseDelay(Buff2) == 0) {
myself.AddUseSkillDesire(creature, Buff2, 1, 1, 1000000);

}

}
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Buff3)) <= 0 && myself.p_state != 3) {
if (myself.Skill_GetConsumeMP(Buff3) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff3) < myself.sm.hp && myself.Skill_InReuseDelay(Buff3) == 0) {
myself.AddUseSkillDesire(creature, Buff3, 1, 1, 1000000);

}

}
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Buff4)) <= 0 && myself.p_state != 3) {
if (myself.Skill_GetConsumeMP(Buff4) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff4) < myself.sm.hp && myself.Skill_InReuseDelay(Buff4) == 0) {
myself.AddUseSkillDesire(creature, Buff4, 1, 1, 1000000);

}

}
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Buff5)) <= 0 && myself.p_state != 3) {
if (myself.Skill_GetConsumeMP(Buff5) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff5) < myself.sm.hp && myself.Skill_InReuseDelay(Buff5) == 0) {
myself.AddUseSkillDesire(creature, Buff5, 1, 1, 1000000);

}

}
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Buff6)) <= 0 && myself.p_state != 3) {
if (myself.Skill_GetConsumeMP(Buff6) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff6) < myself.sm.hp && myself.Skill_InReuseDelay(Buff6) == 0) {
myself.AddUseSkillDesire(creature, Buff6, 1, 1, 1000000);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5001) {
myself.LookNeighbor(300);
myself.AddTimerEx(5001, 20000);

}
super;
	}


}