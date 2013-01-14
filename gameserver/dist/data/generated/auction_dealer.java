package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class auction_dealer extends citizen {
	protected String fnHi = "auction_dealer001.htm";
	protected String fnAgitMap = "gludio";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == -201) {
myself.FHTML_SetFileName(fhtml0, "map_agit_" + fnAgitMap + ".htm");
myself.ShowFHTML(talker, fhtml0);

}
	}


}