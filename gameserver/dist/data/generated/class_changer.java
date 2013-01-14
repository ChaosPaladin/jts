package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class class_changer extends default_npc {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "classchanger.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -512) {
myself.ClassChange(talker, reply);

}
super;
	}


}