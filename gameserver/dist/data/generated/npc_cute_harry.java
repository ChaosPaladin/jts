package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_cute_harry extends citizen {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam c0) {
super;
if (ask == -7801 && reply == 2) {
if (myself.GetOneTimeQuestFlag(talker, 250) == 1) {
myself.ShowPage(talker, "cute_harry003.htm");

} else {
myself.ShowPage(talker, "cute_harry002.htm");

}

}
	}


}