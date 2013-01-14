package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_fishing_block extends warrior_physicalspecial {
	protected int SayType = 0;

	protected void CREATED(HandlerParam i0, HandlerParam c0) {
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.summoner_id);
if (gg.IsNull(myself.c_ai0) == 0) {
myself.AddAttackDesire(myself.c_ai0, 1, 2000);
i0 = 1010400 + SayType * 9 + gg.Rand(3);
myself.Say(gg.MakeFString(i0, myself.c_ai0.name, "", "", "", ""));

} else {
myself.Despawn();

}
myself.AddTimerEx(3000, 1000 * 5 * 10);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (gg.Rand(100) < 33) {
i0 = 1010400 + 3 + SayType * 9 + gg.Rand(3);
myself.Say(gg.MakeFString(i0, "", "", "", "", ""));

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3000) {
if (myself.p_state == 3 && myself.p_state == 10) {
myself.AddTimerEx(3000, 1000 * 5 * 10);

} else {
myself.Despawn();

}

}
super;
	}

	protected void MY_DYING(HandlerParam i0) {
i0 = 1010400 + 6 + SayType * 9 + gg.Rand(3);
myself.Say(gg.MakeFString(i0, "", "", "", "", ""));
super;
	}


}