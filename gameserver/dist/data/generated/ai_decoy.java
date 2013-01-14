package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_decoy extends default_npc {
	protected int decoy_skill = 458752001;

	protected void CREATED() {
if (myself.Skill_GetConsumeMP(decoy_skill) < myself.sm.mp && myself.Skill_GetConsumeHP(decoy_skill) < myself.sm.hp && myself.Skill_InReuseDelay(decoy_skill) == 0) {
myself.AddUseSkillDesire(myself.sm, decoy_skill, 1, 1, 1000000);

}
myself.AddTimerEx(2001, 30 * 1000);
myself.AddTimerEx(2002, 5 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
myself.Despawn();

} else if (timer_id == 2002) {
if (myself.Skill_GetConsumeMP(decoy_skill) < myself.sm.mp && myself.Skill_GetConsumeHP(decoy_skill) < myself.sm.hp && myself.Skill_InReuseDelay(decoy_skill) == 0) {
myself.AddUseSkillDesire(myself.sm, decoy_skill, 1, 1, 1000000);

}
myself.AddTimerEx(2002, 5 * 1000);

}
	}


}