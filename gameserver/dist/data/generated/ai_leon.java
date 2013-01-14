package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_leon extends citizen {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == 196) {
if (reply == 1) {
if (gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) >= 3) {
myself.ShowPage(talker, "guard_leon_q0196_02.htm");
myself.DeleteItem1(talker, 15310, gg.OwnItemCount(talker, 15310));
myself.InstantZone_Leave(talker);

}

}

}
	}


}