package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_telecube_parme extends default_npc {
	protected String fnHi = "b_telecube1001.htm";
	protected String ab_course_doorname = "cyratal_cave_b";
	protected String c1_course_doorname = "cyratal_cave_a";
	protected String c2_course_doorname = "cyratal_cave_c_a";

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void TALKED(HandlerParam talker, HandlerParam party0) {
party0 = gg.GetParty(talker);
if (gg.Party_GetLeader(talker) == talker) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, "a_telecube_balor002.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam i0) {
if (ask == -1005) {
if (reply == 1) {
if (myself.i_ai0 == 0) {
gg.Castle_GateOpenCloseEx(ab_course_doorname, 0, myself.InstantZone_GetId());
myself.i_ai0 = 1;
myself.Despawn();

}

} else if (reply == 2) {
if (myself.i_ai0 == 0) {
gg.Castle_GateOpenCloseEx(c1_course_doorname, 0, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(c2_course_doorname, 0, myself.InstantZone_GetId());
myself.i_ai0 = 1;
myself.Despawn();

}

}

}
	}


}