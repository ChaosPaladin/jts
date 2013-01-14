package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class henna_manager extends citizen {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -16) {
if (reply == 1) {
myself.OpenHennaItemListForEquip(talker);

} else if (reply == 2) {
myself.OpenHennaListForUnquip(talker);

}

}
	}


}