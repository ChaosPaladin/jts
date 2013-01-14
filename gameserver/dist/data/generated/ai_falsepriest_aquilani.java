package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_falsepriest_aquilani extends citizen {
	protected String fnHi1 = "falsepriest_aquilani001.htm";
	protected String fnHi2 = "falsepriest_aquilani002.htm";
	protected int PosX = 118833;
	protected int PosY = -80589;
	protected int PosZ = -2688;

	protected void TALKED(HandlerParam talker) {
if (myself.GetOneTimeQuestFlag(talker, 10288) == 0) {
myself.ShowPage(talker, "falsepriest_aquilani001.htm");

} else if (myself.GetOneTimeQuestFlag(talker, 10288) == 1) {
myself.ShowPage(talker, "falsepriest_aquilani002.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -5555) {
if (reply == 1) {
myself.InstantTeleport(talker, PosX, PosY, PosZ);

}

}
	}


}