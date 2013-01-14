package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class messenger_rogin extends citizen {
	protected void CREATED() {
myself.AddMoveSuperPointDesire(myself.sm.name, 2, 2000);
myself.ChangeMoveType(1);
super;
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
switch (script_event_arg1) {
case 3: {
myself.Say(gg.MakeFString(1010215, "", "", "", "", ""));
break;

}
case 6: {
myself.Say(gg.MakeFString(1010216, "", "", "", "", ""));
break;

}
case 7: {
myself.Say(gg.MakeFString(1010217, "", "", "", "", ""));
break;

}

}
myself.AddMoveSuperPointDesire(myself.sm.name, 2, 50);
super;
	}


}