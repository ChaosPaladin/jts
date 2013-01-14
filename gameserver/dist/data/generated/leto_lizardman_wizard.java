package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class leto_lizardman_wizard extends warrior_passive_casting_ddmagic {
	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(226);
if (timer_id == 22608) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(226);
myself.AddTimerEx(22608, 1000 * 200);
super;
	}


}