package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_controller_of_seal extends default_npc {
	protected void CREATED() {
myself.i_ai4 = 0;
myself.i_ai0 = 0;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam maker0, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 9274216) {
myself.i_ai4 = myself.i_ai4 + script_event_arg2;
if (myself.i_ai0 == 0) {
myself.i_ai0 = script_event_arg3;

}
if (myself.i_ai4 == 1111) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, "iz112_1724_f01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
c0 = gg.GetCreatureFromID(myself.i_ai0);
if (myself.IsNullCreature(c0) == 0) {
myself.StartScenePlayer(c0, 13);
myself.AddTimerEx(7802, 27000);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
if (timer_id == 7802) {
c0 = gg.GetCreatureFromID(myself.i_ai0);
if (myself.IsNullCreature(c0) == 0) {
myself.InstantTeleport(c0, -89556, 216119, -7488);

}

}
	}


}