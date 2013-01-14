package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ex_server_trader extends citizen {
	protected String fnNotEnoughLv = "ex_server_trader002.htm";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -2023 && reply == 1) {
if (talker.level >= 52) {
myself.ShowMultisell(705, talker);

}
if (talker.level >= 40 && talker.level < 52) {
myself.ShowMultisell(704, talker);

}
if (talker.level >= 20 && talker.level < 40) {
myself.ShowMultisell(703, talker);

}
if (talker.level < 20) {
myself.ShowPage(talker, fnNotEnoughLv);

}

}
	}


}