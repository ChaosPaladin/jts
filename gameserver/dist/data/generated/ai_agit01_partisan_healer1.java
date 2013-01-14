package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_agit01_partisan_healer1 extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 500.000000;
	protected double UseSkill_BoostValue = 100000.000000;

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(10, 30);
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (victim.npc_class_id == 1035368 || victim.npc_class_id == 1035375 && victim.hp < victim.max_hp * 0.600000 && gg.Rand(100) < 20) {
if (myself.Skill_GetConsumeMP(265027585) < myself.sm.mp && myself.Skill_GetConsumeHP(265027585) < myself.sm.hp && myself.Skill_InReuseDelay(265027585) == 0) {
myself.AddUseSkillDesire(victim, 265027585, 1, 1, 1000000);

}

}
	}


}