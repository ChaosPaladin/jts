package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class merchant_for_cgrade extends citizen {
	protected String fnHi = "black_merchant001.htm";
	protected String fnNotEnoughCrystal = "black_merchant100.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}


}