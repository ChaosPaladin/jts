package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class merchant_golem_basic extends merchant_for_chaotic {
	protected void CREATED() {
myself.AddTimerEx(1030, 3 * 60 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1030) {
myself.Despawn();

}
super;
	}


}