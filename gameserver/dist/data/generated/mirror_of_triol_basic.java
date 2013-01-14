package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mirror_of_triol_basic extends citizen {
	protected int PosX = 0;
	protected int PosY = 0;
	protected int PosZ = 0;

	protected void TALKED(HandlerParam talker) {
if (NoFnHi == 1) {
myself.InstantTeleport(talker, PosX, PosY, PosZ);

} else {
myself.ShowPage(talker, fnHi);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -501) {
myself.InstantTeleport(talker, PosX, PosY, PosZ);

}
super;
	}


}