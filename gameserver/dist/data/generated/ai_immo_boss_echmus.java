package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_immo_boss_echmus extends monster_behavior {
	protected int IsAggressive = 1;
	protected double Aggressive_Time = 1.000000;
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 1000000.000000;
	protected double DefaultHate = 100.000000;
	protected double Maximum_Hate = 999999984306749440.000000;
	protected int HateClassGroup1 = 3;
	protected double HateClassGroup1Boost = 20.000000;
	protected int HateClassGroup2 = 4;
	protected double HateClassGroup2Boost = 10.000000;
	protected int FavorClassGroup1 = 5;
	protected double FavorClassGroup1Boost = 10.000000;
	protected double SEE_CREATURE_Weight_Point = 1.000000;
	protected double ATTACKED_Weight_Point = 10.000000;
	protected double CLAN_ATTACKED_Weight_Point = 0.000000;
	protected double PARTY_ATTACKED_Weight_Point = 0.000000;
	protected double SEE_SPELL_Weight_Point = 13.000000;
	protected double HATE_SKILL_Weight_Point = 30.000000;
	protected double TUMOR_ATTACKED_Weight_Point = 0.000000;
	protected double VEIN_SIGNAL_Weight_Point = 0.000000;
	protected double TUMOR_HELP_Weight_Point = 0.000000;
	protected double LIFESEED_TAUNT_Weight_Point = 0.000000;
	protected int Skill01_ID = 386596866;
	protected int Skill02_1_ID = 386531330;
	protected int Skill02_2_ID = 388038657;
	protected int Skill02_3_ID = 388104193;
	protected int Skill03_1_ID = 386334721;
	protected int Skill03_2_ID = 386269185;
	protected int Skill04_1_ID = 386924547;
	protected int Skill04_2_ID = 387973121;
	protected int Skillchance_High = 30;
	protected int Skillchance_Low = 15;
	protected int Skillchance_Dim = 4;
	protected int Skill_Retain_1 = 388169729;
	protected int Skill_Retain_2 = 394526721;
	protected int Skill_Retain_3 = 394592257;
	protected int Skill_Retain_4 = 394657793;
	protected int Skill_Retain_5 = 394723329;
	protected int Skill_Obey = 387907585;
	protected int Skill_Husk = 387055617;
	protected int Skill_HPBuff = 458752001;
	protected int private_voidhound = 1029151;
	protected String private_voidhound_class = "private_voidhound_3lv_a";
	protected int Skill_AntiParty_atk01 = 388431873;
	protected int Skill_AntiParty_atk02 = 388431874;
	protected int Skill_AntiParty_atk03 = 388431875;
	protected int Skill_AntiParty_atk04 = 388431876;
	protected int Skill_AntiParty_def01 = 388497409;
	protected int Skill_AntiParty_def02 = 388497410;
	protected int Skill_AntiParty_def03 = 388497411;
	protected int Skill_AntiParty_def04 = 388497412;
	protected int private_husk1 = 1018715;
	protected String private_husk1_class = "private_soulhusk_3lv_kn";
	protected int private_husk2 = 1018717;
	protected String private_husk2_class = "private_soulhusk_3lv_cs";
	protected int private_husk3 = 1018716;
	protected String private_husk3_class = "private_soulhusk_3lv_me";
	protected String ech_atk_expel_maker = "rumwarsha15_1424_expelm1";
	protected String z3_a_dispatcher_maker = "rumwarsha15_1424_a_dispm1";
	protected int tide = 0;
	protected String type = "echmus";
	protected int Party_Type = 2;
	protected int TM_ATTACK_COOLDOWN = 78001;
	protected int TIME_ATTACK_COOLDOWN_MELEE = 5;
	protected int TIME_ATTACK_COOLDOWN_CASTER = 1;
	protected int TM_IDLE_LONG_1 = 78011;
	protected int TIME_IDLE_LONG_1 = 30;
	protected int TM_IDLE_LONG_2 = 78012;
	protected int TIME_IDLE_LONG_2 = 180;
	protected int babble_mode = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.int_list.Clear();
myself.i_ai2 = 0;
myself.i_quest0 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.CreateOnePrivateEx(private_voidhound, private_voidhound_class, 0, 0, -179686, 208854, -15496, 16384, 0, 0, 0);
myself.CreateOnePrivateEx(private_voidhound, private_voidhound_class, 0, 0, -179387, 208854, -15496, 16384, 0, 0, 0);
if (gg.IsSameString(type, "dot") == 1 || gg.IsSameString(type, "cc") == 1 || gg.IsSameString(type, "con") == 1 || gg.IsSameString(type, "ambush_dc_kamikaze") == 1 || gg.IsSameString(type, "solo_boss_caster") == 1 || gg.IsSameString(type, "duo_boss_caster") == 1 || gg.IsSameString(type, "echmus") == 1) {
myself.AddTimerEx(TM_ATTACK_COOLDOWN, 1000);

} else {
myself.AddTimerEx(TM_ATTACK_COOLDOWN, 1000);

}
super;
	}

	protected void NO_DESIRE(HandlerParam s0, HandlerParam h0, HandlerParam i0) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 3000);
