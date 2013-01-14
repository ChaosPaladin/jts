package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_march_pay_promotion extends citizen {
	protected String fnHi = "march_pay_promotion001.htm";
	protected String fnHi1 = "march_pay_promotion002.htm";
	protected String fnHi2 = "march_pay_promotion003.htm";
	protected int bracelet_fee = 100000;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 20002) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 17049) >= 1) {
myself.ShowPage(talker, fnHi1);

} else if (gg.OwnItemCount(talker, 57) >= bracelet_fee) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 17049, 1);
myself.DeleteItem1(talker, 57, bracelet_fee);

} else {
myself.ShowPage(talker, fnHi2);

}

}

}
	}


}