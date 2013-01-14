package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss07_teleporter extends citizen {
	protected String fnNoItem = "";
	protected int ItemNeeded = 7267;
	protected int TelPosX = 0;
	protected int TelPosY = 0;
	protected int TelPosZ = 0;

	protected void CREATED(HandlerParam reply) {
if (reply == 0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.SetDBValue(myself.sm, 0);

} else {
myself.i_ai0 = myself.sm.db_value;

}
myself.i_ai4 = myself.GetCurrentTick();
myself.AddTimerEx(2002, 10000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 2002) {
if (myself.GetCurrentTick() - myself.i_ai4 > 60 * 60) {
myself.i_ai3 = myself.i_ai2;
myself.i_ai2 = myself.i_ai1;
myself.i_ai1 = myself.i_ai0;
myself.i_ai0 = 0;
myself.i_ai4 = myself.GetCurrentTick();

}
i0 = 0;
i0 = myself.i_ai3 + myself.i_ai2 + myself.i_ai1 + myself.i_ai0;
if (i0 != myself.sm.db_value) {
myself.SetDBValue(myself.sm, i0);

}
myself.AddTimerEx(2002, 10000);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == -6) {
if (gg.OwnItemCount(talker, ItemNeeded) != 0) {
myself.DeleteItem1(talker, ItemNeeded, 1);
myself.i_ai0 = myself.i_ai0 + 1;
myself.InstantTeleport(talker, TelPosX, TelPosY, TelPosZ);

} else {
myself.ShowPage(talker, fnNoItem);

}

}
	}


}