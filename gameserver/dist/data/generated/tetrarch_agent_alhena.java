package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tetrarch_agent_alhena extends citizen {
	protected void CREATED() {
myself.AddMoveSuperPointDesire(myself.sm.name, 2, 2000);
myself.ChangeMoveType(0);
super;
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
switch (script_event_arg1) {
case 3: {
myself.Say(gg.MakeFString(1010212, "", "", "", "", ""));
break;

}
case 9: {
myself.Say(gg.MakeFString(1010213, "", "", "", "", ""));
break;

}

}
myself.AddMoveSuperPointDesire(myself.sm.name, 2, 50);
super;
	}


}