package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_warrior_initialize_desire extends warrior_basic {
	protected int HateClassGroup = 3;
	protected double HateClassGroupBoost = 200.000000;

	protected void CREATED() {
myself.AddTimerEx(5002, 10000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 5002) {
myself.RemoveAllDesire();

}
if (timer_id == 5003) {
myself.RemoveAllDesire();
myself.LookNeighbor(600);
myself.AddTimerEx(5003, 30000);
return;

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 && myself.IsInCategory(3, creature.occupation) == 1) {
myself.AddAttackDesire(creature, 1, 1000000);

}
	}


}