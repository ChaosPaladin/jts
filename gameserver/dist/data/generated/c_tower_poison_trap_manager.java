package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_poison_trap_manager extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(9929, 13000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 9929) {
i0 = 989001 + gg.Rand(9);
myself.BroadcastScriptEvent(88010, i0, 900);
myself.AddTimerEx(9929, 30000);

}
	}


}