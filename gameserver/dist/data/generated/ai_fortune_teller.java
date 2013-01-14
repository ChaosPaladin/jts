package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_fortune_teller extends citizen {
	protected int fee_for_fortune = 1000;
	protected String fnNotHaveAdena = "fortune_teller_minne004.htm";
	protected String fnFortune = "fortune_teller_minne003.htm";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1) {
if (ask == -2013 && reply == 1) {
if (gg.OwnItemCount(talker, 57) >= fee_for_fortune) {
i0 = gg.Rand(386);
i1 = 1800309 + i0;
myself.DeleteItem1(talker, 57, fee_for_fortune);
myself.FHTML_SetFileName(fhtml0, fnFortune);
myself.FHTML_SetStr(fhtml0, "fortune_number", gg.MakeFString(i1, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNotHaveAdena);

}

}
super;
	}


}