package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_one_kill extends warrior_basic {
	protected int Death_Word = 458752001;
	protected int Real_Death_Word = 458752001;

	protected void CREATED() {
myself.c_ai4 = gg.GetNullCreature();
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1) {
myself.AddUseSkillDesire(creature, Death_Word, 0, 1, 1000000);
myself.c_ai4 = creature;
myself.AddTimerEx(5100, 30000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5100) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
myself.AddUseSkillDesire(myself.c_ai4, Death_Word, 0, 1, 1000000);

}

}
super;
	}


}