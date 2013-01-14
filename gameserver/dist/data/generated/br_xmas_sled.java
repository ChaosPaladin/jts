package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_xmas_sled extends default_npc {
	protected int MOVE_DELAY = 14401;
	protected int CHECK_EVENT = 14402;
	protected int START_DELAY = 14403;
	protected int PHASE_BUFFSKILL = 14404;
	protected int PHASE_GO = 14405;
	protected int event_gift = 2;

	protected void CREATED() {
if (myself.sm.param1 == 0) {
myself.AddTimerEx(CHECK_EVENT, 30000);
myself.i_ai0 = myself.start_z + 1500;
myself.i_ai1 = 1;
myself.SetVisible(0);
myself.AddMoveToDesire(gg.FloatToInt(myself.start_x - 100), gg.FloatToInt(myself.start_y - 100), gg.FloatToInt(myself.i_ai0), 100000000);

} else {
myself.AddTimerEx(START_DELAY, 2000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
if (timer_id == CHECK_EVENT) {
if (myself.GetGlobalMap(100) == 1) {
myself.Despawn();

} else {
myself.AddTimerEx(CHECK_EVENT, 30000);

}

} else if (timer_id == MOVE_DELAY) {
myself.PlayAnimation(0, 5000);
myself.AddTimerEx(MOVE_DELAY, 42000);

}
if (timer_id == START_DELAY) {
myself.Shout(gg.MakeFString(1900018, "", "", "", "", ""));
myself.AddTimerEx(PHASE_BUFFSKILL, 5000);

}
if (timer_id == PHASE_BUFFSKILL) {
c0 = gg.GetCreatureFromID(myself.GetGlobalMap(101));
myself.BroadcastSystemMessageStr(myself.sm, 0, gg.MakeFString(1900027, c0.name, "", "", "", ""));
myself.AddTimerEx(PHASE_GO, 5000);
myself.AddMoveToDesire(gg.FloatToInt(myself.start_x - 500), gg.FloatToInt(myself.start_y - 2000), gg.FloatToInt(myself.start_z + 1000), 100000000);

}
if (timer_id == PHASE_GO) {

}
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (myself.sm.param1 == 0) {
myself.SetVisible(1);
if (myself.i_ai1 == 1) {
myself.AddMoveToDesire(gg.FloatToInt(myself.sm.param2), gg.FloatToInt(myself.sm.param3), gg.FloatToInt(myself.i_ai0), 100000000);
myself.i_ai1 = 2;

} else if (myself.i_ai1 == 2) {
myself.AddMoveToDesire(gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.i_ai0), 100000000);
myself.i_ai1 = 1;

}

} else {
myself.Despawn();

}
	}


}