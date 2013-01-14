package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class area_state_npc extends default_npc {
	protected int union_skill = 330432513;
	protected int skill_delay = 3;
	protected int despawn_time = 10;

	protected void CREATED() {
myself.AddTimerEx(1001, 1000);
myself.AddTimerEx(1002, despawn_time * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.RemoveAllDesire();
if (myself.Skill_GetConsumeMP(union_skill) < myself.sm.mp && myself.Skill_GetConsumeHP(union_skill) < myself.sm.hp && myself.Skill_InReuseDelay(union_skill) == 0) {
myself.AddUseSkillDesire(myself.sm, union_skill, 1, 1, 1000000);

}
myself.AddTimerEx(1001, skill_delay * 1000);

}
if (timer_id == 1002) {
myself.Despawn();

}
	}


}