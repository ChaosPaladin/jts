package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ghost_on_the_roof extends default_npc {
	protected int cursed_magic = 366542849;

	protected void CREATED() {
myself.AddTimerEx(1000, 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.LookNeighbor(450);
myself.AddTimerEx(1000, 40 * 10000);

}
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(300, 1000);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
myself.AddUseSkillDesire(creature, cursed_magic, 0, 1, 1000000);
	}


}