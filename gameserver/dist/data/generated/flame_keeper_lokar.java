package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class flame_keeper_lokar extends citizen {
	protected void CREATED() {
myself.AddMoveSuperPointDesire(myself.sm.name, 0, 2000);
myself.ChangeMoveType(0);
super;
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
myself.AddMoveSuperPointDesire(myself.sm.name, 0, 50);
super;
	}


}