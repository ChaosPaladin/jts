package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_ghostmonth_manager extends default_npc {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "br_ghostmonth_manager001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0) {
if (ask == 50002) {
switch (reply) {
case 1: {
if (gg.OwnItemCount(talker, 20630) > 0) {
myself.ShowPage(talker, "br_ghostmonth_manager003.htm");

} else {
myself.GiveItem1(talker, 20630, 1);
myself.ShowPage(talker, "br_ghostmonth_manager004.htm");

}

}

}

}
	}


}