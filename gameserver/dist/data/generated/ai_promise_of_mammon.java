package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_promise_of_mammon extends citizen {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 196) {
if (reply == 1) {
if (gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) >= 3 && gg.GetMemoState(talker, 196) < 5) {
myself.InstantZone_Enter(talker, 112, 0);

}

}

}
	}


}