package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv_check_teleporter extends teleporter {
	protected int higher_lv = -1;
	protected int lower_lv = -1;
	protected int chaotic_accept = 0;
	protected String fnYouHigher = "";
	protected String fnYouLower = "";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (chaotic_accept == 0 && talker.karma > 0) {
myself.ShowPage(talker, fnYouAreChaotic);
return;

}
if (higher_lv > 0 && talker.level >= higher_lv) {
myself.ShowPage(talker, fnYouHigher);
return;

}
if (lower_lv > 0 && talker.level <= lower_lv) {
myself.ShowPage(talker, fnYouLower);
return;

}
super;
	}


}