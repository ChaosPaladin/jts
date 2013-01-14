package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sw_singer extends show_npc {
	protected int showFront_x = 0;
	protected int showFront_y = 0;
	protected int showFront_z = 0;

	protected void CREATED() {
myself.i_ai0 = 1;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.AddMoveToDesire(showFront_x, showFront_y, showFront_z, 200000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5000) {
myself.BroadcastScriptEvent(11, 3, 2000);
myself.AddMoveToDesire(showEnd_x, showEnd_y, showEnd_z, 200000);

}
if (timer_id == 20000) {
myself.AddEffectActionDesire(myself.sm, 1, 110 * 1000 / 30, 100);
myself.AddTimerEx(20000, 3000);

}
if (timer_id == 10000) {
if (myself.i_ai1 == 1) {
myself.AddEffectActionDesire(myself.sm, 3, 130 * 1000 / 30, 50);

}
if (myself.i_ai1 == 10) {
myself.AddTimerEx(20000, 10);

}
if (myself.i_ai1 == 41) {
myself.AddEffectActionDesire(myself.sm, 2, 90 * 1000 / 30, 70);

}
if (myself.i_ai1 == 44) {
myself.AddTimerEx(20000, 10);

}
if (myself.i_ai1 == 47) {
myself.AddEffectActionDesire(myself.sm, 0, 90 * 1000 / 30, 70);

}
if (myself.i_ai1 == 83) {
myself.AddEffectActionDesire(myself.sm, 2, 90 * 1000 / 30, 70);

}
if (myself.i_ai1 == 86) {
myself.AddTimerEx(20000, 10);

}
if (myself.i_ai1 == 93) {
myself.AddEffectActionDesire(myself.sm, 2, 90 * 1000 / 30, 70);

}
if (myself.i_ai1 == 96) {
myself.AddTimerEx(20000, 10);

}
if (myself.i_ai1 == 101) {
myself.AddEffectActionDesire(myself.sm, 0, 90 * 1000 / 30, 70);

}
if (myself.i_ai1 == 118) {
myself.AddTimerEx(20000, 10);

}
if (myself.i_ai1 == 129) {
myself.AddEffectActionDesire(myself.sm, 2, 90 * 1000 / 30, 70);

}
if (myself.i_ai1 == 132) {
myself.AddTimerEx(20000, 10);

}
if (myself.i_ai1 == 140) {
myself.AddEffectActionDesire(myself.sm, 0, 90 * 1000 / 30, 70);

}
if (myself.i_ai1 == 159) {
myself.AddTimerEx(20000, 10);

}
if (myself.i_ai1 == 200) {
myself.AddEffectActionDesire(myself.sm, 0, 90 * 1000 / 30, 70);

}
if (myself.i_ai1 == 202) {
myself.AddTimerEx(20000, 10);

}
if (myself.i_ai1 == 213) {
myself.AddEffectActionDesire(myself.sm, 0, 90 * 1000 / 30, 70);

}
if (myself.i_ai1 <= 3 * 60 + 40) {
myself.i_ai1 = myself.i_ai1 + 1;
myself.AddTimerEx(10000, 1000);

}

}
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (myself.i_ai0 == 1) {
myself.AddTimerEx(5000, 3 * 60 * 1000 + 40 * 1000);
myself.EffectMusic(myself.sm, 5000, "ns22_f");
myself.AddTimerEx(10000, 100);
myself.i_ai0 = 0;

} else {
myself.i_ai2 = 1;
myself.BroadcastScriptEvent(11, 4, 2000);
myself.Despawn();

}
	}


}