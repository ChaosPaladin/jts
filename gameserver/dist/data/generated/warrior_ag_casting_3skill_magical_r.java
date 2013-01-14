package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_ag_casting_3skill_magical_r extends warrior_ag_casting_3skill_magical {
	protected void CREATED(HandlerParam c0) {
if (myself.sm.param1 == 1000) {
c0 = gg.GetCreatureFromIndex(myself.sm.param2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddUseSkillDesire(c0, 305594369, 0, 1, 10000);
myself.AddAttackDesire(c0, 1, 500);

}

}
super;
super;
	}


}