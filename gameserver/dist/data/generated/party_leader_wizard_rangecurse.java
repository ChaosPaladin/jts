package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_wizard_rangecurse extends party_leader_wizard_dd2 {
	protected int RangeBuff = 263979009;
	protected int DeBuff = 265224199;
	protected int DeBuffCancel = 69206028;
	protected int RangeDD = 262209537;

	protected void CREATED() {
myself.i_ai1 = 1;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.c_ai2 = myself.sm;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0) {
i0 = gg.Rand(100);
if (myself.i_ai1 == 1) {
if (myself.Skill_GetConsumeMP(RangeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(RangeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, RangeBuff, 1, 1, 1000000);

}
myself.i_ai1 = 0;

}
if (myself.i_ai3 == 0 && myself.i_ai4 == 0) {
myself.i_ai3 = 1;
myself.AddTimerEx(5001, 5000);

} else if (myself.i_ai3 == 1 && myself.i_ai4 == 0) {
myself.i_ai4 = 1;

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (i0 < 10 && myself.top_desire_target != attacker) {
if (myself.Skill_GetConsumeMP(RangeDD) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeDD) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(RangeDD) == 0) {
myself.AddUseSkillDesire(attacker, RangeDD, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, RangeDD, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim) {
super;
	}

	protected void SEE_SPELL(HandlerParam speller) {
super;
	}

	protected void MY_DYING() {
if (myself.c_ai2 != myself.sm) {
if (myself.Skill_GetConsumeMP(DeBuffCancel) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuffCancel) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(DeBuffCancel) == 0) {
myself.AddUseSkillDesire(myself.c_ai2, DeBuffCancel, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(myself.c_ai2, DeBuffCancel, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(myself.c_ai2, 1, 1000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5001) {
if (myself.i_ai3 == 1 && myself.i_ai4 == 1) {
myself.AddTimerEx(5001, 5000);
myself.i_ai4 = 0;

} else if (myself.i_ai3 == 1 && myself.i_ai4 == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, DeBuff, 0, 1, 9999999);
myself.c_ai2 = myself.top_desire_target;

}

}

}
super;
	}


}