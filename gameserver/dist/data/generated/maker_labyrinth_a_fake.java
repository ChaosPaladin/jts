package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_labyrinth_a_fake extends inzone_maker {
	protected void ON_START() {
myself.i_ai0 = 0;
super;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0) {
if (script_event_arg1 == 1624001) {
myself.i_ai0 = 1;

}
super;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam died, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam c0) {
if (myself.i_ai0 == 0) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, myself.name);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
	}


}