package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_3skill_curse extends warrior_casting_3skill_magical {
	protected int DeBuff = 265224199;
	protected int DeBuffCancel = 69206028;

	protected void CREATED() {
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.c_ai2 = myself.sm;
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.i_ai3 == 0 && myself.i_ai4 == 0) {
myself.i_ai3 = 1;
myself.AddTimerEx(5001, 5000);

} else if (myself.i_ai3 == 1 && myself.i_ai4 == 0) {
myself.i_ai4 = 1;

}
super;
	}

	protected void MY_DYING() {
if (myself.c_ai2 != myself.sm) {
if (myself.Skill_GetConsumeMP(DeBuffCancel) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuffCancel) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuffCancel) == 0) {
myself.AddUseSkillDesire(myself.c_ai2, DeBuffCancel, 0, 1, 1000000);

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
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, DeBuff, 0, 1, 1000000);

}
myself.c_ai2 = myself.top_desire_target;

}

}

}
super;
	}


}