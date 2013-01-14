package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_ghost_tolles extends default_npc {
	protected int mode = 0;
	protected String fnHi = "ghost_tolles001.htm";
	protected String fnHi2 = "ghost_tolles002.htm";
	protected String fnHi3 = "ghost_tolles003.htm";
	protected String fnNotAllowed = "ghost_tolles001f.htm";
	protected int f6_x = -12176;
	protected int f6_y = 279696;
	protected int f6_z = -13596;

	protected void CREATED() {
if (mode == 2) {
if (myself.GetGlobalMap(16) == -1 || myself.GetGlobalMap(16) == 0) {
myself.AddTimerEx(78002, 5 * 60 * 1000);

} else {
myself.Despawn();

}

} else if (mode != 3) {
myself.AddTimerEx(78001, 15 * 60 * 1000);

}
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (mode == 1) {
myself.Say(gg.MakeFString(1800135, "", "", "", "", ""));
myself.Despawn();

} else if (mode == 2) {
myself.ShowPage(talker, fnHi);

} else if (mode == 3) {
myself.ShowPage(talker, fnHi3);

} else {
myself.ShowPage(talker, fnHi2);

}
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0) {
if (ask == -7801) {
if (reply == 1) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
if (myself.DistFromMe(myself.GetLeaderOfParty(party0)) <= 3000) {
myself.TeleportParty(party0.id, f6_x, f6_y, f6_z, 6000, 0);

} else {
myself.ShowPage(talker, fnNotAllowed);

}

} else {
myself.InstantTeleport(talker, f6_x, f6_y, f6_z);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 78001) {
myself.Despawn();

} else if (timer_id == 78002) {
if (myself.GetGlobalMap(16) == -1 || myself.GetGlobalMap(16) == 0) {
myself.AddTimerEx(78002, 5 * 60 * 1000);

} else {
myself.Despawn();

}

}
	}


}