package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_legend_orc_buff extends abstract_npc {
	protected int Skill01_ID = 408616961;
	protected int IsAggressive = 1;

	protected void CREATED() {
myself.AddTimerEx(2114005, 1000);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.IsNullCreature(creature) == 0 && creature.is_pc == 1) {
myself.AddUseSkillDesire(creature, Skill01_ID, 1, 0, 10000000);
myself.AddUseSkillDesire(creature, Skill01_ID, 1, 1, 10000000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2114005) {
myself.LookNeighbor(150);
myself.AddTimerEx(2114005, 30 * 1000);

}
	}


}