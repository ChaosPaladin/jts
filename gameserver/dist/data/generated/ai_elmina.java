package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_elmina extends citizen {
	protected int pos_x = -178262;
	protected int pos_y = 153430;
	protected int pos_z = 2472;

	protected void CREATED() {
myself.i_quest9 = 0;
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -415) {
if (reply == 1) {
gg.InstantTeleportEx(talker, pos_x, pos_y, pos_z, 16384);

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 20091023) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.i_quest9) {
myself.Say("아 옙!!!");

}
myself.ChangeDir(myself.sm, c0.id, 0);

}
super;
	}


}