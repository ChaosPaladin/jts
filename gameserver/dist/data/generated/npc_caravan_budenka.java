package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_caravan_budenka extends citizen {
	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (gg.OwnItemCount(talker, 9850) < 1 && gg.OwnItemCount(talker, 9851) < 1 && gg.OwnItemCount(talker, 9852) < 1) {
myself.ShowPage(talker, "caravan_budenka001.htm");

} else if (gg.OwnItemCount(talker, 9850) >= 1 && gg.OwnItemCount(talker, 9851) < 1 && gg.OwnItemCount(talker, 9852) < 1) {
myself.ShowPage(talker, "caravan_budenka002.htm");

} else if (gg.OwnItemCount(talker, 9851) >= 1 || gg.OwnItemCount(talker, 9852) >= 1) {
myself.ShowPage(talker, "caravan_budenka003.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -1006) {
if (reply == 1) {

}

}
	}


}