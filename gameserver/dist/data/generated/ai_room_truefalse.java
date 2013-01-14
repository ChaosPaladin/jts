package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_room_truefalse extends citizen {
	protected String d_doorname = "island_of_oracle_f";

	protected void CREATED() {
myself.BroadcastScriptEvent(12538, 0, 2000);
super;
	}

	protected void TALKED(HandlerParam talker) {
gg.Castle_GateOpenCloseEx(d_doorname, 0, myself.InstantZone_GetId());
if (gg.OwnItemCount(talker, 9690) == 0) {
myself.GiveItem1(talker, 9690, 1);

}
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam i0) {
if (ask == -1005) {
if (reply == 1) {
myself.InstantZone_Leave(talker);

}

}
	}


}