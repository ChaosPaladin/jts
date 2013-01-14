package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class agit_mass_teleporter extends citizen {
	protected int Pos_x1 = 0;
	protected int Pos_y1 = 0;
	protected int Pos_z1 = 0;
	protected int Pos_x2 = 0;
	protected int Pos_y2 = 0;
	protected int Pos_z2 = 0;
	protected String fnhi = "";
	protected int AgitID = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.c_ai0 = gg.GetNullCreature();
	}

	protected void TALKED(HandlerParam talker) {
if (myself.i_ai1 == 0) {
myself.TB_CheckMemberRegisterStatus(AgitID, talker);

} else {
myself.ShowPage(talker, "agit_mass_teleporter001.htm");

}
	}

	protected void TB_CHECK_MEMBER_REGISTER_STATUS(HandlerParam reply, HandlerParam talker, HandlerParam pledge0) {
if (reply == 1) {
myself.i_ai1 = myself.i_ai1 + 1;
if (myself.i_ai1 == 1) {
if (gg.Rand(100) < 50) {
myself.InstantTeleport(talker, Pos_x1, Pos_y1, Pos_z1);

} else {
myself.InstantTeleport(talker, Pos_x2, Pos_y2, Pos_z2);

}

}
myself.AddTimerEx(1001, 60 * 1000);

} else {
myself.ShowPage(talker, "agit_mass_teleporter002.htm");

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.i_ai1 = 0;

}
super;
	}


}