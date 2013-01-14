package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_mainpower extends citizen {
	protected int fortress_id = 0;
	protected int barrack_id = 0;
	protected int msg_shutdown = -1;
	protected int msg_broken1 = -1;
	protected int msg_broken2 = -1;
	protected int msg_broken3 = -1;
	protected String fnNotYet = "";

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0) {
if (script_event_arg1 == 1006) {
switch (script_event_arg2) {
case 1: {
if (msg_broken1 > 0) {
myself.Shout(gg.MakeFString(msg_broken1, "", "", "", "", ""));

}
myself.i_ai0 = 1;
break;

}
case 2: {
if (msg_broken2 > 0) {
myself.Shout(gg.MakeFString(msg_broken2, "", "", "", "", ""));

}
myself.i_ai1 = 1;
break;

}
case 3: {
if (msg_broken3 > 0) {
myself.Shout(gg.MakeFString(msg_broken3, "", "", "", "", ""));

}
myself.i_ai2 = 1;
break;

}

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == -256) {
if (reply == 0) {
i0 = myself.i_ai0 * myself.i_ai1 * myself.i_ai2;
if (i0 == 1) {
if (msg_shutdown > 0) {
myself.Shout(gg.MakeFString(msg_shutdown, "", "", "", "", ""));

}
myself.Fortress_BarrackCaptured(myself.sm.id, fortress_id, barrack_id);
myself.AddTimerEx(1997, 5 * 1000);

} else {
myself.ShowPage(talker, fnNotYet);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1997) {
myself.Despawn();

}
	}


}