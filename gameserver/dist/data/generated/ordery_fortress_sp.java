package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ordery_fortress_sp extends ordery_fortress {
	protected int mobile_type = 0;
	protected String SuperPointName = "";
	protected int SuperPointMethod = 2;
	protected int SuperPointDesire = 50;

	protected void CREATED(HandlerParam s0) {
super;
if (myself.IsNullString(SuperPointName) == 0) {
if (mobile_type == 1) {
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMethod, SuperPointDesire);
myself.ChangeMoveType(0);

}

}
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam s0) {
if (script_event_arg3 > -1 && mobile_type == 1) {
myself.AddEffectActionDesire(myself.sm, script_event_arg3, 10, 10000000);

}
if (myself.IsNullString(SuperPointName) != 1) {
if (mobile_type == 1) {
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMethod, SuperPointDesire);

}

}
	}


}