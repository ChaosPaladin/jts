package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_agit02_doom_trooper_agit extends warrior_passive_casting_splash {
	protected int Unit = 0;

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(5, 5);
	}

	protected void CREATED() {
myself.sm.flag = Unit;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.DistFromMe(attacker) < 200 && gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 1000000);

}

}

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * 100);

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.sm.flag == victim.flag) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.DistFromMe(attacker) < 200 && gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 1000000);

}

}

}

}
if (myself.sm.flag == victim.flag) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * 100);

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target) {
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
myself.AddAttackDesire(speller, 0, myself.Skill_GetEffectPoint(skill_name_id) / myself.sm.max_hp / 0.050000 * 150);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
myself.AddAttackDesire(creature, 0, 200);
	}


}