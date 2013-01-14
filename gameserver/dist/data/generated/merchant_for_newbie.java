package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class merchant_for_newbie extends merchant {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -305) {
if (talker.level < 25) {
myself.ShowMultisell(201, talker);

} else {
myself.ShowPage(talker, "merchant_for_newbie001.htm");

}

}
super;
	}


}