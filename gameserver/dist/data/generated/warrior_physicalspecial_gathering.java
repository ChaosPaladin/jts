package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_physicalspecial_gathering extends warrior_physicalspecial {
	protected void CREATED() {
myself.AddTimerEx(3100, 5000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3100) {
myself.BroadcastScriptEvent(10019, gg.GetIndexFromCreature(myself.sm), 500);
myself.AddTimerEx(3100, 5000);

}
super;
	}


}