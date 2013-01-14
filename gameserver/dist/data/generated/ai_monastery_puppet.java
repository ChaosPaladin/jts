package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_monastery_puppet extends default_npc {
	protected int TIMER = 1000;

	protected void CREATED() {
myself.AddTimerEx(TIMER, 5 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIMER) {
myself.BroadcastScriptEvent(21140014, myself.sm.id, 400);
myself.AddTimerEx(TIMER, 30 * 1000);

}
	}


}