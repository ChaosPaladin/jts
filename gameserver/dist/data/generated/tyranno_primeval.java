package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tyranno_primeval extends warrior {
	protected int SelfBuff1 = 0;
	protected int SelfBuff2 = 0;
	protected int LongRangeDDMagic1 = 0;
	protected int PhysicalSpecial1 = 0;
	protected int PhysicalSpecial2 = 0;
	protected int PhysicalSpecial3 = 0;
	protected int ProbSelfBuff1 = 0;
	protected int ProbSelfBuff2 = 0;
	protected int ProbLongRangeDDMagic1 = 0;
	protected int ProbPhysicalSpecial1 = 0;
	protected int ProbPhysicalSpecial2 = 0;
	protected int ProbPhysicalSpecial3 = 0;
	protected int ProbTimer = 100;
	protected int DeBuff1 = 0;
	protected int DeBuff2 = 0;
	protected int Capture_a = 0;
	protected int Capture_b = 0;
	protected int Capture_c = 0;
	protected int CaptureCancel_a = 0;
	protected int CaptureCancel_b = 0;
	protected int CaptureCancel_c = 0;
	protected int CaptureCancel_all = 0;
	protected int DeBuff1Cancel = 0;
	protected int DeBuff2Cancel = 0;
	protected int mobile_type = 0;
	protected int LongRangeSkillDist = 0;
	protected int BroadCastReception = 0;
	protected int ag_type = 0;
	protected int CaptureCycle = 10;
	protected int CaptureCycleRand = 4;
	protected int CollectGhost = 0;
	protected int CollectGhostDespawnTime = 30;
	protected int HpChkRate3 = 60;
	protected int HpChkRate5 = 30;
	protected int ProbMultiplier1 = 3;
	protected int ProbMultiplier2 = 5;
	protected int Social1 = 0;
	protected int Social1_Frame = 10;
	protected int Social2 = 1;
	protected int Social2_Frame = 10;
	protected int Social3 = 2;
	protected int Social3_Frame = 10;
	protected int is_dbg = 0;
	protected int Vegetable1 = 1022200;
	protected int Vegetable2 = 1022201;
	protected int Vegetable3 = 1022202;
	protected int Vegetable4 = 1022203;
	protected int Vegetable5 = 1022204;
	protected int Vegetable6 = 1022205;
	protected int Vegetable7 = 1022224;
	protected int Vegetable8 = 1022225;
	protected int crew_skill = 404488193;
	protected int invin_buff_on = 342425601;
	protected int invin_buff_off = 359137281;

	protected void CREATED(HandlerParam s0) {
myself.i_ai1 = 0;
myself.i_ai3 = 1;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
myself.i_ai4 = myself.GetCurrentTick();
myself.i_quest2 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
if (CollectGhost == 1) {
myself.AddTimerEx(9009, CollectGhostDespawnTime * 60 * 1000);

}
myself.AddTimerEx(2017100, 30 * 1000);
myself.AddTimerEx(2017101, 1000);
	}

	protected void NO_DESIRE(HandlerParam s0) {
if (myself.IsInCombatMode(myself.sm) == 0) {
if (myself.sm.alive != 0) {
myself.i_quest0 = 0;

}
myself.i_quest1 = 0;
if (myself.i_ai3 > 1) {
if (myself.Skill_GetConsumeMP(SelfBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff1, 0, 1, 1000000);

}
myself.i_ai3 = 1;

}
if (mobile_type == 0) {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);

}

}
if (myself.i_quest2 == 1) {
if (myself.GetCurrentTick() - myself.i_ai4 > 60 * 10) {
myself.BroadcastScriptEvent(11051, 0, 8000);

}

}
super;
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_level, HandlerParam skill_name_id, HandlerParam s0, HandlerParam i0) {
i0 = skill_id - 5106;
if (skill_id == 5106 || skill_id == 5107 || skill_id == 5108) {
if (skill_level == 0) {
if (myself.i_quest0 > 0) {
if (myself.Skill_GetConsumeMP(CaptureCancel_all) < myself.sm.mp && myself.Skill_GetConsumeHP(CaptureCancel_all) < myself.sm.hp && myself.Skill_InReuseDelay(CaptureCancel_all) == 0) {
myself.AddUseSkillDesire(myself.sm, CaptureCancel_all, 1, 1, 10000000);

}
myself.AddLogByNpc(414, myself.sm, 6, 0);
if (myself.sm.alive != 0) {
myself.i_quest0 = 0;

}

}

} else if (skill_level > 0) {
if (i0 != myself.i_quest1) {
if (i0 == 0) {
if (myself.Skill_GetConsumeMP(CaptureCancel_a) < myself.sm.mp && myself.Skill_GetConsumeHP(CaptureCancel_a) < myself.sm.hp && myself.Skill_InReuseDelay(CaptureCancel_a) == 0) {
myself.AddUseSkillDesire(myself.sm, CaptureCancel_a, 1, 1, 10000000);

}
myself.c_ai0 = speller;

} else if (i0 == 1) {
if (myself.Skill_GetConsumeMP(CaptureCancel_b) < myself.sm.mp && myself.Skill_GetConsumeHP(CaptureCancel_b) < myself.sm.hp && myself.Skill_InReuseDelay(CaptureCancel_b) == 0) {
myself.AddUseSkillDesire(myself.sm, CaptureCancel_b, 1, 1, 10000000);

}
myself.c_ai0 = speller;

} else if (i0 == 2) {
if (myself.Skill_GetConsumeMP(CaptureCancel_c) < myself.sm.mp && myself.Skill_GetConsumeHP(CaptureCancel_c) < myself.sm.hp && myself.Skill_InReuseDelay(CaptureCancel_c) == 0) {
myself.AddUseSkillDesire(myself.sm, CaptureCancel_c, 1, 1, 10000000);

}
myself.c_ai0 = speller;

}

} else if (i0 == myself.i_quest1) {
if (skill_level == 1 && myself.i_quest0 == 0) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, DeBuff1, 1, 1, 1000000);

}
if (myself.sm.alive != 0) {
myself.i_quest0 = 1;

}
myself.AddLogByNpc(413, speller, 1, myself.sm.id);
myself.AddTimerEx(9001, CaptureCycle + gg.Rand(CaptureCycleRand) * 1000);

} else if (skill_level >= 2 && myself.i_quest0 >= 1) {
if (myself.Skill_GetConsumeMP(DeBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff2) == 0) {
myself.AddUseSkillDesire(myself.sm, DeBuff2, 1, 1, 1000000);

}
if (myself.sm.alive != 0) {
myself.i_quest0 = 1;

}
myself.AddLogByNpc(413, speller, 2, myself.sm.id);
myself.AddTimerEx(9001, CaptureCycle + gg.Rand(CaptureCycleRand) * 1000);

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam s0) {
if (timer_id == 9001) {
if (myself.i_quest0 > 0 && myself.IsInCombatMode(myself.sm) == 1) {
if (gg.Rand(100) < ProbTimer) {
if (myself.Skill_GetConsumeMP(CaptureCancel_all) < myself.sm.mp && myself.Skill_GetConsumeHP(CaptureCancel_all) < myself.sm.hp && myself.Skill_InReuseDelay(CaptureCancel_all) == 0) {
myself.AddUseSkillDesire(myself.sm, CaptureCancel_all, 1, 1, 10000000);

}
myself.AddLogByNpc(414, myself.sm, 2, 0);
if (myself.sm.alive != 0) {
myself.i_quest0 = 0;

}
i0 = gg.Rand(3);
if (i0 == 0) {
if (Social1_Frame > 0) {
myself.AddEffectActionDesire(myself.sm, Social1, Social1_Frame, 10000000);

}
myself.i_quest1 = i0;

} else if (i0 == 1) {
if (Social2_Frame > 0) {
myself.AddEffectActionDesire(myself.sm, Social2, Social2_Frame, 10000000);

}
myself.i_quest1 = i0;

} else if (i0 == 2) {
if (Social3_Frame > 0) {
myself.AddEffectActionDesire(myself.sm, Social3, Social3_Frame, 10000000);

}
myself.i_quest1 = i0;

}

}

}

} else if (timer_id == 9009) {
if (myself.IsInCombatMode(myself.sm) == 0) {
myself.Despawn();

} else if (CollectGhost == 1) {
myself.AddTimerEx(9009, CollectGhostDespawnTime * 60 * 1000);

}

}
if (timer_id == 9002) {
if (myself.GetCurrentTick() - myself.i_ai4 > 60 && myself.p_state != 3) {
myself.RemoveAllHateInfoIF(0, 0);
myself.BroadcastScriptEvent(11051, 0, 8000);

}
myself.AddTimerEx(9002, 5 * 60 * 1000);

}
if (timer_id == 2017098) {
myself.AddUseSkillDesire(myself.sm, invin_buff_on, 1, 1, 1000000);
myself.ChangeMoveType(1);
myself.AddTimerEx(2017013, 5 * 1000);
myself.AddTimerEx(2017099, 60 * 1000);

}
if (timer_id == 2017099) {
myself.AddUseSkillDesire(myself.sm, invin_buff_off, 1, 1, 1000000);

}
if (timer_id == 2017100) {
if (myself.IsInCombatMode(myself.sm) == 0) {
myself.LookNeighbor(1000);

}
myself.AddTimerEx(2017100, 3 * 60 * 1000);

}
if (timer_id == 2017101) {
if (myself.IsInCombatMode(myself.sm) == 1 && myself.sm.hp < myself.sm.max_hp * 0.100000) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(invin_buff_on)) <= 0) {
myself.LookNeighbor(2000);
myself.i_ai1 = 1;

}

}
myself.AddTimerEx(2017101, 10 * 1000);

}
if (timer_id == 2017012) {
if (myself.p_state != 3 && myself.p_state != 10) {
if (myself.DistFromMe(myself.c_ai2) < 800) {
myself.i_ai4 = myself.GetCurrentTick();
myself.AddAttackDesire(myself.c_ai2, 1, 200);
if (myself.Skill_GetConsumeMP(LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(myself.c_ai2, LongRangeDDMagic1, 0, 1, 1000000);

}

}

}

}
if (timer_id == 2017013) {
if (myself.IsNullCreature(myself.c_ai3) == 0) {
myself.AddAttackDesire(myself.c_ai2, 1, 500);
if (myself.Skill_GetConsumeMP(LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(myself.c_ai3, LongRangeDDMagic1, 0, 1, 1000000);

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success, HandlerParam s0) {
if (skill_name_id == crew_skill) {
myself.AddTimerEx(2017098, 4 * 1000);

}
if (myself.IsInCombatMode(myself.sm) == 1) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < HpChkRate5) {
if (skill_name_id == SelfBuff1) {
myself.i_ai3 = 1;
if (myself.IsNullCreature(myself.c_ai1) == 0) {
if (myself.c_ai1.is_pc != 0 || myself.IsInCategory(12, myself.c_ai1.npc_class_id)) {
myself.AddAttackDesire(myself.c_ai1, 1, 1 * 100);

}
myself.c_ai1 = gg.GetNullCreature();

}

} else if (skill_name_id == SelfBuff2) {
myself.i_ai3 = ProbMultiplier2;
if (myself.IsNullCreature(myself.c_ai1) == 0) {
if (myself.c_ai1.is_pc != 0 || myself.IsInCategory(12, myself.c_ai1.npc_class_id)) {
myself.AddAttackDesire(myself.c_ai1, 1, 1 * 100);

}
myself.c_ai1 = gg.GetNullCreature();

}

}

} else if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < HpChkRate3) {
if (skill_name_id == SelfBuff1) {
myself.i_ai3 = ProbMultiplier1;
if (myself.IsNullCreature(myself.c_ai1) == 0) {
if (myself.c_ai1.is_pc != 0 || myself.IsInCategory(12, myself.c_ai1.npc_class_id)) {
myself.AddAttackDesire(myself.c_ai1, 1, 1 * 100);

}
myself.c_ai1 = gg.GetNullCreature();

}

}

}

}
if (skill_name_id == CaptureCancel_a || skill_name_id == CaptureCancel_b || skill_name_id == CaptureCancel_c) {
if (success == 1 && myself.IsNullCreature(myself.c_ai0) != 1) {
myself.ShowSystemMessage(myself.c_ai0, 2002);
myself.AddLogByNpc(414, myself.sm, 5, 0);

}

}
if (target.is_pc != 0 && success == 1) {
if (skill_name_id == LongRangeDDMagic1 || skill_name_id == PhysicalSpecial1 || skill_name_id == PhysicalSpecial2 || skill_name_id == PhysicalSpecial3) {
if (gg.Rand(100) < 3) {
if (myself.Skill_GetConsumeMP(CaptureCancel_all) < myself.sm.mp && myself.Skill_GetConsumeHP(CaptureCancel_all) < myself.sm.hp && myself.Skill_InReuseDelay(CaptureCancel_all) == 0) {
myself.AddUseSkillDesire(myself.sm, CaptureCancel_all, 1, 1, 10000000);

}
myself.AddLogByNpc(414, myself.sm, 1, 0);
if (myself.sm.alive != 0) {
myself.i_quest0 = 0;

}
myself.i_quest1 = gg.Rand(3);
switch (myself.i_quest1) {
case 0: {
if (Social1_Frame > 0) {
myself.AddEffectActionDesire(myself.sm, Social1, Social1_Frame, 10000000);

}

}
case 1: {
if (Social2_Frame > 0) {
myself.AddEffectActionDesire(myself.sm, Social2, Social2_Frame, 10000000);

}

}
case 2: {
if (Social3_Frame > 0) {
myself.AddEffectActionDesire(myself.sm, Social3, Social3_Frame, 10000000);

}

}

}

}

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam s0) {
myself.i_ai4 = myself.GetCurrentTick();
if (myself.sm.hp / myself.sm.max_hp * 100 <= HpChkRate5) {
if (myself.i_ai3 == ProbMultiplier1) {
myself.RemoveAllAttackDesire();
myself.c_ai1 = myself.top_desire_target;
if (myself.Skill_GetConsumeMP(SelfBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff1, 1, 1, 10000000);

}

} else if (myself.i_ai3 == 1) {
myself.RemoveAllAttackDesire();
myself.c_ai1 = myself.top_desire_target;
if (myself.Skill_GetConsumeMP(SelfBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff2) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff2, 1, 1, 10000000);

}

}

} else if (myself.sm.hp / myself.sm.max_hp * 100 <= HpChkRate3) {
if (myself.i_ai3 == 1) {
myself.RemoveAllAttackDesire();
myself.c_ai1 = myself.top_desire_target;
if (myself.Skill_GetConsumeMP(SelfBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff1, 1, 1, 10000000);

}

}

}
if (myself.DistFromMe(attacker) > LongRangeSkillDist) {
if (myself.IsNullCreature(attacker) == 0) {
if (gg.Rand(100) <= ProbLongRangeDDMagic1 * myself.i_ai3) {
if (myself.Skill_GetConsumeMP(LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, LongRangeDDMagic1, 0, 1, 1000000);

}

}

}

} else if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target != myself.sm) {
if (gg.Rand(100) <= ProbLongRangeDDMagic1 * myself.i_ai3) {
if (myself.Skill_GetConsumeMP(LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, LongRangeDDMagic1, 0, 1, 1000000);

}

}
if (gg.Rand(100) <= ProbPhysicalSpecial1 * myself.i_ai3) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, PhysicalSpecial1, 0, 1, 1000000);

}

}
if (gg.Rand(100) <= ProbPhysicalSpecial2 * myself.i_ai3) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, PhysicalSpecial2, 0, 1, 1000000);

}

}
if (gg.Rand(100) <= ProbPhysicalSpecial3 * myself.i_ai3) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial3) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial3) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial3) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, PhysicalSpecial3, 0, 1, 1000000);

}

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0, HandlerParam s0) {
if (script_event_arg1 == 11049) {
myself.i_quest2 = 1;
myself.AddTimerEx(9002, 10 * 60 * 1000);

} else if (script_event_arg1 == 10016) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0 && c0.is_pc != 0 && BroadCastReception == 1) {
myself.top_desire_target = c0;

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam s0, HandlerParam i0) {
if (creature.is_pc == 0) {
i0 = creature.npc_class_id;
if (i0 == Vegetable1 || i0 == Vegetable2 || i0 == Vegetable3 || i0 == Vegetable4 || i0 == Vegetable5 || i0 == Vegetable6 || i0 == Vegetable7 || i0 == Vegetable8) {
myself.c_ai3 = myself.top_desire_target;
if (myself.Skill_GetConsumeMP(crew_skill) < myself.sm.mp && myself.Skill_GetConsumeHP(crew_skill) < myself.sm.hp && myself.Skill_InReuseDelay(crew_skill) == 0) {
myself.AddUseSkillDesire(creature, crew_skill, 0, 1, 1000000);

}

}

}
if (creature.is_pc == 1 && myself.IsInCombatMode(myself.sm) == 0) {
myself.c_ai2 = creature;
myself.Say("?");
myself.AddTimerEx(2017012, 6000);

}
if (myself.IsInCombatMode(myself.sm) == 1) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (SeeCreatureAttackerTime == -1) {
if (SetAggressiveTime == -1) {
if (myself.GetLifeTime() >= gg.Rand(5) + 3 && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (SetAggressiveTime == 0) {
if (myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SetAggressiveTime + gg.Rand(4) && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

}
	}

	protected void MY_DYING() {
if (myself.i_quest2 == 1) {
myself.BroadcastScriptEventEx(11044, 0, 0, 5000);

}
super;
	}


}