package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_gludio_hold extends default_npc {
	protected double DoNothing_DecayRatio = 1.000000;
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;

	protected void NO_DESIRE() {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.z > myself.sm.z + 100) {
myself.AddFleeDesire(attacker, 30);

} else if (myself.IsInCategory(12, attacker.npc_class_id) != 0 && myself.Castle_GetPledgeState(attacker.master) == 2) {

} else if (myself.Castle_GetPledgeState(attacker) != 2) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 100);

}

}
if (myself.sm.in_peacezone != 0) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllAttackDesire();

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (victim.z > myself.sm.z + 100) {

} else if (myself.IsInCategory(12, attacker.npc_class_id) != 0 && myself.Castle_GetPledgeState(attacker.master) == 2) {

} else if (myself.Castle_GetPledgeState(attacker) != 2) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 50);

}

}
	}

	protected void STATIC_OBJECT_CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.npc_class_id == 1014737) {
if (gg.Rand(100) < 10) {
myself.AddAttackDesire(attacker.master, 1, 5000.000000);

} else {
myself.AddAttackDesire(attacker, 1, 1000.000000);

}

} else if (myself.Castle_GetPledgeState(attacker) != 2) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 50);

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target) {
if (speller.z > myself.sm.z + 100) {

} else if (myself.IsInCategory(12, speller.npc_class_id) != 0 && myself.Castle_GetPledgeState(speller.master) == 2) {

} else if (myself.Castle_GetPledgeState(speller) != 2) {
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
if (myself.p_state == 3 && myself.top_desire_target == target) {
myself.AddAttackDesire(speller, 1, myself.Skill_GetEffectPoint(skill_name_id) / myself.sm.max_hp / 0.050000 * 150);

}

}
if (myself.GetPathfindFailCount() > 10 && speller == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(speller.x), gg.FloatToInt(speller.y), gg.FloatToInt(speller.z));

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.z > myself.sm.z + 100 || creature.is_pc == 0) {

} else if (myself.IsInCategory(12, creature.npc_class_id) != 0 && myself.Castle_GetPledgeState(creature.master) == 2) {

} else if (myself.Castle_GetPledgeState(creature) != 2) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > 7) {
myself.AddAttackDesire(creature, 1, 200);

}

}
if (myself.sm.in_peacezone != 0) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllAttackDesire();

}
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (x == myself.start_x && y == myself.start_y && z == myself.start_z) {
myself.AddDoNothingDesire(40, 30);

} else {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);

}
	}


}