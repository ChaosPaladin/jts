package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_castle_pailaka_invader_warrior extends ai_castle_pailaka_invader_basic {
	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
super;
if (myself.IsNullCreature(myself.top_desire_target) == 1) {
myself.AddAttackDesire(attacker, 1, damage * 10.000000);

} else {
myself.AddAttackDesire(attacker, 1, damage);
if (myself.top_desire_target == attacker) {
if (DDSkill_01 != 458752001) {
if (gg.Rand(100) < DDSkill_01_Prob) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.Skill_GetConsumeMP(DDSkill_01) < myself.sm.mp && myself.Skill_GetConsumeHP(DDSkill_01) < myself.sm.hp && myself.Skill_InReuseDelay(DDSkill_01) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, DDSkill_01, 0, 1, 1000000);

}

}

}

}
if (myself.sm.hp < myself.sm.max_hp * 0.300000 && gg.Rand(100) < DDSkill_02_Prob && DDSkill_02 != 458752001) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.Skill_GetConsumeMP(DDSkill_02) < myself.sm.mp && myself.Skill_GetConsumeHP(DDSkill_02) < myself.sm.hp && myself.Skill_InReuseDelay(DDSkill_02) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, DDSkill_02, 0, 1, 1000000);

}

}

}

}

}
	}


}