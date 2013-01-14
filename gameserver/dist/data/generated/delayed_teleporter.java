package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class delayed_teleporter extends citizen {
	protected String fnHi = "thi.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void CREATED() {
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
if (myself.i_ai0 == 0) {
myself.AddTimerEx(1001, 30000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {

}
super;
	}


}