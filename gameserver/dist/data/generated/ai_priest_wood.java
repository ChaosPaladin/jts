package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_priest_wood extends citizen {
	protected int inzone_id1 = 113;
	protected int enter_type = 0;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0) {
if (ask == 198 && reply == 1) {
if (gg.HaveMemo(talker, 198) == 1 && gg.GetMemoState(talker, 198) >= 1 && gg.GetMemoState(talker, 198) < 3) {
myself.InstantZone_Enter(talker, inzone_id1, enter_type);

}

}
super;
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == 0) {

} else if (reply == 1) {
myself.ShowPage(talker, "priest_wood_q0198_06.htm");

}
	}


}