package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class orc_lv2_master extends guild_master_lv2 {
	protected int lv1_class1 = 44;
	protected int lv1_class2 = 49;
	protected int lv2_class11 = 45;
	protected int lv2_class12 = 47;
	protected int lv2_class21 = 50;
	protected int proof11 = 1592;
	protected int proof12 = 1615;
	protected int proof21 = 1631;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -2 && reply == 1) {
if (talker.race == 3) {
if (myself.IsInCategory(0, talker.occupation)) {
myself.ShowPage(talker, fnClassList1);

} else if (myself.IsInCategory(1, talker.occupation)) {
myself.ShowPage(talker, fnClassList2);

}

} else {
myself.ShowPage(talker, fnClassMismatch);

}

}
super;
	}


}