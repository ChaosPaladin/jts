package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_move_around_fixed extends guard_move_around {
	protected void CREATED() {
myself.AddTimerEx(5001, 300000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5001) {
myself.AddTimerEx(5001, 300000);
if (myself.p_state != 3) {
myself.InstantRandomTeleportInMyTerritory();

}

}
super;
	}


}