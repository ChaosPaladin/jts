package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_falk extends citizen {
	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (gg.OwnItemCount(talker, 9850) < 1 && gg.OwnItemCount(talker, 9851) < 1 && gg.OwnItemCount(talker, 9852) < 1) {
myself.ShowPage(talker, "falk001.htm");

} else if (gg.OwnItemCount(talker, 9850) >= 1 || gg.OwnItemCount(talker, 9851) >= 1 || gg.OwnItemCount(talker, 9852) >= 1) {
myself.ShowPage(talker, "falk001a.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -1006) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 9850) < 1 && gg.OwnItemCount(talker, 9851) < 1 && gg.OwnItemCount(talker, 9852) < 1) {
myself.ShowPage(talker, "falk002.htm");

} else if (gg.OwnItemCount(talker, 9850) >= 1 || gg.OwnItemCount(talker, 9851) >= 1 || gg.OwnItemCount(talker, 9852) >= 1) {
myself.ShowPage(talker, "falk001a.htm");

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 9850) < 1 && gg.OwnItemCount(talker, 9851) < 1 && gg.OwnItemCount(talker, 9852) < 1) {
if (gg.OwnItemCount(talker, 9674) >= 20) {
myself.GiveItem1(talker, 9850, 1);
myself.DeleteItem1(talker, 9674, 20);
myself.ShowPage(talker, "falk002a.htm");

} else {
myself.ShowPage(talker, "falk002b.htm");

}

}

}

}
	}


}