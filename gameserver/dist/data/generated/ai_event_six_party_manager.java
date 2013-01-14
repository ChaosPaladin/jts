package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_six_party_manager extends citizen {
	protected int PaperPrice = 1;
	protected String fnHi = "event_six_party_manager001.htm";
	protected String GoodLuck = "event_six_party_manager002.htm";
	protected String NotEnoughAdena = "event_six_party_manager003.htm";

	protected void TALKED(HandlerParam talker) {
if (myself.DistFromMe(talker) < 300) {
myself.ShowPage(talker, fnHi);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -2078) {
if (reply == 1) {
if (myself.DistFromMe(talker) < 300) {
if (gg.OwnItemCount(talker, 13419) >= PaperPrice) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 13419, PaperPrice);
myself.GiveItem1(talker, 15429, 1);
myself.ShowPage(talker, GoodLuck);

} else {
myself.ShowPage(talker, NotEnoughAdena);

}

}

}

}
	}


}