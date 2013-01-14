package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class merchant_for_chaotic extends merchant {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}


}