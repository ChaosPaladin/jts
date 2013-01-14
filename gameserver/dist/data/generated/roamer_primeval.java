package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class roamer_primeval extends party_leader {
	protected int SelfRangeBuff1 = 0;
	protected int PhysicalSpecial1 = 0;
	protected int PhysicalSpecial2 = 0;
	protected int ProbSelfRangeBuff1 = 0;
	protected int ProbPhysicalSpecial1 = 0;
	protected int ProbPhysicalSpecial2 = 0;
	protected int mobile_type = 0;
	protected int BroadCastRange = 300;
	protected int BroadCastReception = 0;
	protected int ag_type = 0;
	protected int HpChkRate4 = 50;
	protected int HpChkRate5 = 30;
	protected int ProbCond5 = 20;
	protected int is_dbg = 0;

	protected void CREATED(HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": created";
myself.Say(s0);
s0 = "";

}
myself.i_ai2 = 0;
myself.i_ai3 = 1;
myself.c_ai1 = gg.GetNullCreature();
super;
	}

	protected void NO_DESIRE(HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": no_desire";
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
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam s0) {
if (attacker.class_id == 1022215 || attacker.class_id == 1022217 || attacker.class_id == 1022216) {
myself.Suicide();
return;

}
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": attacked" + " attacker:" + attacker.name;
myself.Say(s0);
s0 = "";

}
if (myself.sm.hp / myself.sm.max_hp * 100 <= HpChkRate4) {
myself.i_ai3 = 2;

} else {
myself.i_ai3 = 1;

}
if (myself.sm.hp / myself.sm.max_hp * 100 <= HpChkRate5) {
if (myself.i_ai2 == 0) {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(SelfRangeBuff1) + "]" + "target:" + myself.sm.name;
myself.Say(s0);
s0 = "";

}
myself.RemoveAllAttackDesire();
myself.c_ai1 = myself.top_desire_target;
if (myself.Skill_GetConsumeMP(SelfRangeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeBuff1, 1, 1, 10000000);

}

}

}
if (gg.Rand(100) <= ProbCond5 * myself.i_ai3) {
myself.BroadcastScriptEvent(10002, gg.GetIndexFromCreature(myself.sm), BroadCastRange);

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
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

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success, HandlerParam h0, HandlerParam i0, HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[L283][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill_finished:" + "[" + gg.IntToStr(skill_name_id) + "]";
myself.Say(s0);
s0 = "";

}
if (skill_name_id == SelfRangeBuff1 && success == 1) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(myself.c_ai1) == 0) {
if (myself.c_ai1.is_pc != 0 || myself.IsInCategory(12, myself.c_ai1.npc_class_id)) {
myself.AddAttackDesire(myself.c_ai1, 1, 1 * 100);

}
myself.c_ai1 = gg.GetNullCreature();

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

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0, HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": script_event";
myself.Say(s0);
s0 = "";

}
if (script_event_arg1 == 10016) {
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

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": see_creature::" + "ag_type=" + "[" + gg.IntToStr(ag_type) + "]";
myself.Say(s0);
s0 = "";

}
if (myself.sm.class_id == 1022743 || myself.sm.class_id == 1022742 && creature.is_pc == 1) {
if (gg.Rand(100) < 30) {
myself.RemoveAllDesire();
myself.AddFleeDesireEx(creature, 3000, 500000);
myself.i_ai4 = 1;

}
return;

}
if (ag_type == 1 && creature.is_pc != 0) {
if (gg.Rand(100) <= ProbPhysicalSpecial1 * myself.i_ai3) {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(PhysicalSpecial1) + "]" + "target:" + creature.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesire(creature, PhysicalSpecial1, 0, 1, 1000000);

}

} else if (gg.Rand(100) <= ProbPhysicalSpecial2 * myself.i_ai3) {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(PhysicalSpecial2) + "]" + "target:" + creature.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(creature, PhysicalSpecial2, 0, 1, 1000000);

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

	protected void MY_DYING(HandlerParam last_attacker) {
super;
if (gg.Rand(100) < 3 && myself.i_ai4 == 1) {
if (myself.IsNullCreature(last_attacker) == 0) {
if (myself.GetInventoryInfo(last_attacker, 0) >= myself.GetInventoryInfo(last_attacker, 1) * 0.800000 || myself.GetInventoryInfo(last_attacker, 2) >= myself.GetInventoryInfo(last_attacker, 3) * 0.800000) {
myself.ShowSystemMessageStr(last_attacker, gg.MakeFString(1800879, "", "", "", "", ""));
return;

}
myself.GetItemData(last_attacker, 14828);
myself.CreatePet(last_attacker, 14828, 1016067, 55);
myself.ShowSystemMessageStr(last_attacker, gg.MakeFString(1800878, "", "", "", "", ""));

}

}
	}


}