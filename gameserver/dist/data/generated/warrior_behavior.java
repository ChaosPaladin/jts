package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_behavior extends monster_behavior {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected double DefaultHate = 0.000000;
	protected int HateRace1 = -1;
	protected double HateRace1Boost = 0.000000;
	protected int HateRace2 = -1;
	protected double HateRace2Boost = 0.000000;
	protected int HateClass1 = -1;
	protected double HateClass1Boost = 0.000000;
	protected int HateClass2 = -1;
	protected double HateClass2Boost = 0.000000;
	protected int HateClass3 = -1;
	protected double HateClass3Boost = 0.000000;
	protected int HateClassGroup1 = -1;
	protected double HateClassGroup1Boost = 0.000000;
	protected int HateClassGroup2 = -1;
	protected double HateClassGroup2Boost = 0.000000;
	protected double ATTACKED_Weight_Point = 10.000000;
	protected double CLAN_ATTACKED_Weight_Point = 1.000000;
	protected double PARTY_ATTACKED_Weight_Point = 1.000000;
	protected double SEE_SPELL_Weight_Point = 10.000000;
	protected double HATE_SKILL_Weight_Point = 10.000000;

	protected void CREATED(HandlerParam c0) {
if (myself.sm.param1 == 1000) {
c0 = gg.GetCreatureFromID(myself.sm.param2);
if (myself.IsNullCreature(c0) == 0) {
if (MovingAttack == 1) {
myself.AddAttackDesire(c0, 1, 500);

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam f0, HandlerParam i0, HandlerParam i1) {
if (IsHealer == 1) {

} else if (MovingAttack == 1) {
if (Party_Type == 2 && gg.Rand(10000) < Party_OneShot && myself.IsNullCreature(myself.top_desire_target) == 0) {
if (attacker == myself.top_desire_target) {
myself.BroadcastScriptEventEx(15000001, gg.GetIndexFromCreature(myself.sm), gg.GetIndexFromCreature(myself.top_desire_target), 500);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * ATTACKED_Weight_Point);

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.GetPathfindFailCount() > 10 && attacker == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) >= 0 && myself.DistFromMe(myself.top_desire_target) > 40) {
if (myself.CanAttack(myself.top_desire_target) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * ATTACKED_Weight_Point);

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * ATTACKED_Weight_Point);

}

}

}

}

} else if (myself.CanAttack(attacker) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 0, f0 * ATTACKED_Weight_Point);

}

} else if (myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.top_desire_target) {
myself.RemoveAttackDesire(myself.top_desire_target.id);

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam f0, HandlerParam i0, HandlerParam i1) {
if (myself.GetLifeTime() < Aggressive_Time) {

} else if (Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (IsHealer == 1) {

} else if (MovingAttack == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * CLAN_ATTACKED_Weight_Point);

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.GetPathfindFailCount() > 10 && attacker == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) >= 0 && myself.DistFromMe(myself.top_desire_target) > 40) {
if (myself.CanAttack(myself.top_desire_target) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * CLAN_ATTACKED_Weight_Point);

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * CLAN_ATTACKED_Weight_Point);

}

}

}

}

} else if (myself.CanAttack(attacker) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 0, f0 * CLAN_ATTACKED_Weight_Point);

}

} else if (myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.top_desire_target) {
myself.RemoveAttackDesire(myself.top_desire_target.id);

}

}
super;
	}

	protected void ATTACK_FINISHED(HandlerParam target) {
if (target.alive == 0 && target.is_pc == 0) {
if (myself.IsInCategory(12, target.npc_class_id) != 0) {
if (MovingAttack == 1) {
myself.AddAttackDesire(target.master, 1, 500);
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.GetPathfindFailCount() > 10 && target == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(target.x), gg.FloatToInt(target.y), gg.FloatToInt(target.z));

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) >= 0 && myself.DistFromMe(myself.top_desire_target) > 40) {
if (myself.CanAttack(myself.top_desire_target) == 1) {
myself.AddAttackDesire(target.master, 1, 500);

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
myself.AddAttackDesire(target.master, 1, 500);

}

}

}

} else if (myself.CanAttack(target) == 1) {
myself.AddAttackDesire(target.master, 0, 500);

} else if (myself.IsNullCreature(myself.top_desire_target) == 0 && target == myself.top_desire_target) {
myself.RemoveAttackDesire(myself.top_desire_target.id);

}

}

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam skill_name_id, HandlerParam f0, HandlerParam i0, HandlerParam i1) {
if (Party_Type == 0) {

} else if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (IsHealer == 1) {

} else if (MovingAttack == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * PARTY_ATTACKED_Weight_Point);

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.GetPathfindFailCount() > 10 && attacker == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) >= 0 && myself.DistFromMe(myself.top_desire_target) > 40) {
if (myself.CanAttack(myself.top_desire_target) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * PARTY_ATTACKED_Weight_Point);

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * PARTY_ATTACKED_Weight_Point);

}

}

}

}

} else if (myself.CanAttack(myself.top_desire_target) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 0, f0 * PARTY_ATTACKED_Weight_Point);

}

} else if (myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.top_desire_target) {
myself.RemoveAttackDesire(myself.top_desire_target.id);

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam f0) {
if (IsAggressive == 0) {

} else if (MovingAttack == 1) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {

} else if (myself.InMyTerritory(myself.sm) == 0) {

} else if (myself.GetLifeTime() >= Aggressive_Time) {
myself.AddAttackDesire(creature, 1, 300);

}

} else if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {

} else if (myself.InMyTerritory(myself.sm) == 0) {

} else if (myself.GetLifeTime() > Aggressive_Time) {
myself.AddAttackDesire(creature, 0, 300);

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0, HandlerParam f1) {
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
if (myself.IsInCombatMode(myself.sm) != 0) {
f1 = myself.Skill_GetEffectPoint(skill_name_id);
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == speller.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == speller.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (speller.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (speller.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (speller.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, speller.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, speller.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = f1 * f0 + 1;

}
myself.AddAttackDesire(speller, 1, f0 * SEE_SPELL_Weight_Point);

}

}
if (myself.GetPathfindFailCount() > 10 && speller == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(speller.x), gg.FloatToInt(speller.y), gg.FloatToInt(speller.z));

}
super;
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire * HATE_SKILL_Weight_Point, 0);
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0, HandlerParam c1) {
if (script_event_arg1 == 15000001) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0 && c0 == myself.boss) {
c1 = gg.GetCreatureFromIndex(script_event_arg3);
if (myself.IsNullCreature(c1) == 0) {
myself.RemoveAllAttackDesire();
if (MovingAttack == 1) {
myself.MakeAttackEvent(c1, 100, 0);

} else {
myself.MakeAttackEvent(c1, 100, 0);

}

}

}

}
super;
	}


}