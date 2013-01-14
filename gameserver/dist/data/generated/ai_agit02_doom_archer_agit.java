package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_agit02_doom_archer_agit extends warrior_passive_casting_enchant_clan {
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
if (myself.i_ai1 == 0 && gg.Rand(100) < 33 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 50) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 1000000);

}

}
myself.i_ai1 = 1;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * 100);

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3 & myself.i_ai1 == 0 && myself.sm.flag == victim.flag) {
if (gg.Rand(100) < 50 && gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Buff)) <= 0 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 50) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(victim, Buff, 1, 1, 1000000);

}

}

}
myself.i_ai1 = 1;
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

	protected void STATIC_OBJECT_CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.npc_class_id == 1014737) {
myself.AddAttackDesire(attacker.master, 0, 5000.000000);
myself.AddAttackDesire(attacker, 0, 1000.000000);

} else if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * 50);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
myself.AddAttackDesire(creature, 0, 200);
	}


}