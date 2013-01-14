package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_freya_3rd extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected int Eternal_Blizzard = 411172865;
	protected int Eternal_Blizzard_Hard = 411238401;
	protected int Eternal_Blizzard_Force = 438894593;
	protected int Ice_Ball = 411435009;
	protected int Ice_Ball_Prob = 3333;
	protected int Summon_Elemental = 411369473;
	protected int Summon_Elemental_Prob = 1333;
	protected int Self_Nova = 411500545;
	protected int Self_Nova_Prob = 1500;
	protected int Death_Clack = 411566081;
	protected int Death_Clack_Prob = 777;
	protected int Death_Clack_Count = 4;
	protected int Death_Clack_Count_Hard = 5;
	protected int Reflect_Magic = 411697153;
	protected int Reflect_Magic_Prob = 1333;
	protected int Ice_Storm = 411762689;
	protected int Ice_Storm_Prob = 1333;
	protected int Freya_Anger = 411893761;
	protected int ChangeWeapon = 15471;
	protected int TIMER_randomize_desire = 2314101;
	protected int TIMER_battle_check = 2314102;
	protected int TIMER_eternal_blizzard = 2314103;
	protected int TIMER_phase3_failed = 2314104;
	protected int TIMER_start_moving = 2314105;
	protected int TIMER_use_freya_buff = 2314106;
	protected int TIMER_enable_death_clack = 2314107;
	protected int TIMER_freya_voice_normal = 2314109;
	protected int is_hard_mode = 0;
	protected int debug_mode = 0;
	protected int Dispel_Debuff = 1;
	protected String MAKER_summoner = "schuttgart29_2314_05m1";
	protected String MAKER_controller = "schuttgart29_2314_01m1";
	protected String MAKER_ice_knight = "schuttgart29_2314_03m1";
	protected String MAKER_third_spawner = "schuttgart29_2314_hd_105m1";

	protected void CREATED(HandlerParam i0, HandlerParam maker0) {
super;
if (is_hard_mode == 0) {
myself.ChangeMoveType(0);

} else if (is_hard_mode == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_third_spawner);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
if (myself.Skill_GetConsumeMP(Freya_Anger) < myself.sm.mp && myself.Skill_GetConsumeHP(Freya_Anger) < myself.sm.hp && myself.Skill_InReuseDelay(Freya_Anger) == 0) {
myself.AddUseSkillDesire(myself.sm, Freya_Anger, 1, 1, 1000000);

}
myself.AddTimerEx(TIMER_use_freya_buff, 15 * 1000);

}
myself.SetMaxHateListSize(50);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_ai5 = 0;
myself.i_ai7 = 0;
myself.i_ai8 = 0;
myself.AddTimerEx(TIMER_start_moving, 10 * 1000);
myself.AddTimerEx(TIMER_eternal_blizzard, 50 * 1000);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140013, gg.GetIndexFromCreature(myself.sm), 0);

}
	}

	protected void NO_DESIRE() {
if (myself.i_ai1 == 1) {
if (debug_mode) {
myself.Say("전투 시작 후 no_desire");

}
myself.i_ai5 = myself.i_ai5 + 1;
if (myself.GetCurrentTick() - myself.i_ai2 > 300) {
if (debug_mode) {
myself.Shout("전투 시작 후 긴 시간 공격받지 않아 phase1 실패처리");

}
myself.i_ai1 = 2;
myself.AddTimerEx(TIMER_phase3_failed, 1);

}

} else if (myself.i_ai1 == 3) {

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam h0, HandlerParam maker0) {
if (myself.i_ai1 == 0) {
if (debug_mode) {
myself.Say("first attack");

}
myself.i_ai1 = 1;
myself.AddTimerEx(TIMER_randomize_desire, 30 * 1000);

}
if (myself.sm.hp < myself.sm.max_hp / 5.000000) {
if (myself.i_ai0 == 0) {
if (debug_mode) {
myself.Shout("low hp. phase3 성공.");

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140018, 1, 0);

}
myself.i_ai0 = 1;

}

}
if (attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id) == 1 || myself.IsInCategory(123, attacker.npc_class_id) == 1) {
myself.AddHateInfo(attacker, gg.FloatToInt(damage), 0, 1, 1);
myself.i_ai2 = myself.GetCurrentTick();
if (gg.Rand(100) < 60) {
myself.BroadcastScriptEvent(23140010, gg.GetIndexFromCreature(attacker), 4000);

}
if (attacker.yongma_type == 1 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(279052289)) <= 0) {
if (myself.Skill_GetConsumeMP(279052289) < myself.sm.mp && myself.Skill_GetConsumeHP(279052289) < myself.sm.hp && myself.Skill_InReuseDelay(279052289) == 0) {
myself.AddUseSkillDesire(attacker, 279052289, 0, 1, 1000000);

}

}
if (myself.i_ai3 == 0) {
myself.AddAttackDesire(attacker, 1, damage);
if (Ice_Ball != 458752001) {
if (gg.Rand(10000) < Ice_Ball_Prob) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(10000) < 5000) {
if (myself.Skill_GetConsumeMP(Ice_Ball) < myself.sm.mp && myself.Skill_GetConsumeHP(Ice_Ball) < myself.sm.hp && myself.Skill_InReuseDelay(Ice_Ball) == 0) {
myself.AddUseSkillDesire(attacker, Ice_Ball, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(Ice_Ball) < myself.sm.mp && myself.Skill_GetConsumeHP(Ice_Ball) < myself.sm.hp && myself.Skill_InReuseDelay(Ice_Ball) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Ice_Ball, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(Ice_Ball) < myself.sm.mp && myself.Skill_GetConsumeHP(Ice_Ball) < myself.sm.hp && myself.Skill_InReuseDelay(Ice_Ball) == 0) {
myself.AddUseSkillDesire(attacker, Ice_Ball, 0, 1, 1000000);

}

}

}
if (Summon_Elemental != 458752001) {
if (gg.Rand(10000) < Summon_Elemental_Prob) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(10000) < 5000) {
if (myself.Skill_GetConsumeMP(Summon_Elemental) < myself.sm.mp && myself.Skill_GetConsumeHP(Summon_Elemental) < myself.sm.hp && myself.Skill_InReuseDelay(Summon_Elemental) == 0) {
myself.AddUseSkillDesire(attacker, Summon_Elemental, 0, 1, 1000000);

}
myself.i_ai4 = gg.GetIndexFromCreature(attacker);

} else {
if (myself.Skill_GetConsumeMP(Summon_Elemental) < myself.sm.mp && myself.Skill_GetConsumeHP(Summon_Elemental) < myself.sm.hp && myself.Skill_InReuseDelay(Summon_Elemental) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Summon_Elemental, 0, 1, 1000000);

}
myself.i_ai4 = gg.GetIndexFromCreature(myself.top_desire_target);

}

} else {
if (myself.Skill_GetConsumeMP(Summon_Elemental) < myself.sm.mp && myself.Skill_GetConsumeHP(Summon_Elemental) < myself.sm.hp && myself.Skill_InReuseDelay(Summon_Elemental) == 0) {
myself.AddUseSkillDesire(attacker, Summon_Elemental, 0, 1, 1000000);

}
myself.i_ai4 = gg.GetIndexFromCreature(attacker);

}

}

}
if (Self_Nova != 458752001) {
if (gg.Rand(10000) < Self_Nova_Prob) {
if (myself.Skill_GetConsumeMP(Self_Nova) < myself.sm.mp && myself.Skill_GetConsumeHP(Self_Nova) < myself.sm.hp && myself.Skill_InReuseDelay(Self_Nova) == 0) {
myself.AddUseSkillDesire(myself.sm, Self_Nova, 0, 1, 1000000);

}

}

}
if (Reflect_Magic != 458752001) {
if (gg.Rand(10000) < Reflect_Magic_Prob) {
if (myself.Skill_GetConsumeMP(Reflect_Magic) < myself.sm.mp && myself.Skill_GetConsumeHP(Reflect_Magic) < myself.sm.hp && myself.Skill_InReuseDelay(Reflect_Magic) == 0) {
myself.AddUseSkillDesire(myself.sm, Reflect_Magic, 1, 1, 1000000);

}

}

}
if (Death_Clack != 458752001) {
if (gg.Rand(10000) < Death_Clack_Prob) {
if (myself.i_ai7 == 0) {
myself.i_ai7 = 1;
myself.AddTimerEx(TIMER_enable_death_clack, 15 * 1000);
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullCreature(h0.creature) == 0) {
if (debug_mode) {
myself.Say("죽음의 선고. " + h0.creature.name);

}
myself.AddUseSkillDesire(h0.creature, Death_Clack, 0, 1, 10000000);

}
if (is_hard_mode != 1) {
i0 = Death_Clack_Count;

} else {
i0 = Death_Clack_Count_Hard;

}
switch (i0) {
case 4: {
if (myself.GetHateInfoCount() >= 4) {
h0 = myself.GetNthHateInfo(0, gg.Rand(4) + 1, 0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (debug_mode) {
myself.Say("죽음의 선고. " + h0.creature.name);

}
myself.AddUseSkillDesire(h0.creature, Death_Clack, 0, 1, 10000000);

}

}
h0 = myself.GetNthHateInfo(0, gg.Rand(9) + 1, 0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (debug_mode) {
myself.Say("죽음의 선고. " + h0.creature.name);

}
myself.AddUseSkillDesire(h0.creature, Death_Clack, 0, 1, 10000000);

}

}
h0 = myself.GetNthHateInfo(0, gg.Rand(myself.GetHateInfoCount() - 1) + 1, 0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (debug_mode) {
myself.Say("죽음의 선고. " + h0.creature.name);

}
myself.AddUseSkillDesire(h0.creature, Death_Clack, 0, 1, 10000000);

}

}

}
break;

}
case 5: {
if (myself.GetHateInfoCount() >= 5) {
h0 = myself.GetNthHateInfo(0, gg.Rand(9) + 1, 0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (debug_mode) {
myself.Say("죽음의 선고. " + h0.creature.name);

}
myself.AddUseSkillDesire(h0.creature, Death_Clack, 0, 1, 10000000);

}

}
for (i1 = 0; i1 < 3; i1 = i1 + 1) {
h0 = myself.GetNthHateInfo(0, gg.Rand(myself.GetHateInfoCount() - 1) + 1, 0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (debug_mode) {
myself.Say("죽음의 선고. " + h0.creature.name);

}
myself.AddUseSkillDesire(h0.creature, Death_Clack, 0, 1, 10000000);

}

}

}

}
break;

}

}

}

}

}

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam i0, HandlerParam maker0) {
if (skill_name_id == Summon_Elemental && myself.i_ai3 == 0) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_summoner);
if (gg.IsNull(maker0) == 0) {
if (myself.IsNullCreature(target) == 0) {
gg.SendMakerScriptEvent(maker0, 23140012, gg.GetIndexFromCreature(target), gg.GetIndexFromCreature(target));

}

}

} else if (skill_name_id == Eternal_Blizzard || skill_name_id == Eternal_Blizzard_Hard || skill_name_id == Eternal_Blizzard_Force) {
if (debug_mode) {
myself.Shout("이터널 블리자드 시전 완료.");

}
myself.RemoveAbsoluteDesire();
if (gg.Rand(2) == 1) {
if (debug_mode) {
myself.Say("일반 대사 timer on");

}
myself.AddTimerEx(TIMER_freya_voice_normal, gg.Rand(15) + 10 * 1000);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id) == 1 || myself.IsInCategory(123, attacker.npc_class_id) == 1) {
myself.AddHateInfo(attacker, gg.FloatToInt(damage), 0, 1, 1);
if (myself.i_ai3 == 0) {
if (myself.IsNullCreature(victim) == 0) {
if (victim != myself.sm) {
myself.AddAttackDesire(attacker, 1, 100);

}

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai3 == 0) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1 || myself.IsInCategory(123, creature.npc_class_id) == 1) {
myself.AddHateInfo(creature, 100, 0, 1, 1);
myself.MakeAttackEvent(creature, 200, 0);

}

}
	}

	protected void SEE_SPELL(HandlerParam speller) {
if (speller.is_pc == 1 || myself.IsInCategory(12, speller.npc_class_id) == 1 || myself.IsInCategory(123, speller.npc_class_id)) {
myself.AddHateInfo(speller, 50, 0, 1, 1);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0, HandlerParam h0) {
if (script_event_arg1 == 23140046) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
gg.SendScriptEvent(c0, 23140047, gg.GetIndexFromCreature(h0.creature));

}

}

}

} else if (script_event_arg1 == 23140048) {
if (debug_mode) {
myself.Say("SCE_HOLD_DESIRE_ON");

}
myself.RemoveAllDesire();
myself.RemoveAbsoluteDesire();
myself.StopMove();
myself.i_ai3 = 1;
myself.sm.absolute_defence = 1;
myself.sm.no_attack_damage = 1;

} else if (script_event_arg1 == 23140049) {
if (debug_mode) {
myself.Say("SCE_HOLD_DESIRE_OFF");

}
gg.SetNpcParam(myself.sm, 9, myself.sm.max_hp * 0.300000);
myself.i_ai3 = 0;
myself.LookNeighbor(2000);
myself.sm.absolute_defence = 0;
myself.sm.no_attack_damage = 0;

} else if (script_event_arg1 == 23140051) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEventEx(c0, 23140052, gg.GetIndexFromCreature(myself.sm), 2314);

}

} else if (script_event_arg1 == 23140043) {
if (myself.i_ai5 > 0) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.i_ai5 = 0;
myself.AddAttackDesire(c0, 1, 1000);

}

}

} else if (script_event_arg1 == 23140020) {
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0) {
super;
if (timer_id == TIMER_randomize_desire) {
if (gg.Rand(2) == 1) {
myself.RandomizeAttackDesire();

}
myself.AddTimerEx(TIMER_randomize_desire, 30 * 1000);

}
if (timer_id == TIMER_eternal_blizzard) {
if (is_hard_mode == 1 && myself.i_ai8 == 0 && myself.sm.hp < myself.sm.max_hp * 0.800000 || myself.i_ai8 == 1 && myself.sm.hp < myself.sm.max_hp * 0.600000 || myself.i_ai8 == 2 && myself.sm.hp < myself.sm.max_hp * 0.400000 || myself.i_ai8 == 3 && myself.sm.hp < myself.sm.max_hp * 0.200000) {
myself.i_ai8 = myself.i_ai8 + 1;
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
if (myself.i_ai3 == 0) {
gg.SendMakerScriptEvent(maker0, 23140070, 1, 0);
gg.SendMakerScriptEvent(maker0, 23140067, 0, 0);

}

}
myself.AddUseSkillDesire(myself.sm, Eternal_Blizzard_Force, 0, 1, -1);
myself.AddTimerEx(TIMER_eternal_blizzard, gg.Rand(5) + 35 * 1000);

} else {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
if (myself.i_ai3 == 0) {
gg.SendMakerScriptEvent(maker0, 23140070, 0, 0);
gg.SendMakerScriptEvent(maker0, 23140067, 0, 0);

}

}
if (is_hard_mode == 1) {
if (myself.i_ai3 == 0) {
myself.AddUseSkillDesire(myself.sm, Eternal_Blizzard_Hard, 0, 1, -1);

}
myself.AddTimerEx(TIMER_eternal_blizzard, gg.Rand(5) + 35 * 1000);

} else if (myself.i_ai0 == 1) {
if (debug_mode) {
myself.Shout("P4 - 일반모드 이므로 이터널 블리자드 사용 안함.");

}

} else {
if (myself.i_ai3 == 0) {
myself.AddUseSkillDesire(myself.sm, Eternal_Blizzard, 0, 1, -1);

}
myself.AddTimerEx(TIMER_eternal_blizzard, gg.Rand(5) + 55 * 1000);

}

}

}
if (timer_id == TIMER_phase3_failed) {
if (debug_mode) {
myself.Shout("phase3 실패.");

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140018, 2, 0);

}
myself.sm.absolute_defence = 1;
myself.sm.no_attack_damage = 1;

}
if (timer_id == TIMER_start_moving) {
if (myself.i_ai1 != 1) {
myself.AddMoveToDesire(114730, -114805, -11200, 50);
myself.i_ai1 = 1;

}

}
if (timer_id == TIMER_use_freya_buff) {
myself.BroadcastScriptEvent(23140062, 0, 1000);
myself.AddTimerEx(TIMER_use_freya_buff, 15 * 1000);

}
if (timer_id == TIMER_enable_death_clack) {
myself.i_ai7 = 0;

}
if (timer_id == TIMER_freya_voice_normal) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140068, 0, 0);

}

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam maker0) {
if (debug_mode) {
myself.Shout("my_dying. PHASE4 end");

}
if (debug_mode) {
myself.Shout("inzone mark_restrict");

}
myself.InstantZone_MarkRestriction();
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140019, 1, 0);

}
	}


}