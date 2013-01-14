package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_gludio_stand extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 500.000000;
	protected double UseSkill_BoostValue = 100000.000000;

	protected void CREATED() {
myself.attack_tick = 200;
	}

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(40, 20);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.z > myself.sm.z + 100) {

} else if (myself.IsInCategory(12, attacker.npc_class_id) != 0 && myself.Castle_GetPledgeState(attacker.master) == 2) {

} else if (myself.Castle_GetPledgeState(attacker) != 2) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * 100);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (victim.z > myself.sm.z + 100) {

} else if (myself.IsInCategory(12, attacker.npc_class_id) != 0 && myself.Castle_GetPledgeState(attacker.master) == 2) {

} else if (myself.Castle_GetPledgeState(attacker) != 2) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * 50);

}

}
	}

	protected void STATIC_OBJECT_CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.npc_class_id == 1014737) {
if (gg.Rand(100) < 10) {
myself.AddAttackDesire(attacker.master, 0, 5000.000000);

} else {
myself.AddAttackDesire(attacker, 0, 1000.000000);

}

} else if (myself.Castle_GetPledgeState(attacker) != 2) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * 50);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.IsInCategory(12, creature.npc_class_id) != 0 && myself.Castle_GetPledgeState(creature.master) == 2) {

} else if (myself.Castle_GetPledgeState(creature) != 2) {
myself.AddAttackDesire(creature, 0, 200);

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target) {
if (myself.IsInCategory(12, speller.npc_class_id) != 0 && myself.Castle_GetPledgeState(speller.master) == 2) {

} else if (myself.Castle_GetPledgeState(speller) != 2) {
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
myself.AddAttackDesire(speller, 0, myself.Skill_GetEffectPoint(skill_name_id) / myself.sm.max_hp / 0.050000 * 150);

}

}
	}


}