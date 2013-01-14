package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class treekeeper_jaradine extends citizen {
	protected void CREATED() {
myself.AddMoveSuperPointDesire(myself.sm.name, 0, 2000);
myself.ChangeMoveType(0);
super;
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
switch (script_event_arg1) {
case 3: {
myself.Say(gg.MakeFString(1010208, "", "", "", "", ""));
break;

}
case 4: {
myself.Say(gg.MakeFString(1010209, "", "", "", "", ""));
break;

}

}
myself.AddMoveSuperPointDesire(myself.sm.name, 0, 50);
super;
	}


}