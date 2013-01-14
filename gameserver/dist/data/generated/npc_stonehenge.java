package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_stonehenge extends citizen {
	protected void CREATED() {
myself.AddTimerEx(5001, 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5001) {
myself.BroadcastScriptEvent(1000000, 0, 500);
myself.AddTimerEx(5001, 1000);

}
	}


}