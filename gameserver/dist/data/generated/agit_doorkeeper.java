package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class agit_doorkeeper extends doorkeeper {
	protected void TALKED(HandlerParam talker) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 11) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Castle_IsUnderSiege()) {
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
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 11) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Castle_IsUnderSiege()) {
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
	}


}