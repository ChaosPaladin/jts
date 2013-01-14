package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_warrior_dd_self_ret extends ai_destruct_warrior_ret {
	protected int SelfRangeDD_ID = 458752001;
	protected int SelfRangeDD_Prob = 0;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (SelfRangeDD_ID != 458752001) {
if (gg.Rand(10000) < SelfRangeDD_Prob) {
if (myself.Skill_GetConsumeMP(SelfRangeDD_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDD_ID) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDD_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDD_ID, 0, 1, 1000000);

}

}

}
	}


}