package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class single_door_keeper extends citizen {
	protected String SDoorName = "single_door_keeper_default";
	protected int close_time = -1;

	protected void CREATED() {
myself.i_ai1 = 0;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == -35) {
if (reply == 0) {
gg.Castle_GateOpenClose2(SDoorName, 0);
if (close_time != -1 && myself.i_ai1 == 0) {
myself.i_ai1 = 1;
myself.AddTimerEx(3001, close_time);

}

} else if (reply == 1) {
gg.Castle_GateOpenClose2(SDoorName, 1);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3001) {
gg.Castle_GateOpenClose2(SDoorName, 1);
myself.i_ai1 = 0;

}
super;
	}


}