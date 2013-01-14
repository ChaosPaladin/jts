package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_telecube_steam_1 extends instant_teleporter {
	protected int Pos_x = 147472;
	protected int Pos_y = 152607;
	protected int Pos_z = -12192;
	protected String fnHi = "b_telecube1001.htm";
	protected String fnHi2 = "b_telecube1001a.htm";

	protected void CREATED() {
myself.AddTimerEx(2002, 1 * 60 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2002) {
myself.Despawn();

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (ask == -1005) {
if (reply == 1) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
myself.TeleportParty(party0.id, Pos_x, Pos_y, Pos_z, 2000, 0);
myself.BroadcastScriptEvent(12562, 0, 1000);

} else {
myself.ShowPage(talker, fnHi2);

}

}

}
	}


}