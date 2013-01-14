package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_daltuva extends citizen {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "daltuva001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -1006) {
if (reply == 1) {
if (myself.GetOneTimeQuestFlag(talker, 132) == 1) {
myself.InstantTeleport(talker, 17934, 283189, -9701);

} else {
myself.ShowPage(talker, "daltuva002.htm");

}

}

}
	}


}