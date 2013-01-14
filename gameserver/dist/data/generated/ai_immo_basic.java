package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_immo_basic extends monster_behavior {
	protected int IsAggressive = 1;
	protected double Aggressive_Time = 5.000000;
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 1000000.000000;
	protected double DefaultHate = 100.000000;
	protected double Maximum_Hate = 999999984306749440.000000;
	protected int HateClassGroup1 = 5;
	protected double HateClassGroup1Boost = 80.000000;
	protected int HateClassGroup2 = 3;
	protected double HateClassGroup2Boost = 40.000000;
	protected int FavorClassGroup1 = 4;
	protected double FavorClassGroup1Boost = 20.000000;
	protected double SEE_CREATURE_Weight_Point = 1.000000;
	protected double ATTACKED_Weight_Point = 10.000000;
	protected double CLAN_ATTACKED_Weight_Point = 5.000000;
	protected double PARTY_ATTACKED_Weight_Point = 5.000000;
	protected double SEE_SPELL_Weight_Point = 20.000000;
	protected double HATE_SKILL_Weight_Point = 30.000000;
	protected double TUMOR_ATTACKED_Weight_Point = 10.000000;
	protected double VEIN_SIGNAL_Weight_Point = 10.000000;
	protected double TUMOR_HELP_Weight_Point = 10.000000;
	protected double LIFESEED_TAUNT_Weight_Point = 100.000000;
	protected int Skill01_ID = 458752001;
	protected int Skill02_ID = 458752001;
	protected int Skill03_ID = 458752001;
	protected int Skill04_ID = 458752001;
	protected int Skillchance_High = 15;
	protected int Skillchance_Low = 7;
	protected int Skillchance_Dim = 2;
	protected int Skill_Siege = 458752001;
	protected int Skill_HPBuff = 458752001;
	protected int Skill_AntiParty_atk01 = 388431873;
	protected int Skill_AntiParty_atk02 = 388431874;
	protected int Skill_AntiParty_atk03 = 388431875;
	protected int Skill_AntiParty_atk04 = 388431876;
	protected int Skill_AntiParty_def01 = 388497409;
	protected int Skill_AntiParty_def02 = 388497410;
	protected int Skill_AntiParty_def03 = 388497411;
	protected int Skill_AntiParty_def04 = 388497412;
	protected int raise_modifier = 10;
	protected String SuperPointName1 = "";
	protected String SuperPointName2 = "";
	protected int SuperPointMethod = 0;
	protected int SuperPointDesire = 2000;
	protected int zone = 0;
	protected int room = 0;
	protected int tide = 0;
	protected int raise = 0;
	protected String dispatcher_maker = "";
	protected int tact = 0;
	protected String type = "";
	protected String ech_atk_expel_maker = "rumwarsha15_1424_expelm1";
	protected String z2_a_dispatcher_maker = "rumwarsha14_1424_a_dispm1";
	protected String z2_d_dispatcher_maker = "rumwarsha14_1424_d_dispm1";
	protected String z3_a_dispatcher_maker = "rumwarsha15_1424_a_dispm1";
	protected String z3_d_dispatcher_maker = "rumwarsha15_1424_d_dispm1";
	protected int TM_ATTACK_COOLDOWN = 78001;
	protected int TIME_ATTACK_COOLDOWN_MELEE = 5;
	protected int TIME_ATTACK_COOLDOWN_CASTER = 1;
	protected int TM_REDEPLOY = 78003;
	protected int TIME_REDEPLOY = 90;
	protected int TACT_AGGRESIVE = 0;
	protected int TACT_INTERCEPT = 1;
	protected int TACT_DEFENSIVE = 2;
	protected int babble_mode = 0;

	protected void CREATED(HandlerParam c0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.int_list.Clear();
myself.i_ai2 = 0;
myself.i_quest0 = 0;
myself.i_quest4 = 0;
myself.SetMaxHateListSize(25);
if (gg.IsSameString(type, "boss_marching") == 1) {
myself.ChangeMoveType(0);
if (gg.Rand(2) == 0) {
myself.i_ai1 = 1;

} else {
myself.i_ai1 = 2;

}
if (myself.i_ai1 == 1) {
if (babble_mode == 1) {
myself.Say("1번 경로 이동 시작");

}
myself.AddMoveSuperPointDesire(SuperPointName1, SuperPointMethod, SuperPointDesire);

} else if (myself.i_ai1 == 2) {
if (babble_mode == 1) {
myself.Say("2번 경로 이동 시작");

}
myself.AddMoveSuperPointDesire(SuperPointName2, SuperPointMethod, SuperPointDesire);

}

} else {
myself.AddTimerEx(TM_REDEPLOY, TIME_REDEPLOY * 1000);
if (gg.IsSameString(type, "dot") == 1 || gg.IsSameString(type, "cc") == 1 || gg.IsSameString(type, "con") == 1 || gg.IsSameString(type, "ambush_dc_kamikaze") == 1 || gg.IsSameString(type, "solo_boss_caster") == 1 || gg.IsSameString(type, "duo_boss_caster") == 1 || gg.IsSameString(type, "echmus") == 1) {
myself.AddTimerEx(TM_ATTACK_COOLDOWN, 1000);

} else {
myself.AddTimerEx(TM_ATTACK_COOLDOWN, 1000);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam f0, HandlerParam h0, HandlerParam i0, HandlerParam c0, HandlerParam s0, HandlerParam party0, HandlerParam maker0) {
if (gg.IsSameString(type, "boss_marching") == 1 || myself.i_quest0 == 1 || myself.GetLifeTime() < Aggressive_Time) {
return;

}
if (myself.IsNullCreature(creature) == 0 && creature.is_pc == 1) {
if (babble_mode == 1) {
myself.Say("대상 감지 - 사망 트리거 부여");

}
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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam f0, HandlerParam f1, HandlerParam h0, HandlerParam i0, HandlerParam c0, HandlerParam s0, HandlerParam party0, HandlerParam maker0) {
if (gg.IsSameString(type, "boss_marching") == 1 || myself.i_quest0 == 1) {
return;

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
if (myself.IsNullCreature(attacker) == 0 && attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (attacker.is_pc == 1) {
party0 = gg.GetParty(attacker);

} else if (myself.IsInCategory(12, attacker.npc_class_id) && myself.IsNullCreature(attacker.master) == 0) {
party0 = gg.GetParty(attacker.master);

}
if (myself.IsNullParty(party0) == 0 && myself.int_list.GetSize() == 0) {
myself.int_list.Add(party0.id);

} else if (myself.IsNullParty(party0) == 1 && myself.int_list.GetSize() == 0) {
myself.int_list.Add(attacker.id);

} else if (myself.IsNullParty(party0) == 0 && myself.int_list.GetSize() > 0) {
for (i0 = 0; i0 <= myself.int_list.GetSize(); i0 = i0 + 1) {
if (myself.int_list.Get(i0) == party0.id) {
myself.i_ai2 = myself.i_ai2 + 1;

}

}
if (myself.i_ai2 == 0) {
if (myself.sm.class_id == 1029150) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);
myself.RemoveAllDesire();
myself.int_list.Clear();
myself.i_ai2 = 0;
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_expel_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010066, 0, 0);

}
s0 = gg.MakeFString(1800249, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);

} else {
myself.Shout(gg.MakeFString(1800256, "", "", "", "", ""));
myself.RemoveAllAttackDesire();
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_AntiParty_atk01)) < 1 && myself.sm.hp <= myself.sm.max_hp * 0.600000) {
if (myself.Skill_GetConsumeMP(Skill_AntiParty_atk01) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, Skill_AntiParty_atk01, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("버프 MP부족!");

}

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_AntiParty_atk01)) < 2 && myself.sm.hp <= myself.sm.max_hp * 0.300000) {
if (myself.Skill_GetConsumeMP(Skill_AntiParty_atk02) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, Skill_AntiParty_atk02, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("버프 MP부족!");

}

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_AntiParty_def01)) < 1 && myself.sm.hp <= myself.sm.max_hp * 0.600000) {
if (myself.Skill_GetConsumeMP(Skill_AntiParty_def01) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, Skill_AntiParty_def01, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("버프 MP부족!");

}

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_AntiParty_def01)) < 2 && myself.sm.hp <= myself.sm.max_hp * 0.300000) {
if (myself.Skill_GetConsumeMP(Skill_AntiParty_def02) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, Skill_AntiParty_def02, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("버프 MP부족!");

}

}

}
myself.int_list.Add(party0.id);
myself.i_ai2 = 0;

}

} else if (myself.IsNullParty(party0) == 1 && myself.int_list.GetSize() > 0) {
for (i0 = 0; i0 <= myself.int_list.GetSize(); i0 = i0 + 1) {
if (myself.int_list.Get(i0) == attacker.id) {
myself.i_ai2 = myself.i_ai2 + 1;

}

}
if (myself.i_ai2 == 0) {
if (myself.sm.class_id == 1029150) {
s0 = gg.MakeFString(1800249, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_expel_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010066, 0, 0);

}

} else {
myself.Shout(gg.MakeFString(1800256, "", "", "", "", ""));
myself.RemoveAllAttackDesire();
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_AntiParty_atk01)) < 1 && myself.sm.hp <= myself.sm.max_hp * 0.600000) {
if (myself.Skill_GetConsumeMP(Skill_AntiParty_atk01) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, Skill_AntiParty_atk01, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("버프 MP부족!");

}

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_AntiParty_atk01)) < 2 && myself.sm.hp <= myself.sm.max_hp * 0.300000) {
if (myself.Skill_GetConsumeMP(Skill_AntiParty_atk02) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, Skill_AntiParty_atk02, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("버프 MP부족!");

}

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_AntiParty_def01)) < 1 && myself.sm.hp <= myself.sm.max_hp * 0.600000) {
if (myself.Skill_GetConsumeMP(Skill_AntiParty_def01) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, Skill_AntiParty_def01, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("버프 MP부족!");

}

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_AntiParty_def01)) < 2 && myself.sm.hp <= myself.sm.max_hp * 0.300000) {
if (myself.Skill_GetConsumeMP(Skill_AntiParty_def02) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, Skill_AntiParty_def02, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("버프 MP부족!");

}

}

}
myself.int_list.Add(attacker.id);
myself.i_ai2 = 0;

}

}
if (myself.IsNullParty(party0) == 0) {
f1 = party0.member_count * SEE_CREATURE_Weight_Point;
for (i0 = 0; i0 < party0.member_count; i0 = i0 + 1) {
c0 = myself.GetMemberOfParty(party0, i0);
if (myself.IsNullCreature(c0) == 0) {
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

}
if (myself.sm.hp / myself.sm.max_hp <= 0.100000 && raise <= gg.Rand(100) && myself.i_quest4 == 0) {
myself.Say(gg.MakeFString(1800748, "", "", "", "", ""));
gg.SetNpcParam(myself.sm, 35, myself.sm.hp_regen * raise_modifier);
myself.i_quest4 = 1;

}
if (Skill_HPBuff != 458752001) {
if (myself.i_ai0 <= 0 && myself.sm.hp <= myself.sm.max_hp * 0.900000 && gg.IsSameString(type, "solo_boss") == 1 || gg.IsSameString(type, "duo_boss") == 1 || gg.IsSameString(type, "boss_marching") == 1) {
myself.i_ai0 = 1;
if (Skill_HPBuff == 387645441) {
if (myself.Skill_GetConsumeMP(387645441) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387645441, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387710977) {
if (myself.Skill_GetConsumeMP(387710977) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387710977, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387776513) {
if (myself.Skill_GetConsumeMP(387776513) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387776513, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392232961) {
if (myself.Skill_GetConsumeMP(392232961) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392232961, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392298497) {
if (myself.Skill_GetConsumeMP(392298497) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392298497, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

}

} else if (myself.i_ai0 <= 1 && myself.sm.hp <= myself.sm.max_hp * 0.800000 && gg.IsSameString(type, "solo_boss") == 1 || gg.IsSameString(type, "duo_boss") == 1 || gg.IsSameString(type, "boss_marching") == 1) {
myself.i_ai0 = 2;
if (Skill_HPBuff == 387645441) {
if (myself.Skill_GetConsumeMP(387645442) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387645442, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387710977) {
if (myself.Skill_GetConsumeMP(387710978) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387710978, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387776513) {
if (myself.Skill_GetConsumeMP(387776514) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387776514, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392232961) {
if (myself.Skill_GetConsumeMP(392232962) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392232962, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392298497) {
if (myself.Skill_GetConsumeMP(392298498) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392298498, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

}

} else if (myself.i_ai0 <= 2 && myself.sm.hp <= myself.sm.max_hp * 0.700000 && gg.IsSameString(type, "solo_boss") == 1 || gg.IsSameString(type, "duo_boss") == 1 || gg.IsSameString(type, "boss_marching") == 1) {
myself.i_ai0 = 3;
if (Skill_HPBuff == 387645441) {
if (myself.Skill_GetConsumeMP(387645443) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387645443, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387710977) {
if (myself.Skill_GetConsumeMP(387710979) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387710979, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387776513) {
if (myself.Skill_GetConsumeMP(387776515) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387776515, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392232961) {
if (myself.Skill_GetConsumeMP(392232963) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392232963, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392298497) {
if (myself.Skill_GetConsumeMP(392298499) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392298499, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

}

} else if (myself.i_ai0 <= 3 && myself.sm.hp <= myself.sm.max_hp * 0.600000 && gg.IsSameString(type, "solo_boss") == 1 || gg.IsSameString(type, "duo_boss") == 1 || gg.IsSameString(type, "boss_marching") == 1) {
myself.i_ai0 = 4;
if (Skill_HPBuff == 387645441) {
if (myself.Skill_GetConsumeMP(387645444) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387645444, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387710977) {
if (myself.Skill_GetConsumeMP(387710980) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387710980, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387776513) {
if (myself.Skill_GetConsumeMP(387776516) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387776516, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392232961) {
if (myself.Skill_GetConsumeMP(392232964) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392232964, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392298497) {
if (myself.Skill_GetConsumeMP(392298500) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392298500, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

}

} else if (myself.i_ai0 <= 4 && myself.sm.hp <= myself.sm.max_hp * 0.500000 && gg.IsSameString(type, "solo_boss") == 1 || gg.IsSameString(type, "duo_boss") == 1 || gg.IsSameString(type, "boss_marching") == 1) {
myself.i_ai0 = 5;
if (Skill_HPBuff == 387645441) {
if (myself.Skill_GetConsumeMP(387645445) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387645445, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387710977) {
if (myself.Skill_GetConsumeMP(387710981) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387710981, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387776513) {
if (myself.Skill_GetConsumeMP(387776517) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387776517, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392232961) {
if (myself.Skill_GetConsumeMP(392232965) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392232965, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392298497) {
if (myself.Skill_GetConsumeMP(392298501) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392298501, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

}

} else if (myself.i_ai0 <= 5 && myself.sm.hp <= myself.sm.max_hp * 0.400000 && gg.IsSameString(type, "solo_boss") == 1 || gg.IsSameString(type, "duo_boss") == 1 || gg.IsSameString(type, "boss_marching") == 1) {
myself.i_ai0 = 6;
if (Skill_HPBuff == 387645441) {
if (myself.Skill_GetConsumeMP(387645446) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387645446, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387710977) {
if (myself.Skill_GetConsumeMP(387710982) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387710982, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387776513) {
if (myself.Skill_GetConsumeMP(387776518) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387776518, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392232961) {
if (myself.Skill_GetConsumeMP(392232966) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392232966, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392298497) {
if (myself.Skill_GetConsumeMP(392298502) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392298502, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

}

} else if (myself.i_ai0 <= 6 && myself.sm.hp <= myself.sm.max_hp * 0.300000 && gg.IsSameString(type, "solo_boss") == 1 || gg.IsSameString(type, "duo_boss") == 1 || gg.IsSameString(type, "boss_marching") == 1) {
myself.i_ai0 = 7;
if (Skill_HPBuff == 387645441) {
if (myself.Skill_GetConsumeMP(387645447) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387645447, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387710977) {
if (myself.Skill_GetConsumeMP(387710983) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387710983, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387776513) {
if (myself.Skill_GetConsumeMP(387776519) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387776519, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392232961) {
if (myself.Skill_GetConsumeMP(392232967) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392232967, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392298497) {
if (myself.Skill_GetConsumeMP(392298503) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392298503, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

}

} else if (myself.i_ai0 <= 7 && myself.sm.hp <= myself.sm.max_hp * 0.200000 && gg.IsSameString(type, "solo_boss") == 1 || gg.IsSameString(type, "duo_boss") == 1 || gg.IsSameString(type, "boss_marching") == 1) {
myself.i_ai0 = 8;
if (Skill_HPBuff == 387645441) {
if (myself.Skill_GetConsumeMP(387645448) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387645448, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387710977) {
if (myself.Skill_GetConsumeMP(387710984) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387710984, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387776513) {
if (myself.Skill_GetConsumeMP(387776520) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387776520, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392232961) {
if (myself.Skill_GetConsumeMP(392232968) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392232968, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392298497) {
if (myself.Skill_GetConsumeMP(392298504) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392298504, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

}

} else if (myself.i_ai0 <= 8 && myself.sm.hp <= myself.sm.max_hp * 0.100000 && gg.IsSameString(type, "solo_boss") == 1 || gg.IsSameString(type, "duo_boss") == 1 || gg.IsSameString(type, "boss_marching") == 1) {
myself.i_ai0 = 9;
if (Skill_HPBuff == 387645441) {
if (myself.Skill_GetConsumeMP(387645449) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387645449, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387710977) {
if (myself.Skill_GetConsumeMP(387710985) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387710985, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 387776513) {
if (myself.Skill_GetConsumeMP(387776521) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 387776521, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392232961) {
if (myself.Skill_GetConsumeMP(392232969) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392232969, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

} else if (Skill_HPBuff == 392298497) {
if (myself.Skill_GetConsumeMP(392298505) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, 392298505, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("hpbuff 버프 MP부족!");

}

}

}

}
if (myself.IsNullCreature(attacker) == 0 && myself.sm.hp < myself.sm.max_hp * 0.050000 && gg.Rand(25) == 0) {
myself.AddUseSkillDesire(attacker, 385089537, 0, 1, Maximum_Hate);

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam f0, HandlerParam h0, HandlerParam c0, HandlerParam s0, HandlerParam party0, HandlerParam maker0) {
if (gg.IsSameString(type, "boss_marching") == 1 || myself.i_quest0 == 1) {
return;

}
if (Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
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

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam f0, HandlerParam h0, HandlerParam c0, HandlerParam s0, HandlerParam party0, HandlerParam maker0) {
if (gg.IsSameString(type, "boss_marching") == 1 || myself.i_quest0 == 1) {
return;

}
if (Party_Type == 1 && private == myself.boss || Party_Type == 2 && private == myself.sm) {
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

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
if (gg.IsSameString(type, "boss_marching") == 1) {
return;

}
if (babble_mode == 1) {
myself.Say("헤이트 감지");

}
myself.MakeAttackEvent(speller, desire * HATE_SKILL_Weight_Point, 0);
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0, HandlerParam s0, HandlerParam c0, HandlerParam h0, HandlerParam maker0, HandlerParam party0) {
if (gg.IsSameString(type, "boss_marching") == 1 || myself.i_quest0 == 1 || myself.GetLifeTime() < Aggressive_Time) {
return;

}
i0 = myself.Skill_GetEffectPoint(skill_name_id);
if (i0 > 0 && speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (babble_mode == 1) {
myself.Say("힐/버프 감지");

}
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

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam maker0, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam f0, HandlerParam f1, HandlerParam f2, HandlerParam f3, HandlerParam f4) {
i1 = script_event_arg3 * 100;
if (script_event_arg1 == 78010049 && script_event_arg2 != 0 && myself.i_quest0 == 0) {
c0 = gg.GetCreatureFromID(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
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
f0 = i1 * f0 + 1;

}
myself.AddHateInfo(c0, gg.FloatToInt(f0 * TUMOR_ATTACKED_Weight_Point + Attack_BoostValue), 0, 1, 1);

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
f0 = i1 * f0 + 1;

}
myself.AddHateInfo(c0, gg.FloatToInt(f0 * TUMOR_ATTACKED_Weight_Point), 0, 1, 1);

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
f0 = i1 * f0 + 1;

}
myself.AddHateInfo(c0.master, gg.FloatToInt(f0 * TUMOR_ATTACKED_Weight_Point), 0, 1, 1);

}

}

} else if (script_event_arg1 == 78010058 && script_event_arg2 != 0 && script_event_arg2 != 1 && myself.i_quest0 == 0) {
c0 = gg.GetCreatureFromID(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
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
f0 = i1 * f0 + 1;

}
myself.AddHateInfo(c0, gg.FloatToInt(f0 * VEIN_SIGNAL_Weight_Point + Attack_BoostValue), 0, 1, 1);

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
f0 = i1 * f0 + 1;

}
myself.AddHateInfo(c0, gg.FloatToInt(f0 * VEIN_SIGNAL_Weight_Point), 0, 1, 1);

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
f0 = i1 * f0 + 1;

}
myself.AddHateInfo(c0.master, gg.FloatToInt(f0 * VEIN_SIGNAL_Weight_Point), 0, 1, 1);

}

}

} else if (script_event_arg1 == 78010052 && script_event_arg2 != 0 && script_event_arg3 == room || script_event_arg3 == 911 && gg.IsSameString(type, "solo_boss_melee") == 0 && gg.IsSameString(type, "solo_boss_caster") == 0 && gg.IsSameString(type, "duo_boss_melee") == 0 && gg.IsSameString(type, "duo_boss_caster") == 0 && gg.IsSameString(type, "boss_marching") == 0 && gg.IsSameString(type, "echmus") == 0 && gg.IsSameString(type, "voidhound_a") == 0 && gg.IsSameString(type, "voidhound_d") == 0 && gg.IsSameString(type, "knight") == 0 && gg.IsSameString(type, "melee") == 0 && gg.IsSameString(type, "caster") == 0) {
c0 = gg.GetCreatureFromID(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (gg.Rand(25) == 0) {
if (babble_mode == 1) {
myself.Say("씨앗 올인 모드 시작");

}
myself.RemoveAllHateInfoIF(0, 0);
myself.i_quest0 = 1;

} else {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 600);

}
if (myself.GetHateInfoCount() == 0) {
if (gg.Skill_IsMagic(Skill_Siege) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill_Siege) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill_Siege) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill_Siege) < myself.sm.hp && myself.Skill_InReuseDelay(Skill_Siege) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill_Siege / 65536)) + "사용");

}
myself.AddUseSkillDesire(c0, Skill_Siege, 0, 1, LIFESEED_TAUNT_Weight_Point * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}

} else if (script_event_arg1 == 78010073 && gg.IsSameString(type, "boss_marching") == 1) {
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010073, 0, 0);

}
if (babble_mode == 1) {
myself.Shout("종양체 도달");

}
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam h0, HandlerParam i0) {
if (timer_id == TM_ATTACK_COOLDOWN && gg.IsSameString(type, "boss_marching") == 0 && gg.IsSameString(type, "solo_boss_melee") == 0 && gg.IsSameString(type, "solo_boss_caster") == 0 && gg.IsSameString(type, "duo_boss_melee") == 0 && gg.IsSameString(type, "duo_boss_caster") == 0 && gg.IsSameString(type, "boss_marching") == 0 && gg.IsSameString(type, "echmus") == 0 && gg.IsSameString(type, "voidhound_a") == 0 && gg.IsSameString(type, "voidhound_d") == 0 && gg.IsSameString(type, "knight") == 0 && gg.IsSameString(type, "melee") == 0 && gg.IsSameString(type, "caster") == 0) {
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
if (babble_mode == 1) {
myself.Say(h0.creature.name + " 의 헤이트: " + h0.hate);

}
i0 = gg.Rand(100);
if (gg.IsSameString(type, "tank") == 1) {
if (i0 <= Skillchance_Dim && h0.creature.is_pc == 1 && myself.IsInCategory(88, h0.creature.occupation) == 1 || myself.IsInCategory(91, h0.creature.occupation) == 1 || myself.IsInCategory(93, h0.creature.occupation) == 1) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill04_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (i0 <= Skillchance_Low) {
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

} else if (i0 <= Skillchance_High) {
if (myself.DistFromMe(h0.creature) >= 300) {
if (babble_mode == 1) {
myself.Shout("높은 확률 1번 조건");

}
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else {
if (babble_mode == 1) {
myself.Shout("높은 확률 2번 조건");

}
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

}

} else {
myself.AddAttackDesire(h0.creature, 1, h0.hate);

}

} else if (gg.IsSameString(type, "charger") == 1) {
if (i0 <= Skillchance_Low) {
if (myself.DistFromMe(h0.creature) >= 300) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else if (i0 <= Skillchance_High) {
if (h0.creature.is_pc != 0 && myself.IsInCategory(88, h0.creature.occupation) == 1 || myself.IsInCategory(91, h0.creature.occupation) == 1 || myself.IsInCategory(93, h0.creature.occupation) == 1) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill04_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else {
myself.AddAttackDesire(h0.creature, 1, h0.hate);

}

} else if (gg.IsSameString(type, "dealer") == 1) {
if (i0 <= Skillchance_Dim && h0.creature.max_hp * 0.300000 <= h0.creature.hp) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else if (i0 <= Skillchance_Low) {
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

} else if (gg.IsSameString(type, "debuffer") == 1) {
if (i0 <= Skillchance_Dim && h0.creature.is_pc != 0 && myself.IsInCategory(84, h0.creature.occupation) == 0 && myself.IsInCategory(86, h0.creature.occupation) == 0 && myself.IsInCategory(87, h0.creature.occupation) == 0) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else if (i0 <= Skillchance_Low) {
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

} else if (gg.IsSameString(type, "dot") == 1) {
if (i0 <= Skillchance_High && myself.DistFromMe(h0.creature) <= 200) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else if (gg.IsSameString(type, "cc") == 1) {
if (i0 <= Skillchance_High && myself.DistFromMe(h0.creature) <= 200) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else if (gg.IsSameString(type, "con") == 1) {
if (h0.creature.is_pc != 0 && myself.IsInCategory(85, h0.creature.occupation) == 0 || myself.IsInCategory(92, h0.creature.occupation) == 0 || myself.IsInCategory(90, h0.creature.occupation) == 0) {
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

} else if (i0 <= Skillchance_Low) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else if (i0 <= 30) {
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

} else if (gg.IsSameString(type, "td") == 1) {
if (i0 <= Skillchance_Dim && h0.creature.is_pc != 0 && myself.IsInCategory(88, h0.creature.occupation) == 1 || myself.IsInCategory(91, h0.creature.occupation) == 1 || myself.IsInCategory(93, h0.creature.occupation) == 1) {
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

} else if (i0 <= Skillchance_Low) {
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

} else if (i0 <= Skillchance_High) {
if (Skill02_ID == 386531329 && myself.DistFromMe(h0.creature) <= 300) {
myself.AddAttackDesire(h0.creature, 1, h0.hate);

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

} else {
myself.AddAttackDesire(h0.creature, 1, h0.hate);

}

} else if (gg.IsSameString(type, "ambush_td_kamikaze") == 1) {
if (i0 <= Skillchance_Low) {
if (h0.creature.is_pc != 0 && myself.IsInCategory(88, h0.creature.occupation) == 1 || myself.IsInCategory(91, h0.creature.occupation) == 1 || myself.IsInCategory(93, h0.creature.occupation) == 1) {
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

} else if (gg.IsSameString(type, "ambush_dc_kamikaze") == 1) {
if (i0 <= Skillchance_Dim && Skill03_ID != 458752001) {
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

} else if (i0 <= Skillchance_Low && Skill02_ID == 386924545 && myself.DistFromMe(h0.creature) >= 150) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else if (i0 <= Skillchance_Low && Skill02_ID == 385286145) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) > 0) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else if (Skill01_ID == 386465793) {
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

} else if (gg.IsSameString(type, "spc_wagon") == 1) {
if (i0 <= Skillchance_High) {
if (myself.DistFromMe(h0.creature) >= 300) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else {
myself.AddAttackDesire(h0.creature, 1, h0.hate);

}

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
if (timer_id == TM_REDEPLOY && gg.IsSameString(type, "solo_boss_melee") == 0 && gg.IsSameString(type, "solo_boss_caster") == 0 && gg.IsSameString(type, "duo_boss_melee") == 0 && gg.IsSameString(type, "duo_boss_caster") == 0 && gg.IsSameString(type, "boss_marching") == 0 && gg.IsSameString(type, "echmus") == 0 && gg.IsSameString(type, "voidhound_a") == 0 && gg.IsSameString(type, "voidhound_d") == 0 && gg.IsSameString(type, "knight") == 0 && gg.IsSameString(type, "melee") == 0 && gg.IsSameString(type, "caster") == 0) {
if (myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 0) {
if (babble_mode == 1) {
myself.Say("재배치");

}
myself.Despawn();

} else {
myself.AddTimerEx(TM_REDEPLOY, TIME_REDEPLOY * 1000);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam success, HandlerParam skill_name_id, HandlerParam h0, HandlerParam i0, HandlerParam f4) {
if (babble_mode == 1) {
myself.Say(target.name + "에 스킬" + gg.IntToStr(gg.FloatToInt(skill_name_id / 65536)) + "사용결과" + gg.IntToStr(success));

}
if (success == 1) {
if (skill_name_id == Skill_Siege && myself.GetHateInfoCount() == 0 && myself.i_quest0 == 1) {
if (gg.Skill_IsMagic(Skill_Siege) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill_Siege) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill_Siege) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill_Siege) < myself.sm.hp && myself.Skill_InReuseDelay(Skill_Siege) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill_Siege / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, Skill_Siege, 0, 1, LIFESEED_TAUNT_Weight_Point * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}
if (gg.Rand(25) == 0) {
if (babble_mode == 1) {
myself.Say("씨앗 올인 모드 종료");

}
myself.i_quest0 = 0;

}

}
if (babble_mode == 1) {
myself.Say(target.name + "에 웜 스킬" + gg.IntToStr(gg.FloatToInt(skill_name_id / 65536)) + "사용");

}
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

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam state, HandlerParam success, HandlerParam s0, HandlerParam maker0) {
if (script_event_arg1 == 14) {
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010073, 0, 0);

}
if (babble_mode == 1) {
myself.Say("종양체 도달 - 에키무스의 영광을 위해!!!");

}
myself.Despawn();

} else if (myself.i_ai1 == 1) {
myself.AddMoveSuperPointDesire(SuperPointName1, SuperPointMethod, SuperPointDesire);

} else if (myself.i_ai1 == 2) {
myself.AddMoveSuperPointDesire(SuperPointName2, SuperPointMethod, SuperPointDesire);

}
	}

	protected void DIE_SET(HandlerParam talker) {
if (gg.IsSameString(type, "boss_marching") == 1) {
return;

}
if (myself.IsNullCreature(talker) == 0 && talker.alive == 0 && talker.is_pc == 1) {
if (babble_mode == 1) {
myself.Say("사망 이벤트: " + talker.name);

}
if (gg.IsSameString(type, "dealer") == 1 || gg.IsSameString(type, "debuffer") == 1 && myself.sm.hp <= myself.sm.max_hp * 0.300000) {
if (gg.Skill_IsMagic(386203649) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(386203649) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(386203649) < myself.sm.mp && myself.Skill_GetConsumeHP(386203649) < myself.sm.hp && myself.Skill_InReuseDelay(386203649) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(talker, 386203649, 0, 1, Maximum_Hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.IsSameString(type, "cc") == 1 && talker.is_pc == 1) {
if (gg.Skill_IsMagic(387186689) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(387186689) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(387186689) < myself.sm.mp && myself.Skill_GetConsumeHP(387186689) < myself.sm.hp && myself.Skill_InReuseDelay(387186689) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(talker, 387186689, 0, 1, Maximum_Hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

} else if (babble_mode == 1) {
myself.Say("올바르지 않은 사망 대상");

}
	}

	protected void CLAN_DIED(HandlerParam victim) {
if (gg.IsSameString(type, "dot") == 1 && myself.IsNullCreature(victim) == 0) {
if (babble_mode == 1) {
myself.Say("NPC사망 이벤트: " + victim.name);

}
if (gg.Skill_IsMagic(387121153) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(387121153) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(387121153) < myself.sm.mp && myself.Skill_GetConsumeHP(387121153) < myself.sm.hp && myself.Skill_InReuseDelay(387121153) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(victim, 387121153, 0, 1, Maximum_Hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_level, HandlerParam skill_name_id, HandlerParam s0, HandlerParam i0) {
if (babble_mode == 1) {
myself.Say("이상상태 변경: " + gg.IntToStr(skill_id) + "(" + gg.IntToStr(skill_level) + ")");

}
	}

	protected void ATTACK_FINISHED(HandlerParam target) {
if (target.alive == 0) {
myself.RemoveHateInfoByCreature(target);
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);
if (myself.GetHateInfoCount() == 0) {
myself.int_list.Clear();
myself.i_ai2 = 0;
myself.LookNeighbor(300);

}

}
	}

	protected void NO_DESIRE(HandlerParam h0, HandlerParam i0) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);
if (myself.GetHateInfoCount() != 0 && myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 0) {
if (babble_mode == 1) {
myself.Say("노디자이어 처리");

}
if (gg.IsSameString(type, "dot") == 1 || gg.IsSameString(type, "cc") == 1 || gg.IsSameString(type, "con") == 1 || gg.IsSameString(type, "ambush_dc_kamikaze") == 1 || gg.IsSameString(type, "solo_boss_caster") == 1 || gg.IsSameString(type, "duo_boss_caster") == 1 || gg.IsSameString(type, "echmus") == 1) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
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

} else {
myself.AddMoveAroundDesire(5, 5);

}
	}

	protected void OUT_OF_TERRITORY() {
	}


}