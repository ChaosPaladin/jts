package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_npc_teleporter_for_boss extends default_npc {
	protected int DawnPosX = 0;
	protected int DawnPosY = 0;
	protected int DawnPosZ = 0;
	protected int DuskPosX = 0;
	protected int DuskPosY = 0;
	protected int DuskPosZ = 0;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "spirit_gate001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (myself.GetSSQStatus() != 3) {
myself.ShowPage(talker, "spirit_gate_q0506_01.htm");

} else if (myself.GetSSQWinner() == 1 && gg.GetSSQPart(talker) == 1 && myself.GetSSQSealOwner(1) == 1) {
myself.InstantTeleport(talker, DuskPosX, DuskPosY, DuskPosZ);

} else if (myself.GetSSQWinner() == 2 && gg.GetSSQPart(talker) == 2 && myself.GetSSQSealOwner(1) == 2) {
myself.InstantTeleport(talker, DawnPosX, DawnPosY, DawnPosZ);

} else {
myself.ShowPage(talker, "spirit_gate_q0506_01.htm");

}
	}


}