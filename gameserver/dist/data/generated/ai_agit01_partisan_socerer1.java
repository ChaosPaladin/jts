package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_agit01_partisan_socerer1 extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 500.000000;
	protected double UseSkill_BoostValue = 100000.000000;

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(40, 20);
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(264962049) < myself.sm.mp && myself.Skill_GetConsumeHP(264962049) < myself.sm.hp && myself.Skill_InReuseDelay(264962049) == 0) {
myself.AddUseSkillDesire(attacker, 264962049, 0, 0, 1000000);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.Skill_GetConsumeMP(264962049) < myself.sm.mp && myself.Skill_GetConsumeHP(264962049) < myself.sm.hp && myself.Skill_InReuseDelay(264962049) == 0) {
myself.AddUseSkillDesire(creature, 264962049, 0, 0, 1000000);

}
	}


}