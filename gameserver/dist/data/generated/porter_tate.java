package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class porter_tate extends citizen {
	protected void CREATED() {
myself.AddMoveSuperPointDesire(myself.sm.name, 2, 2000);
myself.ChangeMoveType(0);
super;
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
switch (script_event_arg1) {
case 1: {
myself.Say(gg.MakeFString(1010218, "", "", "", "", ""));
break;

}
case 6: {
myself.Say(gg.MakeFString(1010219, "", "", "", "", ""));
break;

}
case 11: {
myself.Say(gg.MakeFString(1010220, "", "", "", "", ""));
break;

}

}
myself.AddMoveSuperPointDesire(myself.sm.name, 2, 50);
super;
	}


}