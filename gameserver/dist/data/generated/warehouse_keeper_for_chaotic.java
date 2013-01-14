package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_keeper_for_chaotic extends warehouse_keeper {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}


}