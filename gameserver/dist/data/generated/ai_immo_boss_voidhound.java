package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_immo_boss_voidhound extends monster_behavior {
	protected int IsAggressive = 1;
	protected double Aggressive_Time = 1.000000;
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 1000000.000000;
	protected double DefaultHate = 100.000000;
	protected double Maximum_Hate = 999999984306749440.000000;
	protected int HateClassGroup1 = 5;
	protected double HateClassGroup1Boost = 20.000000;
	protected int HateClassGroup2 = 4;
	protected double HateClassGroup2Boost = 10.000000;
	protected int FavorClassGroup1 = 3;
	protected double FavorClassGroup1Boost = 10.000000;
	protected double SEE_CREATURE_Weight_Point = 1.000000;
	protected double ATTACKED_Weight_Point = 0.000000;
	protected double CLAN_ATTACKED_Weight_Point = 10.000000;
	protected double PARTY_ATTACKED_Weight_Point = 10.000000;
	protected double SEE_SPELL_Weight_Point = 20.000000;
	protected double HATE_SKILL_Weight_Point = 50.000000;
	protected double TUMOR_ATTACKED_Weight_Point = 0.000000;
	protected double VEIN_SIGNAL_Weight_Point = 0.000000;
	protected double TUMOR_HELP_Weight_Point = 0.000000;
	protected double LIFESEED_TAUNT_Weight_Point = 0.000000;
	protected int Skill01_ID = 388366337;
	protected int Skill02_ID = 388300801;
	protected int Skill03_ID = 388235265;
	protected int Skillchance_High = 15;
	protected int Skillchance_Low = 7;
	protected int Skillchance_Dim = 2;
	protected int tide = 0;
	protected String type = "voidhound_a";
	protected int Party_Type = 1;
	protected int TM_ATTACK_COOLDOWN = 78001;
	protected int TIME_ATTACK_COOLDOWN_MELEE = 5;
	protected int TIME_ATTACK_COOLDOWN_CASTER = 1;
	protected int babble_mode = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
if (gg.IsSameString(type, "dot") == 1 || gg.IsSameString(type, "cc") == 1 || gg.IsSameString(type, "con") == 1 || gg.IsSameString(type, "ambush_dc_kamikaze") == 1 || gg.IsSameString(type, "solo_boss_caster") == 1 || gg.IsSameString(type, "duo_boss_caster") == 1 || gg.IsSameString(type, "echmus") == 1) {
myself.AddTimerEx(TM_ATTACK_COOLDOWN, 1000);

} else {
myself.AddTimerEx(TM_ATTACK_COOLDOWN, 1000);

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam f0, HandlerParam h0, HandlerParam i0, HandlerParam c0, HandlerParam s0, HandlerParam party0, HandlerParam maker0) {
if (myself.GetLifeTime() < Aggressive_Time) {
return;

}
if (creature.is_pc == 1) {
myself.SetDieEvent(creature, 1, 2000);

}
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, creature.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, creature.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, creature.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = DefaultHate * f0 + 1;

}
myself.AddHateInfo(creature, gg.FloatToInt(f0 * SEE_CREATURE_Weight_Point + Attack_BoostValue), 0, 1, 1);

} else {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, creature.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, creature.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, creature.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = DefaultHate * f0 + 1;

}
myself.AddHateInfo(creature, gg.FloatToInt(f0 * SEE_CREATURE_Weight_Point), 0, 1, 1);

}

}
if (myself.IsInCategory(12, creature.npc_class_id)) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, creature.master.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, creature.master.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, creature.master.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = DefaultHate * f0 + 1;

}
myself.AddHateInfo(creature.master, gg.FloatToInt(f0 * SEE_CREATURE_Weight_Point), 0, 1, 1);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam f0, HandlerParam h0, HandlerParam i0, HandlerParam c0, HandlerParam s0, HandlerParam party0, HandlerParam maker0) {
if (myself.i_quest0 != 0) {
if (babble_mode == 1) {
myself.Say("공격 당했음");

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = DefaultHate;
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
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

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
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

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
if (myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.master.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.master.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.master.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddHateInfo(attacker.master, gg.FloatToInt(f0 * ATTACKED_Weight_Point), 0, 1, 1);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam f0, HandlerParam h0, HandlerParam c0, HandlerParam s0, HandlerParam party0, HandlerParam maker0) {
if (myself.i_quest0 == 0) {
if (myself.GetLifeTime() > Aggressive_Time && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (myself.IsNullCreature(myself.boss) == 1 && gg.IsSameString(type, "voidhound_d") == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = DefaultHate;
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
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

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
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

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
if (myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.master.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.master.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.master.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddHateInfo(attacker.master, gg.FloatToInt(f0 * CLAN_ATTACKED_Weight_Point), 0, 1, 1);

}

}

}

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam f0, HandlerParam h0, HandlerParam c0, HandlerParam s0, HandlerParam party0, HandlerParam maker0) {
if (myself.i_quest0 == 0) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (myself.IsNullCreature(myself.boss) == 0 && private == myself.boss && gg.IsSameString(type, "voidhound_a") == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = DefaultHate;
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
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

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
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

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
if (myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.master.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.master.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.master.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddHateInfo(attacker.master, gg.FloatToInt(f0 * PARTY_ATTACKED_Weight_Point), 0, 1, 1);

}

}

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private == myself.boss && gg.IsSameString(type, "voidhound_a") == 1) {
myself.Suicide();

}
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire * HATE_SKILL_Weight_Point, 0);
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0, HandlerParam s0, HandlerParam c0, HandlerParam h0, HandlerParam maker0, HandlerParam party0) {
if (myself.i_quest0 == 0) {
i0 = myself.Skill_GetEffectPoint(skill_name_id);
if (i0 > 0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
if (myself.p_state == 3 && h0.creature == speller) {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = DefaultHate;
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
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, speller.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = i0 * f0 + 1;

}
myself.AddHateInfo(speller, gg.FloatToInt(f0 * ATTACKED_Weight_Point + Attack_BoostValue), 0, 1, 1);

} else {
f0 = DefaultHate;
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
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, speller.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = i0 * f0 + 1;

}
myself.AddHateInfo(speller, gg.FloatToInt(f0 * ATTACKED_Weight_Point), 0, 1, 1);

}

}
if (myself.IsInCategory(12, speller.npc_class_id)) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, speller.master.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, speller.master.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, speller.master.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = i0 * f0 + 1;

}
myself.AddHateInfo(speller.master, gg.FloatToInt(f0 * ATTACKED_Weight_Point), 0, 1, 1);

}

} else {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = DefaultHate;
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
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, speller.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = i0 * f0 + 1;

}
myself.AddHateInfo(speller, gg.FloatToInt(f0 * SEE_SPELL_Weight_Point + Attack_BoostValue), 0, 1, 1);

} else {
f0 = DefaultHate;
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
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, speller.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

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
if (myself.IsInCategory(12, speller.npc_class_id)) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, speller.master.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, speller.master.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, speller.master.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = i0 * f0 + 1;

}
myself.AddHateInfo(speller.master, gg.FloatToInt(f0 * SEE_SPELL_Weight_Point), 0, 1, 1);

}

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam h0, HandlerParam i0) {
if (timer_id == TM_ATTACK_COOLDOWN) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
i0 = gg.Rand(100);
if (myself.DistFromMe(h0.creature) >= 300) {
if (i0 <= Skillchance_Dim) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill03_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill02_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (i0 <= Skillchance_High) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill01_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else {
myself.AddAttackDesire(h0.creature, 1, h0.hate);

}

}
if (myself.IsNullCreature(myself.boss) == 0 && myself.IsMyBossAlive() == 0 && gg.IsSameString(type, "voidhound_a") == 1) {
myself.Suicide();

}
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);
if (gg.IsSameString(type, "dot") == 1 || gg.IsSameString(type, "cc") == 1 || gg.IsSameString(type, "con") == 1 || gg.IsSameString(type, "ambush_dc_kamikaze") == 1 || gg.IsSameString(type, "solo_boss_caster") == 1 || gg.IsSameString(type, "duo_boss_caster") == 1 || gg.IsSameString(type, "echmus") == 1) {
if (myself.GetHateInfoCount() != 0 && myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0 || gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) <= 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill01_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, 100 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else {
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

}
myself.AddTimerEx(TM_ATTACK_COOLDOWN, TIME_ATTACK_COOLDOWN_CASTER + gg.Rand(TIME_ATTACK_COOLDOWN_CASTER) * 1000);

} else {
if (myself.GetHateInfoCount() != 0 && myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
myself.AddAttackDesire(h0.creature, 1, 100);

}

}
myself.AddTimerEx(TM_ATTACK_COOLDOWN, TIME_ATTACK_COOLDOWN_MELEE + gg.Rand(TIME_ATTACK_COOLDOWN_MELEE) * 1000);

}

}
	}

	protected void ATTACK_FINISHED(HandlerParam target) {
myself.RemoveHateInfoByCreature(target);
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);
if (myself.GetHateInfoCount() == 0) {
myself.int_list.Clear();
myself.i_ai2 = 0;
myself.LookNeighbor(300);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam success, HandlerParam skill_name_id) {
if (babble_mode == 1) {
myself.Say(target.name + "에 스킬" + gg.IntToStr(gg.FloatToInt(skill_name_id / 65536)) + "사용결과" + gg.IntToStr(success));

}
if (success == 1) {
if (target != myself.sm && skill_name_id != 387252225 || skill_name_id != 387317761 || skill_name_id != 387055617) {
if (skill_name_id == 385220609 || skill_name_id == 385286145 || skill_name_id == 385351681 || skill_name_id == 385351682 || skill_name_id == 385417217 || skill_name_id == 385417218 || skill_name_id == 385482753 || skill_name_id == 385482754 || skill_name_id == 385548289 || skill_name_id == 385941505 || skill_name_id == 385941506 || skill_name_id == 385941507 || skill_name_id == 386072577 || skill_name_id == 386138113 || skill_name_id == 386138114) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384696321)) <= 8) {
if (target.max_hp * 0.300000 >= target.hp) {
if (gg.Skill_IsMagic(384696323) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696323) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696323) < myself.sm.mp && myself.Skill_GetConsumeHP(384696323) < myself.sm.hp && myself.Skill_InReuseDelay(384696323) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696323, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.600000 >= target.hp) {
if (gg.Skill_IsMagic(384696322) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696322) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696322) < myself.sm.mp && myself.Skill_GetConsumeHP(384696322) < myself.sm.hp && myself.Skill_InReuseDelay(384696322) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696322, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(384696321) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696321) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696321) < myself.sm.mp && myself.Skill_GetConsumeHP(384696321) < myself.sm.hp && myself.Skill_InReuseDelay(384696321) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696321, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384696321)) <= 9) {
if (target.max_hp * 0.300000 >= target.hp) {
if (gg.Skill_IsMagic(384696327) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696327) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696327) < myself.sm.mp && myself.Skill_GetConsumeHP(384696327) < myself.sm.hp && myself.Skill_InReuseDelay(384696327) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696327, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.600000 >= target.hp) {
if (gg.Skill_IsMagic(384696326) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696326) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696326) < myself.sm.mp && myself.Skill_GetConsumeHP(384696326) < myself.sm.hp && myself.Skill_InReuseDelay(384696326) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696326, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.900000 >= target.hp) {
if (gg.Skill_IsMagic(384696325) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696325) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696325) < myself.sm.mp && myself.Skill_GetConsumeHP(384696325) < myself.sm.hp && myself.Skill_InReuseDelay(384696325) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696325, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(384696324) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696324) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696324) < myself.sm.mp && myself.Skill_GetConsumeHP(384696324) < myself.sm.hp && myself.Skill_InReuseDelay(384696324) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696324, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384696321)) <= 10) {
if (target.max_hp * 0.300000 >= target.hp) {
if (gg.Skill_IsMagic(384696330) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696330) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696330) < myself.sm.mp && myself.Skill_GetConsumeHP(384696330) < myself.sm.hp && myself.Skill_InReuseDelay(384696330) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696330, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.600000 >= target.hp) {
if (gg.Skill_IsMagic(384696329) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696329) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696329) < myself.sm.mp && myself.Skill_GetConsumeHP(384696329) < myself.sm.hp && myself.Skill_InReuseDelay(384696329) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696329, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(384696328) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696328) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696328) < myself.sm.mp && myself.Skill_GetConsumeHP(384696328) < myself.sm.hp && myself.Skill_InReuseDelay(384696328) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696328, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 385613825 || skill_name_id == 385613826 || skill_name_id == 385679361 || skill_name_id == 383713282 || skill_name_id == 385875969 || skill_name_id == 385875970 || skill_name_id == 388759553 || skill_name_id == 388825089) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384761859)) < 8) {
if (gg.Skill_IsMagic(384761859) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384761859) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384761859) < myself.sm.mp && myself.Skill_GetConsumeHP(384761859) < myself.sm.hp && myself.Skill_InReuseDelay(384761859) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384761859, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384761859)) < 9) {
if (gg.Skill_IsMagic(384761863) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384761863) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384761863) < myself.sm.mp && myself.Skill_GetConsumeHP(384761863) < myself.sm.hp && myself.Skill_InReuseDelay(384761863) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384761863, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384761859)) < 10) {
if (gg.Skill_IsMagic(384761866) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384761866) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384761866) < myself.sm.mp && myself.Skill_GetConsumeHP(384761866) < myself.sm.hp && myself.Skill_InReuseDelay(384761866) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384761866, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 385744897 || skill_name_id == 385810433 || skill_name_id == 386007041 || skill_name_id == 386007042 || skill_name_id == 386007043) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384827395)) < 8) {
if (gg.Skill_IsMagic(384827395) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384827395) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384827395) < myself.sm.mp && myself.Skill_GetConsumeHP(384827395) < myself.sm.hp && myself.Skill_InReuseDelay(384827395) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384827395, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384827395)) < 9) {
if (gg.Skill_IsMagic(384827399) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384827399) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384827399) < myself.sm.mp && myself.Skill_GetConsumeHP(384827399) < myself.sm.hp && myself.Skill_InReuseDelay(384827399) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384827399, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384827395)) < 10) {
if (gg.Skill_IsMagic(384827402) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384827402) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384827402) < myself.sm.mp && myself.Skill_GetConsumeHP(384827402) < myself.sm.hp && myself.Skill_InReuseDelay(384827402) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384827402, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 386269185 || skill_name_id == 386334721 || skill_name_id == 386400257 || skill_name_id == 386400258) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384434177)) <= 8) {
if (target.max_hp * 0.300000 >= target.hp) {
if (gg.Skill_IsMagic(384434179) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434179) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434179) < myself.sm.mp && myself.Skill_GetConsumeHP(384434179) < myself.sm.hp && myself.Skill_InReuseDelay(384434179) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434179, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.600000 >= target.hp) {
if (gg.Skill_IsMagic(384434178) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434178) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434178) < myself.sm.mp && myself.Skill_GetConsumeHP(384434178) < myself.sm.hp && myself.Skill_InReuseDelay(384434178) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434178, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(384434177) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434177) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434177) < myself.sm.mp && myself.Skill_GetConsumeHP(384434177) < myself.sm.hp && myself.Skill_InReuseDelay(384434177) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434177, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384434177)) <= 9) {
if (target.max_hp * 0.300000 >= target.hp) {
if (gg.Skill_IsMagic(384434183) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434183) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434183) < myself.sm.mp && myself.Skill_GetConsumeHP(384434183) < myself.sm.hp && myself.Skill_InReuseDelay(384434183) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434183, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.600000 >= target.hp) {
if (gg.Skill_IsMagic(384434182) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434182) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434182) < myself.sm.mp && myself.Skill_GetConsumeHP(384434182) < myself.sm.hp && myself.Skill_InReuseDelay(384434182) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434182, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.900000 >= target.hp) {
if (gg.Skill_IsMagic(384434181) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434181) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434181) < myself.sm.mp && myself.Skill_GetConsumeHP(384434181) < myself.sm.hp && myself.Skill_InReuseDelay(384434181) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434181, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(384434180) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434180) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434180) < myself.sm.mp && myself.Skill_GetConsumeHP(384434180) < myself.sm.hp && myself.Skill_InReuseDelay(384434180) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434180, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384434177)) <= 10) {
if (target.max_hp * 0.300000 >= target.hp) {
if (gg.Skill_IsMagic(384434186) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434186) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434186) < myself.sm.mp && myself.Skill_GetConsumeHP(384434186) < myself.sm.hp && myself.Skill_InReuseDelay(384434186) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434186, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.600000 >= target.hp) {
if (gg.Skill_IsMagic(384434185) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434185) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434185) < myself.sm.mp && myself.Skill_GetConsumeHP(384434185) < myself.sm.hp && myself.Skill_InReuseDelay(384434185) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434185, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(384434184) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434184) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434184) < myself.sm.mp && myself.Skill_GetConsumeHP(384434184) < myself.sm.hp && myself.Skill_InReuseDelay(384434184) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434184, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 386531329 || skill_name_id == 386531330 || skill_name_id == 387121153 || skill_name_id == 387121154 || skill_name_id == 387186689 || skill_name_id == 387186690) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384565251)) < 8) {
if (gg.Skill_IsMagic(384565251) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384565251) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384565251) < myself.sm.mp && myself.Skill_GetConsumeHP(384565251) < myself.sm.hp && myself.Skill_InReuseDelay(384565251) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384565251, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384565251)) < 9) {
if (gg.Skill_IsMagic(384565255) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384565255) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384565255) < myself.sm.mp && myself.Skill_GetConsumeHP(384565255) < myself.sm.hp && myself.Skill_InReuseDelay(384565255) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384565255, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384565251)) < 10) {
if (gg.Skill_IsMagic(384565258) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384565258) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384565258) < myself.sm.mp && myself.Skill_GetConsumeHP(384565258) < myself.sm.hp && myself.Skill_InReuseDelay(384565258) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384565258, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 386727937 || skill_name_id == 386727938 || skill_name_id == 386924545 || skill_name_id == 386924546 || skill_name_id == 386924547 || skill_name_id == 386990081) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384630787)) < 8) {
if (gg.Skill_IsMagic(384630787) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384630787) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384630787) < myself.sm.mp && myself.Skill_GetConsumeHP(384630787) < myself.sm.hp && myself.Skill_InReuseDelay(384630787) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384630787, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384630787)) < 9) {
if (gg.Skill_IsMagic(384630791) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384630791) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384630791) < myself.sm.mp && myself.Skill_GetConsumeHP(384630791) < myself.sm.hp && myself.Skill_InReuseDelay(384630791) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384630791, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384630787)) < 10) {
if (gg.Skill_IsMagic(384630794) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384630794) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384630794) < myself.sm.mp && myself.Skill_GetConsumeHP(384630794) < myself.sm.hp && myself.Skill_InReuseDelay(384630794) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384630794, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 386596865 || skill_name_id == 386596866 || skill_name_id == 386662401 || skill_name_id == 386859009) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384499715)) < 8) {
if (gg.Skill_IsMagic(384499715) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384499715) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384499715) < myself.sm.mp && myself.Skill_GetConsumeHP(384499715) < myself.sm.hp && myself.Skill_InReuseDelay(384499715) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384499715, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384499715)) < 9) {
if (gg.Skill_IsMagic(384499715) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384499715) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384499715) < myself.sm.mp && myself.Skill_GetConsumeHP(384499715) < myself.sm.hp && myself.Skill_InReuseDelay(384499715) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384499715, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384499715)) < 10) {
if (gg.Skill_IsMagic(384499722) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384499722) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384499722) < myself.sm.mp && myself.Skill_GetConsumeHP(384499722) < myself.sm.hp && myself.Skill_InReuseDelay(384499722) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384499722, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 388235265 || skill_name_id == 388300801) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384892929)) < 1) {
if (gg.Skill_IsMagic(384892929) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384892929) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384892929) < myself.sm.mp && myself.Skill_GetConsumeHP(384892929) < myself.sm.hp && myself.Skill_InReuseDelay(384892929) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384892929, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384892929)) < 2) {
if (gg.Skill_IsMagic(384892930) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384892930) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384892930) < myself.sm.mp && myself.Skill_GetConsumeHP(384892930) < myself.sm.hp && myself.Skill_InReuseDelay(384892930) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384892930, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384892929)) < 3) {
if (gg.Skill_IsMagic(384892931) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384892931) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384892931) < myself.sm.mp && myself.Skill_GetConsumeHP(384892931) < myself.sm.hp && myself.Skill_InReuseDelay(384892931) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384892931, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384892929)) < 4) {
if (gg.Skill_IsMagic(384892932) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384892932) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384892932) < myself.sm.mp && myself.Skill_GetConsumeHP(384892932) < myself.sm.hp && myself.Skill_InReuseDelay(384892932) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384892932, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384892929)) < 5) {
if (gg.Skill_IsMagic(384892933) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384892933) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384892933) < myself.sm.mp && myself.Skill_GetConsumeHP(384892933) < myself.sm.hp && myself.Skill_InReuseDelay(384892933) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384892933, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 388366337) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384958465)) < 1) {
if (gg.Skill_IsMagic(384958465) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384958465) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384958465) < myself.sm.mp && myself.Skill_GetConsumeHP(384958465) < myself.sm.hp && myself.Skill_InReuseDelay(384958465) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384958465, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384958465)) < 2) {
if (gg.Skill_IsMagic(384958466) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384958466) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384958466) < myself.sm.mp && myself.Skill_GetConsumeHP(384958466) < myself.sm.hp && myself.Skill_InReuseDelay(384958466) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384958466, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384958465)) < 3) {
if (gg.Skill_IsMagic(384958467) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384958467) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384958467) < myself.sm.mp && myself.Skill_GetConsumeHP(384958467) < myself.sm.hp && myself.Skill_InReuseDelay(384958467) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384958467, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384958465)) < 4) {
if (gg.Skill_IsMagic(384958468) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384958468) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384958468) < myself.sm.mp && myself.Skill_GetConsumeHP(384958468) < myself.sm.hp && myself.Skill_InReuseDelay(384958468) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384958468, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384958465)) < 5) {
if (gg.Skill_IsMagic(384958469) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384958469) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384958469) < myself.sm.mp && myself.Skill_GetConsumeHP(384958469) < myself.sm.hp && myself.Skill_InReuseDelay(384958469) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384958469, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}

}

}
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id) {
if (skill_name_id == Skill03_ID) {
if (babble_mode == 1) {
myself.Say("디바우어 맞았음 - 도망");

}
myself.AddFleeDesire(speller, 100000);

}
	}

	protected void NO_DESIRE(HandlerParam h0, HandlerParam i0) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);
