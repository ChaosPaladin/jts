package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_fortress_channeler extends wizard_fortress_private {
	protected int channelling_time = 15;
	protected int channelling_dist = 100;
	protected int zen_skill_id = 0;
	protected int zen_skill_prob = 33;

	protected void CREATED() {
myself.c_ai0 = gg.GetNullCreature();
myself.AddTimerEx(1799, channelling_time * 1000);
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 1009) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.c_ai0 = c0;

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1799) {
if (myself.IsNullCreature(myself.c_ai0) == 0 && myself.IsInCombatMode(myself.sm) == 1 && myself.DistFromMe(myself.c_ai0) < channelling_dist) {
if (gg.Rand(100) < zen_skill_prob) {
gg.SendScriptEvent(myself.c_ai0, 1004, 0);
if (myself.Skill_GetConsumeMP(zen_skill_id) < myself.sm.mp && myself.Skill_GetConsumeHP(zen_skill_id) < myself.sm.hp && myself.Skill_InReuseDelay(zen_skill_id) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, zen_skill_id, 0, 1, 1000000);

}

}

}
myself.AddTimerEx(1799, channelling_time * 1000);

}
super;
	}


}