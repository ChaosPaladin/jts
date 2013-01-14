package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_organ_dummy_attacker extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(1000, 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.AddAttackDesire(myself.boss, 1, 100);
myself.Despawn();

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private.class_id == 1029045) {
myself.Suicide();

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.id == myself.boss.id) {
myself.AddAttackDesire(creature, 1, 100);

}
super;
	}


}