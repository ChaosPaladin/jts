package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_mine_bug extends warrior_use_skill {
	protected int DeBuff = 458752001;
	protected int DeBuffProb = 5000;
	protected int TIMER_SKILL_RESET = 33112;

	protected void CREATED() {
super;
myself.i_ai5 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (myself.i_ai5 == 0) {
if (myself.DistFromMe(attacker) <= 200) {
if (gg.Rand(10000) < DeBuffProb) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

}
myself.i_ai5 = 1;
myself.AddTimerEx(TIMER_SKILL_RESET, 10 * 1000);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIMER_SKILL_RESET) {
myself.i_ai5 = 0;

}
	}


}