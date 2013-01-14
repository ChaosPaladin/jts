package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class human_elf_fighter_lv2_master extends guild_master_lv2 {
	protected int lv1_class1 = 0;
	protected int lv1_class2 = 18;
	protected int lv2_class11 = 1;
	protected int lv2_class12 = 4;
	protected int lv2_class13 = 7;
	protected int lv2_class21 = 19;
	protected int lv2_class22 = 22;
	protected int proof11 = 1145;
	protected int proof12 = 1161;
	protected int proof13 = 1190;
	protected int proof21 = 1204;
	protected int proof22 = 1217;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -2 && reply == 1) {
if (myself.IsInCategory(0, talker.occupation) && talker.race == 0 || talker.race == 1) {
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