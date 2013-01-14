package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_casting_clanbuff_rangedd_curse extends wizard_casting_clanbuff_curse {
	protected int RangeDD = 458752001;

	protected void ATTACKED(HandlerParam attacker) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 3 && myself.top_desire_target != attacker) {
if (myself.Skill_GetConsumeMP(RangeDD) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeDD) < myself.sm.hp && myself.Skill_InReuseDelay(RangeDD) == 0) {
myself.AddUseSkillDesire(attacker, RangeDD, 0, 1, 1000000);

}

}

}
super;
	}


}