package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_priest_jeina extends citizen {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 198) {
if (reply == 2) {
if (gg.HaveMemo(talker, 198) == 1 && gg.GetMemoState(talker, 198) >= 1) {
myself.ShowPage(talker, "priest_jeina_q0198_02.htm");
myself.InstantZone_Leave(talker);
myself.InstantZone_Finish(1);

}

} else if (reply == 3) {
if (gg.HaveMemo(talker, 198) == 1 && gg.GetMemoState(talker, 198) >= 1) {
myself.ShowPage(talker, "priest_jeina_q0198_02a.htm");

}

}

}
super;
	}


}