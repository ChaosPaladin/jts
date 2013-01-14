package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_keybox extends royal_rush_default_npc {
	protected int RoomIDX = 1;

	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void TALKED(HandlerParam talker) {
if (myself.i_ai0 == 0) {
myself.GiveItem1(talker, 7260, 1);
myself.i_ai0 = 1;

}
myself.Despawn();
	}


}