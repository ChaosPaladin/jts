package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_typhoon extends wizard_basic {
	protected int storm1 = 356122625;
	protected int storm2 = 356188161;

	protected void CREATED() {
myself.AddTimerEx(5621, 5000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5621) {
myself.AddUseSkillDesire(myself.sm, storm1, 1, 1, 10000000);
myself.AddTimerEx(5621, 5000);

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.IsNullCreature(creature) == 0) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id)) {
myself.AddUseSkillDesire(myself.sm, storm1, 1, 1, 10000000);

}

}
super;
	}


}