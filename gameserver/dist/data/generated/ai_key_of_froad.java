package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_key_of_froad extends warrior_use_skill {
	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 12528) {
myself.Despawn();

}
super;
	}

	protected void MY_DYING() {
myself.BroadcastScriptEvent(12529, 1, 6000);
myself.DropItem1(myself.sm, 9699, 1);
	}


}