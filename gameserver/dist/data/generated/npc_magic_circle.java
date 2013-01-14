package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_magic_circle extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(1000, 10000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.BroadcastScriptEvent(2245587, gg.GetIndexFromCreature(myself.sm), 900);
myself.AddTimerEx(1000, 10000);

}
	}


}