package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_wizard_selfrange_buff extends ai_destruct_wizard {
	protected int Buff = 458752001;

	protected void CREATED() {
myself.i_ai2 = 0;
if (my_role_flag != 6) {
myself.AddTimerEx(5617, 1000);

}
super;
	}

	protected void ATTACKED() {
if (my_role_flag == 6) {
if (myself.i_ai2 == 0) {
myself.i_ai2 = 1;
myself.AddTimerEx(5617, 1000);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5617) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 0, 10000000);

}
myself.AddTimerEx(5617, 5 * 60 * 1000);

}
super;
	}


}