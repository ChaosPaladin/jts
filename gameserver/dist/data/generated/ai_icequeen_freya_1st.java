package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_freya_1st extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected int Eternal_Blizzard = 411172865;
	protected int Eternal_Blizzard_Hard = 411238401;
	protected int Ice_Ball = 411435009;
	protected int Ice_Ball_Prob = 3333;
	protected int Summon_Elemental = 411369473;
	protected int Summon_Elemental_Prob = 800;
	protected int Self_Nova = 411500545;
	protected int Self_Nova_Prob = 1500;
	protected int Death_Clack = 411566081;
	protected int Death_Clack_Prob = 500;
	protected int Death_Clack_Count = 2;
	protected int Death_Clack_Count_Hard = 3;
	protected int Freya_Anger = 411893761;
	protected int ChangeWeapon = 15471;
	protected int TIMER_randomize_desire = 2314101;
	protected int TIMER_battle_check = 2314102;
	protected int TIMER_eternal_blizzard = 2314103;
	protected int TIMER_phase1_failed = 2314104;
	protected int TIMER_start_moving = 2314105;
	protected int TIMER_use_freya_buff = 2314106;
	protected int TIMER_enable_death_clack = 2314107;
	protected int TIMER_check_evade_speech = 2314108;
	protected int TIMER_freya_voice_normal = 2314109;
	protected int is_hard_mode = 0;
	protected int Dispel_Debuff = 1;
	protected int debug_mode = 0;
	protected String MAKER_summoner = "schuttgart29_2314_05m1";
	protected String MAKER_controller = "schuttgart29_2314_01m1";
	protected String MAKER_ice_knight = "schuttgart29_2314_03m1";

	protected void CREATED(HandlerParam maker0, HandlerParam i0) {
super;
if (is_hard_mode == 1) {
if (myself.Skill_GetConsumeMP(Freya_Anger) < myself.sm.mp && myself.Skill_GetConsumeHP(Freya_Anger) < myself.sm.hp && myself.Skill_InReuseDelay(Freya_Anger) == 0) {
myself.AddUseSkillDesire(myself.sm, Freya_Anger, 1, 1, 1000000);

}
myself.AddTimerEx(TIMER_start_moving, 3000);

} else {
myself.ChangeMoveType(0);

}
myself.SetMaxHateListSize(50);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_ai5 = 0;
myself.i_ai6 = 0;
myself.i_ai7 = 0;
myself.i_ai8 = 0;
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140013, gg.GetIndexFromCreature(myself.sm), 0);

}
	}

	protected void NO_DESIRE() {
if (myself.i_ai1 == 1) {
if (myself.GetCurrentTick() - myself.i_ai2 > 300) {
if (debug_mode) {
myself.Shout("전투 시작 후 긴 시간 공격받지 않아 phase1 실패처리");

}
myself.i_ai1 = 2;
myself.AddTimerEx(TIMER_phase1_failed, 1);

}

} else if (myself.i_ai1 == 3) {

}
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire, 0);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam h0, HandlerParam maker0) {
if (myself.sm.hp < myself.sm.max_hp * 0.020000) {
if (myself.i_ai6 == 0) {
myself.i_ai6 = 1;
if (myself.i_ai1 != 2) {
if (debug_mode) {
myself.Shout("my_dying. phase1 성공.");

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140016, 1, 0);

}
myself.i_ai1 = 3;

}
myself.SetVisible(0);
myself.StopMove();
myself.RemoveAllDesire();
myself.Despawn();

}

} else if (attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id) == 1 || myself.IsInCategory(123, attacker.npc_class_id) == 1) {
myself.AddHateInfo(attacker, gg.FloatToInt(damage), 0, 1, 1);
if (myself.i_ai1 == 0 && myself.i_ai3 == 0) {
if (debug_mode) {
myself.Shout("first_attack");

}
myself.AddTimerEx(TIMER_start_moving, 100);
myself.i_ai1 = 1;
myself.i_ai3 = 1;
myself.AddTimerEx(TIMER_randomize_desire, 30 * 1000);
if (is_hard_mode == 1) {
myself.AddTimerEx(TIMER_use_freya_buff, 15 * 1000);

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140014, 0, 0);

}
myself.BroadcastScriptEvent(23140010, gg.GetIndexFromCreature(attacker), 4000);

}
if (myself.i_ai5 == 0) {
myself.i_ai5 = myself.GetCurrentTick();

}
myself.i_ai2 = myself.GetCurrentTick();
if (gg.Rand(100) < 50) {
myself.BroadcastScriptEvent(23140010, gg.GetIndexFromCreature(attacker), 4000);

}
if (attacker.yongma_type == 1 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(279052289)) <= 0) {
if (myself.Skill_GetConsumeMP(279052289) < myself.sm.mp && myself.Skill_GetConsumeHP(279052289) < myself.sm.hp && myself.Skill_InReuseDelay(279052289) == 0) {
myself.AddUseSkillDesire(attacker, 279052289, 0, 1, 1000000);

}

}
if (myself.i_ai0 == 0) {
if (Ice_Ball != 458752001) {
if (gg.Rand(10000) < Ice_Ball_Prob) {
if (myself.DistFromMe(attacker) <= 800) {
if (myself.Skill_GetConsumeMP(Ice_Ball) < myself.sm.mp && myself.Skill_GetConsumeHP(Ice_Ball) < myself.sm.hp && myself.Skill_InReuseDelay(Ice_Ball) == 0) {
myself.AddUseSkillDesire(attacker, Ice_Ball, 0, 0, 1000000);

}

}

}

}
if (Summon_Elemental != 458752001) {
if (gg.Rand(10000) < Summon_Elemental_Prob) {
if (myself.DistFromMe(attacker) <= 800) {
if (myself.Skill_GetConsumeMP(Summon_Elemental) < myself.sm.mp && myself.Skill_GetConsumeHP(Summon_Elemental) < myself.sm.hp && myself.Skill_InReuseDelay(Summon_Elemental) == 0) {
myself.AddUseSkillDesire(attacker, Summon_Elemental, 0, 0, 1000000);

}
myself.i_ai4 = gg.GetIndexFromCreature(attacker);

}

}

}
if (myself.DistFromMe(attacker) < 350 || myself.GetCurrentTick() - myself.i_ai5 > 60 * 3) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.c_ai0 = attacker;
myself.AddTimerEx(TIMER_start_moving, 1);

}

}

} else if (myself.i_ai0 == 1) {
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
case 2: {
if (myself.GetHateInfoCount() >= 2) {
h0 = myself.GetNthHateInfo(0, gg.Rand(9) + 1, 0);
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
case 3: {
if (myself.GetHateInfoCount() >= 3) {
h0 = myself.GetNthHateInfo(0, gg.Rand(4) + 1, 0);
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

}

}

}

}

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam i0, HandlerParam maker0) {
if (skill_name_id == Summon_Elemental) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_summoner);
if (gg.IsNull(maker0) == 0) {
if (myself.IsNullCreature(target) == 0) {
gg.SendMakerScriptEvent(maker0, 23140012, gg.GetIndexFromCreature(target), gg.GetIndexFromCreature(target));

}

}

} else if (skill_name_id == Eternal_Blizzard || skill_name_id == Eternal_Blizzard_Hard) {
if (debug_mode) {
myself.Shout("Use Skill Finished - Eternal Blizzard");

}
myself.RemoveAbsoluteDesire();
if (myself.i_ai8 == 0) {
myself.AddTimerEx(TIMER_check_evade_speech, 10 * 1000);

} else if (gg.Rand(2) == 1) {
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
if (myself.i_ai0 == 0) {
if (gg.Rand(10000) < 500) {
if (myself.DistFromMe(attacker) <= 800) {
if (Ice_Ball != 458752001) {
if (myself.Skill_GetConsumeMP(Ice_Ball) < myself.sm.mp && myself.Skill_GetConsumeHP(Ice_Ball) < myself.sm.hp && myself.Skill_InReuseDelay(Ice_Ball) == 0) {
myself.AddUseSkillDesire(attacker, Ice_Ball, 0, 0, 1000000);

}

}

}

}
if (gg.Rand(10000) < 500) {
if (myself.DistFromMe(attacker) <= 800) {
if (Summon_Elemental != 458752001) {
if (myself.Skill_GetConsumeMP(Summon_Elemental) < myself.sm.mp && myself.Skill_GetConsumeHP(Summon_Elemental) < myself.sm.hp && myself.Skill_InReuseDelay(Summon_Elemental) == 0) {
myself.AddUseSkillDesire(attacker, Summon_Elemental, 0, 1, 1000000);

}
myself.i_ai4 = gg.GetIndexFromCreature(attacker);

}

}

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai0 == 1) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}

}
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1 || myself.IsInCategory(123, creature.npc_class_id) == 1) {
myself.AddHateInfo(creature, 100, 0, 1, 1);
myself.MakeAttackEvent(creature, 200, 0);

}
	}

	protected void SEE_SPELL(HandlerParam speller) {
if (speller.is_pc == 1 || myself.IsInCategory(12, speller.npc_class_id) == 1 || myself.IsInCategory(123, speller.npc_class_id)) {
myself.AddHateInfo(speller, 50, 0, 1, 1);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0, HandlerParam h0) {
if (script_event_arg1 == 23140044) {
myself.AddTimerEx(TIMER_start_moving, 1);

} else if (script_event_arg1 == 23140046) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
gg.SendScriptEvent(c0, 23140047, gg.GetIndexFromCreature(h0.creature));

}

}

}

} else if (script_event_arg1 == 23140020) {
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam h0) {
super;
if (timer_id == TIMER_randomize_desire) {
if (gg.Rand(2) == 1) {
myself.RandomizeAttackDesire();

}
myself.AddTimerEx(TIMER_randomize_desire, 30 * 1000);

}
if (timer_id == TIMER_eternal_blizzard) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140070, 0, 0);
gg.SendMakerScriptEvent(maker0, 23140067, 0, 0);

}
if (is_hard_mode == 1) {
if (debug_mode) {
myself.Say("하드모드 타이머");

}
myself.AddUseSkillDesire(myself.sm, Eternal_Blizzard_Hard, 0, 1, -1);
myself.AddTimerEx(TIMER_eternal_blizzard, gg.Rand(5) + 40 * 1000);

} else {
if (debug_mode) {
myself.Say("일반모드 타이머");

}
myself.AddUseSkillDesire(myself.sm, Eternal_Blizzard, 0, 1, -1);
myself.AddTimerEx(TIMER_eternal_blizzard, gg.Rand(5) + 55 * 1000);

}

}
if (timer_id == TIMER_phase1_failed) {
if (debug_mode) {
myself.Shout("phase1 실패.");

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140016, 2, 0);

}
myself.sm.absolute_defence = 1;
myself.sm.no_attack_damage = 1;

}
if (timer_id == TIMER_start_moving) {
if (myself.i_ai0 == 0) {
myself.RemoveAllDesire();
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.AddAttackDesire(myself.c_ai0, 1, 1000);

}
myself.AddMoveToDesire(114730, -114805, -11200, 50);
myself.i_ai0 = 1;
myself.AddTimerEx(TIMER_eternal_blizzard, 60 * 1000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 5, 1, 0, 0, 0, 1, 5000, 0, gg.MakeFString(1801097, "", "", "", "", ""));

}

}
if (timer_id == TIMER_use_freya_buff) {
myself.BroadcastScriptEvent(23140062, 0, 1000);
myself.AddTimerEx(TIMER_use_freya_buff, 15 * 1000);

}
if (timer_id == TIMER_enable_death_clack) {
myself.i_ai7 = 0;

}
if (timer_id == TIMER_check_evade_speech) {
if (myself.i_ai8 == 0) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(436600833)) != 2) {
if (debug_mode) {
myself.Say("이터널 블리자드 회피!");

}
myself.i_ai8 = 1;
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140066, 0, 0);

}

} else if (debug_mode) {
myself.Say("이터널 블리자드 강타!");

}

}

}

}

}
if (timer_id == TIMER_freya_voice_normal) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140068, 0, 0);

}

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam c1, HandlerParam maker0, HandlerParam i2, HandlerParam c2) {
if (myself.i_ai1 != 2) {
if (debug_mode) {
myself.Shout("my_dying. phase1 성공.");

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140016, 1, 0);

}
myself.i_ai1 = 3;

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 1) {
if (debug_mode) {
myself.Say("1 : 패배");
myself.AddTimerEx(TIMER_phase1_failed, 1000);

}

}
	}


}