package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_wdragon_target extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(1001, 10);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.BroadcastScriptEvent(2316005, gg.GetIndexFromCreature(myself.sm), 4000);
myself.AddTimerEx(3000, 60 * 1000);

}
if (timer_id == 3000) {
myself.Suicide();

}
	}


}