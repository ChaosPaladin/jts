package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_wizard_selfrange_buff_ret extends ai_destruct_wizard_ret {
	protected int Buff = 458752001;

	protected void CREATED() {
myself.i_ai2 = 0;
myself.AddTimerEx(5617, 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5617) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 10000000);

}
myself.AddTimerEx(5617, 5 * 60 * 1000);

}
super;
	}


}