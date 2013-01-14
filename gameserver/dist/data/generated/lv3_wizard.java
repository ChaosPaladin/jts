package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv3_wizard extends lv3_monster {
	protected int SummonMode = 263979009;
	protected int SummonHeal1 = 266403841;
	protected int SummonHeal2 = 266403841;
	protected int SummonEffect = 266403841;

	protected void CREATED() {
myself.i_ai0 = 5;
if (myself.Skill_GetConsumeMP(SummonMode) < myself.sm.mp && myself.Skill_GetConsumeHP(SummonMode) < myself.sm.hp && myself.Skill_InReuseDelay(SummonMode) == 0) {
myself.AddUseSkillDesire(myself.sm, SummonMode, 1, 1, 1000000);

}
myself.CreateOnePrivateEx(1027253, "allector_private", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, myself.sm.param1, myself.sm.param2, myself.sm.param3);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
if (myself.i_ai0 > 0) {
myself.CreateOnePrivateEx(1027253, "allector_private", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, myself.sm.param1, myself.sm.param2, myself.sm.param3);
if (myself.Skill_GetConsumeMP(SummonEffect) < myself.sm.mp && myself.Skill_GetConsumeHP(SummonEffect) < myself.sm.hp && myself.Skill_InReuseDelay(SummonEffect) == 0) {
myself.AddUseSkillDesire(myself.sm, SummonEffect, 1, 1, 1000000);

}
myself.i_ai0 = myself.i_ai0 - 1;

} else if (myself.Skill_GetConsumeMP(SummonMode) < myself.sm.mp && myself.Skill_GetConsumeHP(SummonMode) < myself.sm.hp && myself.Skill_InReuseDelay(SummonMode) == 0) {
myself.AddUseSkillDesire(myself.sm, SummonMode, 1, 1, 1000000);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 1000) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (gg.Rand(100) < 50) {
if (myself.Skill_GetConsumeMP(SummonHeal1) < myself.sm.mp && myself.Skill_GetConsumeHP(SummonHeal1) < myself.sm.hp && myself.Skill_InReuseDelay(SummonHeal1) == 0) {
myself.AddUseSkillDesire(c0, SummonHeal1, 1, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(SummonHeal2) < myself.sm.mp && myself.Skill_GetConsumeHP(SummonHeal2) < myself.sm.hp && myself.Skill_InReuseDelay(SummonHeal2) == 0) {
myself.AddUseSkillDesire(c0, SummonHeal2, 1, 1, 1000000);

}

}

}
	}


}