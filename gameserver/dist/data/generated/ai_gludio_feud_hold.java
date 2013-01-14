package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_gludio_feud_hold extends warrior_basic {
	protected int out_of_territory_use = 1;
	protected int comeback_timer = 5;

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.Castle_GetPledgeState(creature) == 2 || myself.IsNullCreature(creature.master) == 0 && myself.Castle_GetPledgeState(creature.master) == 2) {
return;

}
super;
	}

	protected void OUT_OF_TERRITORY() {
if (out_of_territory_use == 0) {
return;

}
if (comeback_timer > 0) {
myself.AddTimerEx(3079, comeback_timer * 1000);

} else if (myself.InMyTerritory(myself.sm) != 1) {
myself.RemoveAllAttackDesire();
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 1000000);
return;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3079) {
if (out_of_territory_use == 0) {
return;

}
if (myself.InMyTerritory(myself.sm) != 1) {
myself.RemoveAllAttackDesire();
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 1000000);
return;

}

}
	}


}