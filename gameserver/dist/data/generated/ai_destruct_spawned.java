package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_spawned extends ai_destruct_wizard {
	protected int DeBuff1 = 458752001;
	protected int DeBuff1_Prob = 0;
	protected int DeBuff2 = 458752001;
	protected int DeBuff2_Prob = 0;

	protected void CREATED() {
if (myself.sm.param1 == 1000 && myself.sm.param2 > 0) {
if (myself.IsNullCreature(gg.GetCreatureFromIndex(myself.sm.param2)) == 0) {
myself.MakeAttackEvent(gg.GetCreatureFromIndex(myself.sm.param2), 1000, 0);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (DeBuff1 != 458752001) {
if (gg.Rand(10000) < DeBuff1_Prob) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, DeBuff1, 0, 0, 1000000);

}

}

}
if (DeBuff2 != 458752001) {
if (gg.Rand(10000) < DeBuff2_Prob) {
if (myself.Skill_GetConsumeMP(DeBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff2) == 0) {
myself.AddUseSkillDesire(myself.sm, DeBuff2, 0, 0, 1000000);

}

}

}
	}

	protected void MY_DYING(HandlerParam last_attacker) {
	}


}