if (myself.GetHateInfoCount() == 0 && myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 0) {
myself.AddMoveAroundDesire(5, 5);
myself.LookNeighbor(1000);
if (myself.i_ai1 == 0) {
myself.AddTimerEx(TM_IDLE_LONG_1, TIME_IDLE_LONG_1 * 1000);
myself.i_ai1 = 1;

}

} else if (myself.GetHateInfoCount() != 0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
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
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam f0, HandlerParam h0, HandlerParam i0, HandlerParam c0, HandlerParam s0, HandlerParam party0, HandlerParam maker0) {
if (myself.GetLifeTime() < Aggressive_Time) {
return;

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
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam f0, HandlerParam f1, HandlerParam h0, HandlerParam i0, HandlerParam c0, HandlerParam s0, HandlerParam party0, HandlerParam maker0) {
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
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam f0, HandlerParam h0, HandlerParam c0, HandlerParam s0, HandlerParam party0, HandlerParam maker0) {
if (myself.GetLifeTime() > Aggressive_Time && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
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
super;
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire * HATE_SKILL_Weight_Point, 0);
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0, HandlerParam s0, HandlerParam c0, HandlerParam h0, HandlerParam maker0, HandlerParam party0) {
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
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam h0, HandlerParam i0, HandlerParam s0) {
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
if (i0 <= Skillchance_Low) {
if (myself.i_quest0 >= 1 && myself.i_quest0 <= 3) {
if (gg.Skill_IsMagic(Skill04_1_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill04_1_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill04_1_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_1_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_1_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill04_1_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill04_1_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(Skill04_2_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill04_2_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill04_2_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_2_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_2_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill04_2_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill04_2_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (i0 <= Skillchance_High) {
if (myself.i_quest0 >= 1 && myself.i_quest0 <= 3) {
if (gg.Skill_IsMagic(Skill02_1_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill02_1_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill02_1_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_1_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_1_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill02_1_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill02_1_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(Skill02_2_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill02_2_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill02_2_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_2_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_2_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill02_2_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill02_2_ID, 0, 1, h0.hate * UseSkill_BoostValue);

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

} else if (timer_id == TM_IDLE_LONG_1) {
myself.LookNeighbor(1000);
if (myself.GetHateInfoCount() == 0 && myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 0) {
s0 = gg.MakeFString(1800229, gg.IntToStr(TIME_IDLE_LONG_2), "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.AddTimerEx(TM_IDLE_LONG_2, TIME_IDLE_LONG_2 * 1000);

} else {
myself.i_ai1 = 0;

}

} else if (timer_id == TM_IDLE_LONG_2) {
myself.LookNeighbor(1000);
if (myself.GetHateInfoCount() == 0 && myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_expel_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010066, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_dispatcher_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010071, 0, 0);

}

} else {
myself.i_ai1 = 0;

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam success, HandlerParam skill_name_id, HandlerParam maker0) {
if (babble_mode == 1) {
myself.Say(target.name + "에 스킬" + gg.IntToStr(gg.FloatToInt(skill_name_id / 65536)) + "사용결과" + gg.IntToStr(success));

}
if (skill_name_id == Skill02_2_ID && success == 1) {
if (babble_mode == 1) {
myself.Shout("익스헤일!");

}
if (gg.Skill_IsMagic(Skill02_3_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill02_3_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill02_3_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_3_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_3_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill02_3_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, Skill02_3_ID, 0, 1, Maximum_Hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}
if (skill_name_id == Skill_Husk && success == 1 && myself.IsNullCreature(myself.c_ai0) == 0) {
maker0 = myself.GetMyMaker();
if (maker0.npc_count < maker0.maximum_npc) {
if (babble_mode == 1) {
myself.Say("maxnpc 체크 통과 - 소환 시도 ");

}
if (myself.IsInCategory(5, myself.c_ai0.occupation) == 1) {
myself.CreateOnePrivateEx(private_husk1, private_husk1_class, 0, 0, gg.FloatToInt(myself.c_ai0.x), gg.FloatToInt(myself.c_ai0.y), gg.FloatToInt(myself.c_ai0.z), 0, 0, 0, 0);

} else if (myself.IsInCategory(1, myself.c_ai0.occupation) == 1) {
myself.CreateOnePrivateEx(private_husk2, private_husk2_class, 0, 0, gg.FloatToInt(myself.c_ai0.x), gg.FloatToInt(myself.c_ai0.y), gg.FloatToInt(myself.c_ai0.z), 0, 0, 0, 0);

} else {
myself.CreateOnePrivateEx(private_husk3, private_husk3_class, 0, 0, gg.FloatToInt(myself.c_ai0.x), gg.FloatToInt(myself.c_ai0.y), gg.FloatToInt(myself.c_ai0.z), 0, 0, 0, 0);

}

} else if (babble_mode == 1) {
myself.Say("NPC최대 수 초과:" + gg.IntToStr(maker0.npc_count) + "/" + gg.IntToStr(maker0.maximum_npc));

}
myself.c_ai0 = gg.GetNullCreature();

}
if (skill_name_id != Skill_Obey && success == 1 && target.is_pc == 1 && target.hp <= target.max_hp * 0.100000) {
if (babble_mode == 1) {
myself.Say("오베이 시도!");

}
if (gg.Skill_IsMagic(Skill_Obey) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill_Obey) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill_Obey) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill_Obey) < myself.sm.hp && myself.Skill_InReuseDelay(Skill_Obey) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill_Obey / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, Skill_Obey, 0, 1, Maximum_Hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}
myself.SetDieEvent(target, 1, 2000);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam f0, HandlerParam f1, HandlerParam f2, HandlerParam f3, HandlerParam f4, HandlerParam s0, HandlerParam party0) {
if (script_event_arg1 == 78010068 || script_event_arg1 == 78010070) {
if (babble_mode == 1) {
myself.Say("단계 변화");

}
myself.RemoveAllAttackDesire();
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_Retain_1)) < 1 && myself.i_quest0 == 0) {
if (script_event_arg1 == 78010068) {
s0 = gg.MakeFString(1800231, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 3, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 1;
myself.AddUseSkillDesire(myself.sm, Skill_Retain_1, 1, 1, Maximum_Hate);

}

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_Retain_1)) == 1 && myself.i_quest0 == 1) {
if (script_event_arg1 == 78010068) {
s0 = gg.MakeFString(1800231, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 3, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 2;
myself.AddUseSkillDesire(myself.sm, Skill_Retain_2, 1, 1, Maximum_Hate);

} else {
s0 = gg.MakeFString(1800230, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 0;
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(Skill_Retain_1));

}

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_Retain_1)) == 2 && myself.i_quest0 == 2) {
if (script_event_arg1 == 78010068) {
s0 = gg.MakeFString(1800231, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 3, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 3;
myself.AddUseSkillDesire(myself.sm, Skill_Retain_3, 1, 1, Maximum_Hate);

} else {
s0 = gg.MakeFString(1800230, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 1;
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(Skill_Retain_1));
myself.AddUseSkillDesire(myself.sm, Skill_Retain_1, 1, 1, Maximum_Hate);

}

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_Retain_1)) == 3 && myself.i_quest0 == 3) {
if (script_event_arg1 == 78010068) {
s0 = gg.MakeFString(1800231, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 3, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 4;
myself.AddUseSkillDesire(myself.sm, Skill_Retain_4, 1, 1, Maximum_Hate);

} else {
s0 = gg.MakeFString(1800230, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 2;
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(Skill_Retain_1));
myself.AddUseSkillDesire(myself.sm, Skill_Retain_2, 1, 1, Maximum_Hate);

}

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_Retain_1)) == 4 && myself.i_quest0 == 4) {
if (script_event_arg1 == 78010068) {
s0 = gg.MakeFString(1800231, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 3, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 5;
myself.AddUseSkillDesire(myself.sm, Skill_Retain_5, 1, 1, Maximum_Hate);

} else {
s0 = gg.MakeFString(1800230, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 3;
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(Skill_Retain_1));
myself.AddUseSkillDesire(myself.sm, Skill_Retain_3, 1, 1, Maximum_Hate);

}

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_Retain_1)) == 5 && myself.i_quest0 == 5) {
if (script_event_arg1 == 78010068) {
s0 = gg.MakeFString(1800269, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 3, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 6;
myself.BroadcastScriptEventEx(78010074, 0, myself.sm.id, 6000);

} else {
s0 = gg.MakeFString(1800230, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 4;
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(Skill_Retain_1));
myself.AddUseSkillDesire(myself.sm, Skill_Retain_4, 1, 1, Maximum_Hate);

}

} else if (myself.i_quest0 == 6) {
if (script_event_arg1 == 78010070) {
s0 = gg.MakeFString(1800270, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 5;
myself.BroadcastScriptEventEx(78010074, 1, myself.sm.id, 6000);

}

}

} else if (script_event_arg1 == 78010067 && script_event_arg2 != 0 && script_event_arg2 != 1) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);
myself.int_list.Clear();
myself.i_ai2 = 0;
if (script_event_arg3 == 0) {
party0 = gg.GetPartyFromID(script_event_arg2);
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
c0 = myself.GetLeaderOfParty(party0);
s0 = gg.MakeFString(1800261, c0.name, "", "", "", "");
myself.Shout(s0);
myself.BroadcastScriptEventEx(78010074, 98, script_event_arg2, 6000);

}

} else if (script_event_arg3 == 1) {
c0 = gg.GetCreatureFromID(script_event_arg2);
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
s0 = gg.MakeFString(1800261, c0.name, "", "", "", "");
myself.Shout(s0);
myself.BroadcastScriptEventEx(78010074, 99, script_event_arg2, 6000);

}

}
myself.int_list.Add(script_event_arg2);

}
	}

	protected void DIE_SET(HandlerParam talker, HandlerParam maker0) {
if (myself.IsNullCreature(talker) == 0 && talker.alive == 0 && talker.is_pc == 1) {
if (babble_mode == 1) {
myself.Say("사망 이벤트: " + talker.name);

}
if (gg.GetAbnormalLevel(talker, myself.Skill_GetAbnormalType(387907585)) > 0) {
if (babble_mode == 1) {
myself.Say("사망 타겟 오베이 디버프 확인");

}
maker0 = myself.GetMyMaker();
if (maker0.npc_count < maker0.maximum_npc) {
if (babble_mode == 1) {
myself.Say("maxnpc 체크 통과 - 허스크 시도");

}
if (gg.Skill_IsMagic(Skill_Husk) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill_Husk) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill_Husk) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill_Husk) < myself.sm.hp && myself.Skill_InReuseDelay(Skill_Husk) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill_Husk / 65536)) + "사용");

}
myself.AddUseSkillDesire(talker, Skill_Husk, 0, 1, Maximum_Hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}
myself.c_ai0 = talker;

} else if (babble_mode == 1) {
myself.Say("maxnpc 체크 실패");

}

} else if (babble_mode == 1) {
myself.Say("사망 타겟 오베이 디버프 미확인");

}

} else if (babble_mode == 1) {
myself.Say("올바르지 않은 사망 대상");

}
	}

	protected void ATTACK_FINISHED(HandlerParam target) {
if (target.alive == 0) {
myself.RemoveHateInfoByCreature(target);
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);
if (myself.GetHateInfoCount() == 0) {
myself.LookNeighbor(300);

}

}
super;
	}


}