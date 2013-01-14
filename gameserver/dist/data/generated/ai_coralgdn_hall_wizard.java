package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_coralgdn_hall_wizard extends wizard_use_skill {
	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam maker0, HandlerParam i1, HandlerParam i2) {
if (script_event_arg1 == 12568) {
myself.i_ai0 = 1;

}
super;
	}

	protected void MY_DYING() {
if (myself.i_ai0 == 1) {
myself.DropItem1(myself.sm, 10016, 1);

}
super;
	}


}