package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_naiazma_keeper extends wizard_basic {
	protected int Party_Type = 1;
	protected int Party_Loyalty = 2;

	protected void CREATED(HandlerParam i0) {
myself.AddTimerEx(78001, 3 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 78001) {
if (myself.IsMyBossAlive() == 0) {
myself.Despawn();

} else {
myself.AddTimerEx(78001, 3 * 1000);

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam maker0) {
if (script_event_arg1 == 78010042) {
myself.Despawn();

}
super;
	}


}