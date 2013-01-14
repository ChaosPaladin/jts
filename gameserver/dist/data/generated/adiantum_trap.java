package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class adiantum_trap extends default_npc {
	protected int Skill_01 = 373882881;

	protected void CREATED() {
myself.AddTimerEx(1000, 1);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.AddUseSkillDesire(myself.sm, Skill_01, 0, 0, 5000000000);
myself.AddTimerEx(2000, 10000);

}
if (timer_id == 2000) {
myself.Suicide();

}
	}


}