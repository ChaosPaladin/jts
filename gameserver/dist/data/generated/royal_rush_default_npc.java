package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_default_npc extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(3000, 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 3000) {
i0 = gg.GetDateTime(0, 4);
i1 = gg.GetDateTime(0, 5);
if (i0 == 54 && i1 == 0) {
myself.Despawn();

} else {
myself.AddTimerEx(3000, 1000);

}

}
	}


}