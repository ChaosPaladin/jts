package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class porter_remy extends citizen {
	protected void CREATED() {
myself.AddMoveSuperPointDesire(myself.sm.name, 2, 2000);
myself.ChangeMoveType(1);
myself.i_ai0 = 0;
super;
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
switch (script_event_arg1) {
case 15: {
myself.Say(gg.MakeFString(1010201, "", "", "", "", ""));
break;

}
case 3: {
myself.Say(gg.MakeFString(1010202, "", "", "", "", ""));
break;

}
case 7: {
myself.Say(gg.MakeFString(1010203, "", "", "", "", ""));
break;

}
case 12: {
myself.Say(gg.MakeFString(1010204, "", "", "", "", ""));
myself.i_ai0 = myself.i_ai0 + 1;
myself.AddTimerEx(2005, 3 * 1000);
break;

}

}
myself.AddMoveSuperPointDesire(myself.sm.name, 2, 50);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2005) {
if (myself.i_ai0 < 3) {
myself.Say(gg.MakeFString(1010204, "", "", "", "", ""));
myself.i_ai0 = myself.i_ai0 + 1;
myself.AddTimerEx(2005, 3 * 1000);

} else {
myself.i_ai0 = 0;

}

}
super;
	}


}