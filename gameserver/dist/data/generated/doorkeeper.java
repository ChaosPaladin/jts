package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class doorkeeper extends citizen {
	protected String DoorName1 = "";
	protected String DoorName2 = "";
	protected String fnHi = "gludio_outter_doorman001.htm";
	protected String fnNotMyLord = "gludio_outter_doorman002.htm";
	protected String fnUnderSiege = "gludio_outter_doorman003.htm";
	protected int pos_x01 = 1;
	protected int pos_y01 = 1;
	protected int pos_z01 = 1;
	protected int pos_x02 = 1;
	protected int pos_y02 = 1;
	protected int pos_z02 = 1;
	protected int dominion_id = 81;

	protected void TALKED(HandlerParam talker) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 16) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
if (myself.IsMyLord(talker) || myself.Castle_GetPledgeState(talker) == 2 || myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnUnderSiege);

}

} else {
myself.ShowPage(talker, fnHi);

}

} else {
myself.ShowPage(talker, fnNotMyLord);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == -201) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 16) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnUnderSiege);

} else {
switch (reply) {
case 1: {
gg.Castle_GateOpenClose2(DoorName1, 0);
gg.Castle_GateOpenClose2(DoorName2, 0);
break;

}
case 2: {
gg.Castle_GateOpenClose2(DoorName1, 1);
gg.Castle_GateOpenClose2(DoorName2, 1);
break;

}

}

}

} else {
myself.ShowPage(talker, fnNotMyLord);

}

}
if (ask == -202) {
if (myself.IsMyLord(talker) || myself.Castle_GetPledgeState(talker) == 2 || myself.HavePledgePower(talker, 16) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
switch (reply) {
case 1: {
myself.InstantTeleport(talker, pos_x01, pos_y01, pos_z01);
break;

}
case 2: {
myself.InstantTeleport(talker, pos_x02, pos_y02, pos_z02);
break;

}

}

} else {
myself.ShowPage(talker, fnNotMyLord);

}

}
	}


}