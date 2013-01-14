package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss03_riba_iren extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 500.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(5, 5);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(different_level_9_attacked)) == -1) {
if (different_level_9_attacked == 295895041) {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);
myself.RemoveAttackDesire(attacker.id);
return;

} else {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);

}

}

}
if (myself.sm.max_hp / 2 > myself.sm.hp) {
if (myself.Skill_GetConsumeMP(295960577) < myself.sm.mp && myself.Skill_GetConsumeHP(295960577) < myself.sm.hp && myself.Skill_InReuseDelay(295960577) == 0) {
myself.AddUseSkillDesire(myself.sm, 295960577, 1, 1, 1000000);

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (speller.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(different_level_9_see_spelled)) == -1) {
if (different_level_9_see_spelled == 295895041) {
myself.CastBuffForQuestReward(speller, different_level_9_see_spelled);
myself.RemoveAttackDesire(speller.id);
return;

} else {
myself.CastBuffForQuestReward(speller, different_level_9_see_spelled);

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (attacker.level <= myself.sm.level + 8) {
if (victim.npc_class_id == 1029014) {
if (victim.max_hp / 2 > victim.hp && gg.Rand(100) < 90) {
if (myself.Skill_GetConsumeMP(295960577) < myself.sm.mp && myself.Skill_GetConsumeHP(295960577) < myself.sm.hp && myself.Skill_InReuseDelay(295960577) == 0) {
myself.AddUseSkillDesire(victim, 295960577, 1, 1, 1000000);

}

}

} else if (victim.npc_class_id == 1029018) {

} else if (victim.max_hp / 2 > victim.hp && gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(295960577) < myself.sm.mp && myself.Skill_GetConsumeHP(295960577) < myself.sm.hp && myself.Skill_InReuseDelay(295960577) == 0) {
myself.AddUseSkillDesire(victim, 295960577, 1, 1, 1000000);

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(different_level_9_attacked)) == -1) {
if (different_level_9_attacked == 295895041) {
myself.CastBuffForQuestReward(creature, different_level_9_attacked);
myself.RemoveAttackDesire(creature.id);
return;

} else {
myself.CastBuffForQuestReward(creature, different_level_9_attacked);

}

}

} else {
super;

}
	}


}