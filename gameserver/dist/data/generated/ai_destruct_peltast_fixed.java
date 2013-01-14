package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_peltast_fixed extends ai_destruct_warrior_fixed {
	protected int Skill02_ID = 458752001;
	protected int Skill02_Prob = 0;

	protected void CREATED() {
super;
myself.AddTimerEx(8123, 1000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (Skill02_ID != 458752001) {
if (gg.Rand(10000) < Skill02_Prob) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 0, 1000000);

}

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
super;
if (timer_id == 8123) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.CanAttack(myself.top_desire_target) == 0) {
myself.RemoveAttackDesire(myself.top_desire_target.id);

}

}
myself.AddTimerEx(8123, 1000);

}
	}


}