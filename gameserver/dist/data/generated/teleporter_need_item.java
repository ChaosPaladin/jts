package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class teleporter_need_item extends teleporter {
	protected String fnNoItem = "";
	protected int ItemNeeded = 1;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -6) {
if (gg.OwnItemCount(talker, ItemNeeded) != 0) {
myself.DeleteItem1(talker, ItemNeeded, 1);

} else {
myself.ShowPage(talker, fnNoItem);

}

}
super;
	}


}