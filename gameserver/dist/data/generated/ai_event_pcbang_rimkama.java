package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_pcbang_rimkama extends citizen {
	protected int event_ticket = 14765;
	protected int ticket_price = 100;
	protected String fnHi = "event_pcbang_rimkama001.htm";
	protected String NotPcCafeUser = "event_pcbang_rimkama002.htm";
	protected String NotYetTime = "event_pcbang_rimkama003.htm";
	protected String MorePoint = "event_pcbang_rimkama004.htm";

	protected void TALKED(HandlerParam talker, HandlerParam i0) {
myself.ShowPage(talker, fnHi);
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam s0) {
if (ask == 2003 && reply == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetPCCafePoint(talker) >= ticket_price) {
if (myself.IsPCCafeUser(talker) == 1) {
if (gg.GetDailyQuestFlag(talker, 993) == 1) {
myself.GiveItemByPCCafePoint(talker, ticket_price, event_ticket, 0, 1);
gg.SetDailyQuestFlag(talker, 993);

} else {
myself.ShowPage(talker, NotYetTime);

}

} else {
myself.ShowPage(talker, NotPcCafeUser);

}

} else {
myself.ShowPage(talker, MorePoint);

}

}
	}


}