package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class human_elf_mage_lv2_master extends guild_master_lv2 {
	protected int lv1_class1 = 10;
	protected int lv1_class2 = 25;
	protected int lv2_class11 = 11;
	protected int lv2_class12 = 15;
	protected int lv2_class21 = 26;
	protected int lv2_class22 = 29;
	protected int proof11 = 1292;
	protected int proof12 = 1201;
	protected int proof21 = 1230;
	protected int proof22 = 1235;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -2 && reply == 1) {
if (myself.IsInCategory(1, talker.occupation) && talker.race == 0 || talker.race == 1) {
if (talker.race == 0) {
myself.ShowPage(talker, fnClassList1);

} else if (talker.race == 1) {
myself.ShowPage(talker, fnClassList2);

}

} else {
myself.ShowPage(talker, fnClassMismatch);

}

}
super;
	}


}