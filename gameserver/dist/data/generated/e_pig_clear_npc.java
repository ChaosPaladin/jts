package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class e_pig_clear_npc extends default_npc {
	protected void CREATED() {
if (myself.Skill_GetConsumeMP(330235905) < myself.sm.mp && myself.Skill_GetConsumeHP(330235905) < myself.sm.hp && myself.Skill_InReuseDelay(330235905) == 0) {
myself.AddUseSkillDesire(myself.sm, 330235905, 1, 1, 1000000);

}
myself.AddTimerEx(1001, 10000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 1001) {
myself.Despawn();

}
	}


}