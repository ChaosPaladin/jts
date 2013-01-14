package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_ag_velociraptor extends party_private_ag_physicalspecial {
	protected void CREATED(HandlerParam s0) {
myself.i_ai4 = myself.GetCurrentTick();
myself.i_quest0 = 0;
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0, HandlerParam s0) {
if (script_event_arg1 == 11049) {
myself.i_quest0 = 1;

}
super;
	}

	protected void NO_DESIRE(HandlerParam maker0) {
if (myself.i_quest0 == 1) {
if (myself.GetCurrentTick() - myself.i_ai4 > 60 * 10) {
myself.BroadcastScriptEvent(11051, 0, 8000);

}

}
super;
	}


}