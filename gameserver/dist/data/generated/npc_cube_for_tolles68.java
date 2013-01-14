package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_cube_for_tolles68 extends default_npc {
	protected String fnHi = "cube_for_tolles68001.htm";
	protected String fnHi2 = "cube_for_tolles68002.htm";
	protected String fnHi3 = "cube_for_tolles68003.htm";
	protected String fnHi4 = "cube_for_tolles68004.htm";
	protected int mode = 0;
	protected String maker6f = "gludio58_1926_600m1";
	protected String maker8f = "gludio58_1926_800m1";
	protected int f6_x = -12176;
	protected int f6_y = 279696;
	protected int f6_z = -13596;
	protected int f8_x = -12176;
	protected int f8_y = 279696;
	protected int f8_z = -10492;
	protected int f_top_x = 21935;
	protected int f_top_y = 243923;
	protected int f_top_z = 11088;

	protected void CREATED() {
if (mode == 3) {
myself.AddTimerEx(78001, 10 * 60 * 1000);

}
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (mode == 1) {
myself.ShowPage(talker, fnHi);

} else if (mode == 2) {
myself.ShowPage(talker, fnHi2);

} else {
myself.ShowPage(talker, fnHi3);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam c0) {
if (ask == -7801) {
if (reply == 1) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
if (myself.DistFromMe(myself.GetLeaderOfParty(party0)) <= 3000) {
myself.TeleportParty(party0.id, f8_x, f8_y, f8_z, 2000, 0);

} else {
myself.ShowPage(talker, fnHi4);

}

} else {
myself.InstantTeleport(talker, f8_x, f8_y, f8_z);

}

} else if (reply == 2) {
if (myself.GetGlobalMap(12) == -1) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
if (myself.DistFromMe(myself.GetLeaderOfParty(party0)) <= 3000) {
myself.TeleportParty(party0.id, f_top_x, f_top_y, f_top_z, 6000, 0);

} else {
myself.ShowPage(talker, fnHi4);

}

} else {
myself.InstantTeleport(talker, f_top_x, f_top_y, f_top_z);

}

} else if (myself.GetGlobalMap(12) != -1) {
c0 = gg.GetCreatureFromID(myself.GetGlobalMap(12));
if (myself.IsNullCreature(c0) == 0 && c0.db_value == 0) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
if (myself.DistFromMe(myself.GetLeaderOfParty(party0)) <= 3000) {
myself.TeleportParty(party0.id, f_top_x, f_top_y, f_top_z, 6000, 0);

} else {
myself.ShowPage(talker, fnHi4);

}

} else {
myself.InstantTeleport(talker, f_top_x, f_top_y, f_top_z);

}

}

} else {
myself.ShowPage(talker, fnHi4);

}

} else if (reply == 3) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
if (myself.DistFromMe(myself.GetLeaderOfParty(party0)) <= 3000) {
myself.TeleportParty(party0.id, f6_x, f6_y, f6_z, 6000, 0);

} else {
myself.ShowPage(talker, fnHi4);

}

} else {
myself.InstantTeleport(talker, f6_x, f6_y, f6_z);

}

} else {
myself.ShowPage(talker, fnHi4);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 78001) {
myself.InstantTeleportInMyTerritory(f8_x, f8_y, f8_z, 500);
myself.Despawn();

}
	}


}