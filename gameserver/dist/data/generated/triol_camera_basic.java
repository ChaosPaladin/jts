package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class triol_camera_basic extends default_npc {
	protected String DoorName = "triol_camera_basic_default";

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 3) {
myself.EffectMusic(myself.sm, 30 * 1000, "BS04_A");
myself.i_ai0 = script_event_arg2;
myself.AddTimerEx(1001, 1 * 1000);

} else if (script_event_arg1 == 4) {

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.SpecialCamera(myself.sm, 1500, 88, 89, 0, 5000, 10000, 0, 110, 1, 0, 1);
myself.AddTimerEx(1002, 300);

} else if (timer_id == 1002) {
myself.SpecialCamera(myself.sm, 1500, 88, 89, 0, 5000, 10000, 0, 110, 1, 0, 1);
myself.AddTimerEx(1003, 300);

} else if (timer_id == 1003) {
myself.SpecialCamera(myself.sm, 450, 88, 3, 5500, 5000, 10000, 0, 350, 1, 0, 1);
myself.AddTimerEx(1004, 9400);

} else if (timer_id == 1004) {
myself.SpecialCamera(myself.sm, 500, 88, 4, 5000, 5000, 10000, 0, 0, 1, 0, 1);
myself.AddTimerEx(1005, 5000);

} else if (timer_id == 1005) {
myself.SpecialCamera(myself.sm, 3000, 88, 4, 6000, 5000, 6900, 0, 15, 1, 0, 1);
myself.AddTimerEx(1006, 6000);

} else if (timer_id == 1006) {
if (myself.i_ai0 != 0) {
myself.BroadcastScriptEvent(4, myself.i_ai0, 4000);

}

}
	}


}