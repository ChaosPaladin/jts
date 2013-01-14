package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class barler_annoying_pillar extends default_npc {
	protected String alarm_maker_name = "innadril22_2422_049m1";
	protected String area_name = "24_22_coral_0";

	protected void CREATED(HandlerParam i0, HandlerParam maker0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
if (myself.sm.z <= -13000) {
myself.AddTimerEx(3001, 20 * 1000);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, alarm_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12565, 0, 0);

}

} else {
myself.AddTimerEx(2001, 20 * 1000);

}
myself.Shout(gg.MakeFString(1800031, "", "", "", "", ""));
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 12567) {
myself.i_ai0 = script_event_arg2;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam s0, HandlerParam s1) {
if (timer_id == 2001) {
if (myself.sm.hp > 0) {
myself.BroadcastScriptEvent(13000, 1, 3000);

}
myself.Despawn();

} else if (timer_id == 3001) {
if (myself.sm.hp > 0) {
if (myself.i_ai0 != 0 && myself.i_ai0 <= 8) {
if (myself.i_ai0 == 1) {
i0 = 46;

} else if (myself.i_ai0 == 2) {
i0 = 45;

} else if (myself.i_ai0 == 3) {
i0 = 48;

} else if (myself.i_ai0 == 4) {
i0 = 53;

} else if (myself.i_ai0 == 5) {
i0 = 54;

} else if (myself.i_ai0 == 6) {
i0 = 55;

} else if (myself.i_ai0 == 7) {
i0 = 50;

} else if (myself.i_ai0 == 8) {
i0 = 47;

}
i1 = gg.Rand(5);
i1 = i1 + 1;
s0 = area_name + i0 + "_" + "0" + i1;
gg.Area_SetOnOffEx(s0, 1, myself.InstantZone_GetId());

}

}
myself.Despawn();

}
	}


}