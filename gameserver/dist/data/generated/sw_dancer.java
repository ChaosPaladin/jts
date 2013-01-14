package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sw_dancer extends show_npc {
	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
if (myself.sm.class_id != 1032432) {
myself.AddTimerEx(9001, 5000);

} else {
myself.AddTimerEx(6001, 5000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 9001) {
myself.AddEffectActionDesire(myself.sm, 1, 106 * 1000 / 30, 100);
myself.AddTimerEx(9001, 3600);

}
if (timer_id == 9002) {
myself.Despawn();

}
if (timer_id == 6002) {
myself.AddEffectActionDesire(myself.sm, 1, 110 * 1000 / 30, 100);
myself.AddTimerEx(6002, 3000);

}
if (timer_id == 6001) {
if (myself.i_ai1 == 43) {
myself.AddEffectActionDesire(myself.sm, 2, 90 * 1000 / 30, 70);

}
if (myself.i_ai1 == 65) {
myself.AddTimerEx(6002, 10);

}
if (myself.i_ai1 == 103) {
myself.AddEffectActionDesire(myself.sm, 0, 90 * 1000 / 30, 70);

}
if (myself.i_ai1 == 118) {
myself.AddTimerEx(6002, 10);

}
if (myself.i_ai1 == 103) {
myself.AddEffectActionDesire(myself.sm, 0, 90 * 1000 / 30, 70);

}
if (myself.i_ai1 == 205) {
myself.AddTimerEx(6002, 10);

}
if (myself.i_ai1 == 200) {
myself.AddEffectActionDesire(myself.sm, 0, 90 * 1000 / 30, 70);

}
if (myself.i_ai1 <= 3 * 60 + 40) {
myself.i_ai1 = myself.i_ai1 + 1;
myself.AddTimerEx(6001, 1000);

}

}
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
myself.Despawn();
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 11) {
if (script_event_arg2 == 3) {
myself.AddMoveToDesire(showEnd_x, showEnd_y, showEnd_z, 200000);

}
if (script_event_arg2 == 15) {
myself.Say(gg.MakeFString(1800104, "", "", "", "", ""));
myself.AddTimerEx(9002, 3000);

}

}
	}


}