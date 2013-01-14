package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class barler_private_crystal_golem_d extends default_npc {
	protected int d_skill1 = 458752001;
	protected int d_skill2 = 458752001;
	protected int d_skill3 = 458752001;

	protected void CREATED() {
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam f0) {
if (script_event_arg1 == 13014) {
if (myself.Skill_GetConsumeMP(d_skill3) < myself.sm.mp && myself.Skill_GetConsumeHP(d_skill3) < myself.sm.hp && myself.Skill_InReuseDelay(d_skill3) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(myself.boss, d_skill3, 0, 1, 1000000);

}

} else if (script_event_arg1 == 13018) {
if (myself.Skill_GetConsumeMP(d_skill1) < myself.sm.mp && myself.Skill_GetConsumeHP(d_skill1) < myself.sm.hp && myself.Skill_InReuseDelay(d_skill1) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(myself.boss, d_skill1, 0, 1, 1000000);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == 354484225) {

} else if (skill_name_id == d_skill1) {
myself.Despawn();

}
	}


}