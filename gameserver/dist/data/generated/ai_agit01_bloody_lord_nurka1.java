package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_agit01_bloody_lord_nurka1 extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 500.000000;
	protected double UseSkill_BoostValue = 100000.000000;

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(40, 20);
	}

	protected void CREATED() {
myself.InstantTeleportInMyTerritory(51952, 111060, -1970, 200);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam c0) {
if (attacker.level > myself.sm.level + 8 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(357564417)) == -1) {
myself.AddUseSkillDesire(attacker, 357564417, 0, 1, 1000000);
myself.RemoveAttackDesire(attacker.id);

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(264896513) < myself.sm.mp && myself.Skill_GetConsumeHP(264896513) < myself.sm.hp && myself.Skill_InReuseDelay(264896513) == 0) {
myself.AddUseSkillDesire(attacker, 264896513, 0, 0, 1000000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * 10000);

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && gg.Rand(100) < 2) {
if (myself.Skill_GetConsumeMP(264896513) < myself.sm.mp && myself.Skill_GetConsumeHP(264896513) < myself.sm.hp && myself.Skill_InReuseDelay(264896513) == 0) {
myself.AddUseSkillDesire(attacker, 264896513, 0, 0, 1000000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * 5000);

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (myself.Skill_GetEffectPoint(skill_name_id) > 0 && gg.Rand(100) < 15) {
if (myself.Skill_GetConsumeMP(264896513) < myself.sm.mp && myself.Skill_GetConsumeHP(264896513) < myself.sm.hp && myself.Skill_InReuseDelay(264896513) == 0) {
myself.AddUseSkillDesire(speller, 264896513, 0, 0, 1000000);

}

}
	}


}