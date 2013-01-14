package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class doorman_of_drain_basic extends wizard {
	protected int pass1 = 8064;
	protected int pass2 = 8065;
	protected int pass3 = 8067;
	protected int MagicHeal = 0;
	protected int DDMagic = 262209537;
	protected int SkillRange = 500;

	protected void NO_DESIRE() {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);
	}

	protected void CREATED() {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam i1, HandlerParam f0) {
super;
h0 = myself.GetMaxHateInfo(0);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, DDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(myself.top_desire_target, DDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(myself.top_desire_target)) {
myself.AddAttackDesire(myself.top_desire_target, 0, 1000);

}

}

} else if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(attacker)) {
myself.AddAttackDesire(attacker, 0, 1000);

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6, HandlerParam h0, HandlerParam i0, HandlerParam i1, HandlerParam f0) {
super;
if (myself.GetLifeTime() > 7) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 30 + 300), 0, 1, 1);

} else {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 30), 0, 1, 1);

}

}

}
h0 = myself.GetMaxHateInfo(0);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, DDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(myself.top_desire_target, DDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(myself.top_desire_target)) {
myself.AddAttackDesire(myself.top_desire_target, 0, 1000);

}

}

} else if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(attacker)) {
myself.AddAttackDesire(attacker, 0, 1000);

}

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success, HandlerParam h0, HandlerParam i0) {
if (target.alive == 0 && target.is_pc == 0) {
if (myself.IsInCategory(12, target.npc_class_id) != 0) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(target.master, DDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(target.master, DDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(target.master)) {
myself.AddAttackDesire(target.master, 0, 1000);

}

}
if (target.master.is_pc != 0 || myself.IsInCategory(12, target.master.npc_class_id)) {
myself.AddHateInfo(target.master, 1 * 200, 0, 1, 1);

}

}

} else if (myself.DistFromMe(target) < SkillRange) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.i_ai0 != 1) {
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(target, DDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(target, DDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(target)) {
myself.AddAttackDesire(target, 0, 1000);

}

}

}

}

}

} else {
myself.RemoveAllDesire();

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i6, HandlerParam i0) {
if (creature.is_pc == 1) {
if (gg.OwnItemCount(creature, pass1) >= 1 || gg.OwnItemCount(creature, pass2) >= 1 || gg.OwnItemCount(creature, pass3) >= 1) {
if (MagicHeal != 0) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(creature, MagicHeal, 1, 0, 1000000);

}

}
myself.RemoveAttackDesire(creature.id);
myself.RemoveHateInfoByCreature(creature);

} else {
if (myself.GetLifeTime() > 7 && myself.InMyTerritory(myself.sm)) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(creature, DDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(creature, DDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(creature)) {
myself.AddAttackDesire(creature, 0, 1000);

}

}

}
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
i0 = 0;
if (SeeCreatureAttackerTime == -1) {
if (SetAggressiveTime == -1) {
if (myself.GetLifeTime() >= gg.Rand(5) + 3 && myself.InMyTerritory(myself.sm)) {
i0 = 1;

}

} else if (SetAggressiveTime == 0) {
if (myself.InMyTerritory(myself.sm)) {
i0 = 1;

}

} else if (myself.GetLifeTime() > SetAggressiveTime + gg.Rand(4) && myself.InMyTerritory(myself.sm)) {
i0 = 1;

}

} else if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
i0 = 1;

}
if (myself.GetHateInfoCount() == 0 && i0 == 1) {
myself.AddHateInfo(creature, 300, 0, 1, 1);

} else {
myself.AddHateInfo(creature, 100, 0, 1, 1);

}

}

}
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (x == myself.start_x && y == myself.start_y && z == myself.start_z) {
myself.AddDoNothingDesire(40, 30);

} else {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);

}
	}

	protected void ATTACK_FINISHED(HandlerParam target, HandlerParam h0, HandlerParam i0, HandlerParam s0) {
if (target.alive == 0 && target.is_pc == 0) {
if (myself.IsInCategory(12, target.npc_class_id) != 0) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(target.master, DDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(target.master, DDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(target.master)) {
myself.AddAttackDesire(target.master, 0, 1000);

}

}
if (target.master.is_pc != 0 || myself.IsInCategory(12, target.master.npc_class_id)) {
myself.AddHateInfo(target.master, 1 * 200, 0, 1, 1);

}

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0) {
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
i0 = myself.Skill_GetEffectPoint(skill_name_id);
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, speller.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (speller.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == speller.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * 1 / myself.sm.level + 7 + f0 / 100 * 1.000000 * 1 / myself.sm.level + 7;
myself.AddAttackDesire(speller, 0, f0 * 150);

}
	}


}