package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_behavior extends monster_behavior {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected int AttackRange = 2;
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
if (AttackRange == 2) {
myself.i_ai4 = 0;

}
if (myself.sm.param1 == 1000) {
c0 = gg.GetCreatureFromID(myself.sm.param2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddHateInfo(c0, 500, 0, 1, 1);

}

}
myself.AddTimerEx(5002, 10000);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0, HandlerParam i1, HandlerParam f0, HandlerParam h0, HandlerParam damage, HandlerParam skill_name_id) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
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
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * ATTACKED_Weight_Point + Attack_BoostValue), 0, 1, 1);

} else {
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
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * ATTACKED_Weight_Point), 0, 1, 1);

}

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
myself.i_ai4 = 1;
myself.AddTimerEx(5001, 10000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam h0, HandlerParam i0) {
if (timer_id == 5001) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
myself.AddTimerEx(5001, 10000);

} else {
myself.RemoveAllAttackDesire();
myself.i_ai4 = 0;
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.MakeAttackEvent(h0.creature, 100, 0);

}

}

}

}
if (timer_id == 5002) {
myself.AddTimerEx(5002, 10000);
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam f0, HandlerParam skill_name_id) {
if (myself.GetLifeTime() > Aggressive_Time) {
if (Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
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
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * CLAN_ATTACKED_Weight_Point + Attack_BoostValue), 0, 1, 1);

} else {
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
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * CLAN_ATTACKED_Weight_Point), 0, 1, 1);

}

}

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0, HandlerParam skill_name_id) {
if (myself.GetLifeTime() > Aggressive_Time) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
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
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * PARTY_ATTACKED_Weight_Point + Attack_BoostValue), 0, 1, 1);

} else {
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
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * PARTY_ATTACKED_Weight_Point), 0, 1, 1);

}

}

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam f0, HandlerParam i0, HandlerParam h0) {
if (IsAggressive == 0) {

} else if (myself.GetLifeTime() >= Aggressive_Time) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt * ATTACKED_Weight_Point + 300), 0, 1, 1);

} else {
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt * ATTACKED_Weight_Point), 0, 1, 1);

}

}

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0) {
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
if (myself.p_state == 3 && myself.top_desire_target == speller) {
i0 = myself.Skill_GetEffectPoint(skill_name_id);
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
f0 = i0 * f0 + 1;

}
myself.AddHateInfo(speller, gg.FloatToInt(f0 * ATTACKED_Weight_Point), 0, 1, 1);

} else {
i0 = myself.Skill_GetEffectPoint(skill_name_id);
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
f0 = i0 * f0 + 1;

}
myself.AddHateInfo(speller, gg.FloatToInt(f0 * SEE_SPELL_Weight_Point), 0, 1, 1);

}

}
super;
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire * HATE_SKILL_Weight_Point, 0);
super;
	}

	protected void MY_DYING() {
super;
	}


}