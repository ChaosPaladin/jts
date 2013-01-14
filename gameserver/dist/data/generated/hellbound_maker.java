package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hellbound_maker extends default_maker {
	protected void ON_START() {
myself.RegisterFieldCycleEventEx(1);
super;
	}

	protected void ON_FIELD_CYCLE_CHANGED_EVENT(HandlerParam event_id, HandlerParam state, HandlerParam i1) {
if (event_id == 1) {
if (state >= 1 && state <= 8) {

}

}
	}


}