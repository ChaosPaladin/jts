package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv2_warehouse_chief extends guild_master_lv2 {
	protected int lv1_class1 = 53;
	protected int lv2_class11 = 54;
	protected int proof11 = 1642;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -2 && reply == 1) {
if (myself.IsInCategory(10, talker.occupation)) {
myself.ShowPage(talker, fnClassList1);

} else {
myself.ShowPage(talker, fnClassMismatch);

}

}
super;
	}


}