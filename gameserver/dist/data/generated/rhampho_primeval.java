package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rhampho_primeval extends warrior {
	protected int SelfBuff1 = 0;
	protected int LongRangeDDMagic1 = 0;
	protected int PhysicalSpecial1 = 0;
	protected int PhysicalSpecial2 = 0;
	protected int ProbSelfBuff1 = 0;
	protected int ProbLongRangeDDMagic1 = 0;
	protected int ProbPhysicalSpecial1 = 0;
	protected int ProbPhysicalSpecial2 = 0;
	protected int mobile_type = 0;
	protected int LongRangeSkillDist = 100;
	protected int BroadCastReception = 0;
	protected int ag_type = 0;
	protected int HpChkRate4 = 50;
	protected int HpChkRate5 = 30;
	protected int ProbCond4 = 30;
	protected int ProbMultiplier1 = 2;
	protected int is_dbg = 0;

	protected void CREATED(HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": created";
myself.Say(s0);
s0 = "";

}
myself.i_ai2 = 0;
myself.i_ai3 = 1;
myself.i_ai4 = myself.GetCurrentTick();
myself.i_quest0 = 0;
super;
	}

	protected void NO_DESIRE(HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": created";
myself.Say(s0);
s0 = "";

}
if (myself.IsInCombatMode(myself.sm) == 0) {
myself.i_ai2 = 0;
myself.i_ai3 = 1;
if (mobile_type == 0) {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);

}

}
if (myself.i_quest0 == 1) {
if (myself.GetCurrentTick() - myself.i_ai4 > 60 * 10) {
myself.BroadcastScriptEvent(11051, 0, 8000);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam s0) {
myself.i_ai4 = myself.GetCurrentTick();
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": attacked" + " attacker:" + attacker.name;
myself.Say(s0);
s0 = "";

}
if (myself.sm.hp / myself.sm.max_hp * 100 <= HpChkRate4) {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + "skill prob multiplier:" + "[" + gg.IntToStr(ProbMultiplier1) + "]";
myself.Say(s0);
s0 = "";

}
myself.i_ai3 = ProbMultiplier1;

} else {
myself.i_ai3 = 1;

}
if (myself.sm.hp / myself.sm.max_hp * 100 <= HpChkRate5) {
if (myself.i_ai2 == 0) {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(SelfBuff1) + "]" + "target:" + myself.sm.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(SelfBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff1, 1, 1, 10000000);

}
myself.i_ai2 = 1;

}

}
if (myself.DistFromMe(attacker) < LongRangeSkillDist) {
if (myself.IsNullCreature(attacker) == 0) {
if (gg.Rand(100) <= ProbLongRangeDDMagic1 * myself.i_ai3) {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(LongRangeDDMagic1) + "]" + "target:" + attacker.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, LongRangeDDMagic1, 0, 1, 1000000);

}

}

}

} else if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) <= ProbLongRangeDDMagic1 * myself.i_ai3) {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(LongRangeDDMagic1) + "]" + "target:" + myself.top_desire_target.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, LongRangeDDMagic1, 0, 1, 1000000);

}

}
if (gg.Rand(100) <= ProbPhysicalSpecial1 * myself.i_ai3) {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(PhysicalSpecial1) + "]" + "target:" + myself.top_desire_target.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, PhysicalSpecial1, 0, 1, 1000000);

}

}
if (gg.Rand(100) <= ProbPhysicalSpecial2 * myself.i_ai3) {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(PhysicalSpecial2) + "]" + "target:" + myself.top_desire_target.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, PhysicalSpecial2, 0, 1, 1000000);

}

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0, HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": script_event";
myself.Say(s0);
s0 = "";

}
if (script_event_arg1 == 11049) {
myself.i_quest0 = 1;

} else if (script_event_arg1 == 10016) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0 && c0.is_pc != 0 && BroadCastReception == 1) {
if (is_dbg > 2) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": script_event::" + "replace top_desire_target as " + c0.name;
myself.Say(s0);
s0 = "";

}
myself.top_desire_target = c0;

}

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0, HandlerParam s0) {
myself.i_ai4 = myself.GetCurrentTick();
if (myself.Skill_GetEffectPoint(skill_name_id) > 0 && gg.Rand(100) <= ProbCond4) {
if (target.is_pc != 0) {
if (gg.Rand(2) == 1) {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(PhysicalSpecial1) + "]" + "target:" + speller.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesire(speller, PhysicalSpecial1, 0, 1, 1000000);

}

} else {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(PhysicalSpecial2) + "]" + "target:" + speller.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(speller, PhysicalSpecial2, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_level, HandlerParam skill_name_id, HandlerParam s0, HandlerParam i0) {
if (is_dbg > 1) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": abnormal_status_changed" + " speller:" + speller.name + ":skill_level::" + "[" + gg.IntToStr(skill_level) + "]" + ":skill_id::" + "[" + gg.IntToStr(skill_id) + "]";
myself.Say(s0);
s0 = "";

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam s0) {
myself.i_ai4 = myself.GetCurrentTick();
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": see_creature::" + "ag_type=" + "[" + gg.IntToStr(ag_type) + "]";
myself.Say(s0);
s0 = "";

}
if (ag_type == 1 && creature.is_pc != 0) {
if (myself.IsInCombatMode(myself.sm) == 0) {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(LongRangeDDMagic1) + "]" + "target:" + creature.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(creature, LongRangeDDMagic1, 0, 1, 1000000);

}

}

}
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
super;
	}


}