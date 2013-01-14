package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class siege_instant_teleporter extends citizen {
	protected String fnHi = "thi.htm";
	protected String fnNotMyPledge = "";
	protected String fnNoAuthority = "noAuthority.htm";
	protected int pos_x01 = 1;
	protected int pos_y01 = 1;
	protected int pos_z01 = 1;
	protected int pos_x02 = 1;
	protected int pos_y02 = 1;
	protected int pos_z02 = 1;
	protected int pos_x03 = 1;
	protected int pos_y03 = 1;
	protected int pos_z03 = 1;
	protected int pos_x11 = 1;
	protected int pos_y11 = 1;
	protected int pos_z11 = 1;
	protected int pos_x12 = 1;
	protected int pos_y12 = 1;
	protected int pos_z12 = 1;
	protected int pos_x13 = 1;
	protected int pos_y13 = 1;
	protected int pos_z13 = 1;
	protected int pos_x21 = 1;
	protected int pos_y21 = 1;
	protected int pos_z21 = 1;
	protected int pos_x22 = 1;
	protected int pos_y22 = 1;
	protected int pos_z22 = 1;
	protected int pos_x23 = 1;
	protected int pos_y23 = 1;
	protected int pos_z23 = 1;
	protected int pos_x31 = 1;
	protected int pos_y31 = 1;
	protected int pos_z31 = 1;
	protected int pos_x32 = 1;
	protected int pos_y32 = 1;
	protected int pos_z32 = 1;
	protected int pos_x33 = 1;
	protected int pos_y33 = 1;
	protected int pos_z33 = 1;
	protected int pos_x41 = 1;
	protected int pos_y41 = 1;
	protected int pos_z41 = 1;
	protected int pos_x42 = 1;
	protected int pos_y42 = 1;
	protected int pos_z42 = 1;
	protected int pos_x43 = 1;
	protected int pos_y43 = 1;
	protected int pos_z43 = 1;
	protected int pos_x51 = 1;
	protected int pos_y51 = 1;
	protected int pos_z51 = 1;

	protected void TALKED(HandlerParam talker) {
if (myself.Castle_GetPledgeState(talker) == 2 || myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnNotMyPledge);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -5) {
if (reply == 0) {
if (gg.Rand(100) < 33) {
myself.InstantTeleport(talker, pos_x01, pos_y01, pos_z01);

} else if (gg.Rand(100) < 66) {
myself.InstantTeleport(talker, pos_x02, pos_y02, pos_z02);

} else {
myself.InstantTeleport(talker, pos_x03, pos_y03, pos_z03);

}

} else if (reply == 1) {
if (gg.Rand(100) < 33) {
myself.InstantTeleport(talker, pos_x11, pos_y11, pos_z11);

} else if (gg.Rand(100) < 66) {
myself.InstantTeleport(talker, pos_x12, pos_y12, pos_z12);

} else {
myself.InstantTeleport(talker, pos_x13, pos_y13, pos_z13);

}

} else if (reply == 2) {
if (gg.Rand(100) < 33) {
myself.InstantTeleport(talker, pos_x21, pos_y21, pos_z21);

} else if (gg.Rand(100) < 66) {
myself.InstantTeleport(talker, pos_x22, pos_y22, pos_z22);

} else {
myself.InstantTeleport(talker, pos_x23, pos_y23, pos_z23);

}

} else if (reply == 3) {
if (gg.Rand(100) < 33) {
myself.InstantTeleport(talker, pos_x31, pos_y31, pos_z31);

} else if (gg.Rand(100) < 66) {
myself.InstantTeleport(talker, pos_x32, pos_y32, pos_z32);

} else {
myself.InstantTeleport(talker, pos_x33, pos_y33, pos_z33);

}

} else if (reply == 4) {
if (gg.Rand(100) < 33) {
myself.InstantTeleport(talker, pos_x41, pos_y41, pos_z41);

} else if (gg.Rand(100) < 66) {
myself.InstantTeleport(talker, pos_x42, pos_y42, pos_z42);

} else {
myself.InstantTeleport(talker, pos_x43, pos_y43, pos_z43);

}

} else if (reply == 5) {
if (myself.IsMyLord(talker)) {
myself.InstantTeleport(talker, pos_x51, pos_y51, pos_z51);

} else {
myself.ShowPage(talker, fnNoAuthority);

}

}

}
	}


}