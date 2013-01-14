package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dark_elf_lv2_master extends guild_master_lv2 {
	protected int lv1_class1 = 31;
	protected int lv1_class2 = 38;
	protected int lv2_class11 = 32;
	protected int lv2_class12 = 35;
	protected int lv2_class21 = 39;
	protected int lv2_class22 = 42;
	protected int proof11 = 1244;
	protected int proof12 = 1252;
	protected int proof21 = 1261;
	protected int proof22 = 1270;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -2 && reply == 1) {
if (talker.race == 2) {
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