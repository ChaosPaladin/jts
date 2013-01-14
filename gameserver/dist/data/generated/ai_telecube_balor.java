package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_telecube_balor extends default_npc {
	protected String fnHi = "";
	protected String fnHi2 = "";

	protected void CREATED() {
myself.AddTimerEx(2002, 10 * 60 * 1000);
	}

	protected void TALKED(HandlerParam talker, HandlerParam party0) {
if (gg.HaveMemo(talker, 131)) {
myself.ShowPage(talker, "telecube_balor001a.htm");

} else {
myself.ShowPage(talker, fnHi);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0) {
if (ask == -1005) {
i0 = gg.Rand(100);
if (reply == 1) {
if (i0 < 12) {
myself.InstantTeleport(talker, 153768, 142132, -9756);

} else if (i0 < 24) {
myself.InstantTeleport(talker, 153704, 142248, -9756);

} else if (i0 < 36) {
myself.InstantTeleport(talker, 153752, 141980, -9756);

} else if (i0 < 48) {
myself.InstantTeleport(talker, 153488, 141880, -9756);

} else if (i0 < 60) {
myself.InstantTeleport(talker, 153392, 141984, -9756);

} else if (i0 < 72) {
myself.InstantTeleport(talker, 153384, 142120, -9756);

} else if (i0 < 84) {
myself.InstantTeleport(talker, 153448, 142240, -9756);

} else if (i0 < 94) {
myself.InstantTeleport(talker, 153564, 142272, -9756);

} else {
myself.InstantTeleport(talker, 153636, 141872, -9756);

}

} else if (reply == 2) {
myself.InstantZone_Leave(talker);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2002) {
myself.Despawn();

}
	}


}