package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class elcroki_primeval extends party_leader_wizard {
	protected String ai_type1 = "orc";
	protected int silhouette1 = 1020130;
	protected String ai_type2 = "orc";
	protected int silhouette2 = 1020130;
	protected String Privates = "";
	protected int max_spawn_privates = 5;
	protected int max_concurrent_privates = 2;
	protected int SelfRangeBuff1 = 0;
	protected int SelfRangeDeBuff1 = 0;
	protected int LongRangeDDMagic1 = 0;
	protected int SelfRangeDDMagic1 = 0;
	protected int ProbSelfRangeBuff1 = 0;
	protected int ProbSelfRangeDeBuff1 = 30;
	protected int ProbLongRangeDDMagic1 = 0;
	protected int ProbSelfRangeDDMagic1 = 0;
	protected int LongRangeSkillDist = 100;
	protected int BroadCastReception = 0;
	protected int BroadCastRange = 300;
	protected int ag_type = 0;
	protected int HpChkRate2 = 80;
	protected int HpChkRate3 = 60;
	protected int HpChkRate4 = 50;
	protected int HpChkRate5 = 30;
	protected int ProbCond4 = 30;
	protected int is_dbg = 0;

	protected void CREATED(HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[L063][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": created";
myself.Say(s0);
s0 = "";

}
myself.i_quest0 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
super;
	}

	protected void NO_DESIRE(HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[L078][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": no_desire";
myself.Say(s0);
s0 = "";

}
if (myself.IsInCombatMode(myself.sm) == 0) {
if (myself.sm.hp / myself.sm.max_hp * 100 >= HpChkRate2) {
if (is_dbg > 2) {
s0 = "[L089][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": no_desire - reset innver variables";
myself.Say(s0);
s0 = "";

}
if (myself.i_ai3 > 0) {
if (is_dbg > 1) {
s0 = "[L098][DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": broadcast - @sce_private_despawn : range" + "[" + gg.IntToStr(BroadCastRange) + "]";
myself.Say(s0);
s0 = "";

}
myself.BroadcastScriptEvent(11039, 0, BroadCastRange);
myself.i_ai3 = 0;
myself.i_ai4 = 0;

}
myself.i_quest0 = 0;

}
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam s0, HandlerParam h0, HandlerParam i0, HandlerParam f0) {
if (is_dbg > 2) {
s0 = "[L117][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": attacked" + " attacker:" + attacker.name;
myself.Say(s0);
s0 = "";

}
if (myself.sm.hp / myself.sm.max_hp * 100 <= HpChkRate3) {
if (myself.i_quest0 == 0) {
if (is_dbg > 1) {
s0 = "[L130][DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(SelfRangeBuff1) + "]" + "target:" + myself.sm.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(SelfRangeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeBuff1, 0, 1, 1000000);

}

}

}
if (myself.sm.hp / myself.sm.max_hp * 100 <= HpChkRate5 && gg.Rand(100) < ProbSelfRangeDeBuff1) {
if (is_dbg > 1) {
s0 = "[L145][DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(SelfRangeDeBuff1) + "]" + "target:" + myself.sm.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(SelfRangeDeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDeBuff1) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangeDeBuff1, 0, 1, 1000000);

}

}
if (gg.Rand(100) <= ProbCond4) {
myself.BroadcastScriptEvent(10002, gg.GetIndexFromCreature(myself.sm), BroadCastRange);

}
if (is_dbg > 1) {
s0 = "[L163][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": attacked-GetHateInfo" + " attacker:" + attacker.name;
myself.Say(s0);
s0 = "";

}
super;
h0 = myself.GetMaxHateInfo(0);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.i_ai0 == 0) {
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (h0.creature == attacker) {
i0 = 1;

}

}
if (myself.DistFromMe(attacker) > LongRangeSkillDist) {
if (i0 == 1) {
if (is_dbg > 1) {
s0 = "[L187][DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(LongRangeDDMagic1) + "]" + "target:" + attacker.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangeDDMagic1) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, LongRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, LongRangeDDMagic1, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (gg.Rand(100) < 2) {
if (is_dbg > 1) {
s0 = "[L197][DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(LongRangeDDMagic1) + "]" + "target:" + attacker.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangeDDMagic1) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, LongRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, LongRangeDDMagic1, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

} else if (i0 == 1) {
if (is_dbg > 1) {
s0 = "[L210][DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(SelfRangeDDMagic1) + "]" + "target:" + myself.sm.name + "i0:" + "[" + gg.IntToStr(i0) + "]";
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangeDDMagic1, 0, 1, 1000000);

}

} else if (gg.Rand(100) < 2) {
if (is_dbg > 1) {
s0 = "[L221][DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(SelfRangeDDMagic1) + "]" + "target:" + myself.sm.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic1) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(SelfRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, SelfRangeDDMagic1, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

} else if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddAttackDesire(attacker, 1, f0 * 100);

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6, HandlerParam h0) {
myself.RemoveAllHateInfoIF(1, 0);
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.GetHateInfoCount() == 0) {
if (myself.DistFromMe(attacker) > LongRangeSkillDist) {
if (myself.Skill_GetConsumeMP(LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangeDDMagic1) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, LongRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, LongRangeDDMagic1, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(SelfRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangeDDMagic1, 0, 1, 1000000);

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6, HandlerParam h0) {
myself.RemoveAllHateInfoIF(1, 0);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.GetHateInfoCount() == 0) {
if (myself.DistFromMe(attacker) > LongRangeSkillDist) {
if (myself.Skill_GetConsumeMP(LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangeDDMagic1) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, LongRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, LongRangeDDMagic1, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(SelfRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangeDDMagic1, 0, 1, 1000000);

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
myself.i_quest0 = 1;

}
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.i_ai0 != 1) {
if (myself.DistFromMe(h0.creature) > LongRangeSkillDist) {
if (is_dbg > 1) {
s0 = "[L298][DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(LongRangeDDMagic1) + "]" + "target:" + h0.creature.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangeDDMagic1) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(h0.creature, LongRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, LongRangeDDMagic1, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

} else {
if (is_dbg > 1) {
s0 = "[L310][DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(SelfRangeDDMagic1) + "]" + "target:" + h0.creature.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(h0.creature, SelfRangeDDMagic1, 0, 1, 1000000);

}

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0, HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[L325][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": script_event";
myself.Say(s0);
s0 = "";

}
super;
	}

	protected void PARTY_DIED(HandlerParam private, HandlerParam s0, HandlerParam i0) {
if (is_dbg > 2) {
s0 = "[L337][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": PARTY_DIED::private_name" + "[" + private.name + "]";
myself.Say(s0);
s0 = "";

}
if (private != myself.sm) {
if (myself.i_ai3 > 0) {
myself.i_ai3 = myself.i_ai3 - 1;

}
if (myself.IsInCombatMode(myself.sm) == 1 && myself.i_ai3 < 2 && myself.i_ai4 < max_spawn_privates) {
if (gg.Rand(2) == 0) {
if (is_dbg > 1) {
s0 = "[L355][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": party_died::create private:" + ai_type1 + ":silhouette=" + "[" + gg.IntToStr(silhouette1) + "]";
myself.Say(s0);
s0 = "";

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {

}
myself.i_ai3 = myself.i_ai3 + 1;
myself.i_ai4 = myself.i_ai4 + 1;

} else {
if (is_dbg > 1) {
s0 = "[L367][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": party_died::create private:" + ai_type2 + ":silhouette=" + "[" + gg.IntToStr(silhouette2) + "]";
myself.Say(s0);
s0 = "";

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {

}
myself.i_ai3 = myself.i_ai3 + 1;
myself.i_ai4 = myself.i_ai4 + 1;

}

}

}
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_level, HandlerParam skill_name_id, HandlerParam s0, HandlerParam i0) {
if (is_dbg > 1) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": abnormal_status_changed" + " speller:" + speller.name + ":skill_level::" + "[" + gg.IntToStr(skill_level) + "]" + ":skill_id::" + "[" + gg.IntToStr(skill_id) + "]";
myself.Say(s0);
s0 = "";

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam s0, HandlerParam i0) {
if (is_dbg > 2) {
s0 = "[L392][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": see_creature::" + "ag_type=" + "[" + gg.IntToStr(ag_type) + "]";
myself.Say(s0);
s0 = "";

}
if (ag_type == 1 && creature.is_pc != 0) {
if (myself.InMyTerritory(myself.sm) && myself.GetHateInfoCount() == 0) {
if (gg.Rand(2) == 0 && myself.i_ai3 < 2 && myself.i_ai4 < max_spawn_privates) {
if (is_dbg > 1) {
s0 = "[L407][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": see_creature::create private:" + ai_type1 + ":silhouette=" + "[" + gg.IntToStr(silhouette1) + "]";
myself.Say(s0);
s0 = "";

}
myself.i_ai3 = myself.i_ai3 + 1;
myself.i_ai4 = myself.i_ai4 + 1;

} else if (myself.i_ai3 < 2 && myself.i_ai4 < max_spawn_privates) {
if (is_dbg > 1) {
s0 = "[L419][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": see_creature::create private:" + ai_type2 + ":silhouette=" + "[" + gg.IntToStr(silhouette2) + "]";
myself.Say(s0);
s0 = "";

}
myself.i_ai3 = myself.i_ai3 + 1;
myself.i_ai4 = myself.i_ai4 + 1;

} else if (is_dbg > 1) {
s0 = "[L431][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": see_creature::more than 2 current privates ";
myself.Say(s0);
s0 = "";

}
if (gg.Rand(2) == 0 && myself.i_ai3 < 2 && myself.i_ai4 < max_spawn_privates) {
if (is_dbg > 1) {
s0 = "[L442][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": see_creature::create private:" + ai_type1 + ":silhouette=" + "[" + gg.IntToStr(silhouette1) + "]";
myself.Say(s0);
s0 = "";

}
myself.i_ai3 = myself.i_ai3 + 1;
myself.i_ai4 = myself.i_ai4 + 1;

} else if (myself.i_ai3 < 2 && myself.i_ai4 < max_spawn_privates) {
if (is_dbg > 1) {
s0 = "[L454][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": see_creature::create private:" + ai_type2 + ":silhouette=" + "[" + gg.IntToStr(silhouette2) + "]";
myself.Say(s0);
s0 = "";

}
myself.i_ai3 = myself.i_ai3 + 1;
myself.i_ai4 = myself.i_ai4 + 1;

} else if (is_dbg > 1) {
s0 = "[L466][DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": see_creature::more than 2 current privates ";
myself.Say(s0);
s0 = "";

}
if (myself.DistFromMe(creature) > LongRangeSkillDist) {
if (is_dbg > 1) {
s0 = "[L477][DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(LongRangeDDMagic1) + "]" + "target:" + creature.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangeDDMagic1) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(creature, LongRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(creature, LongRangeDDMagic1, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(creature, 1, 1000);

}

} else {
if (is_dbg > 1) {
s0 = "[L487][DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(SelfRangeDDMagic1) + "]" + "target:" + creature.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(creature, SelfRangeDDMagic1, 0, 1, 1000000);

}

}
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
i0 = 0;
if (SeeCreatureAttackerTime == -1) {
if (SetAggressiveTime == -1) {
if (myself.GetLifeTime() >= gg.Rand(5) + 3 && myself.InMyTerritory(myself.sm)) {
i0 = 1;

}

} else if (SetAggressiveTime == 0) {
if (myself.InMyTerritory(myself.sm)) {
i0 = 1;

}

} else if (myself.GetLifeTime() > SetAggressiveTime + gg.Rand(4) && myself.InMyTerritory(myself.sm)) {
i0 = 1;

}

} else if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
i0 = 1;

}
if (myself.GetHateInfoCount() == 0 && i0 == 1) {
myself.AddHateInfo(creature, 300, 0, 1, 1);

} else {
myself.AddHateInfo(creature, 100, 0, 1, 1);

}
super;

}

}
	}


}