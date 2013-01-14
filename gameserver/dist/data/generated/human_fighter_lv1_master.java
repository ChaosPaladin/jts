package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class human_fighter_lv1_master extends guild_master_lv1 {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -2 && reply == 1) {
if (talker.race == 0 && myself.IsInCategory(0, talker.occupation)) {
myself.ShowPage(talker, fnClassList1);

} else {
myself.ShowPage(talker, fnClassMismatch);

}

}
super;
	}


}