package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class on_timer_parade_maker extends default_maker {
	protected int parade_state = 0;
	protected int on_start_spawn = 0;
	protected int time_interval = 6;
	protected int l2_time = 13;
	protected int Is_day = 1;

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam def0) {
i0 = gg.GetL2Time(0);
i1 = gg.GetL2Time(1);
i2 = gg.GetL2Time(2);
myself.AddTimerEx(1816300, 1000);
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1) {
myself.i_ai0 = 0;
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam def0) {
if (timer_id == 1816300) {
i0 = gg.GetL2Time(0);
i1 = gg.GetL2Time(1);
i2 = gg.GetL2Time(2);
if (i0 == 2 || i0 == 8 || i0 == 14 || i0 == 20 && i1 == 0) {
if (i2) {
if (Is_day == 0 || Is_day == 2) {
myself.i_ai0 = 1;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}

}

} else if (Is_day == 1 || Is_day == 2) {
myself.i_ai0 = 1;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}

}

} else {
myself.AddTimerEx(1816300, 1000);
return;

}
myself.AddTimerEx(1816300, 60 * 1000);

}
	}


}