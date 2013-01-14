package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class plant_primeval extends warrior_hold {
	protected int SelfRangeDeBuff1 = 458752001;
	protected int ProbSelfRangeDeBuff1 = 100;
	protected int DeBuff_interval = 0;
	protected int Social1 = 1;
	protected int Social1_Frame = -1;
	protected int is_dbg = 0;

	protected void CREATED(HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": created";
myself.Say(s0);
s0 = "";

}
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": timer_id:" + "[" + gg.IntToStr(5001) + "]" + " debuff_interval:" + "[" + gg.IntToStr(DeBuff_interval) + "]";
myself.Say(s0);
s0 = "";

}
if (is_dbg > 2) {
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.AddTimerEx(5002, DeBuff_interval * 1000 / 2);

}
myself.AddTimerEx(5001, DeBuff_interval * 1000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": attacked::" + "attacker:" + attacker.name;
myself.Say(s0);
s0 = "";

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success, HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill_finished::" + "target:" + target.name + ":skill_name_id::" + "[" + gg.IntToStr(skill_name_id) + "]" + ":success::" + gg.IntToStr(skill_name_id) + "]";
myself.Say(s0);
s0 = "";

}
if (is_dbg > 1) {
myself.i_ai4 = myself.i_ai4 + 1;

}
super;
	}

	protected void SCRIPT_EVENT() {
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": timer_fired_ex::" + "timer_id" + "[" + gg.IntToStr(5001) + "]";
myself.Say(s0);
s0 = "";

}
if (timer_id == 5001) {
if (gg.Rand(100) <= ProbSelfRangeDeBuff1) {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": use_skill::" + "skill_id" + "[" + gg.IntToStr(SelfRangeDeBuff1) + "]" + "target:" + myself.sm.name;
myself.Say(s0);
s0 = "";

}
if (myself.Skill_GetConsumeMP(SelfRangeDeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDeBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDeBuff1, 0, 1, 1000000);

}
if (is_dbg > 2) {
myself.i_ai3 = myself.i_ai3 + 1;
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": timer_id:" + "[" + gg.IntToStr(5001) + "]" + " debuff_interval:" + "[" + gg.IntToStr(DeBuff_interval) + "]";
myself.Say(s0);
s0 = "";

}

}
myself.AddTimerEx(5001, DeBuff_interval * 1000);

} else if (timer_id == 5002) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": timer_id::" + "[" + gg.IntToStr(timer_id) + "]" + "debuff casting try:" + "[" + gg.IntToStr(myself.i_ai3) + "]" + "debuff casting success:" + "[" + gg.IntToStr(myself.i_ai4) + "]";
myself.Say(s0);
s0 = "";
myself.AddTimerEx(5002, DeBuff_interval * 1000 / 2);

}

}
	}


}