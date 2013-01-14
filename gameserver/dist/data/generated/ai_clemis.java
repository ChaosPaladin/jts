package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_clemis extends citizen {
	protected int pos_x = -180218;
	protected int pos_y = 185923;
	protected int pos_z = -10576;
	protected String fnEnterFailed = "clemis002.htm";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -415) {
if (reply == 1) {
if (talker.level > 79) {
gg.InstantTeleportEx(talker, pos_x, pos_y, pos_z, 16384);

} else {
myself.ShowPage(talker, fnEnterFailed);

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 20091023) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
myself.ChangeDir(myself.sm, c0.id, 0);

}
	}


}