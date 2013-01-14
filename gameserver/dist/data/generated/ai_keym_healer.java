package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_keym_healer extends warrior_basic {
	protected int WaterDeBuff = 378273793;
	protected int Heal = 266403843;
	protected int Sleep = 265158660;

	protected void CREATED() {
myself.AddTimerEx(1000, 1000);
	}

	protected void NO_DESIRE() {
if (myself.GetLifeTime() > 9) {
myself.AddMoveAroundDesire(5, 5);
myself.LookNeighbor(3000);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1) {
myself.c_ai0 = creature;
myself.AddTimerEx(2000, 1000);
myself.AddTimerEx(6000, 1000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam i0, HandlerParam i1) {
if (timer_id == 1000) {
myself.LookNeighbor(3000);
myself.AddTimerEx(1000, 5 * 1000);

}
if (timer_id == 2000) {
if (gg.Rand(100) < 30) {
myself.AddUseSkillDesire(myself.c_ai0, Sleep, 1, 1, 400000000000);
myself.AddTimerEx(3000, 3000);

}
myself.AddTimerEx(2000, 10 * 1000);

}
if (timer_id == 3000) {
myself.AddUseSkillDesire(myself.sm, Heal, 1, 1, 500000000000);

}
if (timer_id == 6000) {
if (myself.Skill_GetConsumeMP(WaterDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(WaterDeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(WaterDeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, WaterDeBuff, 0, 1, 1000000);

}
myself.AddTimerEx(6000, 60000);

}
	}


}