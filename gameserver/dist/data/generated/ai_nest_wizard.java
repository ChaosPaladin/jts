package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_nest_wizard extends ai_nest_wizard_basic {
	protected int SelfRangeHeal = 458752001;
	protected int SelfRangeHealProb = 1000;

	protected void CLAN_ATTACKED(HandlerParam victim, HandlerParam attacker, HandlerParam damage) {
super;
if (gg.Rand(10000) < SelfRangeHealProb) {
if (myself.Skill_GetConsumeMP(SelfRangeHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeHeal) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeHeal) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeHeal, 1, 1, 1000000);

}

}
	}


}