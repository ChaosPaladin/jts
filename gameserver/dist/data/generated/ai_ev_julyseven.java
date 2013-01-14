package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ev_julyseven extends citizen {
	protected int PaperPrice = 100000;
	protected String fnHi = "ev_julyseven001.htm";
	protected String GoodLuck = "ev_julyseven002.htm";
	protected String NotEnoughAdena = "ev_julyseven003.htm";

	protected void TALKED(HandlerParam talker) {
if (myself.DistFromMe(talker) < 300) {
myself.ShowPage(talker, fnHi);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -2077) {
if (reply == 1) {
if (myself.DistFromMe(talker) < 300) {
if (gg.OwnItemCount(talker, 57) >= PaperPrice) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 57, PaperPrice);
myself.GiveItem1(talker, 15381, 1);
myself.ShowPage(talker, GoodLuck);

} else {
myself.ShowPage(talker, NotEnoughAdena);

}

}

}

}
	}


}