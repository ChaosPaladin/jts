package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_soldier_jinbi extends zone_controller {
	protected int inzone_id1 = -1;
	protected int inzone_id2 = -1;
	protected int enter_type = 0;

	protected void TALKED(HandlerParam talker, HandlerParam i0, HandlerParam s0, HandlerParam party0, HandlerParam c0) {
myself.ShowPage(talker, fnHi);
return;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 10270) {
if (reply == 4) {
myself.i_ai0 = inzone_id1;
if (inzone_id1 > -1) {
if (gg.HaveMemo(talker, 10270) == 1 && gg.GetMemoState(talker, 10270) >= 5 && gg.GetMemoState(talker, 10270) < 20) {
myself.InstantZone_Enter(talker, myself.i_ai0, enter_type);

}

}

}

}
if (ask == 10272) {
if (reply == 4) {
myself.i_ai0 = inzone_id2;
if (inzone_id2 > -1) {
if (gg.HaveMemo(talker, 10272) == 1 && gg.GetMemoState(talker, 10272) >= 6 && gg.GetMemoState(talker, 10272) < 20) {
myself.InstantZone_Enter(talker, myself.i_ai0, enter_type);

}

}

}

}
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply) {
if (myself.i_ai0 == 117) {
if (reply == 0) {
myself.ShowPage(talker, "soldier_jinbi_q10270_09.htm");

} else if (reply == 1) {
if (gg.HaveMemo(talker, 10270) == 1 && gg.GetMemoState(talker, 10270) == 5) {
myself.SetMemoState(talker, 10270, 10);

}
myself.ShowPage(talker, "soldier_jinbi_q10270_08.htm");

}

} else if (myself.i_ai0 == 118) {
if (reply == 0) {
myself.ShowPage(talker, "soldier_jinbi_q10272_08.htm");

} else if (reply == 1) {
if (gg.HaveMemo(talker, 10272) == 1 && gg.GetMemoState(talker, 10272) == 6) {
myself.SetMemoState(talker, 10272, 10);

}
myself.ShowPage(talker, "soldier_jinbi_q10272_07.htm");

}

}
	}


}