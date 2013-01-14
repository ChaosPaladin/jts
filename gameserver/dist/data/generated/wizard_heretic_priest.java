package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_heretic_priest extends wizard {
	protected int Hold = 0;
	protected int party_members = 0;
	protected int TelPosX1 = 0;
	protected int TelPosY1 = 0;
	protected int TelPosZ1 = 0;
	protected int TelPosX2 = 0;
	protected int TelPosY2 = 0;
	protected int TelPosZ2 = 0;
	protected int TelPosX3 = 0;
	protected int TelPosY3 = 0;
	protected int TelPosZ3 = 0;
	protected int W_ShortRangeDDMagic = 272629761;
	protected int W_LongRangeDDMagic = 272039937;
	protected int HoldMagic = 0;
	protected int DeBuff = 264568833;
	protected int HelpCastRange = 500;
	protected int DistNoDesire = 500;
	protected int NoPCTeleport = 0;
	protected int DeBuff = 0;

	protected void CREATED() {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);
	}

	protected void NO_DESIRE() {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam i1, HandlerParam f0) {
super;
if (myself.p_state != 3 && myself.p_state != 10) {
myself.BroadcastScriptEvent(10033, gg.GetIndexFromCreature(attacker), HelpCastRange);

}
h0 = myself.GetMaxHateInfo(0);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.i_ai0 == 0) {
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (h0.creature == attacker) {
i0 = 1;

}

}
if (Hold == 1) {
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(DeBuff)) <= 0) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 0, 1000000);

}

}
if (myself.DistFromMe(attacker) > 40 && gg.Rand(100) < 80) {
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(attacker)) {
myself.AddAttackDesire(attacker, 0, 1000);

}

}

} else if (gg.Rand(100) < 2) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(attacker)) {
myself.AddAttackDesire(attacker, 0, 1000);

}

}

}

} else if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(attacker)) {
myself.AddAttackDesire(attacker, 0, 1000);

}

}

} else if (gg.Rand(100) < 2) {
if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(attacker)) {
myself.AddAttackDesire(attacker, 0, 1000);

}

}

}

} else {
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(DeBuff)) <= 0) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 0, 1000000);

}

}
if (myself.DistFromMe(attacker) > 100 && gg.Rand(100) < 80) {
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (gg.Rand(100) < 2) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

} else if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (gg.Rand(100) < 2) {
if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}

} else if (Hold == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
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
myself.AddAttackDesire(attacker, 0, f0 * 100);

}

} else if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
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
myself.AddAttackDesire(attacker, 1, f0 * 100);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6, HandlerParam h0) {
myself.RemoveAllHateInfoIF(1, 0);
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.GetHateInfoCount() == 0) {
if (Hold == 1) {
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(DeBuff)) <= 0) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 0, 1000000);

}

}
if (myself.DistFromMe(attacker) > 40 && gg.Rand(100) < 80) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(attacker)) {
myself.AddAttackDesire(attacker, 0, 1000);

}

}

} else if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(attacker)) {
myself.AddAttackDesire(attacker, 0, 1000);

}

}

} else {
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(DeBuff)) <= 0) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 0, 1000000);

}

}
if (myself.DistFromMe(attacker) > 100 && gg.Rand(100) < 80) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam i0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.i_ai0 != 1) {
if (Hold == 1) {
if (myself.DistFromMe(h0.creature) > 40 && gg.Rand(100) < 80) {
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(h0.creature)) {
myself.AddAttackDesire(h0.creature, 0, 1000);

}

}

} else if (gg.Rand(100) < 2) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(h0.creature)) {
myself.AddAttackDesire(h0.creature, 0, 1000);

}

}

}

} else if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(h0.creature)) {
myself.AddAttackDesire(h0.creature, 0, 1000);

}

}

} else if (gg.Rand(100) < 2) {
if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(h0.creature)) {
myself.AddAttackDesire(h0.creature, 0, 1000);

}

}

}

} else if (myself.DistFromMe(h0.creature) > 100 && gg.Rand(100) < 80) {
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

} else if (gg.Rand(100) < 2) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

}

} else if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

} else if (gg.Rand(100) < 2) {
if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.sm.alive == 0) {
return;

}
i0 = gg.Rand(100);
if (i0 < 33 && creature.occupation == 5 || creature.occupation == 90 || myself.IsInCategory(3, creature.occupation)) {
myself.AddUseSkillDesire(creature, HoldMagic, 0, 0, 1000000);
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(creature, W_LongRangeDDMagic, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(creature, W_LongRangeDDMagic, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(creature)) {
myself.AddAttackDesire(creature, 0, 1000);

}

}

}
i0 = gg.Rand(100);
if (i0 < 33 && gg.Party_GetCount(creature) > party_members && creature.is_pc == 1 && NoPCTeleport == 0 && myself.InMyTerritory(creature)) {
c0 = myself.GetSummon(creature);
i1 = gg.Rand(3);
if (i1 == 0) {
myself.InstantTeleport(creature, TelPosX1, TelPosY1, TelPosZ1);
if (myself.IsNullCreature(c0) == 0) {
myself.InstantTeleport(c0, TelPosX1, TelPosY1, TelPosZ1);

}

} else if (i1 == 1) {
myself.InstantTeleport(creature, TelPosX2, TelPosY2, TelPosZ2);
if (myself.IsNullCreature(c0) == 0) {
myself.InstantTeleport(c0, TelPosX2, TelPosY2, TelPosZ2);

}

} else {
myself.InstantTeleport(creature, TelPosX3, TelPosY3, TelPosZ3);
if (myself.IsNullCreature(c0) == 0) {
myself.InstantTeleport(c0, TelPosX3, TelPosY3, TelPosZ3);

}

}

}
super;
	}

	protected void OUT_OF_TERRITORY() {
if (Hold == 0) {
myself.RemoveAllAttackDesire();
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 100);
myself.RemoveAllHateInfoIF(0, 0);
myself.BroadcastScriptEvent(10035, 0, DistNoDesire);

}
	}


}