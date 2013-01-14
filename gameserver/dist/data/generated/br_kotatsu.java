package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_kotatsu extends default_npc {
	protected void CREATED() {
myself.i_ai0 = 0;
myself.AddTimerEx(5001, 1000 * 60 * 10);
if (myself.sm.in_peacezone == 0) {
myself.AddTimerEx(5002, 1000 * 5);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5001) {
myself.Despawn();

} else if (timer_id == 5002) {
if (myself.Skill_GetConsumeMP(1449525249) < myself.sm.mp && myself.Skill_GetConsumeHP(1449525249) < myself.sm.hp && myself.Skill_InReuseDelay(1449525249) == 0) {
myself.AddUseSkillDesire(myself.sm, 1449525249, 1, 1, 1000000);

}
myself.AddTimerEx(5002, 25000);
myself.AddTimerEx(5003, 1000);

} else if (timer_id == 5003) {
myself.i_ai0 = gg.Rand(100) % 4;
if (myself.i_ai0 == 0) {
myself.AddEffectActionDesire(myself.sm, 1, 10000, 1000000);

} else if (myself.i_ai0 == 1) {
myself.AddEffectActionDesire(myself.sm, 2, 10000, 1000000);

} else if (myself.i_ai0 == 2) {
myself.AddEffectActionDesire(myself.sm, 3, 10000, 1000000);

}

}
super;
	}


}