if (myself.GetHateInfoCount() != 0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
myself.AddAttackDesire(h0.creature, 1, 100);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam f0, HandlerParam f1, HandlerParam f2, HandlerParam f3, HandlerParam f4, HandlerParam s0, HandlerParam party0) {
if (script_event_arg1 == 78010074 && script_event_arg2 == 0) {
if (babble_mode == 1) {
myself.Say("연결 끊김");

}
myself.i_quest0 = 1;
myself.RemoveAllHateInfoIF(0, 0);
myself.RemoveAllDesire();
myself.AddMoveAroundDesire(5, 5);

} else if (script_event_arg1 == 78010074 && script_event_arg2 == 1) {
if (babble_mode == 1) {
myself.Say("연결 회복");

}
myself.i_quest0 = 0;
myself.RemoveAllHateInfoIF(0, 0);
myself.RemoveAllDesire();
if (myself.IsMyBossAlive()) {
myself.AddFollowDesire(myself.boss, 5);

} else {
myself.AddMoveAroundDesire(5, 5);

}

} else if (script_event_arg1 == 78010074 && script_event_arg2 == 98) {
party0 = gg.GetPartyFromID(script_event_arg3);
if (myself.IsNullParty(party0) == 0) {
f1 = party0.member_count * SEE_CREATURE_Weight_Point;
for (i0 = 0; i0 < party0.member_count; i0 = i0 + 1) {
c0 = myself.GetMemberOfParty(party0, i0);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) <= 3000) {
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, c0.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, c0.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, c0.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = DefaultHate * f0 + 1;

}
myself.AddHateInfo(c0, gg.FloatToInt(f0 * f1 + Attack_BoostValue), 0, 1, 1);

} else {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, c0.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, c0.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, c0.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = DefaultHate * f0 + 1;

}
myself.AddHateInfo(c0, gg.FloatToInt(f0 * f1), 0, 1, 1);

}

}
if (myself.IsInCategory(12, c0.npc_class_id)) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, c0.master.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, c0.master.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, c0.master.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = DefaultHate * f0 + 1;

}
myself.AddHateInfo(c0.master, gg.FloatToInt(f0 * f1), 0, 1, 1);

}

}

}

}

} else if (script_event_arg1 == 78010074 && script_event_arg2 == 99) {
c0 = gg.GetCreatureFromID(script_event_arg3);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) <= 3000) {
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, c0.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, c0.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, c0.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = DefaultHate * f0 + 1;

}
myself.AddHateInfo(c0, gg.FloatToInt(f0 * SEE_CREATURE_Weight_Point + Attack_BoostValue), 0, 1, 1);

} else {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, c0.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, c0.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, c0.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = DefaultHate * f0 + 1;

}
myself.AddHateInfo(c0, gg.FloatToInt(f0 * SEE_CREATURE_Weight_Point), 0, 1, 1);

}

}
if (myself.IsInCategory(12, c0.npc_class_id)) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, c0.master.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, c0.master.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, c0.master.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = DefaultHate * f0 + 1;

}
myself.AddHateInfo(c0.master, gg.FloatToInt(f0 * SEE_CREATURE_Weight_Point), 0, 1, 1);

}

}

}
	}


}