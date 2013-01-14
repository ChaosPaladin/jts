package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_massymore_teleporter extends default_npc {
	protected String fnHi = "";
	protected String fnUnderSiege = "";

	protected void CREATED() {
myself.i_ai0 = 1;
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam state, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam s0) {
if (reply == 79) {
if (myself.Castle_IsUnderSiege()) {
myself.ShowPage(talker, fnUnderSiege);

} else {
myself.InstantTeleport(talker, 12589, -49044, -3008);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 10101) {
myself.Shout(gg.MakeFString(1010632, "", "", "", "", ""));

}
	}


}