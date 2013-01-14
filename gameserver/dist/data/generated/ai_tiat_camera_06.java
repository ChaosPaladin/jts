package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_tiat_camera_06 extends default_npc {
	protected String tiat_maker_name = "rumwarsha1224_402m1";

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai0 == 0 && creature.is_pc == 1) {
myself.i_ai0 = 1;
myself.StartScenePlayerAround(myself.sm, 5, 8000, -11972, -11772);
myself.AddTimerEx(8128, 51000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam maker0) {
if (timer_id == 8128) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, tiat_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
	}


}