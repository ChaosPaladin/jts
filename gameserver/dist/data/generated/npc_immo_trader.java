package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_immo_trader extends default_npc {
	protected int FieldCycle = 3;
	protected String fnHi = "";
	protected String fnHi2 = "trader_immortality002.htm";
	protected int multisellno1 = 647;
	protected int multisellno2 = 698;
	protected int check_item = 13692;
	protected int babble_mode = 0;

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(10, 10);
	}

	protected void TALKED(HandlerParam talker) {
if (gg.OwnItemCount(talker, check_item) >= 1) {
myself.ShowPage(talker, fnHi2);

} else {
myself.ShowPage(talker, fnHi);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == -7801) {
if (reply == 2 && gg.OwnItemCount(talker, check_item) >= 1) {
myself.ShowMultisell(multisellno2, talker);

} else if (reply == 1) {
myself.ShowMultisell(multisellno1, talker);

}

}
	}


}