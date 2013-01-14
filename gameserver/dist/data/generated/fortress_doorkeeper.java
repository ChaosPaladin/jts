package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_doorkeeper extends doorkeeper {
	protected String DoorName3 = "";
	protected String DoorName4 = "";
	protected int dominion_id = 81;

	protected void TALKED(HandlerParam talker) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 16) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnUnderSiege);

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
if (myself.IsNullString(DoorName3) == 0) {
gg.Castle_GateOpenClose2(DoorName3, 0);

}
if (myself.IsNullString(DoorName4) == 0) {
gg.Castle_GateOpenClose2(DoorName4, 0);

}
break;

}
case 2: {
gg.Castle_GateOpenClose2(DoorName1, 1);
gg.Castle_GateOpenClose2(DoorName2, 1);
if (myself.IsNullString(DoorName3) == 0) {
gg.Castle_GateOpenClose2(DoorName3, 1);

}
if (myself.IsNullString(DoorName4) == 0) {
gg.Castle_GateOpenClose2(DoorName4, 1);

}
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