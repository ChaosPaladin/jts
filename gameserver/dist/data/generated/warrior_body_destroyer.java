package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_body_destroyer extends warrior_basic {
	protected int Death_Word = 458752001;
	protected int Real_Death_Word = 458752001;

	protected void CREATED() {
myself.i_ai2 = -1;
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 && myself.i_ai2 == -1) {
myself.AddUseSkillDesire(creature, Death_Word, 0, 1, 1000000);
myself.i_ai2 = creature.id;
myself.AddTimerEx(5100, 30000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam i0) {
if (timer_id == 5100) {
c0 = gg.GetCreatureFromID(myself.i_ai2);
if (myself.IsNullCreature(c0) == 0) {

}

}
super;
	}

	protected void MY_DYING(HandlerParam c0) {
if (myself.i_ai2 != -1) {
c0 = gg.GetCreatureFromID(myself.i_ai2);
if (myself.IsNullCreature(c0) == 0) {
myself.Dispel(c0, myself.Skill_GetAbnormalType(Death_Word));

}

}
super;
	}


}