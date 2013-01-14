package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv2_head_blacksmith extends guild_master_lv2 {
	protected int lv1_class1 = 53;
	protected int lv2_class11 = 56;
	protected int proof11 = 1635;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -2 && reply == 1) {
if (myself.IsInCategory(11, talker.occupation)) {
myself.ShowPage(talker, fnClassList1);

} else {
myself.ShowPage(talker, fnClassMismatch);

}

}
super;
	}


}