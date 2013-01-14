package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class bard_casiel extends citizen {
	protected void CREATED() {
myself.AddMoveSuperPointDesire(myself.sm.name, 0, 2000);
myself.ChangeMoveType(0);
super;
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
switch (script_event_arg1) {
case 5: {
myself.Say(gg.MakeFString(1010210, "", "", "", "", ""));
break;

}
case 9: {
myself.Say(gg.MakeFString(1010211, "", "", "", "", ""));
break;

}

}
myself.AddMoveSuperPointDesire(myself.sm.name, 0, 50);
super;
	}


}