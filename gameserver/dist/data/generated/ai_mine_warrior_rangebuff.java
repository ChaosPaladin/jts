package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_mine_warrior_rangebuff extends warrior_use_skill {
	protected int SelfRangeBuff = 458752001;
	protected int SelfRangeBuffProb = 3333;
	protected int TIMER_SKILL_RESET = 33112;

	protected void CREATED() {
super;
myself.i_ai5 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (myself.i_ai5 == 0) {
if (gg.Rand(10000) < SelfRangeBuffProb) {
if (myself.Skill_GetConsumeMP(SelfRangeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeBuff, 1, 1, 1000000);

}
myself.i_ai5 = 1;
myself.AddTimerEx(TIMER_SKILL_RESET, 60 * 1000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
super;
if (timer_id == TIMER_SKILL_RESET) {
myself.i_ai5 = 0;

}
	}


}