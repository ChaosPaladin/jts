package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss02_teleport_cube extends instant_teleporter {
	protected void CREATED() {
myself.AddTimerEx(2001, 900000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
myself.Despawn();

}
super;
	}


}