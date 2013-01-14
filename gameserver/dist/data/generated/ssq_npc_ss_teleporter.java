package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_npc_ss_teleporter extends default_npc {
	protected int SignNumber = 0;
	protected int Role = 0;
	protected int PosX = 0;
	protected int PosY = 0;
	protected int PosZ = 0;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "ss_teleporter001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == 506 && reply == 1) {
if (myself.GetSSQStatus() == 1) {
if (gg.GetSSQPart(talker) != 0) {
myself.InstantTeleport(talker, PosX, PosY, PosZ);

} else if (Role == 1) {
myself.InstantTeleport(talker, PosX, PosY, PosZ);

} else {
myself.ShowPage(talker, "ss_teleporter_q0506_01.htm");

}

} else if (myself.GetSSQStatus() == 3 || myself.GetSSQStatus() == 2) {
if (gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, "ss_teleporter_q0506_01.htm");

} else if (myself.GetSSQSealOwner(SignNumber) == 0) {
myself.InstantTeleport(talker, PosX, PosY, PosZ);

} else if (gg.GetSSQPart(talker) == myself.GetSSQSealOwner(SignNumber)) {
myself.InstantTeleport(talker, PosX, PosY, PosZ);

} else if (Role == 1) {
myself.InstantTeleport(talker, PosX, PosY, PosZ);

} else {
myself.ShowPage(talker, "ss_teleporter_q0506_02.htm");

}

} else {
myself.InstantTeleport(talker, PosX, PosY, PosZ);

}

}
super;
	}


}